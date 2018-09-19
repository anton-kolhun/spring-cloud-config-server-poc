create table PROPERTIES
(
   application varchar(200) DEFAULT NULL,
   profile varchar(200) DEFAULT NULL,
   label varchar(200) DEFAULT NULL,
   key varchar(200) DEFAULT NULL,
   value varchar(200) DEFAULT NULL
);

--for simplicity label's usage is skipped. Default value is used: label='master'
--client resolves the property by the following format: {application_name}/{profile}.
--  if not found - will try to use default application_name and profile:
--  default application_name='application'
--  default profile='default'
--  default label='master'
INSERT INTO PROPERTIES (key, value, application, profile, label)
VALUES ('property1-key','property1-super-updated-value','application','default','master');

INSERT INTO PROPERTIES (key, value, application, profile, label)
VALUES ('property2-key','property2-default-value','application','default','master');

INSERT INTO PROPERTIES (key, value, application, profile, label)
VALUES ('property1-key','property1-non-default-value','cloud-config-client','default','master');




