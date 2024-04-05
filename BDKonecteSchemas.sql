CREATE SCHEMA `BDkonecte`;
USE `BDkonecte` ;

CREATE TABLE  `BDkonecte`.`oficios` (
  `Id oficio` INT NOT NULL,
  `NombreOficio` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`Id oficio`));


CREATE TABLE  `BDkonecte`.`Master` (
  `idMaster` INT NOT NULL AUTO_INCREMENT,
  `NombreMaster` VARCHAR(45) NOT NULL,
  `DomicilioMaster` VARCHAR(100) NOT NULL,
  `TelMaster` VARCHAR(13) NULL DEFAULT NULL,
  `CorreoMaster` VARCHAR(45) NOT NULL,
  `FotoMaster` VARCHAR(300) NOT NULL,
  `ContraseñaUsuario` VARCHAR(45) NOT NULL,
  `Descripcion` VARCHAR(45) NULL DEFAULT NULL,
  `Oficios_Id oficio` INT NOT NULL,
  PRIMARY KEY (`idMaster`, `Oficios_Id oficio`),
  INDEX `fk_Master_Oficios_idx` (`Oficios_Id oficio` ASC) VISIBLE,
  CONSTRAINT `fk_Master_Oficios`
    FOREIGN KEY (`Oficios_Id oficio`)
    REFERENCES `BDkonecte`.`oficios` (`Id oficio`))
ENGINE = InnoDB
AUTO_INCREMENT = 8;


CREATE TABLE `BDkonecte`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `NombreUsuario` VARCHAR(45) NOT NULL,
  `TelUsuario` VARCHAR(13) NULL DEFAULT NULL,
  `CorreoUsuario` VARCHAR(35) NOT NULL,
  `ContraseñaUsuario` VARCHAR(23) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 7;


