create table author
(
    id   integer      not null GENERATED ALWAYS AS IDENTITY,
    name varchar(255) not null,
    primary key (id)
);

create table book_authors(
                             books_id integer not null,
                             authors_id integer not null
);

alter table book alter column author varchar(255) null;

/* convert the data that is already in the author-column of the book-table*/
insert into author (name)
select author  from (SELECT distinct author FROM book) as author;

insert into book_authors (books_id, authors_id)
select book.id, author.id FROM book inner join author  on book.author=author.name;


