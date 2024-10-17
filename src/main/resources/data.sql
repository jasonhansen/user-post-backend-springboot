CREATE TABLE IF NOT EXISTS user_details (
                                            id BIGINT NOT NULL PRIMARY KEY,
                                            birth_date DATE,
                                            name VARCHAR(100)
    );


insert into user_details(id,birth_date,name)
values (10001,current_date(),'Hansen');

insert into user_details(id,birth_date,name)
values (10002,current_date(),'Feanor');

insert into user_details(id,birth_date,name)
values (10003,current_date(),'Finwe');


insert into post(id,description,user_id)
values (20001,'I want to learn AWS',10001);

insert into post(id,description,user_id)
values (20002,'I want to learn Sping MVC',10001);

insert into post(id,description,user_id)
values (20003,'I want to learn DevOps',10002);

insert into post(id,description,user_id)
values (20004,'I want to learn Java Core',10002);

insert into post(id,description,user_id)
values (20005,'I want to learn Photoshop',10003);

insert into post(id,description,user_id)
values (20006,'I want to learn After Effects',10003);
