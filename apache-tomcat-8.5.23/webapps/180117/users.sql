drop table users if exists;

create table users
(
    id int auto_increment primary key,
    name varchar(100) not null unique,
    password varchar(100) not null
);

insert into users values(null, 'zyb', 'zyb120110');
insert into users values(null, 'zzz', 'zzz120110');
insert into users values(null, 'yyy', 'yyy120110');
insert into users values(null, 'bbb', 'bbb120110');
