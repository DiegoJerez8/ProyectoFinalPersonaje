CREATE TABLE `proyectofinal`.`personaje` (
  `idpersonaje` INT NOT NULL AUTO_INCREMENT,
  `nombrepersonaje` VARCHAR(45) NULL,
  `genero` VARCHAR(45) NULL,
  `edad` INT NULL,
  `idvideojuego` INT NULL,
  PRIMARY KEY (`idpersonaje`),
  INDEX `idvideojuego_idx` (`idvideojuego` ASC) VISIBLE,
  CONSTRAINT `idvideojuego`
    FOREIGN KEY (`idvideojuego`)
    REFERENCES `proyectofinal`.`videojuego` (`idvideojuego`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);