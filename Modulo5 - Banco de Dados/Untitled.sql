-- Adicione um filme a tabela de filmes
insert into movies
values (null, now(), null, 'A mumia', 10, 10, '1998-01-01', 5, 5);

-- Adicione um genero a tabela de generos
insert into genres
values (null, now(), null, 'Horror test', 13, 1);

-- Associe o filme inserido no item  1. com o gênero criado item 2.
update movies
set genre_id = 13
where movies.id = 22;

-- Modifique a tabela de atores para que pelo menos um ator tenha o filme adicionado item 1 como favorito.

-- Crie uma tabela temporária da tabela filmes.
create
temporary table movies_tmp
select *
from movies;

-- Elimine da tabela temporária do item 5 todos os filmes que ganharam menos de 5 prêmios.
delete
from movies_tmp
where awards < 5;

-- Obtenha a lista de todos os gêneros que possuem pelo menos um filme.
select distinct name
from genres
         inner join movies on genres.id = movies.genre_id;

-- Obtenha a lista de atores cujo filme favorito ganhou mais de 3 prêmios.
select first_name, last_name
from actors
         inner join movies on actors.favorite_movie_id = movies.id
where movies.awards > 3;

-- Crie um índice no nome na tabela de filmes. Verifique se o índice foi criado corretamente.
create
index indx_movies_title on movies(title);
