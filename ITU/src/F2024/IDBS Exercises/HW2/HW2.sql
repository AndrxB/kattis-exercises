/*
-- 1 ER Diagram Interpretation
-- Choose the correct statements

-> (a) All foxes have a weight.
-> (b) A hunter can kill a fox without the assistance of a dog.
(c) A dog can kill a bird.
(d) Hunters are animals.
(e) All animals are dead.
-> (f) A hunter can kill a fox with the assistance of at least one dog.
-> (g) All foxes are dead.
(h) A bird can be killed by many hunters.
(i) All birds are dead.
-> (j) Given a hunter, it is possible to find the total weight of the animals he/she has killed.
-> (k) A bird can be a dog.
*/

-- 2 ER Diagram Design (original by Hildur Davíðsdóttir)
-- https://erdplus.com/edit-diagram/28cd0662-4f10-4ad0-935d-2e284a97db08

-- 3 SQL

/*
(a) The empire ‘Great Britain’ consists of 4 countries. How many countries does the
empire ‘Iberian’ consist of?
*/

SELECT COUNT(*) FROM empires WHERE empire LIKE 'Great%';
-- 4

SELECT COUNT(*) FROM empires WHERE empire LIKE 'Iberian%';
-- 3

/*
(b) There are 4 countries that are present on more than one continent. How many of
these countries are partially in Asia?
*/

SELECT COUNT(*) AS more_than_one_continent FROM (
	SELECT C.name
	FROM countries C, countries_continents CC 
	WHERE C.code = CC.countrycode 
	GROUP BY C.name
	HAVING COUNT(C.region) > 1
) count;
-- 4

SELECT COUNT(*) AS partial_asia FROM (
	SELECT C.name
	FROM countries C, countries_continents CC 
	WHERE C.code = CC.countrycode 
    AND LOWER(C.region) LIKE '%asia%'
	GROUP BY C.name
	HAVING COUNT(C.region) > 1
) count;
-- 1

/*
(c) In the countries of North America that have more than 80 million inhabitants, there
are a total of 111,946,176 people who speak Spanish, according to the statistics in
the database. How many people who speak Spanish exist in the countries of Europe
that have more than 50 million inhabitants?
*/



/*
(d) According to the database, two languages are spoken in all countries of ‘Benelux’.
How many languages are spoken in all countries of ‘Danish Empire’?
*/



-- Note: This is a division query; points will only be awarded if division is attempted.


-- 4 Functions & Triggers
-- choose the correct statements

