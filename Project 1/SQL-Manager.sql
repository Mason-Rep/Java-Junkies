CREATE table employees (
	id int auto_increment PRIMARY KEY NOT NULL,
	first_name VARCHAR (50),
	last_name VARCHAR (50),
	email VARCHAR (50),
	emp_username VARCHAR (50) NOT NULL,
	emp_password VARCHAR (50) NOT NULL,
	emp_type VARCHAR (50)
);

insert into employees values (default,'alazar', 'hailemeskel', 'alazar@mail.com', 'alazar', 'alazar', null );
insert into employees values (default, 'ah', 'ha', 'ah@mail.com', 'ah', 'ah123', 'manager' );

CREATE Table reimbursements (
	id int auto_increment PRIMARY KEY NOT NULL,
	employee_id int NOT NULL,
	title VARCHAR (50),
	amountrequested numeric(20,2),
	status VARCHAR (50),
	constraint fk_employee
		foreign key (employee_id) 	
			references employees(id)
