use BDkonecte;

SELECT * FROM BDkonecte.Master;

ALTER TABLE BDkonecte.Master
MODIFY COLUMN TelMaster VARCHAR(13);


INSERT INTO `BDkonecte`.`Master` (`idMaster`, `NombreMaster`, `DomicilioMaster`, `TelMaster`, `CorreoMaster`, 
`FotoMaster`, `ContraseñaUsuario`, `Descripcion`) 
VALUES (NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

INSERT INTO oficios (`Id oficio`, `NombreOficio`) VALUES ('1', 'Carpintero');

INSERT INTO oficios (`Id oficio`, `NombreOficio`) VALUES ('2', 'Plomeria');
INSERT INTO oficios (`Id oficio`, `NombreOficio`) VALUES ('3', 'Albañilería');
INSERT INTO oficios (`Id oficio`, `NombreOficio`) VALUES ('4', 'Sastrería');
INSERT INTO oficios (`Id oficio`, `NombreOficio`) VALUES ('5', 'Electricista');
INSERT INTO oficios (`Id oficio`, `NombreOficio`) VALUES ('6', 'Personal de Limpieza');
INSERT INTO oficios (`Id oficio`, `NombreOficio`) VALUES ('7', 'Herrería');
INSERT INTO oficios (`Id oficio`, `NombreOficio`) VALUES ('8', 'Planchaduría');
INSERT INTO oficios (`Id oficio`, `NombreOficio`) VALUES ('9', 'Pintor');
INSERT INTO oficios (`Id oficio`, `NombreOficio`) VALUES ('10', 'Cerrajero');
INSERT INTO oficios (`Id oficio`, `NombreOficio`) VALUES ('11', 'Otros');


-- Valor de prueba
INSERT INTO Master (`NombreMaster`, `DomicilioMaster`, `TelMaster`, `CorreoMaster`, 
`FotoMaster`, `ContraseñaUsuario`, `Descripcion`, `Oficios_Id oficio` ) 
VALUES ('Pedro Sanchez', 'Calle 345', '5536859023', 'pedro@hotmail.com', 
'Base 64', 'Contrasena1$', 'Soy un ejemplo de persona', '1');

INSERT INTO Master (`NombreMaster`, `DomicilioMaster`, `TelMaster`, `CorreoMaster`, 
`FotoMaster`, `ContraseñaUsuario`, `Descripcion`, `Oficios_Id oficio` )
VALUES ('Juan Pablo Perez', 'Retorno 16', '5551520745', 'JupPerez@gmail.com', 'Base 64', 'Pa$$w0rd', 'Carpintero experto', '1' );

INSERT INTO Master (`NombreMaster`, `DomicilioMaster`, `TelMaster`, `CorreoMaster`, 
`FotoMaster`, `ContraseñaUsuario`, `Descripcion`, `Oficios_Id oficio` )
VALUES ('Mario Velasquez', 'Avenida 1', '5525520745', 'MVelasquez@gmail.com', 'Base 64', 'MV220972$', 'Herreria en general', '7' );

INSERT INTO Master (`NombreMaster`, `DomicilioMaster`, `TelMaster`, `CorreoMaster`, 
`FotoMaster`, `ContraseñaUsuario`, `Descripcion`, `Oficios_Id oficio` )
VALUES ('Raul Fernandez', 'Cerrada 23', '5521905476', 'RaFer@outlook.com', 'Base 64', 'AbC123%', 'Experto en acabados', '1' );

INSERT INTO Master (`NombreMaster`, `DomicilioMaster`, `TelMaster`, `CorreoMaster`, 
`FotoMaster`, `ContraseñaUsuario`, `Descripcion`, `Oficios_Id oficio` )
VALUES ('Dolores Garcia', 'Avenida Insurgentes 1123', '5525436117', 'DoloresGar@hotmail.com', 'Base 64', '210475DG#', 'Ayudante planta', '6' );

SELECT * FROM Master;
SELECT * FROM Oficios;

SELECT Master.NombreMaster, Master.Oficios_Id oficio
FROM Master
INNER JOIN oficios ON Master.Oficios_Id = oficios.`Id oficio`
WHERE oficios.`Id oficio` = 1;

