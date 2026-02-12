問１
insert into items (id,category_id,name,price) values
(13,1,'鰯',150),
(14,2,'羊',650);

問2
update items set price = price * 0.9;

問３
delete from employees where end_date <= '2013-03-31'

問４
SELECT * FROM
    employees WHERE
    end_date IS NULL ORDER BY
    start_date LIMIT 1;

問５
select r.name as region,
p.name as prefecture
from
regions r
join
prefectures p
on
r.code = p.region_code;

問６
select sum(population) as population from populations;

問７
with people as(
select
p.gender_code,
r.name,
pr.name as prname,
sum(p.population) as pop
from
prefectures as pr
join
populations as p
on
p.prefecture_code = pr.code
join regions as r on r.code = pr.region_code
group by
pr.name,
p.gender_code,
r.name
)
select 
p.prname as prefecture,
g.name as gender,
p.pop as population
from
people p
join
genders g
on
g.code = p.gender_code
where
p.name = '九州'
order by
population desc


問８
