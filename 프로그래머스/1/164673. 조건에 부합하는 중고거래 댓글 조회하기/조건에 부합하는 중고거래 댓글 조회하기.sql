-- 코드를 입력하세요
SELECT b.title, b.board_id, r.reply_id, r.writer_id, r.contents, TO_CHAR(r.CREATED_DATE, 'YYYY-MM-DD')
from used_goods_board b, used_goods_reply r
where b.board_id = r.board_id
    and b.created_date BETWEEN TO_DATE('2022-10-01', 'YYYY-MM-DD')
                    AND TO_DATE('2022-10-31', 'YYYY-MM-DD')
order by r.created_date, title;