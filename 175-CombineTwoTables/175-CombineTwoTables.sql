-- Last updated: 7/9/2026, 3:12:15 PM
# Write your MySQL query statement below
select p.firstName,
       p.lastName,
       a.city,
       a.state
from Person p
left join Address a
on p.personId = a.personId;