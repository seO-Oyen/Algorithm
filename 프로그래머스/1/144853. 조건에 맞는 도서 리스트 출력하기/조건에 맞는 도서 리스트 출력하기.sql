-- 코드를 입력하세요
SELECT book_id, to_char(published_date, 'yyyy-mm-dd')
from book
where published_date like '%21%'
    and category like '인문'
order by published_date;