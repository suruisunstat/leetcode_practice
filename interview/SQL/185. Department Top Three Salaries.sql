select d.Name as Department, e.Name as Employee, Salary from 
Employee e join Department d 
on e.DepartmentId = d.Id
where e.Id in 
(select t1.Id from
(select e1.*, e2.Salary as e2_salary, e2.Name as e2_name from Employee e1 join Employee e2
where e1.DepartmentId = e2.DepartmentId and e2.Salary >= e1.Salary) t1
group by t1.Id
having count(distinct e2_salary) <= 3)
