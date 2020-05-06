CREATE DATABASE  IF NOT EXISTS `elympics` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `elympics`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: elympics
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `gioco`
--

DROP TABLE IF EXISTS `gioco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gioco` (
  `id` int NOT NULL,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gioco`
--

LOCK TABLES `gioco` WRITE;
/*!40000 ALTER TABLE `gioco` DISABLE KEYS */;
INSERT INTO `gioco` VALUES (1,'Cup Hunter'),(2,'Snake'),(3,'Pills Challenge'),(4,'Catch Stars');
/*!40000 ALTER TABLE `gioco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partita`
--

DROP TABLE IF EXISTS `partita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partita` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tempo` datetime NOT NULL,
  `punteggio` int NOT NULL,
  `utente_id` int NOT NULL,
  `gioco_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `gioco_id` (`gioco_id`),
  KEY `partita_ibfk_1_idx` (`utente_id`),
  CONSTRAINT `partita_ibfk_1` FOREIGN KEY (`utente_id`) REFERENCES `utente` (`id`),
  CONSTRAINT `partita_ibfk_2` FOREIGN KEY (`gioco_id`) REFERENCES `gioco` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partita`
--

LOCK TABLES `partita` WRITE;
/*!40000 ALTER TABLE `partita` DISABLE KEYS */;
INSERT INTO `partita` VALUES (21,'2020-05-06 08:36:44',6,20,2),(22,'2020-05-06 08:41:08',0,20,3),(23,'2020-05-06 08:46:21',0,21,3),(24,'2020-05-06 08:48:33',0,21,3),(25,'2020-05-06 08:51:05',0,21,3),(26,'2020-05-06 08:51:46',0,21,3),(27,'2020-05-06 08:53:21',40,21,3),(28,'2020-05-06 08:59:37',100,21,3),(29,'2020-05-06 09:12:24',40,20,3),(30,'2020-05-06 13:16:09',160,20,1),(31,'2020-05-06 13:16:58',0,20,4),(32,'2020-05-06 13:20:17',0,20,4),(33,'2020-05-06 13:21:49',0,20,4),(34,'2020-05-06 13:24:22',0,20,4),(35,'2020-05-06 13:26:35',20,20,4);
/*!40000 ALTER TABLE `partita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utente`
--

DROP TABLE IF EXISTS `utente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utente` (
  `username` varchar(12) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cognome` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `paese` varchar(50) DEFAULT NULL,
  `data_inserimento` datetime NOT NULL,
  `data_eliminazione` datetime DEFAULT NULL,
  `isamm` tinyint DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `bloccato` tinyint DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utente`
--

LOCK TABLES `utente` WRITE;
/*!40000 ALTER TABLE `utente` DISABLE KEYS */;
INSERT INTO `utente` VALUES ('Albuz','Davide','Gentile','davi@hotmail.it','123','Lussemburgo','2020-05-06 08:32:23',NULL,0,20,0),('Giocatore2','Alberto','Lorena','albi@hotmail.it','123','Paesi Bassi','2020-05-06 08:44:33',NULL,0,21,0);
/*!40000 ALTER TABLE `utente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-06 15:29:02
