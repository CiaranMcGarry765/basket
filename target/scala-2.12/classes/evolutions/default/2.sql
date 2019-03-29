# --- !Ups

insert into category (id,name) values ( 1,'Acoustic' );
insert into category (id,name) values ( 2,'Electric' );
insert into category (id,name) values ( 3,'Bass' );
insert into category (id,name) values ( 4,'Piano' );
insert into category (id,name) values ( 5,'Drums' );
insert into category (id,name) values ( 6,'CDs' );
insert into category (id,name) values ( 7,'Accessories' );
insert into category (id,name) values ( 8,'Other' );

insert into product (id,name,description,stock,price) values ( 1,'DX1AE','Martin and CO Semi-Acoustic',22,550.00 );
insert into product (id,name,description,stock,price) values ( 2,'LX1E','Acoustic Mini Martin',5,400.00 );
insert into product (id,name,description,stock,price) values ( 3,'Modern Love','Picture This Album',9,10.99 );
insert into product (id,name,description,stock,price) values ( 4,'Ernie Ball 2211','Stainless Steel Strings',45,5.50 );
insert into product (id,name,description,stock,price) values ( 5,'Drum Kit Simple','Jet Black',5,199.99 );
insert into product (id,name,description,stock,price) values ( 6,'Squier Strat','Electric Guitar for starting',12,109.00 );
insert into product (id,name,description,stock,price) values ( 7,'X','Ed Sheeran',50,12.00 );
insert into product (id,name,description,stock,price) values ( 8,'Wooden Cajon','Box Drum',15,265.00 );
insert into product (id,name,description,stock,price) values ( 9,'Fender Bass','Bass for Beginners',5,299.00 );
insert into product (id,name,description,stock,price) values ( 10,'Taylor Acoustic','Acoustic',10,399.00 );
insert into product (id,name,description,stock,price) values ( 11,'Yamaha Piano','Grand Piano',5,1899.00 );
insert into product (id,name,description,stock,price) values ( 12,'Roland Piano','Stringed Piano Extra Harmonics',3,2219.00 );

insert into category_product (category_id,product_id) values (1,1);
insert into category_product (category_id,product_id) values (1,2);
insert into category_product (category_id,product_id) values (6,3);
insert into category_product (category_id,product_id) values (7,4);
insert into category_product (category_id,product_id) values (5,5);
insert into category_product (category_id,product_id) values (2,6);
insert into category_product (category_id,product_id) values (6,7);
insert into category_product (category_id,product_id) values (5,8);
insert into category_product (category_id,product_id) values (3,9);
insert into category_product (category_id,product_id) values (1,10);
insert into category_product (category_id,product_id) values (4,11);
insert into category_product (category_id,product_id) values (4,12);

insert into user (email,name,password,role) values ( 'admin@products.com', 'Alice Admin', 'password', 'admin' );
insert into user (email,name,password,role) values ( 'manager@products.com', 'Bob Manager', 'password', 'manager' );
insert into user (email,name,password,role) values ( 'customer@products.com', 'Charlie Customer', 'password', 'customer' );