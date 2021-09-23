DROP DATABASE IF EXISTS plataformaPflics;
CREATE DATABASE plataformaPflics;
USE plataformaPflics;

/*

Pra fazer no java:

Usuario comum
Usuario adm
adm pode cadastrar adm
data de nascimento (so deixar assinar se +18)
endereco de cobrança
Aceitar outros metodos de pagamento (CARTAO (debito ou credito), BOLETO E PIX, PAYPAL)

Servico n, plano
cupom

email cliente

*/

CREATE TABLE USUARIO (
cpfUsuario bigint PRIMARY KEY not null,
FK_idPlano int ,
nomeUsuario char (50) not null,
sexoUsuario char(1),
telUsuario bigint not null,
emailUsuario char (50) not null,
dataNascimento date not null
);

CREATE TABLE PLANO (
idPlano int PRIMARY KEY not null auto_increment,
nomePlano char(30) not null,
beneficiosPlano char(50),
precoPlano double not null
);

CREATE TABLE LOGIN(
FK_idUsuario bigint not null,
login char(15) unique,
senha char(15) not null,
dataLogin timestamp default current_timestamp
);

CREATE TABLE ENDERECO (
FK_cpfUsuario bigint ,
rua char (20) not null,
num int,
cep int not null,
bairro char (15) not null,
cidade char (20) not null,
pais char (15) not null
);

CREATE TABLE CARTAO (
FK_cpfUsuario bigint,
ID_cartao int not null primary key auto_increment,
titularCartao char (25) not null,
cpfTitular bigint not null,
numero int not null,
mesValidade int not null,
anoValidade int not null,
cvv int not null
);

CREATE TABLE CUPOM (
token int not null,
desconto double not null
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


insert into PLANO(idPlano,nomePlano,beneficiosPlano,precoPlano) values(
01,"ADM","INFINITO", 999
);

insert into USUARIO(cpfUsuario, FK_idPlano, nomeUsuario, sexoUsuario, telUsuario, emailUsuario, dataNascimento) values
(
12345678911,01, "Islan", "M", 9999999999, "Islan@gmail.com", "2018-05-15"
);
