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

create table sys_user (
    id bigint not null AUTO_INCREMENT comment '用户id',
    user_name varchar(50) comment '用户名',
    user_password varchar(50) comment '密码',
    user_email varchar(50) comment '邮箱',
    user_info text comment '简介',
    head_img blob comment '头像',
    create_time datetime comment '创建时间',
    primary key (id)
);
alter table sys_user comment '用户表';


create table sys_role (
    id bigint not null auto_increment comment '角色ID',
    role_name varchar(50) comment '角色名',
    enabled int comment '有效标记',
    create_by bigint comment '创建人',
    create_time DATETIME comment '创建时间',
    primary key (id)
);
alter table sys_role comment '角色表';

create table sys_privilege (
  id bigint not null auto_increment comment '权限ID',
  privilege_name varchar(50) comment '权限名称',
  privilege_url varchar(200) comment '权限URL',
  primary key (id)
);
alter table sys_privilege comment '权限表';

create table sys_user_role (
    user_id bigint comment '用户ID',
    role_id bigint comment '角色ID'
);
alter table sys_user_role comment '用户角色关联表';

create table sys_role_privilege (
    role_id bigint comment '角色ID',
    privilege_id bigint comment '权限ID'
);
alter table sys_role_privilege comment '角色权限关联表';


