-- db_login
drop table if exists login_table;
create table login_table
(
	id varchar(30) primary key, 
	email varchar(30),
    password varchar(30),
    teamName varchar(30)
);
select login_table;