"RETO TECNICO" 

La base de datos esta creada en en mysql 5
-Cargar el driver JDBC
-El password de root debe dejarse en blanco

Para crear la bd de datos debemos ejecutar desde la consola el siguiente comando:
       mysql -uroot < preguntarioDB.sql -> Desde la carpeta db del repositorio
 
O podemos ejecutar los siguiente comandos:
 
 CREATE DATABASE preguntario;
 
 CREATE TABLE `historico` (
  `jugador` char(40) DEFAULT NULL,
  `puntaje` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 
 



