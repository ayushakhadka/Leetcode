# Write your MySQL query statement below

# SELECT customer_id, Count(visit_id) as count_no_trans 
# from Visits v
# WHERE v.visit_id not in (SELECT visit_id from Transactions)
# GROUP BY customer_id;

SELECT customer_id, Count(v.visit_id) as count_no_trans
from Visits v
left join Transactions t 
ON v.visit_id = t.visit_id
WHERE t.visit_id is NULL
group by customer_id;

