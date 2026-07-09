-- Last updated: 7/9/2026, 3:12:13 PM
# Write your MySQL query statement below
select(
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary desc 
    limit 1 offset 1
)AS SecondHighestSalary;