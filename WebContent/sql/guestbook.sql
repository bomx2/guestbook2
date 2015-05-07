drop SEQUENCE GUESTBOOK_SEQ;
drop table guestbook;

﻿CREATE TABLE GUESTBOOK (
  NO NUMBER(20) NOT NULL,
  NAME VARCHAR2(20) NOT NULL, 
  PASSWORD VARCHAR2(50) NOT NULL,
  MESSAGE VARCHAR2(2000) NOT NULL,
  REG_DATE DATE,
  PRIMARY KEY (NO) 
);

CREATE SEQUENCE GUESTBOOK_SEQ
INCREMENT BY 1
START WITH 1
MAXVALUE 9999999
NOCACHE
NOCYCLE;
   
insert into guestbook values(GUESTBOOK_SEQ.nextval,'안대혁','1234','안녕하세요',sysdate);
select * from guestbook;
delete from guestbook where no='7' and password='1234';
