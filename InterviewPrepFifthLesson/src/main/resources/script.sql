CREATE TABLE `gbinterviewprep`.`students` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `mark` TINYINT(1) NOT NULL,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  PRIMARY KEY (`id`));

INSERT INTO students (`name`, `mark`) VALUES ('Alex', 3);

SELECT * FROM students;
DELETE FROM students WHERE id = 1;

DROP TABLE students;