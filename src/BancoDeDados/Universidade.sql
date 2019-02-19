TABELAS 

CREATE TABLE curso(
	cod_curso INTEGER PRIMARY KEY,
	nome_curso VARCHAR(60),
	turno CHAR(1)	
);

CREATE TABLE grade (
	cod_grade INTEGER PRIMARY KEY,
	ano_inicio INTEGER,
	nome_curso VARCHAR(60),
	carga_horaria_geral INTEGER,
	num_semestre INTEGER,
	carga_horaria_semestral INTEGER
);


CREATE TABLE disciplina(
	cod_disciplina INTEGER PRIMARY KEY,
	nome_disciplina VARCHAR(60),
	carga_horaria INTEGER,
	semestre INTEGER,
	nome_professor VARCHAR(60)
);

CREATE TABLE professor(
	cod_professor INTEGER PRIMARY KEY,
	nome_professor VARCHAR(60),
	coordenador CHAR(2)
);


INSET manualmente 



--curso 
select*from curso

insert into curso values(1, 'tads', 'n')
insert into curso values(2, 'engenharia civil', 'v')
insert into curso values(3, 'matematica', 'm')
insert into curso values(4, 'letras', 'n')
--disciplina
select*from disciplina

insert into disciplina values(1, 'poo', 60, 1,'alexsandro ')
insert into disciplina values(2, 'banco de dados', 120, 2,'marcos ')
insert into disciplina values(3, 'engenharia de software', 60, 3,'ana karina ')
insert into disciplina values(4, 'algoritmo', 60, 4,'carlos ')
--grade
select*from grade

insert into grade values(1, 2010, 'tads', 600, 8, 60)
insert into grade values(2, 2011, 'engenharia civil', 700, 10, 300)
insert into grade values(3, 2012, 'matematica', 800, 6, 300)
insert into grade values(4, 2013, 'letras', 900, 10, 300)

--professor
select*from professor

insert into professor values(1, 'alexsandro', 'n')
insert into professor values(2, 'marcos', 's')
insert into professor values(3, 'ana karina', 'n')
insert into professor values(4, 'carlos', 'n')




