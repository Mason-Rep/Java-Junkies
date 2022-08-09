create database project1;

create table if not exists employee(
	employee_ID serial primary key,
	username varchar(20) unique not null,
	password varchar(20) not null,
	first_name varchar(30) default null,
	last_name varchar(30) default null,
	email varchar(40) defualt null,
	phone_num varchar(15) default null,
	manager_ID int,
	constraint fk_manager
		foreign key(manager_ID)
			references manager(manager_ID)
			on delete cascade
);


