 /* (1) 
The person relation contains 284 entries with a registered death date after ‘2010-02-01’. 
How many entries do not have a registered death date?
*/

SELECT COUNT(DISTINCT P.name)
FROM person P
WHERE P.deathdate > '2010-02-01';

-- 284

SELECT COUNT(DISTINCT P.name)
FROM person P
WHERE P.deathdate IS NULL;

-- 52759

SELECT COUNT(DISTINCT P.name)
FROM person P
WHERE P.deathdate IS NULL
AND P.birthdate > '2010-02-01'

-- 1

/* (2)
In the database, there are 46 movies in the French language for which the average height of 
all the people involved is greater than 185 centimeters (ignoring people with unregistered height). 
What is the number of movies in the Portuguese language for which the average height of all people 
involved is greater than 175 centimeters?
*/

SELECT COUNT(*) AS french_movies_avg_185 FROM (
	SELECT M.title
	FROM movie M, person P, involved I
	WHERE M.ID = I.movieID
	AND P.ID = I.personID
	AND M.language = 'French'
	GROUP BY M.title
	HAVING AVG(P.height) > 185
) m;

-- 46

SELECT COUNT(*) AS portugese_movies_avg_175 FROM (
	SELECT M.title
	FROM movie M, person P, involved I
	WHERE M.ID = I.movieID
	AND P.ID = I.personID
	AND M.language = 'Portuguese'
	GROUP BY M.title
	HAVING AVG(P.height) > 175
) m;

-- 26

/* (3)
The movie genre relation does not have a primary key, which can lead to a movie having more than 
one entry with the same genre. As a result, there are 14 movies in movie genre that have the genre 
‘Action’ assigned to them more than once. How many movies in movie genre have the genre ‘Thriller’ 
assigned to them more than once?
*/

SELECT COUNT(*) AS action_genre
FROM (SELECT COUNT(DISTINCT movieID)
	FROM movie_genre 
	WHERE genre = 'Action'
	GROUP BY movieID
	HAVING COUNT(genre) > 1
) thriller;

-- 14

SELECT COUNT(*) AS thriller_genre
FROM (SELECT COUNT(DISTINCT movieID)
	FROM movie_genre 
	WHERE genre = 'Thriller'
	GROUP BY movieID
	HAVING COUNT(genre) > 1
) thriller;

-- 14

/* (4)
According to the information in the database, 52 different people acted in movies directed by 
‘Ingmar Bergman’. How many different people acted in movies directed by ‘Akira Kurosawa’?
*/

SELECT COUNT(*) AS Directed_by_IB FROM (
	SELECT DISTINCT P.id
	FROM movie M, involved I, person P
	WHERE M.ID = I.movieID
	AND I.personID = P.ID
	AND M.title IN (SELECT M.title
		FROM movie M, involved I, person P
		WHERE M.ID = I.movieID
		AND I.personID = P.ID
		AND I.role = 'director'
		AND P.name = 'Ingmar Bergman')
) m;

-- 52

	SELECT COUNT(*) AS Directed_by_AK FROM (
		SELECT DISTINCT P.id
		FROM movie M, involved I, person P
		WHERE M.ID = I.movieID
		AND I.personID = P.ID
		AND M.title IN (SELECT M.title
			FROM movie M, involved I, person P
			WHERE M.ID = I.movieID
			AND I.personID = P.ID
			AND I.role = 'director'
			AND P.name = 'Akira Kurosawa')
	) m;

-- 131

/* (5)
Of all the movies produced in 2007, there are 15 that have two directors involved in them. 
How many movies produced in 2010 have two directors involved in them?
*/

SELECT M.title, COUNT(I.personID)
FROM movie M, involved I
WHERE M.year = 2007
AND M.ID = I.movieID
AND I.role = 'director'
GROUP BY M.title
HAVING COUNT(I.role) > 1

/* (6)
There are 406 unique pairs of actors who have appeared together in exactly 10 movies 
released between 2000 and 2010. How many unique pairs of actors have appeared together 
in exactly 20 movies released between 2000 and 2010?
*/

/* (7)
Of all the movies produced between 2000 and 2002, there are 782 that have entries registered 
in involved for all roles defined in the roles relation. How many movies produced between 2002 
and 2004 have entries registered in involved for all roles defined in the roles relation? 
Note: This is a relational division query that must work for any instance; Do not use any ‘magic numbers’.
*/

/* (8)
The number of people who have played a role in movies of all genres in the category ‘Newsworthy’ is 156. 
How many people have played a role in movies of all genres in the category ‘Newsworthy’ but have not 
played any role in movies that cover all genres in the category ‘Popular’?
*/