# Write your MySQL query statement below

select s.student_id, s.student_name, sub.subject_name,
    (select count(*) from Examinations e where e.student_id = s.student_id and e.subject_name=sub.subject_name
    ) as attended_exams
from Students s
Inner join Subjects sub
order by student_id, subject_name;

