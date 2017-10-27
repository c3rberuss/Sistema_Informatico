CREATE DATABASE IF NOT EXISTS `Sistema_DB`;
USE Sistema_DB;
DROP PROCEDURE IF EXISTS add_user;
CREATE PROCEDURE `add_user` (IN `id` VARCHAR(8), IN `nick` VARCHAR(100), IN `pwd` VARCHAR(20), IN `type` VARCHAR(30))  NO SQL INSERT INTO users VALUES(id, nick, pwd, type);
DROP PROCEDURE IF EXISTS delete_user;
CREATE PROCEDURE `delete_user` (IN `id` VARCHAR(10))  NO SQL DELETE FROM users WHERE id_usr=id;
DROP PROCEDURE IF EXISTS get_user_type;
CREATE PROCEDURE `get_user_type` (IN `nick` VARCHAR(100))  NO SQL SELECT type_usr FROM users WHERE nick_usr=nick;
DROP PROCEDURE IF EXISTS login;
CREATE PROCEDURE `login`(IN `nick` VARCHAR(100), IN `pwd` VARCHAR(50)) NO SQL SELECT COUNT(*) FROM users WHERE upper(nick_usr)=upper(nick) AND pwd_usr=pwd;
DROP PROCEDURE IF EXISTS search_user;
CREATE PROCEDURE `search_user` (IN `id` VARCHAR(10))  NO SQL SELECT * FROM users WHERE id_usr=id;
DROP PROCEDURE IF EXISTS update_user;
CREATE PROCEDURE `update_user` (IN `id` VARCHAR(10), IN `nick` VARCHAR(100), IN `pwd` VARCHAR(20))  NO SQL UPDATE users SET id_usr=id, nick_usr=nick, pwd_usr=pwd WHERE id_usr=id;
DROP PROCEDURE IF EXISTS carrito;
CREATE PROCEDURE `carrito`() NO SQL SELECT id, producto, precio, cantidad FROM shopping_cart ORDER BY n DESC;
DROP PROCEDURE IF EXISTS subtotal_carrito;
CREATE PROCEDURE `subtotal_carrito`() NO SQL SELECT SUM(precio*cantidad) as total FROM shopping_cart;
DROP PROCEDURE IF EXISTS actualizarItem;
CREATE PROCEDURE `actualizarItem`(IN `cantidad_` INT(8), IN `id_` VARCHAR(10)) NO SQL UPDATE shopping_cart SET cantidad=cantidad_ WHERE id=id_;
DROP PROCEDURE IF EXISTS borrarItem;
CREATE PROCEDURE `borrarItem`(IN `id_` VARCHAR(15)) NO SQL DELETE FROM shopping_cart WHERE id = id_;
DROP PROCEDURE IF EXISTS buscarItem;
CREATE PROCEDURE `buscarItem`(IN `id_` VARCHAR(10)) NO SQL SELECT id, producto, precio, stock FROM inventario WHERE id=id_ AND stock > 0;
DROP PROCEDURE IF EXISTS existeItem;
CREATE PROCEDURE `existeItem`(IN `id_` VARCHAR(10)) NO SQL SELECT COUNT(*) FROM shopping_cart WHERE id=id_;
DROP PROCEDURE IF EXISTS insertarItem;
CREATE PROCEDURE `insertarItem`(IN `id_` VARCHAR(20), IN `producto_` VARCHAR(50), IN `precio_` DOUBLE(6,2), IN `cantidad_` INT(4)) NO SQL INSERT INTO shopping_cart VALUES(id_, producto_, precio_, cantidad_, null);
DROP PROCEDURE IF EXISTS mostrarItems;
CREATE PROCEDURE `mostrarItems`() NO SQL SELECT * FROM inventario WHERE stock > 0;
DROP PROCEDURE IF EXISTS vaciarCarrito;
CREATE PROCEDURE `vaciarCarrito`() NO SQL TRUNCATE shopping_cart;
CREATE TABLE IF NOT EXISTS `shopping_cart` (`id` varchar(20) COLLATE utf8_spanish_ci NOT NULL, `producto` varchar(50) COLLATE utf8_spanish_ci NOT NULL, `precio` double(6,2) NOT NULL, `cantidad` int(4) NOT NULL, `n` int(10) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
CREATE TABLE IF NOT EXISTS `users` (`id_usr` varchar(10) NOT NULL, `nick_usr` varchar(100) NOT NULL, `pwd_usr` varchar(20) NOT NULL, `type_usr` varchar(30) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE IF NOT EXISTS `ventas` (`id` varchar(10) COLLATE utf8_spanish_ci NOT NULL,`producto` varchar(50) COLLATE utf8_spanish_ci NOT NULL,`cantidad` int(100) NOT NULL, `total_ventas` double(8,2) NOT NULL, `total_inversion` double(8,2) NOT NULL, `total_ganancias` double(8,2) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
CREATE TABLE IF NOT EXISTS `inventario` (`id` varchar(20) NOT NULL,`producto` varchar(75) NOT NULL, `descripcion` varchar(125) NOT NULL,`stock` int(10) NOT NULL, `precio` double(6,2) NOT NULL, `precio_costo` double(6,2) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=latin1;
INSERT IGNORE INTO `users` (`id_usr`, `nick_usr`, `pwd_usr`, `type_usr`) values( '1', 'Administrador', '0000', 'Admin');
ALTER TABLE `inventario` ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);
ALTER TABLE `shopping_cart` ADD PRIMARY KEY (`n`), ADD UNIQUE KEY `id` (`id`);
ALTER TABLE `users` ADD PRIMARY KEY (`id_usr`), ADD UNIQUE KEY `id_usr` (`id_usr`), ADD UNIQUE KEY `nick_usr` (`nick_usr`);
ALTER TABLE `ventas` ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`), ADD UNIQUE KEY `producto` (`producto`);
ALTER TABLE `shopping_cart` MODIFY `n` int(10) NOT NULL AUTO_INCREMENT;
DROP PROCEDURE IF EXISTS descontar_existencias;
CREATE PROCEDURE `descontar_existencias`(IN `id_` VARCHAR(10), IN `cantidad_` INT(4)) NO SQL UPDATE inventario SET stock=stock-cantidad_ WHERE id=id_;
DROP PROCEDURE IF EXISTS registrar_venta;
CREATE PROCEDURE `registrar_venta`(IN `id_` VARCHAR(10), IN `producto_` VARCHAR(50), IN `cantidad_` INT(4), IN `precio_` DOUBLE(6,2)) NO SQL BEGIN IF NOT EXISTS(SELECT * from ventas where id=id_) THEN SET @costo = (SELECT precio_costo FROM inventario where id=id_); INSERT INTO ventas VALUES(id_, producto_, cantidad_, precio_*cantidad_, @costo * cantidad_, (precio_*cantidad_) - (@costo * cantidad_)); ELSE SET @costo = (SELECT precio_costo FROM inventario where id=id_); UPDATE ventas SET total_ventas=(total_ventas+(precio_*cantidad_)), cantidad = cantidad + cantidad_, total_inversion = total_inversion + (@costo * cantidad_), total_ganancias = ((total_ventas) - total_inversion)WHERE id=id_; END IF; END;
DROP PROCEDURE IF EXISTS delete_product;
CREATE PROCEDURE delete_product(IN id_ VARCHAR(20)) NO SQL DELETE FROM inventario WHERE id=id_;
DROP PROCEDURE IF EXISTS search_product;
CREATE PROCEDURE search_product(IN id_ VARCHAR(20)) NO SQL SELECT * FROM inventario WHERE id=id_;
DROP PROCEDURE IF EXISTS update_product;
CREATE PROCEDURE update_product(IN id_ VARCHAR(20), IN NOM VARCHAR(75), IN DESCR VARCHAR(125), IN stock_ INT(10), IN precio_ DOUBLE,  IN ADQU DOUBLE) NO SQL UPDATE inventario SET producto=NOM, descripcion=DESCR, stock=stock_, precio=precio_, precio_costo=ADQU WHERE id=id_;
DROP PROCEDURE IF EXISTS add_product;
CREATE PROCEDURE add_product(IN id VARCHAR(20), IN prod VARCHAR(75), IN descr VARCHAR(125), IN stock INT(10), IN precio DOUBLE, IN adqui DOUBLE) NO SQL INSERT INTO inventario VALUES(id, prod, descr, stock, precio, adqui);
DROP PROCEDURE IF EXISTS mostrar_users;
CREATE PROCEDURE `mostrar_users` ()  NO SQL SELECT * from users;
DROP PROCEDURE IF EXISTS mostrar_productos;
CREATE PROCEDURE `mostrar_productos`() NO SQL SELECT * FROM inventario;