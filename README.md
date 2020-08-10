# MySQL Schema

``` mysql
-유저 생성 및 권한주기와 관련 DB생성-
create user 'shareHouse'@'%' identified by 'bitc5600';
GRANT ALL PRIVILEGES ON *.* TO 'shareHouse'@'%';
create database shareHouse;
use shareHouse;


-FAQ 테이블 생성-
CREATE TABLE FAQ(
   	id int auto_increment primary key,
    type varchar(100) not null,
    title varchar(1000) unique not null,
    content BLOB not null,
    create_date timestamp
) engine=InnoDB default charset=utf8;
```



