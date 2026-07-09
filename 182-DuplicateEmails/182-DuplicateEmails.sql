-- Last updated: 7/9/2026, 3:12:03 PM
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;