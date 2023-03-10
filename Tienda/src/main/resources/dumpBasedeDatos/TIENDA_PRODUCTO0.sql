CREATE DATABASE  IF NOT EXISTS `TIENDA` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `TIENDA`;
-- MySQL dump 10.13  Distrib 8.0.29, for Linux (x86_64)
--
-- Host: localhost    Database: TIENDA
-- ------------------------------------------------------
-- Server version	5.7.40-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `PRODUCTO`
--

DROP TABLE IF EXISTS `PRODUCTO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PRODUCTO` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idproducto` varchar(45) DEFAULT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `pvp` float DEFAULT NULL,
  `coste` float DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `iva` float DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_PRODUCTO_id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PRODUCTO`
--

LOCK TABLES `PRODUCTO` WRITE;
/*!40000 ALTER TABLE `PRODUCTO` DISABLE KEYS */;
INSERT INTO `PRODUCTO` VALUES (1,'c','casa',10,5,'2022-01-01',NULL),(3,'p','perrito',2,1,'2022-02-01',NULL),(7,'023p','gato',19,15,'2022-12-31',NULL),(8,'023p32','Gatera',18.7,15.25,'2022-12-31',NULL),(9,'cas','casa de ca',23,123,'2022-12-31',2),(11,'foto','foto de camara',25,18,'2022-12-17',16),(12,'casetilla','ventas dw',12.58,10.01,'2022-12-01',17.17),(14,'animales','camas de perros',6.8,3,'2023-12-01',16),(16,'852','Casita de Perro',585.03,25.01,'2022-12-17',14.01);
/*!40000 ALTER TABLE `PRODUCTO` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-10 20:49:43
