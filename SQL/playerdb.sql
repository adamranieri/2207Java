
create table team(
	team_id serial primary key,
	name varchar(30) unique,
	hometown varchar(30),
	mascot varchar(30)
);

insert into team values (default,'Mutton Chop Mountaineers','Morgantown','The Mountaineer');
insert into team values (default, 'The Generals', 'Washington', 'The General');
insert into team values (default, 'Globe Trotters','Harlem','Globie');
insert into team values (default, 'The Heat','Miami','Burnie');

select * from team;
delete  from team where team_id = 1; -- fails becuase it would make orphan records
delete  from team where team_id = 4;

-- Foreign Keys relate tables to each other
-- The table with the foreign key is the child
-- The table it references is the parent player=child, team=parent 
-- the child table is the many, parent is the one
-- Orphan records are child records that DO NOT have a valid parent to reference (should never happen so long as you set up foreign keys correctly)
create table player(
	player_id serial primary key,
	fname varchar(30),
	lname varchar(30),
	salary int,
	t_id int references team(team_id) -- column that says what team a player is on foreign key constraint
);

select * from player;

insert into player values(default,'Adam', 'Ranieri', 1000000,1);
insert into player values(default,'Jerry', 'West', 500000,2);
insert into player values(default,'patrick', 'Orwin', 10,2);
insert into player values(default,'Sarah', 'Farrens', 700000,3);
insert into player values(default,'Hank', 'Hill', 300000,3);
insert into player values(default,'Lebron', 'James', 900000,1);
insert into player values(default, 'Steph','Curry',850000,99); -- team 99 DOES not EXIST



create table coach(
	coach_id serial primary key,
	fname varchar(30),
	lname varchar(30),
	title varchar(30),
	salary int,
	t_id int references team(team_id) -- adding a foreign key to make sure all coaches are on valid teams

);

insert into coach values (default, 'Ryan', 'Schlientz', 'Head Coach', 2000000,1);
insert into coach values (default, 'Lilly', 'Schlientz', 'Shooting Instructor', 1500000,1);
insert into coach values (default, 'Sierra', 'Nicholes', 'General Manager', 15000000,2);
select * from coach;

-- Multiplictiy is the type of relation 2 tables can have
-- 1-1
-- 1-many    1 team will have many players. Any 1 player is only on one team
-- many-many
select * from player;

-- In a relation database important information is often spread across multiplt tables. This makes certain queries difficult or impossible 
-- joins allow us to combine temporarily two tables so that we can query the combine table for pertinent information

select * from team left join player on player.t_id = team.team_id ; -- on is the join predicate it tells sql HOW to match records
select name,lname from team left join player on player.t_id = team.team_id; 
-- joins inherently add redundancy and DENORMALIZE a database
-- there are many different types of joins 

-- right joins will match EVERY RECORD on the right to every record that it can on the left. Records in the right table ARE STILL included even if they do not match
select * from team right join player on player.t_id = team.team_id ; 

-- inner joins will only show records that DID find a match. So the the order of specifying the tables does not matter
select * from team inner join player on player.t_id = team.team_id;

-- cross join. Cartesian product where every record is matched to every record
select * from team cross join player;

-- outer join. inclues non matching records as well
select * from team full outer join player on player.t_id = team.team_id;

-- aggregate and scalar functions 
-- postgres has inbuilt functions for basic operations

select * from player;

-- aggregate functions require multiple records to make sense
select sum(salary) from player;
select avg(salary) from player;
select max(salary) from player;
select min(salary) from player;

-- aggregatate functions use a group by clause which you can use to GROUP records into buckets that are analyzed independently
select avg(salary) from player group by t_id;
select avg(salary),name from player left join team on player.t_id = team.team_id group by name;

-- scalar functions take a single input and have a single output 
select  upper(fname) from player; 
select length(lname) from player;


-- it is possible to make player records who reference a team that DOES NOT EXIST
-- Referential integrity all records that reference another record should always reference an exising record. No referencing non existent values

-- Unions and set operators
-- set operators stack two tables on top of each other without any sort of join predicate

select lname,salary from player
union -- will stack the top table on top of the bottom table
select lname,salary from coach;
-- set operators are most useful when tables share columns but you want them as a single table
-- what's the averable salary in the league
select avg(salary) from 
(select lname,salary from player
union -- will stack the top table on top of the bottom table
select lname,salary from coach) as dummy;
-- nested query. take the first query put in parantheses then put as x at the end

-- the only requirement of a set operator is that the number and datatype of the columns be the same
select fname,salary from player
union -- will stack the top table on top of the bottom table
select lname,t_id from coach;

-- order by
select * from player order by salary desc;



