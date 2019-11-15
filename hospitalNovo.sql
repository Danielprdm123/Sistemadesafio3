create database hospitalFX;
use  hospitalFX;
create table Medico (
id int not null AUTO_INCREMENT,
nome varchar(50) ,
cpf varchar(50) ,
idade int ,
tipoSanguineo varchar(50) ,
sexo varchar(50) ,
statusPessoa varchar(200), 
login varchar(50) ,
senha varchar(50) ,
statusUsuario varchar(200),
numeroRegistro int,
especialidade varchar(50),
constraint PK_Medico primary key(id));

create table Enfermeiro (
id int not null AUTO_INCREMENT,
nome varchar(50) ,
cpf varchar(50) ,
idade int ,
tipoSanguineo varchar(50) ,
sexo varchar(50) ,
statusPessoa varchar(200), 
login varchar(50) ,
senha varchar(50) ,
statusUsuario varchar(200),
numeroRegistro varchar(50),
constraint PK_Enfermeiro primary key(id));

create table Gerente (
id int not null AUTO_INCREMENT,
nome varchar(50) ,
cpf varchar(50) ,
idade int ,
tipoSanguineo varchar(50) ,
sexo varchar(50) ,
statusPessoa varchar(200), 
login varchar(50) ,
senha varchar(50) ,
statusUsuario varchar(200),
cargo varchar(50),
constraint PK_Gerente primary key(id));

create table Paciente (
id int not null AUTO_INCREMENT,
nome varchar(50) ,
cpf varchar(50) ,
idade int ,
tipoSanguineo varchar(50) ,
sexo varchar(50) ,
statusPessoa varchar(200) ,
doenca varchar (300) ,
historico varchar (300),
constraint PK_Paciente primary key(id));

create table EnfermidadePessoal (
id int not null AUTO_INCREMENT,
comentario varchar(100) ,
statusEnfermeiro varchar(100) ,
constraint PK_EnfermidadePessoal primary key (id));

create table Enfermidade(
id int not null AUTO_INCREMENT,
nome varchar(50) ,
tipo varchar(50) ,
descricao varchar(150) ,
constraint PK_Enfermidade primary key (id));

create table Entrada (
id int not null AUTO_INCREMENT,
dataEntrada date ,
dataSaida date ,
statusEntrada varchar(50) ,
situacaoPaciente varchar(300),
constraint PK_Entrada primary key (id));

create table Atendimento (
id int not null AUTO_INCREMENT,
comentarioEnfermeiro varchar(100) ,
comentarioMedico varchar(100) ,
altura float ,
peso float ,
dtData date ,
doenca varchar(300) ,
constraint PK_Atendimento primary key (id));

