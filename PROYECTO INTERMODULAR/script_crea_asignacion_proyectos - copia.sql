DROP DATABASE IF EXISTS pi_asignacion_proyectos;

CREATE DATABASE pi_asignacion_proyectos;

USE pi_asignacion_proyectos;

CREATE TABLE cliente (
	id INT UNSIGNED AUTO_INCREMENT,
    DNI VARCHAR(10) NOT NULL UNIQUE KEY,
    nombre VARCHAR(15) NOT NULL,
    apellido1 VARCHAR(15) NOT NULL,
    apellido2 VARCHAR(15),
    email VARCHAR(40) NOT NULL,
    telefono VARCHAR(20),
    CONSTRAINT id_cliente PRIMARY KEY (id)
    );
    
CREATE TABLE desarrollador (
	id INT UNSIGNED AUTO_INCREMENT,
    DNI VARCHAR(10) NOT NULL UNIQUE KEY,
    nombre VARCHAR(15) NOT NULL,
    apellido1 VARCHAR(15) NOT NULL,
    apellido2 VARCHAR(15),
    email VARCHAR(40) NOT NULL,
    CONSTRAINT id_desarrollador PRIMARY KEY (id)
    );
    
CREATE TABLE proyecto (
	id INT UNSIGNED AUTO_INCREMENT,
    nombre VARCHAR(30) NOT NULL,
    descripcion VARCHAR(100),
    fecha_inicio DATE,
    fecha_fin DATE,
    horas_previstas INT UNSIGNED,
    CONSTRAINT id_proyecto PRIMARY KEY (id)
    );
    
CREATE TABLE asignacion (
	id INT UNSIGNED AUTO_INCREMENT,
    id_cliente INT UNSIGNED NOT NULL,
    id_desarrollador INT UNSIGNED,
    id_proyecto INT UNSIGNED,
    fecha_inicio DATE,
    fecha_fin DATE,
    horas_trabajadas INT UNSIGNED,
    CONSTRAINT id_asignacion PRIMARY KEY (id),
    CONSTRAINT fk_id_cliente_asignacion FOREIGN KEY (id_cliente) REFERENCES cliente (id),
    CONSTRAINT fk_id_desarrollador FOREIGN KEY (id_desarrollador) REFERENCES desarrollador (id),
    CONSTRAINT fk_id_proyecto FOREIGN KEY (id_proyecto) REFERENCES proyecto (id)
    );

INSERT cliente (id, DNI, nombre, apellido1, apellido2, email, telefono)
	VALUES (null, '11111111A', 'Sebastián', 'Ramírez', 'Gómez', 's.ramgom@gmail.com', '611222333');

INSERT cliente (id, DNI, nombre, apellido1, apellido2, email, telefono)
	VALUES (null, '22222222B', 'Alba', 'Pérez', 'Delgado', 'a.perdel@gmail.com', '622333444');

INSERT cliente (id, DNI, nombre, apellido1, apellido2, email, telefono)
	VALUES (null, '33333333C', 'Carlos', 'Méndez', 'Rojas', 'c.menroj@gmail.com', '633444555');

INSERT cliente (id, DNI, nombre, apellido1, apellido2, email, telefono)
	VALUES (null, '44444444D', 'Ana', 'Beltrán', 'Suárez', 'a.belsua@gmail.com', '644555666');

INSERT cliente (id, DNI, nombre, apellido1, apellido2, email, telefono)
	VALUES (null, '55555555E', 'Luis', 'Ramírez', 'Ortega', 'l.ramort@gmail.com', '655666777');

INSERT cliente (id, DNI, nombre, apellido1, apellido2, email, telefono)
	VALUES (null, '66666666F', 'María', 'Fernández', 'Pino', 'm.ferpin@gmail.com', '666777888');

INSERT cliente (id, DNI, nombre, apellido1, apellido2, email, telefono)
	VALUES (null, '77777777G', 'Javier', 'Torres', 'Guzmán', 'j.torguz@gmail.com', '677888999');

INSERT cliente (id, DNI, nombre, apellido1, apellido2, email, telefono)
	VALUES (null, '88888888H', 'Elena', 'Castro', 'Vega', 'e.casveg@gmail.com', '688999111');

INSERT cliente (id, DNI, nombre, apellido1, apellido2, email, telefono)
	VALUES (null, '99999999I', 'Pedro', 'Morales', 'Quintana', 'p.morqui@gmail.com', '699111222');

INSERT cliente (id, DNI, nombre, apellido1, apellido2, email, telefono)
	VALUES (null, '11111111J', 'Sofía', 'Herrera', 'Lozano', 's.herloz@gmail.com', '666111222');

INSERT cliente (id, DNI, nombre, apellido1, apellido2, email, telefono)
	VALUES (null, '22222222K', 'Fernando', 'Aguilar', 'Domínguez', 'f.agudom@gmail.com', '666222333');

INSERT cliente (id, DNI, nombre, apellido1, apellido2, email, telefono)
	VALUES (null, '33333333L', 'Valeria', 'Navarro', 'Espinosa', 'v.navesp@gmail.com', '666333444');