-- MySQL dump 10.13  Distrib 5.5.35, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: securitydashboard
-- ------------------------------------------------------
-- Server version	5.5.35-0ubuntu0.13.10.2

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

DROP DATABASE IF EXISTS `securitydashboard`;
CREATE DATABASE IF NOT EXISTS `securitydashboard` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `securitydashboard`;

-- -----------------------------------------------------
-- Table `securitydashboard`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `securitydashboard`.`user` ;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE IF NOT EXISTS `securitydashboard`.`user` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `username_x` VARCHAR(50) NOT NULL,
  `password_x` VARCHAR(50) NOT NULL,
  `firstname_x` VARCHAR(100) NOT NULL,
  `lastname_x` VARCHAR(100) NOT NULL,
  `email_x` VARCHAR(100) NOT NULL,
  `enabled_b` TINYINT(1) NOT NULL,
  `salt_x` VARCHAR(25) NOT NULL DEFAULT 0,
  `created_d` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modificated_d` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `user_changed_id` BIGINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idx_id` (`id` ASC),
  UNIQUE INDEX `unique_username` (`username_x` ASC),
  UNIQUE INDEX `unique_email` (`email_x` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `securitydashboard`.`role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `securitydashboard`.`role` ;

CREATE TABLE IF NOT EXISTS `securitydashboard`.`role` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `role_x` VARCHAR(50) NOT NULL,
  `created_d` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modificated_d` TIMESTAMP NOT NULL DEFAULT '0000-00-00 00:00:00',
  `user_changed_id` BIGINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `securitydashboard`.`authorities`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `securitydashboard`.`authorities` ;

CREATE TABLE IF NOT EXISTS `securitydashboard`.`authorities` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT NOT NULL,
  `role_id` BIGINT NOT NULL,
  `created_d` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modificated_d` TIMESTAMP NOT NULL DEFAULT '0000-00-00 00:00:00',
  `user_changed_id` BIGINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `useridroleididx` (`user_id` ASC, `role_id` ASC),
  INDEX `rolefk_idx` (`role_id` ASC),
  CONSTRAINT `authoritiesuserfk`
    FOREIGN KEY (`user_id`)
    REFERENCES `securitydashboard`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `authoritiesrolefk`
    FOREIGN KEY (`role_id`)
    REFERENCES `securitydashboard`.`role` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Insert into `securitydashboard`.`role`
-- -----------------------------------------------------
INSERT INTO `securitydashboard`.`role` (`role_x`) VALUES ('ROLE_ADMIN'),('ROLE_USER');

-- -----------------------------------------------------
-- Insert into `securitydashboard`.`user`
-- -----------------------------------------------------
INSERT INTO `securitydashboard`.`user` (`username_x`,`password_x`,`firstname_x`,`lastname_x`,`email_x`,`enabled_b`,`salt_x`)
VALUES ('admin','admin','Administrator','Administrator','michael.glanvill@gmail.com',0,'12345');

-- -----------------------------------------------------
-- Insert into `securitydashboard`.`authorities`
-- -----------------------------------------------------
INSERT INTO `securitydashboard`.`authorities` (`user_id`,`role_id`) VALUES (1,1),(1,2);

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
