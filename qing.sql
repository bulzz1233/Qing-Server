/*
 Navicat Premium Data Transfer

 Source Server         : bu
 Source Server Type    : MySQL
 Source Server Version : 50623
 Source Host           : localhost:3306
 Source Schema         : qing

 Target Server Type    : MySQL
 Target Server Version : 50623
 File Encoding         : 65001

 Date: 01/07/2022 20:45:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for finish
-- ----------------------------
DROP TABLE IF EXISTS `finish`;
CREATE TABLE `finish`  (
  `finish_Id` bigint(100) NOT NULL AUTO_INCREMENT,
  `user_Id` bigint(100) NULL DEFAULT NULL,
  `finish_Date` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  PRIMARY KEY (`finish_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_croatian_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of finish
-- ----------------------------
INSERT INTO `finish` VALUES (5, 20, '2022/6/29');
INSERT INTO `finish` VALUES (6, 23, '2022/7/4');
INSERT INTO `finish` VALUES (7, 23, '2022/7/1');

-- ----------------------------
-- Table structure for likes
-- ----------------------------
DROP TABLE IF EXISTS `likes`;
CREATE TABLE `likes`  (
  `likes_Id` bigint(100) NOT NULL AUTO_INCREMENT,
  `user_Id` bigint(100) NULL DEFAULT NULL,
  `sid` bigint(100) NULL DEFAULT NULL,
  PRIMARY KEY (`likes_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8 COLLATE = utf8_croatian_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of likes
-- ----------------------------
INSERT INTO `likes` VALUES (24, 20, 28);
INSERT INTO `likes` VALUES (30, 20, 19);
INSERT INTO `likes` VALUES (31, 21, 26);
INSERT INTO `likes` VALUES (32, 21, 21);
INSERT INTO `likes` VALUES (33, 22, 36);
INSERT INTO `likes` VALUES (34, 22, 26);
INSERT INTO `likes` VALUES (35, 23, 19);
INSERT INTO `likes` VALUES (36, 23, 23);
INSERT INTO `likes` VALUES (37, 23, 28);

-- ----------------------------
-- Table structure for plan
-- ----------------------------
DROP TABLE IF EXISTS `plan`;
CREATE TABLE `plan`  (
  `plan_Id` bigint(100) NOT NULL AUTO_INCREMENT,
  `user_Id` bigint(100) NULL DEFAULT NULL,
  `sport_Name` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `sport_Type` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `plan_Interval` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `plan_Date` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `plan_Content` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `plan_Done` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `plan_Reminder` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  PRIMARY KEY (`plan_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 204 CHARACTER SET = utf8 COLLATE = utf8_croatian_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of plan
-- ----------------------------
INSERT INTO `plan` VALUES (152, 20, '踢毽子', 'yoga,run,ride', '0', '2022/6/29', '踢毽子', '1', '0');
INSERT INTO `plan` VALUES (180, 21, '打造马甲线', 'yoga', '1', '2022/7/1', '打造马甲线', '0', '0');
INSERT INTO `plan` VALUES (181, 21, '打造马甲线', 'yoga', '1', '2022/7/3', '打造马甲线', '0', '0');
INSERT INTO `plan` VALUES (182, 21, '打造马甲线', 'yoga', '1', '2022/7/5', '打造马甲线', '0', '0');
INSERT INTO `plan` VALUES (183, 21, '打造马甲线', 'yoga', '1', '2022/7/7', '打造马甲线', '0', '0');
INSERT INTO `plan` VALUES (184, 22, '胯下击掌', 'yoga', '0', '2022/6/30', '胯下击掌', '0', '0');
INSERT INTO `plan` VALUES (185, 22, '胯下击掌', 'yoga', '0', '2022/7/1', '胯下击掌', '0', '0');
INSERT INTO `plan` VALUES (186, 22, '胯下击掌', 'yoga', '0', '2022/7/2', '胯下击掌', '0', '0');
INSERT INTO `plan` VALUES (187, 22, '转身运球', 'basketball', '1', '2022/7/1', '转身运球', '0', '1');
INSERT INTO `plan` VALUES (188, 22, '转身运球', 'basketball', '1', '2022/7/3', '转身运球', '0', '1');
INSERT INTO `plan` VALUES (189, 23, '开合跳', 'yoga', '0', '2022/7/1', '开合跳', '1', '1');
INSERT INTO `plan` VALUES (190, 23, '开合跳', 'yoga', '0', '2022/7/2', '开合跳', '0', '1');
INSERT INTO `plan` VALUES (191, 23, '开合跳', 'yoga', '0', '2022/7/3', '开合跳', '0', '1');
INSERT INTO `plan` VALUES (192, 23, '开合跳', 'yoga', '0', '2022/7/4', '开合跳', '0', '1');
INSERT INTO `plan` VALUES (193, 23, '开合跳', 'yoga', '0', '2022/7/5', '开合跳', '0', '1');
INSERT INTO `plan` VALUES (194, 23, '开合跳', 'yoga', '0', '2022/7/6', '开合跳', '0', '1');
INSERT INTO `plan` VALUES (195, 23, '开合跳', 'yoga', '0', '2022/7/7', '开合跳', '0', '1');
INSERT INTO `plan` VALUES (196, 23, '开合跳', 'yoga', '0', '2022/7/8', '开合跳', '0', '1');
INSERT INTO `plan` VALUES (198, 23, '正确的跑步姿势', 'run', '0', '2022/7/1', '正确的跑步姿势', '1', '0');
INSERT INTO `plan` VALUES (199, 23, '正确的跑步姿势', 'run', '0', '2022/7/2', '正确的跑步姿势', '0', '0');
INSERT INTO `plan` VALUES (200, 23, '正确的跑步姿势', 'run', '0', '2022/7/3', '正确的跑步姿势', '0', '0');
INSERT INTO `plan` VALUES (201, 23, '正确的跑步姿势', 'run', '0', '2022/7/4', '正确的跑步姿势', '0', '0');
INSERT INTO `plan` VALUES (202, 23, '正确的跑步姿势', 'run', '0', '2022/7/5', '正确的跑步姿势', '0', '0');
INSERT INTO `plan` VALUES (203, 23, '正确的跑步姿势', 'run', '0', '2022/7/6', '正确的跑步姿势', '0', '0');

-- ----------------------------
-- Table structure for sport
-- ----------------------------
DROP TABLE IF EXISTS `sport`;
CREATE TABLE `sport`  (
  `sid` bigint(100) NOT NULL AUTO_INCREMENT,
  `sport_Name` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `sport_Introduce` varchar(500) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `sport_Type` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `sport_Pic` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `sport_Video` varchar(500) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `sport_Fit` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `sport_Likes` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `sport_Star` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8 COLLATE = utf8_croatian_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sport
-- ----------------------------
INSERT INTO `sport` VALUES (19, '开合跳', '可以减少身体脂肪积累，增强身体的耐力', 'yoga', 'yoga7.png', 'yoga7.mp4', 'old,young,mid', '16', '0');
INSERT INTO `sport` VALUES (20, '踢毽子', '可以提高身体的基础代谢，提高抗病能力', 'yoga', 'yoga5.png', 'yoga5.mp4', 'old,young,mid', '6', '0');
INSERT INTO `sport` VALUES (21, '胯下击掌', '可以提高膝盖、脚踝等肢关节的协调性', 'yoga', 'yoga6.png', 'yoga6.mp4', 'old,young,mid', '4', '0');
INSERT INTO `sport` VALUES (22, '三种呼吸方式', '可以使你在跑步中更轻松，克服疲劳提高效率', 'run', 'run3.jpg', 'yoga7.mp4', 'young,mid', '0', '0');
INSERT INTO `sport` VALUES (23, '正确的跑步姿势', '可以增强心肺功能', 'run', 'run2.jpg', 'yoga5.mp4', 'young,mid,old', '2', '0');
INSERT INTO `sport` VALUES (24, '跑步到底怎么呼吸', '可以使你在跑步中更轻松，克服疲劳提高效率', 'run', 'run1.jpg', 'yoga5.mp4', 'young,mid', '7', '0');
INSERT INTO `sport` VALUES (25, '体前运球', '体前变向换手运球是篮球运动中变向运球的一种', 'basketball', 'Basketball1.jpg', 'yoga5.mp4', 'young,mid', '18', '0');
INSERT INTO `sport` VALUES (26, '胯下运球', '在运球的过程中前后脚分立运球穿越胯下', 'basketball', 'Basketball2.jpg', 'yoga5.mp4', 'young,mid', '5', '0');
INSERT INTO `sport` VALUES (27, '转身运球', '在对手逼近并堵截一侧时候，可用以改变运球路线摆脱防守的激素动作', 'basketball', 'Basketball3.jpg', 'yoga5.mp4', 'young,mid', '5', '0');
INSERT INTO `sport` VALUES (28, '背后运球', '背后运球可以防止对手的抢断，借机观察场上的动向', 'basketball', 'Basketball4.jpg', 'yoga5.mp4', 'young,mid', '8', '0');
INSERT INTO `sport` VALUES (29, '如何摇车', '学会摇车可以在高速巡航中维持一定功率的输出', 'ride', 'ride2.png', 'yoga6.mp4', 'mid,old', '10', '0');
INSERT INTO `sport` VALUES (30, '骑行快速入门', '可以帮助你快速入门骑行', 'ride', 'ride1.png', 'yoga5.mp4', 'mid,old', '15', '0');
INSERT INTO `sport` VALUES (31, '菜腿训练指南', '可以极大程度上提高大腿肌肉的力量，适合初学者', 'ride', 'ride4.png', 'yoga5.mp4', 'mid,old', '16', '0');
INSERT INTO `sport` VALUES (32, '如何换气', '学会游泳中换气可以提高在水中闭气的时间', 'swim', 'swim1.png', 'yoga5.mp4', 'old,mid', '18', '0');
INSERT INTO `sport` VALUES (33, '蛙泳教学', '适合初学者学习蛙泳', 'swim', 'swim2.png', 'yoga6.mp4', 'old,mid', '1', '0');
INSERT INTO `sport` VALUES (34, '游泳的正确姿势', '学会正确的游泳姿势可以游得更加省力', 'swim', 'swim3.png', 'yoga7.mp4', 'old,mid', '21', '0');
INSERT INTO `sport` VALUES (35, '游泳的四个技巧', '提高游泳的能力和游泳效率', 'swim', 'swim4.png', 'yoga5.mp4', 'old,mid', '9', '0');
INSERT INTO `sport` VALUES (36, '打造马甲线', '几个小动作快速打造出马甲线', 'yoga', 'yoga1.png', 'yoga7.mp4', 'young', '23', '0');
INSERT INTO `sport` VALUES (37, '快速燃脂，塑造气质', '可以短时间内燃脂，适合久坐人群', 'yoga', 'yoga3.png', 'yoga7.mp4', 'young,mid', '1', '0');
INSERT INTO `sport` VALUES (38, '拉伸', '可以提高身体的柔韧性', 'yoga', 'yoga4.png', 'yoga7.mp4', 'young,mid', '16', '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` bigint(100) NOT NULL AUTO_INCREMENT,
  `user_Name` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `user_Password` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `tall` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `weight` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_croatian_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (20, '小明', '123456', NULL, NULL, NULL);
INSERT INTO `user` VALUES (21, 'xiao', '111111', NULL, NULL, NULL);
INSERT INTO `user` VALUES (22, '333', '222', NULL, NULL, NULL);
INSERT INTO `user` VALUES (23, 'mm', '123456', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
