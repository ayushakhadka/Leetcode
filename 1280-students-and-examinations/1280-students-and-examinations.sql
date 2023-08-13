# Write your MySQL query statement below

select s.student_id, s.student_name, sub.subject_name, count(e.subject_name) as attended_exams
from Students as s
Join Subjects as sub
Left join Examinations as e
on s.student_id=e.student_id and sub.subject_name=e.subject_name
group by s.student_id, sub.subject_name
order by student_id, subject_name;

