# Write your MySQL query statement below

SELECT e1.name as name 
from Employee e1
Join(
    select managerId, count(*) as directReports 
    from Employee e2
    where managerId is not null
    group by managerId
) e2 on e1.id=e2.managerId
where e2.directReports >=5;