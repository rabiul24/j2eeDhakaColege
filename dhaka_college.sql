CREATE DATABASE  IF NOT EXISTS `dhaka_college` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `dhaka_college`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: dhaka_college
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.16-MariaDB

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
-- Table structure for table `employer_info`
--

DROP TABLE IF EXISTS `employer_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employer_info` (
  `id` varchar(45) NOT NULL,
  `company` varchar(70) NOT NULL,
  `comtype` varchar(45) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `coutry` varchar(45) DEFAULT NULL,
  `website` varchar(100) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employer_info`
--

LOCK TABLES `employer_info` WRITE;
/*!40000 ALTER TABLE `employer_info` DISABLE KEYS */;
INSERT INTO `employer_info` VALUES ('parves45','Creative It Ltd','Training Academy','Dhamondi, Dhaka','Dhaka','Bangladesh','www.alfarves.com','01929645480');
/*!40000 ALTER TABLE `employer_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hosteladd`
--

DROP TABLE IF EXISTS `hosteladd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hosteladd` (
  `roll_number` varchar(45) NOT NULL,
  `transaction_id` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `amount` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`roll_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hosteladd`
--

LOCK TABLES `hosteladd` WRITE;
/*!40000 ALTER TABLE `hosteladd` DISABLE KEYS */;
INSERT INTO `hosteladd` VALUES ('7255','10001','01989211528','3420');
/*!40000 ALTER TABLE `hosteladd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `information`
--

DROP TABLE IF EXISTS `information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `information` (
  `Teacher_Information` varchar(45) NOT NULL,
  `Student_Information` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Teacher_Information`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `information`
--

LOCK TABLES `information` WRITE;
/*!40000 ALTER TABLE `information` DISABLE KEYS */;
/*!40000 ALTER TABLE `information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notice` (
  `notice_sl` int(11) NOT NULL,
  `class_susspend_notice` longtext,
  `exam_notice` longtext,
  `recent_impotant_notice` longtext,
  `Date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`notice_sl`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
INSERT INTO `notice` VALUES (1,'class stop for masters Exam from 2aug to 5aug 2016','** 2016-01-12, Notice for Class XI 3rd term Exam Routine ',' Notice for Department of Accounting BBA 3rd Year (Session 2013-2014) Class Starting ***','2016-08-07'),(2,'Notice for Department of Accounting, MBA (2013-2014) Absent Students list for police.','***  Department of Accounting, Notice for MBA (2013-2014) Test Exam Routine *',' Notice for Department of Accounting BBA 3rd Year (Session 2013-2014) Class Starting ***','2016-06-18'),(3,'class stop 17 aug','***  Department of Accounting, Notice for MBA (2013-2014) Test Exam Routine *',' Notice for Department of Accounting BBA 3rd Year (Session 2013-2014) Class Starting ***','2016-08-11'),(4,'','2016	Notice for Department of Accounting BBA (Hon’s) 1st Year (Session 2014-2015) in course Correction Exam Routine','Notice for Department of Accounting Most important BBA (Hon’s) 1st Year (Session 2015-2016)','2016-08-12'),(5,'Notice for Department of Accounting BBA ','2016	Notice for Department of Accounting BBA (Hon’s) 1st Year (Session 2014-2015) in course Correction Exam Routine','Notice for Department of Accounting Most important BBA (Hon’s) 1st Year (Session 2015-2016)','2016-08-13');
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parsonal_info`
--

DROP TABLE IF EXISTS `parsonal_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parsonal_info` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `mname` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `nationality` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `maritualstatus` varchar(45) DEFAULT NULL,
  `religion` varchar(45) DEFAULT NULL,
  `home_phone` varchar(45) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `par_address` varchar(100) DEFAULT NULL,
  `simage` varchar(100) DEFAULT NULL,
  `mail_address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parsonal_info`
--

LOCK TABLES `parsonal_info` WRITE;
/*!40000 ALTER TABLE `parsonal_info` DISABLE KEYS */;
INSERT INTO `parsonal_info` VALUES (1173089,'Azim Hossain Biddut','azim@gmail.com','Azhar Ali','Sokina Begam','2015-05-04','Bangladesh','Male','Married','Muslim','01929645480','01929645480','01929645480','/resources/1173089.jpg','01929645480');
/*!40000 ALTER TABLE `parsonal_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `father_name` varchar(45) DEFAULT NULL,
  `mather_name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `gairdian_phone` varchar(45) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `Attendencs` varchar(45) DEFAULT NULL,
  `media` varchar(45) DEFAULT NULL,
  `seesion` varchar(45) DEFAULT NULL,
  `dob` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `religion` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `year` varchar(45) DEFAULT NULL,
  `nId` varchar(45) DEFAULT NULL,
  `PresentAdd` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (7255,'Md.Rabiul Islam','Md.Nurul Islam','Altafunnessah','Shibgang, Bogra','01989211582','01724628576','Psychology','70%','Masters','2011-2012','01-03-1990','Male','Islam','st7.jpg','Final Year','010311907777432121','Jigatolo, Dhaka'),(88925,'Md.Faruk Siddique','Md.Khaleque','Merina','jamalpur, Madargang','01985965896','01754256256','Accounting','10%','Honours','2014-2013','1995-02-06','Male','Islam','st4.jpg','First',NULL,NULL),(89923,'Md. Shajib hossian','aleuddin','Malek','Khulna, Shamnagar','01911560321','01237845123','Statistic','20%','Honours','2012-2013','1995-01-04','Male','Islam','st2.jpg','second ',NULL,NULL),(89924,'Md.Ratul Hossin','Abdur Rahman','Jainal Hazary','Bogra, Banani','01998933226','01985452665','Bangla','60%','Honours','2014-2013','1995-02-03','Male','Islam','st8.jpg','second',NULL,NULL),(99659,'Md.Mumunur Rashid','Md.Mohbul ','Momena','Netrokon,jaria','01985986598','01551524652','Acoounting','80%','Masters','2015-2016','1992-01-03','Male','Islam','st5.jpg','Final',NULL,NULL),(321456,'Md.Foysal','Hafijur Rahman','Beauty Akter','Shirajgang','01985922663','524156326','Accounting','20%','Honours','2014-2015','1995-02-03','Male','Islam','st1.jpg','Third',NULL,NULL),(898564,'Md.Zillur Rahman','Md.Sabuj rahman','Joytunnesa','Netrokona, Jaria','01958625666','01245652252','Acounting','50%','Masters','2015-2016','1990-02-03','Male','Islam','st6.jpg','Final',NULL,NULL);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_account`
--

DROP TABLE IF EXISTS `student_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_account` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `dob` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_account`
--

LOCK TABLES `student_account` WRITE;
/*!40000 ALTER TABLE `student_account` DISABLE KEYS */;
INSERT INTO `student_account` VALUES ('10001','222','rewr','',''),('234rwe','34234','erwerw','23423','12-12-12'),('robi','rabiul','2222','01989211528','1990-1-02'),('rrrr','rabiul','2222','01989211528',NULL);
/*!40000 ALTER TABLE `student_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_info`
--

DROP TABLE IF EXISTS `student_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_info` (
  `First_Name` varchar(45) NOT NULL,
  `Last_Name` varchar(45) DEFAULT NULL,
  `Dob` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `Religion` varchar(45) DEFAULT NULL,
  `Nid` varchar(45) DEFAULT NULL,
  `Present_Address` longtext,
  `Permanent_Address` longtext,
  `Father_Name` varchar(45) DEFAULT NULL,
  `Phone` varchar(45) DEFAULT NULL,
  `Mother_name` varchar(45) DEFAULT NULL,
  `M_phone` varchar(45) DEFAULT NULL,
  `Stu_email` varchar(45) DEFAULT NULL,
  `Stu_phon` varchar(45) DEFAULT NULL,
  `Blood_group` varchar(45) DEFAULT NULL,
  `Image` varchar(45) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `year` varchar(45) DEFAULT NULL,
  `semis` varchar(45) DEFAULT NULL,
  `session` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`First_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_info`
--

LOCK TABLES `student_info` WRITE;
/*!40000 ALTER TABLE `student_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher_account`
--

DROP TABLE IF EXISTS `teacher_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher_account` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `dateofBirth` varchar(45) NOT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_account`
--

LOCK TABLES `teacher_account` WRITE;
/*!40000 ALTER TABLE `teacher_account` DISABLE KEYS */;
INSERT INTO `teacher_account` VALUES ('','','','',''),('1000','222','rewr','01989211528','rtretr'),('765757','tuiyuiu','uiououo','kljlkjl','1990-02-02'),('7657ty','tuiyuiu','uiououo','kljlkjl','1990-02-02'),('ert','rtret','','',''),('ert42345','rtret','4564','tyrtyr','tyrtyrty'),('ertert','retert','ertrt','gdfg','rtretr'),('kao123','Kaoser','kkk111','0198922152','2001-11-11'),('kaoser','kkkk','2424','1990-02-03',NULL),('rdfsfs','rtretdsfgsd','weeerr','01234','19-12-12'),('rk','Rabiul Islam','32','01989211528','1990-6-6'),('rkoiuo','Rabiul Islam','1','01989211528','1990-6-6'),('robi','Rabiul','2222','1990-01-01','01989211528'),('robi22','Rabiul','2222','1990-06-03',NULL);
/*!40000 ALTER TABLE `teacher_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher_info`
--

DROP TABLE IF EXISTS `teacher_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher_info` (
  `Teacher_Id` int(11) NOT NULL,
  `Teacher_Name` varchar(45) DEFAULT NULL,
  `Father_or_HusbandName` varchar(45) DEFAULT NULL,
  `Mother_Name` varchar(45) DEFAULT NULL,
  `Date_of_Birth` date DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `Relegion` varchar(45) DEFAULT NULL,
  `Blood_Group` varchar(45) DEFAULT NULL,
  `Image` varchar(45) DEFAULT NULL,
  `Department` varchar(45) DEFAULT NULL,
  `Designation` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Teacher_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_info`
--

LOCK TABLES `teacher_info` WRITE;
/*!40000 ALTER TABLE `teacher_info` DISABLE KEYS */;
INSERT INTO `teacher_info` VALUES (119,'Rokeya ParvinI','Mahbubur Rahman ',' 	Begum Fatema Rahmanv','1968-11-01',' 	Female ',' 	Islam ','A+','tea3.jpg','Accounting ','Associate Professor'),(561,'Mustary Begum','Abdul Jalil','Sufia Begum','1958-02-12','Female','Islam',' 	A+ ','tea1.jpg',' 	 Accountingr','Professor'),(8892,'Abul Mohsin','Abdul Mannan','Momtaz Akter','1973-01-19',' 	Male ',' 	Islam ',' 	A+ ','tea5.jpg','Accounting','Assistant Professor'),(9822,'Mangal Chandra',' 	 	Jatindra Nath ',' 	 	Aroti Rani Paul','1971-02-23','Male','Hindu','B+','tea6.jpg','Accounting','Associate Professor'),(11542,'Shankar Chandra','Naresh Chandra','Halen Bala','1964-02-12',' 	Male ','Hindu','A+ ','tea2.jpg','Accounting','Associate Professor'),(15146,'Mohamad Nasir','mohamamad Giash','Jamila Begum','1977-10-26',' 	Male ','Islam',' 	B+ ','tea4.jpg','Accounting','Assistant Professor');
/*!40000 ALTER TABLE `teacher_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trinee_info`
--

DROP TABLE IF EXISTS `trinee_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trinee_info` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `d_birth` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trinee_info`
--

LOCK TABLES `trinee_info` WRITE;
/*!40000 ALTER TABLE `trinee_info` DISABLE KEYS */;
INSERT INTO `trinee_info` VALUES (1173081,'Manjaru Islam','2016-01-19'),(1173087,'Rakibul Hossain','2015-12-01'),(1173088,'Md.ABDULLAH AL FARVES','1989-02-01'),(1173089,'Azim Hossain Biddut','2015-05-04'),(1173090,'Farukul Hossain','2015-05-04'),(1173091,'Jibon Mia','2015-05-04'),(1173092,'Rezaul Islam','2015-05-04'),(1173093,'AL Mamaun','2015-05-04'),(1173094,'Saleh Ahammde babor','2015-05-04'),(1173095,'Chabed Alam','2015-05-04'),(1173096,'Lokman Hossain','2015-05-04'),(1173097,'Saidul Islam','2015-05-04'),(1173098,'Saimulj Jaman','2015-05-04'),(1173099,'Rajib Hossain','2015-05-04'),(1173100,'Abdul Rahman','2015-05-04'),(1173101,'Fojleh Rabbi','2015-05-04'),(1173102,'Azimul Islam biddut','2015-05-04');
/*!40000 ALTER TABLE `trinee_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_account`
--

DROP TABLE IF EXISTS `user_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_account` (
  `id` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_account`
--

LOCK TABLES `user_account` WRITE;
/*!40000 ALTER TABLE `user_account` DISABLE KEYS */;
INSERT INTO `user_account` VALUES ('robi','2222');
/*!40000 ALTER TABLE `user_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'dhaka_college'
--

--
-- Dumping routines for database 'dhaka_college'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-12 19:46:21
