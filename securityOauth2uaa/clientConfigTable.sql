DROP TABLE IF EXISTS `oauth_client_details`;
CREATE TABLE `oauth_client_details` ( 
`client_id` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客户端标 识',
`resource_ids` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接入资源列表', 
`client_secret` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客户端秘钥', 
`scope` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL, 
`authorized_grant_types` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL, 
`web_server_redirect_uri` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
 `authorities` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL, 
 `access_token_validity` INT(11) NULL DEFAULT NULL, `refresh_token_validity` INT(11) NULL DEFAULT NULL, 
 `additional_information` LONGTEXT CHARACTER SET utf8 COLLATE utf8_general_ci NULL, 
 `create_time` TIMESTAMP(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0), 
 `archived` TINYINT(4) NULL DEFAULT NULL, `trusted` TINYINT(4) NULL DEFAULT NULL, 
 `autoapprove` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL, 
 PRIMARY KEY (`client_id`) USING BTREE
  ) 
ENGINE = INNODB CHARACTER SET = utf8 COLLATE = utf8_general_ci 
COMMENT = '接入客户端信息' ROW_FORMAT = DYNAMIC;
INSERT INTO `oauth_client_details` VALUES ('resource1', 'res1', '$2a$10$NlBC84MVb7F95EXYTXwLneXgCca6/GipyWR5NHm8K0203bSQMLpvm', 'ROLE_ADMIN,ROLE_USER,ROLE_API', 'client_credentials,password,authorization_code,implicit,refresh_token', 'http://www.baidu.com', NULL, 7200, 259200, NULL, '2019‐09‐09 16:04:28', 0, 0, 'false');