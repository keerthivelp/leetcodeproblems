# Write your MySQL query statement below
select DISTINCT author_id as id FROM Views
WHERE author_id = viewer_id
order by id;
