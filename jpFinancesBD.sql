
create database jpfinance

use jpfinance


create table person(
 id varchar(20) primary key,
 username varchar(50),
 name varchar(30) ,
 lastname varchar(30),
 email varchar(40),
 password varchar(100)
)

create table incomexpenses(
 id int primary key identity(1,1),
 description varchar(100),
 type varchar(20),
 category varchar(20),
 datein date,
 isexpense bit,
 idUser varchar(20) foreign key (idUser) references person(id)
)

