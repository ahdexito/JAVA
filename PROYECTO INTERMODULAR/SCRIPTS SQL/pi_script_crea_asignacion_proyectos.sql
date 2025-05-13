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