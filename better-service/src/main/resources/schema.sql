drop table user if exists;
create table user(
/*自增主键*/
id bigint generated by default as identity,/*自增主键*/
username varchar(40),
name varchar(20),
age int(3),
balance decimal(10,2),/*余额*/
primary key(id))