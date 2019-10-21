CREATE TABLE `sys_dbinfo` (
  `dbinfo_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `db_name` varchar(64) NOT NULL COMMENT '数据库名字',
  `db_type` varchar(64) NOT NULL COMMENT '数据库类型',
  `area_type` int(6) DEFAULT NULL COMMENT '区域类型：离线：1  专题：2  其他数据连接：3  沙盘结果输出：10',
  `db_ip` varchar(64) NOT NULL COMMENT '数据库ip',
  `db_port` varchar(32) NOT NULL COMMENT '数据库端口号',
  `db_server_name` varchar(64) NOT NULL COMMENT '服务名字',
  `db_table_schema` varchar(64) DEFAULT NULL COMMENT 'postgresql,同一个库需要区分不同的模式',
  `db_relkind` varchar(32) DEFAULT NULL COMMENT 'postgresql库区分视图与表 r:表 v:视图',
  `db_user` varchar(64) DEFAULT NULL COMMENT '数据库用户名',
  `db_password` varchar(64) DEFAULT NULL COMMENT '数据库密码',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态 1 可用 0 不可用',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_person_id` varchar(36) DEFAULT NULL COMMENT '创建人用户id',
  PRIMARY KEY (`dbinfo_id`),
  UNIQUE KEY `db_unique_index` (`db_name`,`db_type`,`db_server_name`,`db_table_schema`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8 COMMENT='数据库';

