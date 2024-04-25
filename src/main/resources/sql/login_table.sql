-- db_login
drop table if exists login_table;
create table login_table
(
	id varchar(30) primary key not null, 
	email varchar(30) not null,
    password varchar(30) not null,
    teamName varchar(30) not null
);
select * from login_table;