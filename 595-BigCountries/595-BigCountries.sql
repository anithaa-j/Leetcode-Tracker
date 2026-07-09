-- Last updated: 7/9/2026, 3:11:05 PM
# Write your MySQL query statement below
select name,population,area
from world
where area>=3000000
    or population>=25000000;
