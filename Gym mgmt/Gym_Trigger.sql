create table cancel_member(id int , member_id int , firstname varchar(20), middlename varchar(20), lastname varchar(20), gender varchar(4),
 contact bigint, address varchar(20), email varchar(20), date_created date);
 
delimiter &&
create trigger cancel
after delete
on members
for each row
begin 
insert into cancel_member
 (id, 
member_id ,
 firstname,
 middlename , 
 lastname ,
 gender,
 contact, 
 address,
 email ,
 date_created)
values (old.id, 
old.member_id ,
 old.firstname,
 old.middlename , 
 old.lastname ,
 old.gender,
 old.contact, 
 old.address,
 old.email ,
 old.date_created);
end &&
delimiter ;