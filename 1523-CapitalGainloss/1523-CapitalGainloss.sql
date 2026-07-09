-- Last updated: 7/9/2026, 3:10:08 PM
# Write your MySQL query statement below
SELECT stock_name, SUM(
    CASE
        WHEN operation = 'Buy' THEN -price
        ELSE price
    END
) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name