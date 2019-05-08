create database mybatis;
use mybatis;
create table tb_user (
    ID INT(11) PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(18) DEFAULT NULL,
    SEX char(2) DEFAULT NULL,
    AGE INT(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table country (
    `id` int NOT NULL AUTO_INCREMENT,
    `countryName` varchar(255) NULL,
    `countryCode` varchar(255) NULL,
    primary key (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

##default data
insert into country (countryName, countryCode) VALUES ('中国','CN'),('美国','US'),('英国','GB'),('法国','FR');