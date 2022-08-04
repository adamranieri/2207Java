
select * from player;
select * from coach;
select * from team;

-- Relational databases are transaction based
-- Transactions are discrete units of change for a database. Every transaction consists of 1 to multiple SQL statemnets

-- think of a transaction as the SQL statments between two commits
insert into team values(default, 'Lakers','LA','The Smog');
commit; -- will save any sql statements to the disk. PERSIST it
rollback; -- will undo any sql statments until you did commit last


insert into team values(default, 'Warriors','San Franciso','The Warrior');
insert into team values(default, 'The Jazz','Utah','awefwaefawffafefwfwfeawfewfafefwafefeawfewfewfewaffeawf');

-- ACID properties of transactions
-- Atomic (all statements in a transaction MUST suceed or none of them persists)
-- Consistent (Transactions always move from consistent state to consistent state) one state to another. no middle state there is no point where half the SQL statments are commited
-- Isolated (transactions can run in paralled WITHOUT messing with each other)
-- Durable (Failures in a transaction do not cause data corruption)
