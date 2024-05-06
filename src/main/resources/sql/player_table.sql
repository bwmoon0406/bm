-- player_table
drop table if exists player_table;
create table player_table
(
playerId int primary key auto_increment,
playerName varchar(10) not null,
position varchar(10) not null,
age int not null default 0,
height int not null default 0,
quarter int not null default 0,
assist int not null default 0,
block int not null default 0,
steel int not null default 0,
rebound int not null default 0,
offensiveRebound int not null default 0,
defensiveRebound int not null default 0,
turnover int not null default 0,
point int not null default 0,
backNumber int not null default 0
);
select * from player_table;
