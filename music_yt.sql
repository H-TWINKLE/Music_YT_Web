/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50622
 Source Host           : localhost:3306
 Source Schema         : music_yt

 Target Server Type    : MySQL
 Target Server Version : 50622
 File Encoding         : 65001

 Date: 05/12/2019 23:26:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for authorlist
-- ----------------------------
DROP TABLE IF EXISTS `authorlist`;
CREATE TABLE `authorlist`  (
  `authorlist_id` int(11) NOT NULL AUTO_INCREMENT,
  `authorlist_user` int(255) NULL DEFAULT NULL,
  `authorlist_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `authorlist_pic` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `authorlist_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`authorlist_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of authorlist
-- ----------------------------
INSERT INTO `authorlist` VALUES (1, 10559, '张惠妹', 'http://p2.music.126.net/F9asgcj7C7qSl_je9XDvRw==/603631883675241.jpg?param=130y130', '2019-11-17 10:16:05');
INSERT INTO `authorlist` VALUES (2, 5345, '万晓利', 'http://p1.music.126.net/TiRAIiIihOgtBgYB6DZRXA==/109951162916034289.jpg?param=130y130', '2019-11-18 23:09:24');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `comment_playlist` bigint(20) NULL DEFAULT NULL,
  `comment_user` int(11) NULL DEFAULT NULL,
  `comment_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `comment_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`comment_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (8, 3779629, 1, 'xxx', '2019-11-18 22:24:32');
INSERT INTO `comment` VALUES (9, 3778678, 1, '3333', '2019-11-18 22:26:04');
INSERT INTO `comment` VALUES (10, 3778678, 1, 'eeeeeeeeeeeeeeeeeeeeeee', '2019-11-18 22:31:22');

-- ----------------------------
-- Table structure for playlist
-- ----------------------------
DROP TABLE IF EXISTS `playlist`;
CREATE TABLE `playlist`  (
  `playlist_id` int(11) NOT NULL AUTO_INCREMENT,
  `playlist_user` bigint(20) NULL DEFAULT NULL,
  `playlist_name` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `playlist_pic` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `playlist_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`playlist_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of playlist
-- ----------------------------
INSERT INTO `playlist` VALUES (1, 2819914042, '[一周日语上新] 性感歌姬倖田來未携《re(CORD)》帅气上线', 'http://p4.music.126.net/PiQ3T2GYN_qucSiMiv5sCQ==/109951164492148716.jpg?param=200y200', '2019-11-17 11:24:38');
INSERT INTO `playlist` VALUES (2, 2957977406, '独立摇滚：请收下你的人生浪费指南', 'http://p3.music.126.net/hlp7R-siOhD944uH0P38DQ==/109951164475753436.jpg?param=200y200', '2019-11-18 23:07:37');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_admin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_pass` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_photo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_role` int(11) NULL DEFAULT NULL,
  `user_create_time` datetime(0) NULL DEFAULT NULL,
  `user_update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '张三', '123', '123', '4@163.com', NULL, 1002, '2019-11-18 22:49:19', '2019-11-18 22:49:21');
INSERT INTO `user` VALUES (2, '5', '5', '5', 'r@qq.com', NULL, 1001, '2019-11-17 11:52:31', '2019-11-17 11:52:31');

SET FOREIGN_KEY_CHECKS = 1;
