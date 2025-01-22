-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm7049m
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `ssm7049m`
--

/*!40000 DROP DATABASE IF EXISTS `ssm7049m`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssm7049m` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssm7049m`;

--
-- Table structure for table `caigoudingdan`
--

DROP TABLE IF EXISTS `caigoudingdan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `caigoudingdan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `caigoubianhao` varchar(200) DEFAULT NULL COMMENT '采购编号',
  `yaopinbianhao` varchar(200) DEFAULT NULL COMMENT '药品编号',
  `yaopinmingcheng` varchar(200) DEFAULT NULL COMMENT '药品名称',
  `yaopinzhengshiming` varchar(200) DEFAULT NULL COMMENT '药品正式名',
  `guige` varchar(200) DEFAULT NULL COMMENT '规格',
  `danwei` varchar(200) DEFAULT NULL COMMENT '单位',
  `chandi` varchar(200) DEFAULT NULL COMMENT '产地',
  `yaopinshuliang` int(11) DEFAULT NULL COMMENT '药品数量',
  `yaopinjinjia` float DEFAULT NULL COMMENT '药品进价',
  `zongjine` float DEFAULT NULL COMMENT '总金额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `caigoubianhao` (`caigoubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='采购订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caigoudingdan`
--

LOCK TABLES `caigoudingdan` WRITE;
/*!40000 ALTER TABLE `caigoudingdan` DISABLE KEYS */;
INSERT INTO `caigoudingdan` VALUES (71,'2022-03-03 13:32:58','1111111111','药品编号1','药品名称1','药品正式名1','规格1','单位1','产地1',1,1,1),(72,'2022-03-03 13:32:58','2222222222','药品编号2','药品名称2','药品正式名2','规格2','单位2','产地2',2,2,2),(73,'2022-03-03 13:32:58','3333333333','药品编号3','药品名称3','药品正式名3','规格3','单位3','产地3',3,3,3),(74,'2022-03-03 13:32:58','4444444444','药品编号4','药品名称4','药品正式名4','规格4','单位4','产地4',4,4,4),(75,'2022-03-03 13:32:58','5555555555','药品编号5','药品名称5','药品正式名5','规格5','单位5','产地5',5,5,5),(76,'2022-03-03 13:32:58','6666666666','药品编号6','药品名称6','药品正式名6','规格6','单位6','产地6',6,6,6);
/*!40000 ALTER TABLE `caigoudingdan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `caiwubu`
--

DROP TABLE IF EXISTS `caiwubu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `caiwubu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuangonggonghao` (`yuangonggonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='财务部';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caiwubu`
--

LOCK TABLES `caiwubu` WRITE;
/*!40000 ALTER TABLE `caiwubu` DISABLE KEYS */;
INSERT INTO `caiwubu` VALUES (61,'2022-03-03 13:32:58','员工工号1','员工姓名1','123456','男','13823888881','440300199101010001'),(62,'2022-03-03 13:32:58','员工工号2','员工姓名2','123456','男','13823888882','440300199202020002'),(63,'2022-03-03 13:32:58','员工工号3','员工姓名3','123456','男','13823888883','440300199303030003'),(64,'2022-03-03 13:32:58','员工工号4','员工姓名4','123456','男','13823888884','440300199404040004'),(65,'2022-03-03 13:32:58','员工工号5','员工姓名5','123456','男','13823888885','440300199505050005'),(66,'2022-03-03 13:32:58','员工工号6','员工姓名6','123456','男','13823888886','440300199606060006');
/*!40000 ALTER TABLE `caiwubu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cangchubumen`
--

DROP TABLE IF EXISTS `cangchubumen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cangchubumen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuangonggonghao` (`yuangonggonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='仓储部门';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cangchubumen`
--

LOCK TABLES `cangchubumen` WRITE;
/*!40000 ALTER TABLE `cangchubumen` DISABLE KEYS */;
INSERT INTO `cangchubumen` VALUES (21,'2022-03-03 13:32:58','员工工号1','员工姓名1','123456','男','13823888881','440300199101010001'),(22,'2022-03-03 13:32:58','员工工号2','员工姓名2','123456','男','13823888882','440300199202020002'),(23,'2022-03-03 13:32:58','员工工号3','员工姓名3','123456','男','13823888883','440300199303030003'),(24,'2022-03-03 13:32:58','员工工号4','员工姓名4','123456','男','13823888884','440300199404040004'),(25,'2022-03-03 13:32:58','员工工号5','员工姓名5','123456','男','13823888885','440300199505050005'),(26,'2022-03-03 13:32:58','员工工号6','员工姓名6','123456','男','13823888886','440300199606060006');
/*!40000 ALTER TABLE `cangchubumen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gongyingbumen`
--

DROP TABLE IF EXISTS `gongyingbumen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gongyingbumen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuangonggonghao` (`yuangonggonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='供应部门';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gongyingbumen`
--

LOCK TABLES `gongyingbumen` WRITE;
/*!40000 ALTER TABLE `gongyingbumen` DISABLE KEYS */;
INSERT INTO `gongyingbumen` VALUES (31,'2022-03-03 13:32:58','员工工号1','员工姓名1','123456','男','13823888881','440300199101010001'),(32,'2022-03-03 13:32:58','员工工号2','员工姓名2','123456','男','13823888882','440300199202020002'),(33,'2022-03-03 13:32:58','员工工号3','员工姓名3','123456','男','13823888883','440300199303030003'),(34,'2022-03-03 13:32:58','员工工号4','员工姓名4','123456','男','13823888884','440300199404040004'),(35,'2022-03-03 13:32:58','员工工号5','员工姓名5','123456','男','13823888885','440300199505050005'),(36,'2022-03-03 13:32:58','员工工号6','员工姓名6','123456','男','13823888886','440300199606060006');
/*!40000 ALTER TABLE `gongyingbumen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guoqiyaopin`
--

DROP TABLE IF EXISTS `guoqiyaopin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guoqiyaopin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yaopinbianhao` varchar(200) DEFAULT NULL COMMENT '药品编号',
  `yaopinmingcheng` varchar(200) DEFAULT NULL COMMENT '药品名称',
  `yaopinzhengshiming` varchar(200) DEFAULT NULL COMMENT '药品正式名',
  `guige` varchar(200) DEFAULT NULL COMMENT '规格',
  `danwei` varchar(200) DEFAULT NULL COMMENT '单位',
  `chandi` varchar(200) DEFAULT NULL COMMENT '产地',
  `shengchanriqi` date DEFAULT NULL COMMENT '生产日期',
  `yaopinshuliang` int(11) DEFAULT NULL COMMENT '药品数量',
  `yaopinjinjia` varchar(200) DEFAULT NULL COMMENT '药品进价',
  `yaopinshoujia` varchar(200) DEFAULT NULL COMMENT '药品售价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='过期药品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guoqiyaopin`
--

LOCK TABLES `guoqiyaopin` WRITE;
/*!40000 ALTER TABLE `guoqiyaopin` DISABLE KEYS */;
INSERT INTO `guoqiyaopin` VALUES (101,'2022-03-03 13:32:58','药品编号1','药品名称1','药品正式名1','规格1','单位1','产地1','2022-03-03',1,'药品进价1','药品售价1'),(102,'2022-03-03 13:32:58','药品编号2','药品名称2','药品正式名2','规格2','单位2','产地2','2022-03-03',2,'药品进价2','药品售价2'),(103,'2022-03-03 13:32:58','药品编号3','药品名称3','药品正式名3','规格3','单位3','产地3','2022-03-03',3,'药品进价3','药品售价3'),(104,'2022-03-03 13:32:58','药品编号4','药品名称4','药品正式名4','规格4','单位4','产地4','2022-03-03',4,'药品进价4','药品售价4'),(105,'2022-03-03 13:32:58','药品编号5','药品名称5','药品正式名5','规格5','单位5','产地5','2022-03-03',5,'药品进价5','药品售价5'),(106,'2022-03-03 13:32:58','药品编号6','药品名称6','药品正式名6','规格6','单位6','产地6','2022-03-03',6,'药品进价6','药品售价6');
/*!40000 ALTER TABLE `guoqiyaopin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kehu`
--

DROP TABLE IF EXISTS `kehu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kehu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kehumingcheng` varchar(200) DEFAULT NULL COMMENT '客户名称',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `kehulaiyuan` varchar(200) DEFAULT NULL COMMENT '客户来源',
  `xingye` varchar(200) DEFAULT NULL COMMENT '行业',
  `guojiadiqu` varchar(200) DEFAULT NULL COMMENT '国家地区',
  `kehudianhua` varchar(200) DEFAULT NULL COMMENT '客户电话',
  `kehudizhi` varchar(200) DEFAULT NULL COMMENT '客户地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `kehumingcheng` (`kehumingcheng`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='客户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kehu`
--

LOCK TABLES `kehu` WRITE;
/*!40000 ALTER TABLE `kehu` DISABLE KEYS */;
INSERT INTO `kehu` VALUES (51,'2022-03-03 13:32:58','客户名称1','123456','业务员发展','行业1','国家地区1','客户电话1','客户地址1'),(52,'2022-03-03 13:32:58','客户名称2','123456','业务员发展','行业2','国家地区2','客户电话2','客户地址2'),(53,'2022-03-03 13:32:58','客户名称3','123456','业务员发展','行业3','国家地区3','客户电话3','客户地址3'),(54,'2022-03-03 13:32:58','客户名称4','123456','业务员发展','行业4','国家地区4','客户电话4','客户地址4'),(55,'2022-03-03 13:32:58','客户名称5','123456','业务员发展','行业5','国家地区5','客户电话5','客户地址5'),(56,'2022-03-03 13:32:58','客户名称6','123456','业务员发展','行业6','国家地区6','客户电话6','客户地址6');
/*!40000 ALTER TABLE `kehu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kehudingdan`
--

DROP TABLE IF EXISTS `kehudingdan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kehudingdan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT '订单编号',
  `yaopinbianhao` varchar(200) DEFAULT NULL COMMENT '药品编号',
  `yaopinmingcheng` varchar(200) DEFAULT NULL COMMENT '药品名称',
  `yaopinzhengshiming` varchar(200) DEFAULT NULL COMMENT '药品正式名',
  `guige` varchar(200) DEFAULT NULL COMMENT '规格',
  `danwei` varchar(200) DEFAULT NULL COMMENT '单位',
  `chandi` varchar(200) DEFAULT NULL COMMENT '产地',
  `shengchanriqi` date DEFAULT NULL COMMENT '生产日期',
  `yaopinshuliang` int(11) DEFAULT NULL COMMENT '药品数量',
  `yaopinshoujia` float DEFAULT NULL COMMENT '药品售价',
  `zongjine` float DEFAULT NULL COMMENT '总金额',
  `kehumingcheng` varchar(200) DEFAULT NULL COMMENT '客户名称',
  `kehudianhua` varchar(200) DEFAULT NULL COMMENT '客户电话',
  `kehudizhi` varchar(200) DEFAULT NULL COMMENT '客户地址',
  `dengjishijian` datetime DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dingdanbianhao` (`dingdanbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='客户订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kehudingdan`
--

LOCK TABLES `kehudingdan` WRITE;
/*!40000 ALTER TABLE `kehudingdan` DISABLE KEYS */;
INSERT INTO `kehudingdan` VALUES (121,'2022-03-03 13:32:59','1111111111','药品编号1','药品名称1','药品正式名1','规格1','单位1','产地1','2022-03-03',1,1,1,'客户名称1','客户电话1','客户地址1','2022-03-03 21:32:59'),(122,'2022-03-03 13:32:59','2222222222','药品编号2','药品名称2','药品正式名2','规格2','单位2','产地2','2022-03-03',2,2,2,'客户名称2','客户电话2','客户地址2','2022-03-03 21:32:59'),(123,'2022-03-03 13:32:59','3333333333','药品编号3','药品名称3','药品正式名3','规格3','单位3','产地3','2022-03-03',3,3,3,'客户名称3','客户电话3','客户地址3','2022-03-03 21:32:59'),(124,'2022-03-03 13:32:59','4444444444','药品编号4','药品名称4','药品正式名4','规格4','单位4','产地4','2022-03-03',4,4,4,'客户名称4','客户电话4','客户地址4','2022-03-03 21:32:59'),(125,'2022-03-03 13:32:59','5555555555','药品编号5','药品名称5','药品正式名5','规格5','单位5','产地5','2022-03-03',5,5,5,'客户名称5','客户电话5','客户地址5','2022-03-03 21:32:59'),(126,'2022-03-03 13:32:59','6666666666','药品编号6','药品名称6','药品正式名6','规格6','单位6','产地6','2022-03-03',6,6,6,'客户名称6','客户电话6','客户地址6','2022-03-03 21:32:59');
/*!40000 ALTER TABLE `kehudingdan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuihuodingdan`
--

DROP TABLE IF EXISTS `tuihuodingdan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tuihuodingdan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT '订单编号',
  `yaopinbianhao` varchar(200) DEFAULT NULL COMMENT '药品编号',
  `yaopinmingcheng` varchar(200) DEFAULT NULL COMMENT '药品名称',
  `yaopinzhengshiming` varchar(200) DEFAULT NULL COMMENT '药品正式名',
  `guige` varchar(200) DEFAULT NULL COMMENT '规格',
  `danwei` varchar(200) DEFAULT NULL COMMENT '单位',
  `chandi` varchar(200) DEFAULT NULL COMMENT '产地',
  `tuihuoshuliang` int(11) DEFAULT NULL COMMENT '退货数量',
  `yaopinshoujia` float DEFAULT NULL COMMENT '药品售价',
  `tuikuanjine` float DEFAULT NULL COMMENT '退款金额',
  `kehumingcheng` varchar(200) DEFAULT NULL COMMENT '客户名称',
  `kehudianhua` varchar(200) DEFAULT NULL COMMENT '客户电话',
  `kehudizhi` varchar(200) DEFAULT NULL COMMENT '客户地址',
  `tuihuoshijian` datetime DEFAULT NULL COMMENT '退货时间',
  `tuihuoyuanyin` longtext COMMENT '退货原因',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='退货订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuihuodingdan`
--

LOCK TABLES `tuihuodingdan` WRITE;
/*!40000 ALTER TABLE `tuihuodingdan` DISABLE KEYS */;
INSERT INTO `tuihuodingdan` VALUES (131,'2022-03-03 13:32:59','订单编号1','药品编号1','药品名称1','药品正式名1','规格1','单位1','产地1',1,1,1,'客户名称1','客户电话1','客户地址1','2022-03-03 21:32:59','退货原因1','是',''),(132,'2022-03-03 13:32:59','订单编号2','药品编号2','药品名称2','药品正式名2','规格2','单位2','产地2',2,2,2,'客户名称2','客户电话2','客户地址2','2022-03-03 21:32:59','退货原因2','是',''),(133,'2022-03-03 13:32:59','订单编号3','药品编号3','药品名称3','药品正式名3','规格3','单位3','产地3',3,3,3,'客户名称3','客户电话3','客户地址3','2022-03-03 21:32:59','退货原因3','是',''),(134,'2022-03-03 13:32:59','订单编号4','药品编号4','药品名称4','药品正式名4','规格4','单位4','产地4',4,4,4,'客户名称4','客户电话4','客户地址4','2022-03-03 21:32:59','退货原因4','是',''),(135,'2022-03-03 13:32:59','订单编号5','药品编号5','药品名称5','药品正式名5','规格5','单位5','产地5',5,5,5,'客户名称5','客户电话5','客户地址5','2022-03-03 21:32:59','退货原因5','是',''),(136,'2022-03-03 13:32:59','订单编号6','药品编号6','药品名称6','药品正式名6','规格6','单位6','产地6',6,6,6,'客户名称6','客户电话6','客户地址6','2022-03-03 21:32:59','退货原因6','是','');
/*!40000 ALTER TABLE `tuihuodingdan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-03-03 13:32:59');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaoshoudingdan`
--

DROP TABLE IF EXISTS `xiaoshoudingdan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaoshoudingdan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiaoshoudanhao` varchar(200) DEFAULT NULL COMMENT '销售单号',
  `yaopinbianhao` varchar(200) DEFAULT NULL COMMENT '药品编号',
  `yaopinmingcheng` varchar(200) DEFAULT NULL COMMENT '药品名称',
  `yaopinzhengshiming` varchar(200) DEFAULT NULL COMMENT '药品正式名',
  `guige` varchar(200) DEFAULT NULL COMMENT '规格',
  `danwei` varchar(200) DEFAULT NULL COMMENT '单位',
  `chandi` varchar(200) DEFAULT NULL COMMENT '产地',
  `yaopinshuliang` int(11) DEFAULT NULL COMMENT '药品数量',
  `yaopinshoujia` float DEFAULT NULL COMMENT '药品售价',
  `zongjine` float DEFAULT NULL COMMENT '总金额',
  `kehumingcheng` varchar(200) DEFAULT NULL COMMENT '客户名称',
  `kehudianhua` varchar(200) DEFAULT NULL COMMENT '客户电话',
  `kehudizhi` varchar(200) DEFAULT NULL COMMENT '客户地址',
  `dengjishijian` datetime DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xiaoshoudanhao` (`xiaoshoudanhao`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='销售订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaoshoudingdan`
--

LOCK TABLES `xiaoshoudingdan` WRITE;
/*!40000 ALTER TABLE `xiaoshoudingdan` DISABLE KEYS */;
INSERT INTO `xiaoshoudingdan` VALUES (111,'2022-03-03 13:32:58','1111111111','药品编号1','药品名称1','药品正式名1','规格1','单位1','产地1',1,1,1,'客户名称1','客户电话1','客户地址1','2022-03-03 21:32:58'),(112,'2022-03-03 13:32:58','2222222222','药品编号2','药品名称2','药品正式名2','规格2','单位2','产地2',2,2,2,'客户名称2','客户电话2','客户地址2','2022-03-03 21:32:58'),(113,'2022-03-03 13:32:59','3333333333','药品编号3','药品名称3','药品正式名3','规格3','单位3','产地3',3,3,3,'客户名称3','客户电话3','客户地址3','2022-03-03 21:32:59'),(114,'2022-03-03 13:32:59','4444444444','药品编号4','药品名称4','药品正式名4','规格4','单位4','产地4',4,4,4,'客户名称4','客户电话4','客户地址4','2022-03-03 21:32:59'),(115,'2022-03-03 13:32:59','5555555555','药品编号5','药品名称5','药品正式名5','规格5','单位5','产地5',5,5,5,'客户名称5','客户电话5','客户地址5','2022-03-03 21:32:59'),(116,'2022-03-03 13:32:59','6666666666','药品编号6','药品名称6','药品正式名6','规格6','单位6','产地6',6,6,6,'客户名称6','客户电话6','客户地址6','2022-03-03 21:32:59');
/*!40000 ALTER TABLE `xiaoshoudingdan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yaopinchuku`
--

DROP TABLE IF EXISTS `yaopinchuku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yaopinchuku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yaopinbianhao` varchar(200) DEFAULT NULL COMMENT '药品编号',
  `yaopinmingcheng` varchar(200) DEFAULT NULL COMMENT '药品名称',
  `yaopinzhengshiming` varchar(200) DEFAULT NULL COMMENT '药品正式名',
  `guige` varchar(200) DEFAULT NULL COMMENT '规格',
  `danwei` varchar(200) DEFAULT NULL COMMENT '单位',
  `chandi` varchar(200) DEFAULT NULL COMMENT '产地',
  `shengchanriqi` date DEFAULT NULL COMMENT '生产日期',
  `yaopinshuliang` int(11) DEFAULT NULL COMMENT '药品数量',
  `yaopinshoujia` float DEFAULT NULL COMMENT '药品售价',
  `zongjine` float DEFAULT NULL COMMENT '总金额',
  `kehumingcheng` varchar(200) DEFAULT NULL COMMENT '客户名称',
  `kehudianhua` varchar(200) DEFAULT NULL COMMENT '客户电话',
  `kehudizhi` varchar(200) DEFAULT NULL COMMENT '客户地址',
  `chukushijian` datetime DEFAULT NULL COMMENT '出库时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='药品出库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yaopinchuku`
--

LOCK TABLES `yaopinchuku` WRITE;
/*!40000 ALTER TABLE `yaopinchuku` DISABLE KEYS */;
INSERT INTO `yaopinchuku` VALUES (91,'2022-03-03 13:32:58','药品编号1','药品名称1','药品正式名1','规格1','单位1','产地1','2022-03-03',1,1,1,'客户名称1','客户电话1','客户地址1','2022-03-03 21:32:58'),(92,'2022-03-03 13:32:58','药品编号2','药品名称2','药品正式名2','规格2','单位2','产地2','2022-03-03',2,2,2,'客户名称2','客户电话2','客户地址2','2022-03-03 21:32:58'),(93,'2022-03-03 13:32:58','药品编号3','药品名称3','药品正式名3','规格3','单位3','产地3','2022-03-03',3,3,3,'客户名称3','客户电话3','客户地址3','2022-03-03 21:32:58'),(94,'2022-03-03 13:32:58','药品编号4','药品名称4','药品正式名4','规格4','单位4','产地4','2022-03-03',4,4,4,'客户名称4','客户电话4','客户地址4','2022-03-03 21:32:58'),(95,'2022-03-03 13:32:58','药品编号5','药品名称5','药品正式名5','规格5','单位5','产地5','2022-03-03',5,5,5,'客户名称5','客户电话5','客户地址5','2022-03-03 21:32:58'),(96,'2022-03-03 13:32:58','药品编号6','药品名称6','药品正式名6','规格6','单位6','产地6','2022-03-03',6,6,6,'客户名称6','客户电话6','客户地址6','2022-03-03 21:32:58');
/*!40000 ALTER TABLE `yaopinchuku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yaopinruku`
--

DROP TABLE IF EXISTS `yaopinruku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yaopinruku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yaopinbianhao` varchar(200) DEFAULT NULL COMMENT '药品编号',
  `yaopinmingcheng` varchar(200) DEFAULT NULL COMMENT '药品名称',
  `yaopinzhengshiming` varchar(200) DEFAULT NULL COMMENT '药品正式名',
  `guige` varchar(200) DEFAULT NULL COMMENT '规格',
  `danwei` varchar(200) DEFAULT NULL COMMENT '单位',
  `chandi` varchar(200) DEFAULT NULL COMMENT '产地',
  `shengchanriqi` date DEFAULT NULL COMMENT '生产日期',
  `yaopinshuliang` int(11) DEFAULT NULL COMMENT '药品数量',
  `yaopinjinjia` float DEFAULT NULL COMMENT '药品进价',
  `yaopinshoujia` float DEFAULT NULL COMMENT '药品售价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='药品入库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yaopinruku`
--

LOCK TABLES `yaopinruku` WRITE;
/*!40000 ALTER TABLE `yaopinruku` DISABLE KEYS */;
INSERT INTO `yaopinruku` VALUES (81,'2022-03-03 13:32:58','药品编号1','药品名称1','药品正式名1','规格1','单位1','产地1','2022-03-03',1,1,1),(82,'2022-03-03 13:32:58','药品编号2','药品名称2','药品正式名2','规格2','单位2','产地2','2022-03-03',2,2,2),(83,'2022-03-03 13:32:58','药品编号3','药品名称3','药品正式名3','规格3','单位3','产地3','2022-03-03',3,3,3),(84,'2022-03-03 13:32:58','药品编号4','药品名称4','药品正式名4','规格4','单位4','产地4','2022-03-03',4,4,4),(85,'2022-03-03 13:32:58','药品编号5','药品名称5','药品正式名5','规格5','单位5','产地5','2022-03-03',5,5,5),(86,'2022-03-03 13:32:58','药品编号6','药品名称6','药品正式名6','规格6','单位6','产地6','2022-03-03',6,6,6);
/*!40000 ALTER TABLE `yaopinruku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yaopinxinxi`
--

DROP TABLE IF EXISTS `yaopinxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yaopinxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yaopinbianhao` varchar(200) DEFAULT NULL COMMENT '药品编号',
  `yaopinmingcheng` varchar(200) DEFAULT NULL COMMENT '药品名称',
  `yaopinzhengshiming` varchar(200) DEFAULT NULL COMMENT '药品正式名',
  `guige` varchar(200) DEFAULT NULL COMMENT '规格',
  `danwei` varchar(200) DEFAULT NULL COMMENT '单位',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `leibie` varchar(200) DEFAULT NULL COMMENT '类别',
  `chandi` varchar(200) DEFAULT NULL COMMENT '产地',
  `baohao` varchar(200) DEFAULT NULL COMMENT '报号',
  `youxiaoqi` varchar(200) DEFAULT NULL COMMENT '有效期',
  `shengchanriqi` date DEFAULT NULL COMMENT '生产日期',
  `pizhunwenhao` varchar(200) DEFAULT NULL COMMENT '批准文号',
  `yaopinshuliang` int(11) DEFAULT NULL COMMENT '药品数量',
  `yaopinjinjia` float DEFAULT NULL COMMENT '药品进价',
  `yaopinshoujia` float DEFAULT NULL COMMENT '药品售价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='药品信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yaopinxinxi`
--

LOCK TABLES `yaopinxinxi` WRITE;
/*!40000 ALTER TABLE `yaopinxinxi` DISABLE KEYS */;
INSERT INTO `yaopinxinxi` VALUES (11,'2022-03-03 13:32:58','药品编号1','药品名称1','药品正式名1','规格1','单位1','类型1','类别1','产地1','报号1','有效期1','2022-03-03','批准文号1',1,1,1),(12,'2022-03-03 13:32:58','药品编号2','药品名称2','药品正式名2','规格2','单位2','类型2','类别2','产地2','报号2','有效期2','2022-03-03','批准文号2',2,2,2),(13,'2022-03-03 13:32:58','药品编号3','药品名称3','药品正式名3','规格3','单位3','类型3','类别3','产地3','报号3','有效期3','2022-03-03','批准文号3',3,3,3),(14,'2022-03-03 13:32:58','药品编号4','药品名称4','药品正式名4','规格4','单位4','类型4','类别4','产地4','报号4','有效期4','2022-03-03','批准文号4',4,4,4),(15,'2022-03-03 13:32:58','药品编号5','药品名称5','药品正式名5','规格5','单位5','类型5','类别5','产地5','报号5','有效期5','2022-03-03','批准文号5',5,5,5),(16,'2022-03-03 13:32:58','药品编号6','药品名称6','药品正式名6','规格6','单位6','类型6','类别6','产地6','报号6','有效期6','2022-03-03','批准文号6',6,6,6);
/*!40000 ALTER TABLE `yaopinxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yewubumen`
--

DROP TABLE IF EXISTS `yewubumen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yewubumen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuangonggonghao` (`yuangonggonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='业务部门';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yewubumen`
--

LOCK TABLES `yewubumen` WRITE;
/*!40000 ALTER TABLE `yewubumen` DISABLE KEYS */;
INSERT INTO `yewubumen` VALUES (41,'2022-03-03 13:32:58','员工工号1','员工姓名1','123456','男','13823888881','440300199101010001'),(42,'2022-03-03 13:32:58','员工工号2','员工姓名2','123456','男','13823888882','440300199202020002'),(43,'2022-03-03 13:32:58','员工工号3','员工姓名3','123456','男','13823888883','440300199303030003'),(44,'2022-03-03 13:32:58','员工工号4','员工姓名4','123456','男','13823888884','440300199404040004'),(45,'2022-03-03 13:32:58','员工工号5','员工姓名5','123456','男','13823888885','440300199505050005'),(46,'2022-03-03 13:32:58','员工工号6','员工姓名6','123456','男','13823888886','440300199606060006');
/*!40000 ALTER TABLE `yewubumen` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-04 16:37:04
