# Write your MySQL query statement below
select s.Score, t2.rk as `Rank` from
Scores s
join
(select t1.Score, count(distinct s2_score) as rk from
(select s1.*, s2.Score as s2_score from Scores s1 join Scores s2
where s2.Score >= s1.Score) t1
group by t1.Score) t2
on s.Score = t2.Score
order by `Rank`

