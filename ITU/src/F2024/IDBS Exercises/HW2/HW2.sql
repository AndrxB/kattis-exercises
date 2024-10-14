/*
-- 1 ER Diagram Interpretation
-- Choose the correct statements

(a) All foxes have a weight.

-> (b) A hunter can kill a fox without the assistance of a dog.

(c) A dog can kill a bird.

(d) Hunters are animals.

(e) All animals are dead.

-> (f) A hunter can kill a fox with the assistance of at least one dog.

-> (g) All foxes are dead.

(h) A bird can be killed by many hunters.

(i) All birds are dead.

(j) Given a hunter, it is possible to find the total weight of the animals he/she has killed.

-> (k) A bird can be a dog.
*/

-- 2 ER Diagram Design (original by Hildur Davíðsdóttir)
-- https://erdplus.com/edit-diagram/28cd0662-4f10-4ad0-935d-2e284a97db08


-- 3 SQL

/*
(a) The empire ‘Great Britain’ consists of 4 countries. How many countries does the
empire ‘Iberian’ consist of?
*/

SELECT COUNT(*) AS _3a_demo FROM empires WHERE empire LIKE 'Great%';
-- 4

SELECT COUNT(*) AS _3a FROM empires WHERE empire LIKE 'Iberian%';
-- 3

/*
(b) There are 4 countries that are present on more than one continent. How many of
these countries are partially in Asia?
*/

SELECT COUNT(*) AS _3b_demo FROM (
	SELECT C.name
	FROM countries C, countries_continents CC 
	WHERE C.code = CC.countrycode 
	GROUP BY C.name
	HAVING COUNT(C.region) > 1
) count;
-- 4

SELECT COUNT(*) AS _3b FROM (
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

SELECT SUM(C.population * CL.percentage/100)AS _3c_demo
FROM countries C, countries_continents CC, countries_languages CL 
WHERE C.code = CC.countrycode 
AND C.code = CL.countrycode 
AND CC.continent LIKE 'North America' 
AND C.population > 80000000 
AND CL.language = 'Spanish';
-- 111946176

SELECT FLOOR(SUM(C.population * CL.percentage/100)) AS _3c
FROM countries C, countries_continents CC, countries_languages CL 
WHERE C.code = CC.countrycode 
AND C.code = CL.countrycode 
AND CC.continent LIKE 'Europe'
AND C.population >  50000000
AND CL.language = 'Spanish';
-- 236902


/*
(d) According to the database, two languages are spoken in all countries of ‘Benelux’.
How many languages are spoken in all countries of ‘Danish Empire’?
-- Note: This is a division query; points will only be awarded if division is attempted.
*/


/*
-- 4 Functions & Triggers
-- choose the correct statements

(a) A row-level AFTER trigger on INSERT can modify the newly inserted row.
no, the inserted record is already in the database, and will not the altered

-> (b) In PostgreSQL, a trigger needs to be associated with a function.
yes, you create a trigger based on a function.

(c) A function can only be executed using a SELECT statement.
no, you can create a function without a SELECT statement

-> (d) If a function fails, its changes will be reverted.
yes, and no? the changes will not be commited.
*/
