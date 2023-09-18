use wm;

create table if not exists estados(
	id int unsigned not null auto_increment,
	nome varchar(45) not null,
	sigla varchar(2) not null,
	regiao enum('Norte', 'Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul') not null,
    populacao decimal(5,2) not null,
	primary key(id),
	unique key (nome),
	unique key( sigla)
);

INSERT INTO 
	estados (nome, sigla, regiao, populacao) 
VALUES
	('São Paulo', 'SP', 'Sudeste', 4.23),
	('Rio de Janeiro', 'RJ', 'Sudeste', 2.1),
	('Minas Gerais', 'MG', 'Sudeste', 4.2),
	('Bahia', 'BA', 'Nordeste', 4.2);

select nome, sigla, regiao from estados where populacao > 3;

update estados 
set nome = 'Maranhão',
	populacao = 12.32
where id = 3;

show tables;

select id,estados.nome, sigla, regiao, estados.populacao from estados where sigla = 'MG';

delete from estados
where id = 5;

select * from estados;

INSERT INTO 
	estados (nome, sigla, regiao, populacao) 
VALUES
	('Bahia', 'BA', 'Nordeste', 4.2);