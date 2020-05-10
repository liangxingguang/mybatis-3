insert into sys_user values (1, 'admin', '123456', 'admin@qq.com','管理员', null, '2019-10-21 17:00:58');
insert into sys_user values (1001, 'test', '123456', 'test@qq.com','测试用户', null, '2019-10-21 17:00:58');

insert into sys_role values (1, '管理员', 1,1, '2019-10-21 21:00:00');
insert into sys_role values (2, '普通用户', 1,1, '2019-10-21 21:00:00');

insert into sys_user_role values (1,1);
insert into sys_user_role values (1,2);
insert into sys_user_role values (1001,2);


insert into sys_privilege values (1, '管理员', '/users');
insert into sys_privilege values (2, '角色管理', '/roles');
insert into sys_privilege values (3, '系统日志', '/logs');
insert into sys_privilege values (4, '人员维护', '/persons');
insert into sys_privilege values (5, '单位维护', '/companies');

insert into sys_role_privilege values (1,1);
insert into sys_role_privilege values (1,3);
insert into sys_role_privilege values (1,2);
insert into sys_role_privilege values (2,4);
insert into sys_role_privilege values (2,5);