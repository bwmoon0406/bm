-- player_table
drop table if exists player_table;
create table player_table
(
playerId int primary key auto_increment,
playerName varchar(10) not null,
position varchar(10) not null,
age int default 0,
height int default 0,
quarter int default 0,
assist int default 0, 
block int default 0,
steel int default 0,
rebound int default 0,
offensiveRebound int default 0,
defensiveRebound int default 0,
turnover int default 0,
point int default 0,
backNumber int default 0
);
select * from player_table;
