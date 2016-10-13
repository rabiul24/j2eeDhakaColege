-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: labor_wage_management
-- ------------------------------------------------------
-- Server version	5.5.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `labor_table`
--

DROP TABLE IF EXISTS `labor_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `labor_table` (
  `labor_id` int(11) NOT NULL DEFAULT '0',
  `labor_name` varchar(45) NOT NULL,
  `labor_age` int(11) NOT NULL,
  `labor_image` blob,
  `labor_address` varchar(45) DEFAULT NULL,
  `labor_contact` int(11) DEFAULT NULL,
  PRIMARY KEY (`labor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `payment_table`
--

DROP TABLE IF EXISTS `payment_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment_table` (
  `payment_id` int(11) NOT NULL,
  `actual_work_hour` int(11) DEFAULT NULL,
  `standard_work_hour` int(11) DEFAULT NULL,
  `standard_payment` float DEFAULT NULL,
  `actual_amount` float DEFAULT NULL,
  `labor_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`payment_id`),
  KEY `labor_id_pm_fk_idx` (`labor_id`),
  CONSTRAINT `labor_id_pm_fk` FOREIGN KEY (`labor_id`) REFERENCES `labor_table` (`labor_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `performance_table`
--

DROP TABLE IF EXISTS `performance_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `performance_table` (
  `labor_id` int(11) NOT NULL,
  `labor_name` varchar(45) DEFAULT NULL,
  `increased_payment` float DEFAULT NULL,
  `less_payment` float DEFAULT NULL,
  `total_payment` float DEFAULT NULL,
  PRIMARY KEY (`labor_id`),
  CONSTRAINT `labor_id_pt_fk` FOREIGN KEY (`labor_id`) REFERENCES `labor_table` (`labor_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping routines for database 'labor_wage_management'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-05 19:09:29
