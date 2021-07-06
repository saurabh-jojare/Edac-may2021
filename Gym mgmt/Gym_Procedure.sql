-- procedure for gym_db

drop table tempp;
create table tempp (first int ,second int , three varchar(100),four varchar(100),five varchar(100),six varchar(50),seven varchar(50),eight varchar(50),nine varchar(50),ten datetime );
CREATE TABLE members (
   id int(30) NOT NULL,
   member_id int(30) NOT NULL,
   firstname varchar(100) NOT NULL,
   middlename varchar(100) NOT NULL,
   lastname varchar(100) NOT NULL,
   gender varchar(20) NOT NULL,
   contact  varchar(100) NOT NULL,
   address text NOT NULL,
   email varchar(100) NOT NULL,
   date_created  datetime NOT NULL DEFAULT current_timestamp()
); 

delimiter //
create procedure abc()
begin
declare a int;
declare b int ;
declare c varchar(100);
declare d varchar(100);
declare e varchar(100);
declare f varchar(20);
declare g varchar(50);
declare h varchar(50);
declare i varchar(50);
declare j datetime(6);
declare x int default 0;
declare y int;
declare c1 cursor for select * from members;
select count(*) into y from members;
open c1;
while x < y do
fetch c1 into a,b,c,d,e,f,g,h,i,j;
insert into tempp values(a, b,c,d,e,f,g,h,i,j);
set x = x + 1;
end while;
close c1;
end; //
delimiter ;
call abc();
drop procedure abc;
drop table temp;
select * from tempp;