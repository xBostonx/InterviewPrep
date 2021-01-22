drop table if exists students;
create table students (id INT unsigned NOT NULL AUTO_INCREMENT PRIMARY KEY, name VARCHAR(45), age TINYINT(2));
insert into students
(name, age) values
('Alex', 17),
('Maria', 16),
('Misha', 16),
('Dima', 17),
('Lisa', 17),
('Denis', 15);
