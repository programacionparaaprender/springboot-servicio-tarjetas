--INSERT INTO productos (nombre, precio, create_at) VALUES('Panasonic', 800, NOW());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Sony', 700, NOW());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Apple', 1000, NOW());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Notebook', 1000, NOW());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Hewlett Packard', 500, NOW());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Bianchi', 600, NOW());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Nike', 100, NOW());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Adidas', 200, NOW());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Reebok', 300, NOW());

--INSERT INTO productos (nombre, precio, create_at) VALUES('Panasonic', 800, GETDATE());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Sony', 700, GETDATE());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Apple', 1000, GETDATE());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Notebook', 1000, GETDATE());

--INSERT INTO productos (nombre, precio, create_at) VALUES('Hewlett Packard', 500, GETDATE());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Bianchi', 600, GETDATE());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Nike', 100, GETDATE());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Adidas', 200, GETDATE());
--INSERT INTO productos (nombre, precio, create_at) VALUES('Reebok', 300, GETDATE());


insert into menu(nombre, url, hijo) values('inicio', '/', 0);
insert into menu(nombre, url, hijo) values('usuarios', '/usuarios', 1);
insert into menu(nombre, url, hijo) values('tarjeta', '/tarjeta', 1);

insert into tarjetacredito(titular, numerotarjeta, fecha_expiracion, cvv) values('Pedro Gonzales', '1234567812345678', '02/26', '337');
insert into tarjetacredito(titular, numerotarjeta, fecha_expiracion, cvv) values('Maria Marcano', '1234567812345679', '02/28', '338');
insert into tarjetacredito(titular, numerotarjeta, fecha_expiracion, cvv) values('Talia Rodriguez', '1234567812345672', '02/26', '339');

