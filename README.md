# Ejercicio con JPA y Spring Security

## Spring Security
Incluimos dependencias en pom.xml, incluimos página de login 
(horrible, lo sé, pero funcional), creamos una pequeña estructura
de datos para contener a usuario y sus roles.


```sql
CREATE TABLE IF NOT EXISTS `sakila`.`User` (
  `userName` VARCHAR(30) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `enabled` TINYINT(1) NULL,
  PRIMARY KEY (`userName`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `sakila`.`ROL` (
  `idROL` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`idROL`),
  UNIQUE INDEX `idROL_UNIQUE` (`idROL` ASC))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `sakila`.`User_has_ROL` (
  `userName` VARCHAR(30) NOT NULL,
  `idROL` INT NOT NULL,
  PRIMARY KEY (`userName`, `idROL`),
  INDEX `fk_User_has_ROL_ROL1_idx` (`idROL` ASC),
  INDEX `fk_User_has_ROL_User1_idx` (`userName` ASC),
  CONSTRAINT `fk_User_has_ROL_User1`
    FOREIGN KEY (`userName`)
    REFERENCES `sakila`.`User` (`userName`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_User_has_ROL_ROL1`
    FOREIGN KEY (`idROL`)
    REFERENCES `sakila`.`ROL` (`idROL`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
```


Y luego poblarla acá con este script.

```sql
insert into user values
('brian', '$2a$10$I5sLnE6jdR5UB3K.IKJqe.BTNTFgzKhQWQl7uSlPH.D4ytU5Kz7fO', true),
('jeshu', '$2a$10$9bx/L5912uWKCTh9riXC1eBipouENSwWyvClYVcywk2Wv7Am4DIXS', true);
insert into rol (nombre) values ('ADMIN'), ('USER');
insert into user_has_rol values ('brian', 1), ('brian', 2), ('jeshu', 2);
```
