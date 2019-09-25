
INSERT INTO `credentials`(id, enabled, password, username, verifyPassword) VALUES (1,NULL,'123456','admin','123456');
INSERT INTO `credentials`(id, enabled, password, username, verifyPassword) VALUES (2,NULL,'123456','user','123456');

INSERT INTO `authority`(id, authority, username, credentials_id) VALUES (1,'ADMIN','admin',1);
INSERT INTO `authority`(id, authority, username, credentials_id) VALUES (2,'USER','user',2);

INSERT INTO `project`(id, description, endDate, startDate, title) VALUES (1,'This is a project','2014-01-01','2011-02-02','Project');

INSERT INTO `team`(id, teamName, project_id) VALUES (1,'Code Strikers',1);


INSERT INTO `team_member`(id, email, firstName, lastName, credentials_id, team_id) VALUES (1,'john@gmail.com','John','Soe',1,1);


INSERT INTO `task`(id, description, endTime, startTime, status, taskName, version, teamMember_id, project_id) VALUES (1,'This is a taks 1','2014-01-01','2011-01-01','Open','UI Design',1,1,1);

 
 
  					