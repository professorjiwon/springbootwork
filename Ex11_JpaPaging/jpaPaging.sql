create table jpaPaging (
    id number PRIMARY KEY,
    email varchar(50),
    name varchar(20)
);

create SEQUENCE jpaPaging_seq nocache;

insert into jpaPaging values(jpaPaging_seq.nextval, 'user01', 'user01@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user02', 'user02@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user03', 'user03@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user04', 'user04@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user05', 'user05@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user06', 'user06@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user07', 'user07@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user08', 'user08@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user09', 'user09@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user10', 'user10@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user11', 'user11@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user12', 'user12@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user13', 'user13@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user14', 'user14@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user15', 'user15@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user16', 'user16@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user17', 'user17@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user18', 'user18@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user19', 'user19@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user20', 'user20@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user21', 'user21@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user22', 'user22@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user23', 'user23@test.com');
insert into jpaPaging values(jpaPaging_seq.nextval, 'user24', 'user24@test.com');
commit;