CREATE DATABASE  IF NOT EXISTS `gerenciador` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `gerenciador`;
-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: gerenciador
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

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
-- Table structure for table `pecas`
--

DROP TABLE IF EXISTS `pecas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pecas` (
  `id_peca` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `descricao` varchar(100) DEFAULT NULL,
  `codigo_fabricante` varchar(50) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `material` varchar(50) DEFAULT NULL,
  `compatibilidade` varchar(100) DEFAULT NULL,
  `quantidade_estoque` int(11) DEFAULT 0,
  `preco` decimal(10,2) DEFAULT NULL,
  `fornecedor` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_peca`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pecas`
--

LOCK TABLES `pecas` WRITE;
/*!40000 ALTER TABLE `pecas` DISABLE KEYS */;
INSERT INTO `pecas` VALUES (1,'Agulha nº 14','Agulha para tecidos médios','AG-14','Agulha','Aço','Singer, Brother',200,1.50,'Fornecedor A'),(2,'Pedal eletrônico','Pedal de controle eletrônico','PD-EL01','Pedal','Plástico','Singer, Janome',50,120.00,'Fornecedor B'),(3,'Correia de borracha','Correia para motor pequeno','CR-22','Correia','Borracha','Singer antiga',80,15.00,'Fornecedor C'),(4,'Carretel plástico','Carretel para linha','CT-PL01','Carretel','Plástico','Universal',500,0.80,'Fornecedor D'),(5,'Motor 110V','Motor elétrico para máquina doméstica','MT-110','Motor','Metal','Singer, Brother',20,250.00,'Fornecedor E'),(6,'Lâmpada LED','Lâmpada para iluminação da costura','LP-LED','Lâmpada','Vidro/Metal','Universal',100,12.00,'Fornecedor F'),(7,'Placa de agulha','Placa metálica sob a agulha','PL-AG01','Placa','Aço inox','Singer, Brother',40,35.00,'Fornecedor G'),(8,'Bobina metálica','Bobina para linha inferior','BB-MT01','Bobina','Metal','Universal',300,1.20,'Fornecedor H'),(9,'Calcador para zíper','Calcador especial para costura de zíper','CL-ZP01','Calcador','Metal','Singer, Brother, Janome',70,18.00,'Fornecedor I'),(10,'Tensão de linha','Conjunto regulador de tensão da linha','TS-LN01','Regulador','Metal/Plástico','Singer, Brother',25,45.00,'Fornecedor J');
/*!40000 ALTER TABLE `pecas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `admin` tinyint(1) DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Iago Barbosa','iago.barbosa','132224',1),(2,'Joao de Santo Cristo','santo.cristo','123456',0),(3,'Edward Elrick','ed.elrick','123456',0),(4,'Gon Freecss','hunter.gon','123456',0);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-04-02 15:52:57
