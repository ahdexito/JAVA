DELIMITER //

-- ----------------------------------------------------------------------------------
-- CREAR CLIENTE DADO SUS DATOS
-- ----------------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_insertCliente //
CREATE PROCEDURE sp_insertCliente(
    IN p_DNI VARCHAR(10),
	IN p_nombre VARCHAR(15),
	IN p_apellido1 VARCHAR(15),
	IN p_apellido2 VARCHAR(15),
	IN p_email VARCHAR(40),
	IN p_telefono VARCHAR(20)
)
BEGIN
	INSERT INTO cliente VALUES
        (NULL, p_DNI, p_nombre, p_apellido1, p_apellido2, p_email, p_telefono);
END //
-- ----------------------------------------------------------------------------------


-- ----------------------------------------------------------------------------------
-- CONSULTAR TODOS LOS DATOS DE CLIENTE DADO EL ID
-- ----------------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_getCliente //
CREATE PROCEDURE sp_getCliente(
    IN p_id INT
)
BEGIN
    SELECT * FROM cliente WHERE id = p_id;
END //
-- ----------------------------------------------------------------------------------


-- ----------------------------------------------------------------------------------
-- MODIFICAR DATOS DE CLIENTE DADO EL ID, ADAPTATIVO
-- ----------------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_modifyCliente //
CREATE PROCEDURE sp_modifyCliente(
    IN p_id INT,
    IN p_DNI VARCHAR(10),
	IN p_nombre VARCHAR(15),
	IN p_apellido1 VARCHAR(15),
	IN p_apellido2 VARCHAR(15),
	IN p_email VARCHAR(40),
	IN p_telefono VARCHAR(20)
)
BEGIN
    UPDATE cliente
    SET 
        DNI = IF(p_DNI = '' OR p_DNI IS NULL, DNI, p_DNI),
        nombre = IF(p_nombre = '' OR p_nombre IS NULL, nombre, p_nombre),
        apellido1 = IF(p_apellido1 = '' OR p_apellido1 IS NULL, apellido1, p_apellido1),
        apellido2 = IF(p_apellido2 = '' OR p_apellido2 IS NULL, apellido2, p_apellido2),
        email = IF(p_email = '' OR p_email IS NULL, email, p_email),
        telefono = IF(p_telefono = '' OR p_telefono IS NULL, telefono, p_telefono)
    WHERE id = p_id;
END //
-- ----------------------------------------------------------------------------------


-- ----------------------------------------------------------------------------------
-- BORRAR CLIENTE DADO EL ID
-- ----------------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_deleteCliente //
CREATE PROCEDURE sp_deleteCliente(
    IN p_id INT
)
BEGIN
    DELETE FROM cliente WHERE id = p_id;
END //
-- ----------------------------------------------------------------------------------

DELIMITER ;