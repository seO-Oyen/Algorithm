-- 코드를 입력하세요
SELECT round(avg(daily_fee), 0) 
from car_rental_company_car
group by car_type
having car_type like 'SUV';