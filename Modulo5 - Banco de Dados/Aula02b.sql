-- mostrar todos os registros da tabela de filmes
SELECT *
FROM movies;

-- mostrar o nome, sobrenome e classificaçao de todos os atores
SELECT first_name, last_name, rating
FROM actors;

-- mostrar o titulo de todas as series e use alias para que tanto o nome da tabela quanto o campo estejam em portugues
SELECT séries.title as Título
FROM series as séries;
-- as é opcional

-- mostrar o nome e sobrenome dos atores cuja classificacao é superior a 7.5
SELECT first_name, last_name, rating
FROM actors
WHERE rating > 7.5;

-- mostrar o titulo dos filmes, classificacao e os premios dos filmes com classificacao superior a 7.5 e com mais de dois premios
SELECT title, rating, awards
FROM movies
WHERE rating > 7.5
  and awards > 2;

-- mostrar o titulo dos filmes e a classificacao ordenados por classificacao em ordem crescente
SELECT title, rating
FROM movies
ORDER BY rating desc;

-- mostrar os titulos dos 3 priemiros titulos de filme no banco de dados
SELECT title
FROM movies LIMIT 3;

-- mostrar os 5 melhores filmes com a classificacao mais alta
SELECT title, rating
FROM movies
ORDER BY rating desc LIMIT 5;

-- listar os 10 primeiros atores
select first_name, last_name
from actors limit 10;

-- mostrar o titulo e a classificacao de todos os filmes cujo titulo é toy story
select title, rating
from movies
where title like '%Toy Story%';

-- mostrar todos os atores cujos nomes comecam com Sam
select first_name, last_name
from actors
where first_name like '%Sam%';

-- mostrar o titulo dos filmes que sairam entre 2004 e 2008
select title, release_date, year (release_date)
from movies
where year (release_date) between 2004 and 2008;

-- mostrar o titulo dos filmes com classificacao superior a 3, com mais de 1 premio e com data de lancamento entre 1988 e 2009.
-- Ordenar o resunltado por classificacao
select title, awards, rating, release_date
from movies
where year (release_date) between 1988 and 2009 and awards > 1 and rating > 3
order by rating;


-- insere
insert into actors
values (null, null, null, 'Armando', 'Santos', 5.7, 13);

-- atualiza
update actors
set last_name = 'Ferreira'
where id = 50;

-- deleta
delete
from actors
where id = 50;
