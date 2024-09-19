-- 1. The name and record of all sports sorted by name.
SELECT name, record 
FROM sports 
ORDER BY name ASC;

-- 2. The name of all sports with at least one result.
SELECT DISTINCT name, record, id 
FROM sports
JOIN results
ON sports.id = results.sportid;

-- 3. The number of athletes who have competed in at least one sport.
SELECT COUNT(DISTINCT peopleID) 
FROM results 
WHERE result > 1;

-- 4. The ID and name of athletes who have at least twenty results.
SELECT R.peopleID, P.name
FROM results R 
JOIN people P 
ON R.peopleid = P.ID 
GROUP BY R.peopleID, P.name
HAVING COUNT(R.result) >= 20;

-- 5. The ID, name and gender description of all athletes that currently hold a record.
SELECT DISTINCT P.ID, P.name, G.description
FROM People P, Gender G, Results R, Sports S 
WHERE P.gender = G.gender 
AND P.ID = R.peopleID 
AND S.ID = R.sportID 
AND R.result = S.record
ORDER BY P.ID ASC;

/* 
 * 6. For each sport, where some athlete holds the record, the name of the
 * sport and the number of athletes that hold a record in that sport; the last
 * column should be named “numathletes”.
 */
SELECT S.name, Count(DISTINCT R.peopleID)
FROM Sports S, Results R
WHERE R.result = S.record
AND R.sportID = S.ID
GROUP BY S.name;

/* 
 * 7. The ID and name of each athlete that has at least twenty results in the
 * triple jump, their best result, along with the difference between the  
 * record and their best result. The second-to-last column should be named
 * “best” while the last column should be named “difference”. The last
 * column should always contain non-negative values and should preferably
 * be formatted to show at least one digit before the decimal point and
 *exactly two digits after the decimal point.
 */

SELECT P.ID, P.name, MAX(R.result) AS best, to_char(S.record-max(R.result), '0D99') AS difference
FROM People P, Results R, Sports S
WHERE R.peopleID = P.ID
	AND R.sportID = S.ID
	AND R.sportID = 2
GROUP BY P.ID, P.name, S.record
	HAVING COUNT(R.result) >= 20
ORDER BY P.ID ASC;

/* 
 * 8. The ID, name and gender description of all athletes who participated in the
 * competition held in Hvide Sande in 2009
 */
SELECT DISTINCT P.name, P.ID, G.description
FROM People P, Gender G, Competitions C, Results R
WHERE CAST(C.held AS VARCHAR) LIKE '2009%'
AND P.gender = G.gender
AND P.ID = R.peopleID
AND R.competitionID = C.ID
AND C.place = 'Hvide Sande'
ORDER BY P.ID ASC;

/* 
 * 9. The name and gender description of all people with a last name that starts
 * with a “J” and ends with a “sen” (e.g., Jensen, Jansen, Johansen).
 */
SELECT name
FROM people
WHERE name SIMILAR TO '% (J|j)%|(sen)';

-- 11. The number of athletes with some incomplete result registrations.


