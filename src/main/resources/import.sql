--INSERT DE DATOS INICIALES DE LAS LISTAS DE REPRODUCCION
INSERT INTO playlist(descripcion,nombre) VALUES('descripcion de playlist 1', 'playlist 1');
INSERT INTO playlist(descripcion,nombre) VALUES('descripcion de playlist 2', 'playlist 2');
INSERT INTO playlist(descripcion,nombre) VALUES('descripcion de playlist 3', 'playlist 3');
INSERT INTO playlist(descripcion,nombre) VALUES('descripcion de playlist 4', 'playlist 4');

--INSERT DE DATOS INICIALES DE LAS CANCIONES
INSERT INTO songs(titulo,artista,album,anno) VALUES( 'titulo 1', 'artista 1', 'album 1', 'anno 1');
INSERT INTO songs(titulo,artista,album,anno) VALUES( 'titulo 2', 'artista 2', 'album 2', 'anno 2');
INSERT INTO songs(titulo,artista,album,anno) VALUES( 'titulo 3', 'artista 3', 'album 3', 'anno 3');
INSERT INTO songs(titulo,artista,album,anno) VALUES( 'titulo 4', 'artista 4', 'album 4', 'anno 4');
INSERT INTO songs(titulo,artista,album,anno) VALUES( 'titulo 5', 'artista 5', 'album 5', 'anno 5');
INSERT INTO songs(titulo,artista,album,anno) VALUES( 'titulo 6', 'artista 6', 'album 6', 'anno 6');
INSERT INTO songs(titulo,artista,album,anno) VALUES( 'titulo 7', 'artista 7', 'album 7', 'anno 7');
INSERT INTO songs(titulo,artista,album,anno) VALUES( 'titulo 8', 'artista 8', 'album 8', 'anno 8');
INSERT INTO songs(titulo,artista,album,anno) VALUES( 'titulo 9', 'artista 9', 'album 9', 'anno 9');
INSERT INTO songs(titulo,artista,album,anno) VALUES( 'titulo 10', 'artista 10', 'album 10', 'anno 10');

--INSERT DE DATOS INICIALES DE USUARIOS

INSERT INTO usuarios (username,password,enabled,nombre,apellido,email) VALUES ('geralfinof', '$2a$10$N/3McwqZr93FzahrARCz/O2zUqo.tkYdYEYzNpqVHw.G7xs0v0266', 1, 'Francisco', 'Geraldino','fgemail@mail.com');
INSERT INTO usuarios (username,password,enabled,nombre,apellido,email) VALUES ('admin', '$2a$10$HZOqFfCFyVyvtRU6CIPT4uO5wWDloDOx0uxrb8ANGkQ7wZDCjWgJu', 1, 'admin nombre', 'admin apellido','aminemail@mail.com');

--INSERT DE DATOS INICIALES DE ROLES
INSERT INTO roles(nombre) VALUES('ROLE_USER');
INSERT INTO roles(nombre) VALUES('ROLE_ADMIN');

--INSERT DE DATOS INICIALES DE USUARIO_ROL
INSERT INTO usuarios_roles(usuario_id,rol_id) VALUES(1,1);
INSERT INTO usuarios_roles(usuario_id,rol_id) VALUES(2,2);
INSERT INTO usuarios_roles(usuario_id,rol_id) VALUES(2,1);







