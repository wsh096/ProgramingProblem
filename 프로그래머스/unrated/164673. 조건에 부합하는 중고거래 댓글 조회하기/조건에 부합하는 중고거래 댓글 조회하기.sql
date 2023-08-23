-- 코드를 입력하세요
SELECT a.title, a.board_id, b.reply_id, b.writer_id , b.contents , DATE_FORMAT(b.created_date, '%Y-%m-%d')
FROM used_goods_board AS a INNER JOIN used_goods_reply AS b
ON a.board_id = b.board_id
WHERE a.created_date LIKE '2022-10%'
ORDER BY b.created_date, a.title;