insert into BOOK (TITLE)
values ('Oryx and Crake'); /*1*/

insert into BOOK (TITLE)
values ('The year of the flood');/*2*/

insert into BOOK (TITLE)
values ('MaddAddam');/*3*/

insert into BOOK (TITLE)
values ('1Q84');/*4*/

insert into BOOK (TITLE)
values ('De opwindvogelkronieken');/*5*/

insert into BOOK (TITLE)
values ('Design Patterns');/*6*/

insert into AUTHOR (NAME)
values ('Margaret Atwood'); /*1*/

insert into AUTHOR (NAME)
values ('Haruki Murakami'); /*2*/

insert into AUTHOR (NAME)
values ('Erich Gamma'); /*3*/

insert into AUTHOR (NAME)
values ('Richard Helm'); /*4*/

insert into AUTHOR (NAME)
values ('Ralph Johnson'); /*5*/

insert into AUTHOR (NAME)
values ('John Vlissides'); /*6*/

insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID)
values (select id from BOOK where title= 'Oryx and Crake',
           select id from AUTHOR where name = 'Margaret Atwood');

insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID)
values (select id from BOOK where title= 'The year of the flood',
           select id from AUTHOR where name = 'Margaret Atwood');

insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID)
values (select id from BOOK where title= 'MaddAddam',
           select id from AUTHOR where name = 'Margaret Atwood');

insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID)
values (select id from BOOK where title= '1Q84',
           select id from AUTHOR where name = 'Haruki Murakami');

insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID)
values (select id from BOOK where title= 'De opwindvogelkronieken',
           select id from AUTHOR where name = 'Haruki Murakami');

insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID)
values (select id from BOOK where title= 'Design Patterns',
           select id from AUTHOR where name = 'Erich Gamma');

insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID)
values (select id from BOOK where title= 'Design Patterns',
           select id from AUTHOR where name = 'Richard Helm');

insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID)
values (select id from BOOK where title= 'Design Patterns',
           select id from AUTHOR where name = 'Ralph Johnson');

insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID)
values (select id from BOOK where title= 'Design Patterns',
           select id from AUTHOR where name = 'John Vlissides');

insert into GENRE(NAME)
values ('fantasy');

insert into GENRE(NAME)
values ('non-fiction');

insert into GENRE(NAME)
values ('programming');

INSERT INTO BOOKSUSER (USERNAME, PASSWORD, ROLE)
VALUES ('admin', '$2a$10$9MIX8kYPkuB7uE/H5nHF8.KG6.YdjBA/voOnjSZnZDxLXL/2BIerS', 'ADMIN'); -- admin

INSERT INTO BOOKSUSER (USERNAME, PASSWORD, ROLE)
VALUES ('marie', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'USER'); -- password

INSERT INTO BOOKSUSER (USERNAME, PASSWORD, ROLE)
VALUES ('vera', '$2y$12$KF3spKP4kgf59.6zYkmjyeYaW2.4ZxV16Grpw1FPsFnzYq68kswJ6', 'USER'); -- vera

insert into SERIE(NAME) values ('Harry Potter');
insert into SERIE(NAME) values ('Anderland');


INSERT INTO LIBRARY(NAME, LOCATION, MEMBERS, MEMBERSHIP_FEE, LATE_FEE_PER_DAY)
VALUES ("De Centrale Bibliotheek", "Antwerpen", 2000, 35.0, 0.6);

INSERT INTO LIBRARY(NAME, LOCATION, MEMBERS, MEMBERSHIP_FEE, LATE_FEE_PER_DAY)
VALUES ("Hoofdstedelijke Bibliotheek Brussel", "Brussel", 2500, 35.0, 0.55);

INSERT INTO LIBRARY(NAME, LOCATION, MEMBERS, MEMBERSHIP_FEE, LATE_FEE_PER_DAY)
VALUES ("Bibliotheek Mechelen", "Mechelen", 1600, 31.0, 0.6);

INSERT INTO LIBRARY(NAME, LOCATION, MEMBERS, MEMBERSHIP_FEE, LATE_FEE_PER_DAY)
VALUES ("Stedelijke Bibliotheek Gent", "Gent", 1700, 32.0, 0.5);

INSERT INTO LIBRARY(NAME, LOCATION, MEMBERS, MEMBERSHIP_FEE, LATE_FEE_PER_DAY)
VALUES ("Openbare Bibliotheek Brugge", "Brugge", 1800, 33.0, 0.5);

INSERT INTO LIBRARY(NAME, LOCATION, MEMBERS, MEMBERSHIP_FEE, LATE_FEE_PER_DAY)
VALUES ("Bibliotheek Hasselt Limburg", "Hasselt", 1400, 27.5, 0.4);