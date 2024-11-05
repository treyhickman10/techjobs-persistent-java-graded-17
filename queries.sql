--Part 1

id int
employer varchar(255)
name varchar(255)
skills varchar(255)

--Part 2

SELECT name
FROM employer
WHERE location = "St. Louis City";

--Part 3

DROP TABLE job;

--Part 4

select *
from skill
left join job_skills on skill.id = job_skills.skills_id
where job_skills.job_id IS NOT NULL
order by name ASC;