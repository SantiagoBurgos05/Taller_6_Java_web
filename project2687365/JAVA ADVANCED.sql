CREATE DATABASE project2687365;
USE project2687365;
CREATE TABLE users_tbl(
user_id int not null primary key auto_increment,
user_firstname VARCHAR(40) not null,
user_lastname VARCHAR(40) not null,
user_email VARCHAR(60) not null,
user_password VARBINARY(255)
);
SELECT * FROM users_tbl;

INSERT INTO project2687365.users_tbl (user_firstname, user_lastname, user_email, user_password)
VALUES (UPPER('Santiago'), UPPER('burgos'), 'santiago@correo.com',AES_ENCRYPT('password','$2a$12$jgbB8ox.i5.O5sQ0pv7pDuguBJh0nww02ITSZuMFm1NPoLvGFYK0O'));

SELECT *,CAST(AES_DECRYPT(user_password,'$2a$12$jgbB8ox.i5.O5sQ0pv7pDuguBJh0nww02ITSZuMFm1NPoLvGFYK0O') AS CHAR(50))end_data FROM users_tbl WHERE user_id = 1;
