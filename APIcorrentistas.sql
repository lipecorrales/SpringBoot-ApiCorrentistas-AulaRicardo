create table fluxo_caixa(
ag int not null,
conta int not null,
fluxo int not null,
entrada decimal(8,2) not null,
saida decimal(8,2) not null,
primary key(ag,conta,fluxo));

create table correntista(
ag int not null,
conta int not null,
nome varchar(50) not null,
email varchar(80) not null,
telefone char(11) not null,
saldo decimal(8,2) not null,
primary key (ag,conta));

use revisao;

describe correntista;

select * from correntista;

insert into correntista(ag,conta,nome,email,telefone,saldo) values
("1234","22222","Philippe","philippe@gmail.com","988451050","500.00"),
("1234","33333","Corrales","corrales@gmail.com","988451050","990.00");

insert into fluxo_caixa(ag,conta,fluxo,entrada,saida) values
("1234","22222","222","333","444"),
("1235","33333","555","666","777");

update correntista set ag="1234" where conta=22222;