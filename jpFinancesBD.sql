
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


create table budget(
 id int primary key identity(1,1),
 name varchar(50),
 value float,
 idcreator varchar(20)
 )

create table incomexpenses(
 id int primary key identity(1,1),
 description varchar(100),
 type varchar(20),
 category varchar(20),
 datein date,
 isexpense bit,
 value float,
 idBudget int foreign key (idBudget) references budget(id)
)

create table personbudget(
   idUser varchar(20) foreign key (idUser) references person(id),
   idBudget int foreign key (idBudget) references budget(id),
   primary key(idUser, idBudget)
)

create table saving(
    id int primary key identity(1,1),
	goalvalue float,
	qoutavalue float,
	description varchar(200),
	frequency int,
	dateinit date,
	dateend date,

)
