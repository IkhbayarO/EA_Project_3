
INSERT INTO `credentials`(id, enabled, password, username, verifyPassword) VALUES (1,NULL,'123456','admin','123456');
INSERT INTO `credentials`(id, enabled, password, username, verifyPassword) VALUES (2,NULL,'123456','user','123456');
INSERT INTO `credentials`(id, enabled, password, username, verifyPassword) VALUES (3,NULL,'123456','baya','123456');
INSERT INTO `credentials`(id, enabled, password, username, verifyPassword) VALUES (4,NULL,'123456','henok','123456');
INSERT INTO `credentials`(id, enabled, password, username, verifyPassword) VALUES (5,NULL,'123456','sandeep','123456');
INSERT INTO `credentials`(id, enabled, password, username, verifyPassword) VALUES (6,NULL,'123456','babita','123456');

INSERT INTO `authority`(id, authority, username, credentials_id) VALUES (1,'ADMIN','admin',1);
INSERT INTO `authority`(id, authority, username, credentials_id) VALUES (2,'USER','user',2);
INSERT INTO `authority`(id, authority, username, credentials_id) VALUES (3,'USER','baya',3);
INSERT INTO `authority`(id, authority, username, credentials_id) VALUES (4,'USER','henok',4);
INSERT INTO `authority`(id, authority, username, credentials_id) VALUES (5,'USER','sandeep',5);
INSERT INTO `authority`(id, authority, username, credentials_id) VALUES (6,'USER','babita',6);

INSERT INTO `project`(id, description, endDate, startDate, title) VALUES (1,'This is a project','2014-01-01','2011-02-02','Project');
INSERT INTO `project`(id, description, endDate, startDate, title) VALUES (2,'Restful web service','2019-09-01','2019-08-02','Restful WS');
INSERT INTO `project`(id, description, endDate, startDate, title) VALUES (3,'Angular based project','2019-09-10','2019-01-10','Angular');
INSERT INTO `project`(id, description, endDate, startDate, title) VALUES (4,'Spring boot based project','2019-09-10','2018-10-02','Spring boot');
INSERT INTO `project`(id, description, endDate, startDate, title) VALUES (5,'React based project','2019-09-10','2019-01-01','React');
INSERT INTO `project`(id, description, endDate, startDate, title) VALUES (6,'Node.js based project','2019-05-05','2019-04-05','Node.js');


INSERT INTO `team`(id, teamName, project_id) VALUES (1,'Code Strikers',1);
INSERT INTO `team`(id, teamName, project_id) VALUES (2,'Code Strikers',2);
INSERT INTO `team`(id, teamName, project_id) VALUES (3,'Code Strikers',3);
INSERT INTO `team`(id, teamName, project_id) VALUES (4,'Code Strikers',4);
INSERT INTO `team`(id, teamName, project_id) VALUES (5,'Code Strikers',5);
INSERT INTO `team`(id, teamName, project_id) VALUES (6,'Code Strikers',6);



INSERT INTO `team_member`(id, email, firstName, lastName, credentials_id, team_id) VALUES (1,'john@gmail.com','John','Soe',1,1);


INSERT INTO `task`(id, description, endTime, startTime, status, taskName, version, teamMember_id, project_id) VALUES (1,'This is a taks 1','2014-01-01','2011-01-01','Open','UI Design',1,1,1);

 
 
  					