# Write your MySQL query statement below
with Cumulative as(
    select person_name,
    turn,
    sum(weight) over (order by turn) as total_weight
    from queue
)

select person_name 
from Cumulative
where total_weight<=1000
order by turn DESC
limit 1;
