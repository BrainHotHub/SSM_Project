/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 60011
Source Host           : localhost:3306
Source Database       : crm

Target Server Type    : MYSQL
Target Server Version : 60011
File Encoding         : 65001

Date: 2015-08-11 13:45:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sysrolemenu
-- ----------------------------
DROP TABLE IF EXISTS `sysrolemenu`;
CREATE TABLE `sysrolemenu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `menu_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  KEY `menu_id` (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='权限关联表';

-- ----------------------------
-- Records of sysrolemenu
-- ----------------------------
INSERT INTO `sysrolemenu` VALUES ('1', '1', '2');
INSERT INTO `sysrolemenu` VALUES ('2', '1', '3');
INSERT INTO `sysrolemenu` VALUES ('3', '1', '201');
INSERT INTO `sysrolemenu` VALUES ('4', '1', '202');
INSERT INTO `sysrolemenu` VALUES ('5', '1', '301');
INSERT INTO `sysrolemenu` VALUES ('6', '2', '2');
INSERT INTO `sysrolemenu` VALUES ('7', '2', '201');
INSERT INTO `sysrolemenu` VALUES ('8', '2', '202');
INSERT INTO `sysrolemenu` VALUES ('9', '1', '101');
INSERT INTO `sysrolemenu` VALUES ('10', '2', '101');
INSERT INTO `sysrolemenu` VALUES ('11', '1', '1');
INSERT INTO `sysrolemenu` VALUES ('12', '2', '1');
INSERT INTO `sysrolemenu` VALUES ('13', '1', '4');
INSERT INTO `sysrolemenu` VALUES ('14', '1', '5');
INSERT INTO `sysrolemenu` VALUES ('15', '1', '401');
INSERT INTO `sysrolemenu` VALUES ('16', '1', '402');
INSERT INTO `sysrolemenu` VALUES ('17', '1', '403');
INSERT INTO `sysrolemenu` VALUES ('18', '1', '501');
INSERT INTO `sysrolemenu` VALUES ('19', '1', '6');
INSERT INTO `sysrolemenu` VALUES ('20', '1', '7');
INSERT INTO `sysrolemenu` VALUES ('21', '1', '8');
INSERT INTO `sysrolemenu` VALUES ('22', '1', '9');
INSERT INTO `sysrolemenu` VALUES ('23', '1', '601');
INSERT INTO `sysrolemenu` VALUES ('24', '1', '701');
INSERT INTO `sysrolemenu` VALUES ('25', '1', '801');
INSERT INTO `sysrolemenu` VALUES ('26', '1', '901');
INSERT INTO `sysrolemenu` VALUES ('27', '1', '302');
INSERT INTO `sysrolemenu` VALUES ('28', '1', '102');
INSERT INTO `sysrolemenu` VALUES ('29', '1', '404');
