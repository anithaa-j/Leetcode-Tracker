-- Last updated: 7/9/2026, 3:11:03 PM
# Write your MySQL query statement below
# Write your MySQL query statement below
select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle