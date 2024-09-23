INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
INSERT INTO usuario(username, password) VALUES ('user1', '$2a$12$1k34YdrmxBkVborQvZLh2OUvX1S80GVVQjZJ5H55y1eez7XV.nV06');
--INSERT INTO usuario(username, password) VALUES ('user1', '$2a$12$8VrnMkXLONSBl7tlmoMbaeXtUUYokm.DqpgbLeD2Pb5YUFUEPeJuC');
INSERT INTO usuario(username, password) VALUES ('admin', '$2a$12$1k34YdrmxBkVborQvZLh2OUvX1S80GVVQjZJ5H55y1eez7XV.nV06');
--INSERT INTO usuario(username, password) VALUES ('admin', '$2a$12$8VrnMkXLONSBl7tlmoMbaeXtUUYokm.DqpgbLeD2Pb5YUFUEPeJuC');
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1); -- user1 with ROLE_USER
INSERT INTO user_roles (user_id, role_id) VALUES (2, 2); -- admin with ROLE_ADMIN

INSERT INTO GENERO(nombre_genero) VALUES ('masculino');
--INSERT INTO GENERO(nombre_genero) VALUES ('femenino');
INSERT INTO TIPO_PORCION(nombre_porcion) VALUES('gramos');
INSERT INTO TIPO_PORCION(nombre_porcion) VALUES('mililitros');
INSERT INTO ACTIVIDAD_FISICA(descripcion, factor_actividad) VALUES ('sedentario',1.2);
INSERT INTO ACTIVIDAD_FISICA(descripcion, factor_actividad) VALUES ('activo',1.6);