-- group by

-- quantas series cadastradas
select count(*)
from series;

-- quantas temporadas cadastradas
select count(*)
from seasons;

-- quantas temporadas para cada serie
select series.title, count(*)
from seasons
         inner join series on series.id = seasons.serie_id
group by series.id;

-- quantas temporadas para cada a série "The Walking Dead"
select series.title, count(*)
from seasons
         inner join series on series.id = seasons.serie_id
where series.title = 'The Walking Dead'
group by series.id;

-- quais series tem mais que 5 temporadas
select series.title, count(*) as temporadas
from seasons
         inner join series on series.id = seasons.serie_id
group by series.id
having temporadas > 5;

-- quais sao as 3 series com maior numero de temporadas
select series.title, count(*) as temporadas
from seasons
         inner join series on series.id = seasons.serie_id
group by series.id
order by temporadas desc limit 3;

-- subconsultas
-- quais os nomes dos atores que trabalham em filmes com avaliacao maior que 9.1
select *
from actors
where id in
      (select actor_movie.actor_id
       from movies
                inner join actor_movie on movies.id = actor_movie.movie_id
       where rating > 9.1)

order by first_name;

-- outra forma de resolver usando join (ordenado por avaliacao do ator)
select first_name, last_name, actors.rating as 'Actor`s rating'
from movies
         inner join actor_movie on movies.id = actor_movie.movie_id
         inner join actors on actors.id = actor_movie.actor_id
where movies.rating > 9.1
order by actors.rating desc;

-- quais sao os filmes que nao sao preferidos de nenhum ator
select movies.title
from movies
where not exists
    (select actors.first_name from actors where favorite_movie_id = movies.id);
