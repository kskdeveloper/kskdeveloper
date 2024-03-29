SELECT T1.USER_ID
     , T1.NICKNAME
     , (T1.CITY||' '||T1.STREET_ADDRESS1||' '||T1.STREET_ADDRESS2) AS 전체주소
     , (SUBSTR(T1.TLNO,1,3)||'-'||SUBSTR(T1.TLNO,4,4)||'-'||SUBSTR(T1.TLNO,8))AS 전화번호
FROM USED_GOODS_USER T1
INNER JOIN (
            SELECT WRITER_ID
                 , COUNT(*) AS CNT 
              FROM USED_GOODS_BOARD 
            GROUP BY WRITER_ID
           ) T2
		ON T1.USER_ID = T2.WRITER_ID
WHERE T2.CNT >= 3
ORDER BY T1.USER_ID DESC