DROP DATABASE IF EXISTS plataformaPflics;
CREATE DATABASE plataformaPflics;
USE plataformaPflics;


CREATE TABLE USUARIO (
cpfUsuario bigint PRIMARY KEY ,
FK_idPlano int ,
nomeUsuario char (50) not null,
sexoUsuario char(1),
telUsuario char(30) not null,
emailUsuario char (50) not null,
dataNascimento char (30) not null
);

CREATE TABLE PLANO (
idPlano int PRIMARY KEY not null auto_increment,
nomePlano char(30) not null,
beneficiosPlano char(50),
precoPlano double not null
);

CREATE TABLE LOGIN(
FK_idUsuario bigint not null,
login varchar(20) unique,
senha varchar(20) not null,
perfil varchar(20) not null,
dataCriacao timestamp default current_timestamp
);

CREATE TABLE ENDERECO (
FK_cpfUsuario bigint ,
rua char (20) not null,
num int not null,
cep int not null,
bairro char (15) not null,
cidade char (20) not null,
pais char (15) not null
);
desc Endereco;
CREATE TABLE CARTAO (
FK_cpfUsuario bigint,
ID_cartao int not null primary key auto_increment,
titularCartao char (25) not null,
cpfTitular bigint not null,
numero bigint not null,
mesValidade int not null,
anoValidade int not null,
cvv int not null
);


-- Relacionamentos
alter table USUARIO
add foreign key (FK_idPlano) references PLANO(idPlano);

alter table ENDERECO
add foreign key (FK_cpfUsuario) references USUARIO(cpfUsuario);

alter table CARTAO
add foreign key (FK_cpfUsuario) references USUARIO(cpfUsuario);

alter table LOGIN
add foreign key (FK_idUsuario) references USUARIO(cpfUsuario);


insert into PLANO(idPlano,nomePlano,beneficiosPlano,precoPlano) values
(01,"ADM","INFINITO", 999),
(02, "Netlfix","Full", 42.90),
(03, "Disney+","Full", 29.90),
(04, "HBO Max","Full", 13.90);

insert into USUARIO(cpfUsuario, FK_idPlano, nomeUsuario, sexoUsuario, telUsuario, emailUsuario, dataNascimento) values
(84567451623, 01, "Islan", "M", 9999999999, "Islan@gmail.com", "15/05/2002"),
(16513213231, 04, "Pina", "M", 5412653232, "pina@gmail.com", "23/05/2003"),
(52132315322, 02, "Josela", "F", 45132132132, "Josela@gmail.com", "07/08/2015");

insert into Login(FK_idUsuario, login, senha, perfil) values
(84567451623,"Admin","adm25","Admin"),
(16513213231,"UsuarioComum","1234","User");

insert into ENDERECO(FK_cpfUsuario, rua, num, cep, bairro, cidade, pais) values
(84567451623, "Rua da Mata", 03, 4586222, "Aroá", "Mata", "BR"),
(16513213231, "Rua da Morte", 04, 74754784, "Areal", "Camacari", "Canadi"),
(52132315322, "Rua da Língua", 05, 99747458, "Areias", "Brasilandia", "EUA");

insert into CARTAO(FK_cpfUsuario, ID_cartao, titularCartao, cpfTitular, numero, mesValidade, anoValidade, cvv) values
(84567451623, 01, "Islan", 84567451623, 165132135263, 02, 12, 777),
(16513213231, 02, "Pina", 16513213231, 6969696969696, 01, 11, 444),
(52132315322, 03, "Josela", 52132315322, 47478558569685, 03,16, 888);


