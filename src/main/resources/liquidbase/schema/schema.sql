--liquibase formatted sql

--changeset yessense:v00
create table item
(
    id   uuid not null primary key,
    name varchar(256)
);

--changeset yessense:v01
create table cart
(
    id uuid not null primary key
);



