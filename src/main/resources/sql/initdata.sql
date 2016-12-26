--用户数据
INSERT INTO users(username,loginname,password,createtime,userlevel) VALUES ('超级管理员','superadmin','superadmin',sysdate,'3');
INSERT INTO users(username,loginname,password,createtime,userlevel) VALUES ('管理员','admin','admin',sysdate,'2');

--菜单数据
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('首页','sy','1','0',null,'/',0,'1','1');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('核心业务','hxyw','1','0',null,'/hxyw',0,'1','2');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('成功案例','cgal','1','0',null,'/cgal',0,'1','3');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('服务网点','fwwd','1','0',null,'/fwwd',0,'1','4');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('关于我们','gywm','1','0',null,'/gywm',0,'1','5');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('数码印刷','smys','2','1','这个数码印刷的内容，可以后台进行修改','/hxyw/smys',101,'1','1');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('商务印刷','swys','2','1','这个商务印刷的内容，可以后台进行修改','/hxyw/swys',101,'1','2');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('格式装订','gszd','2','1','这个格式装订的内容，可以后台进行修改','/hxyw/gszd',101,'1','3');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('公关咨询','ggzx','2','1','这个公关咨询的内容，可以后台进行修改','/hxyw/ggzx',101,'1','4');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('广告制作','ggzz','2','1','这个广告制作的内容，可以后台进行修改','/hxyw/ggzz',101,'1','5');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('标识标牌','bzbp','2','1','这个标识标牌的内容，可以后台进行修改','/hxyw/bzbp',101,'1','6');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('奖杯奖状','jbjz','2','1','这个奖杯奖状的内容，可以后台进行修改','/hxyw/jbjz',101,'1','7');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('增值服务','zzfw','2','1','这个增值服务的内容，可以后台进行修改','/hxyw/zzfw',101,'1','8');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('公司简介','gsjj','2','1','这个公司简介的内容，可以后台进行修改','/gywm/gsjj',104,'1','1');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('服务优势','fwys','2','1','这个服务优势的内容，可以后台进行修改','/gywm/fwys',104,'1','2');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('新闻中心','xwzx','2','0',NULL,'/xwzx',104,'1','3');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('会员中心','hyzx','2','1','这个会员中心的内容，可以后台进行修改','/gywm/hyzx',104,'1','4');
INSERT INTO menu (menuname,menuname_en,menulevel,usetemp,content,url,parent,status,sort) VALUES ('客户须知','khxz','2','1','这个客户须知的内容，可以后台进行修改','/gywm/khxz',104,'1','5');
