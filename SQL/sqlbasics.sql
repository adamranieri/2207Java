
-- DDL
create table player(
	id serial primary key, -- dbeaver does not recognize serial as a keyword, serial is used to make an auto incremeting column
	first_name varchar(40) not null, -- string data type, specify the max length
	last_name varchar(40) not null,
	salary int check (salary > 0 )
);
-- When you execute a statement it immediatly does that to the database
-- SQL scripts are NOT like a Java Program that you can just execute time and again

-- DML ( Data manipulation Lanugage)

-- inserts
insert into player values (default,'Lebron', 'James',26000000);
insert into player (id, last_name, first_name, salary) values (default,'Curry','Steph', 22000000);
insert into player values (default,'Giannis', 'A',10000000);

insert into player values (default,'Chris', 'Bosh',0);
insert into player values (default,'Jerry','West', -10000);

-- delete 
delete from player;
delete from player  where id = 7;

-- update 
update player set first_name ='Adam', last_name = 'Ranieri' where id = 8;

-- Java vs SQL operators
-- comments //  --
-- quoutes ""   		'' 
-- comparison ==           =
-- assignment =            :=
-- and  && and 
-- or || or


-- DQL (Data Query language)
select * from player; -- * means every column
select first_name, last_name from player; -- no filtering of the records from player 
select * from player where salary > 11000000; -- where is a filter that selects records
select last_name from player where salary < 12000000;

drop table player ;

