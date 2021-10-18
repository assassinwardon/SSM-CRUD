-- auto-generated definition
create table tbl_dept
(
    dept_id   int auto_increment
        primary key,
    dept_name varchar(45) not null
)
    charset = utf8;

-- auto-generated definition
create table tbl_emp
(
    emp_id   int auto_increment
        primary key,
    emp_name varchar(45) not null,
    gender   char        null,
    email    varchar(45) null,
    d_id     int         null,
    constraint fk_emp_dept
        foreign key (d_id) references tbl_dept (dept_id)
            on delete cascade
)
    charset = utf8;

create index fk_emp_dept_idx
    on tbl_emp (d_id);