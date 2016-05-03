


CREATE SEQUENCE seq_pessoa nocache;

CREATE TABLE  PESSOA (	
    ID NUMBER(11,0) NOT NULL , 
	NOME VARCHAR2(30) NOT NULL , 
	SOBRENOME VARCHAR2(50) NOT NULL , 
	EMAIL VARCHAR2(50) NOT NULL , 
	CPF VARCHAR2(11) NOT NULL , 
	 CONSTRAINT "PESSOA_PK" PRIMARY KEY (ID) 
   ) ;

CREATE OR REPLACE TRIGGER  BI__PESSOA 
  before insert on pessoa
  for each row
begin
  if :new.id is null then
    select seq_pessoa.nextval into :new.id from dual;
  end if;
end;
/

