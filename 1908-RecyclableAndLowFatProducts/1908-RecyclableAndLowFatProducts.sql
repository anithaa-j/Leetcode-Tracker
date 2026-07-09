-- Last updated: 7/9/2026, 3:09:53 PM
# Write your MySQL query statement below
SELECT
    product_id
FROM Products
WHERE low_fats = 'Y'
AND recyclable = 'Y';