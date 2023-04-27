/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  gun
 * Created: Apr 27, 2023
 */

create database db27 default chartset 'UTF8';

create user user27 identified with mysql_native_password by 'p27';

grant all on db27.* to user27;

ีuse db27;
create table branch (
    number    int unique not null auto_increment,
    name      varchar(200) not null unique,
    area      float
);
insert into branch(name,area) values('New York', 80.0);
insert into branch(name,area) values('London', 120.0);
insert into branch(name,area) values('Paris', 100.0);
insert into branch(name,area) values('Tokyo', 90.0);

create table staff (
    number   int unique not null auto_increment,
    name     varchar(200) unique not null,
    salary   float default 0.0,
    gender   char default 'X'
);


