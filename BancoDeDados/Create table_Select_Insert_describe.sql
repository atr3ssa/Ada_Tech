show databases;
-- create database escola;
use escola;
show tables;

create table livros (
id_livro int not null,
nome varchar(45) not null,
autor varchar(45) not null,
sinopse varchar(400) not null,
id_disciplina int,
primary key (id_livro),
foreign key (id_disciplina)
references disciplina(id_disciplina)
);

create table disciplina (
id_disciplina int not null,
nome varchar(30) not null,
ementa text not null,
primary key (id_disciplina)
);

create table professor (
id_professor int not null,
nome varchar(40) not null,
celular varchar(14) not null,
id_disciplina int,
primary key (id_professor),
foreign key (id_disciplina)
references disciplina (id_disciplina)
);

-- descrever tabela X
describe disciplina;

-- add dados na tabela X
insert into disciplina values (1, 'português', 'literatura e gramática');

-- add mais dados de uma vez
insert into disciplina values (2, 'matematica', 'algebra linear'), (3, 'física', 'elétrica e dinâmica');

-- busca
select * from disciplina;





