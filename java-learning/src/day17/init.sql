-- 创建数据库
create database if not exists study character set utf8mb4;
-- 显示数据库
show databases;
-- 使用数据库
use study;
-- 创建表
create table student(
    id int primary key auto_increment,
    name varchar(20),
    age int,
    score double
);
-- 描述表结构
describe student;
-- 插入数据
insert into student (name, age, score) values ('Alice', 18, 88.5);
insert into student (name, age, score) values ('Bob', 19, 92.0);
insert into student (name, age, score) values ('Charlie', 17, 78.0);
insert into student (name, age, score) values ('David', 18, 85.5);
insert into student (name, age, score) values ('Lisa', 22, 60);

-- 查询数据
-- 查询所有数据
select * from student;
-- 查询部分数据
select name, score from student;
-- 查询条件
select * from student where age > 18;
-- 查询排序
select * from student order by score desc;
-- 查询限制 限制数据条数为3
select * from student order by score desc limit 3;
-- 查询分页 限制数据条数为2，`LIMIT a, b` = 跳过前 a 条，取接下来的 b 条
select * from student limit 1, 2;
-- 查询总数
select count(*) from student;
-- 查询平均分
select avg(score) from student;

-- 更新数据
update student set score = 100 where name = 'Lisa';
update student set age = age + 1;
update student set score = score + 5 where age > 18 and score < 90;


-- 查询更新后的数据
select * from student;
-- 删除数据
delete from student where name = 'Charlie';
delete from student where age < 18;
-- 查询删除后的数据
select * from student;
