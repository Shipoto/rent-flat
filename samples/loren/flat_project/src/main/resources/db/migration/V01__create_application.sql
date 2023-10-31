create table if not exists client_info(
    id int8 primary key not null,
    nick_name varchar,
    email varchar,
    password varchar
)
-- create sequence client_info_sequence;