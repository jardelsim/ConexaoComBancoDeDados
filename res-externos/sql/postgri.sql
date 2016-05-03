-- Table: public.pessoa

create sequence seq_pessoa increment 1 start 1;

CREATE TABLE public.pessoa
(
  id integer NOT NULL DEFAULT nextval('seq_pessoa'::regclass),
  nome character varying(30) NOT NULL,
  sobrenome character varying(50) NOT NULL,
  email character varying(50) NOT NULL,
  cpf character varying(11) NOT NULL,
  CONSTRAINT pessoa_pkey PRIMARY KEY (id)
)

