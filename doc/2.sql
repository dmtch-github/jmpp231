USE my_db;

CREATE TABLE employees (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  surname varchar(25),
  department varchar(20),
  salary int,
  PRIMARY KEY (id)
) ;


#PostgreSQL
CREATE TABLE IF NOT EXISTS userwebs (
  id SERIAL PRIMARY KEY,
  name CHARACTER VARYING(30) NOT NULL,
  last_name CHARACTER VARYING(30) NOT NULL,
  age INTEGER NOT NULL,
  email CHARACTER VARYING(30) NOT NULL,
  role CHARACTER VARYING(30) NOT NULL,
);


INSERT INTO my_db.employees (name, surname, department, salary)
VALUES
	('Zaur', 'Tregulov', 'IT', 500),
	('Oleg', 'Ivanov', 'Sales', 700),
	('Nina', 'Sidorova', 'HR', 850);

