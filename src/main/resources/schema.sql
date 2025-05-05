drop table if exists products;
drop table if exists categories;

create table categories
(
    id serial primary key,
    name varchar(255) not null unique
);

create table products
(
    id   serial primary key,
    name varchar(255) not null unique,
    description varchar(255) not null,
    price int not null,
    category_id int references categories(id)
);