create database mybatis;
use mybatis;
create table tb_user (
    ID INT(11) PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(18) DEFAULT NULL,
    SEX char(2) DEFAULT NULL,
    AGE INT(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;