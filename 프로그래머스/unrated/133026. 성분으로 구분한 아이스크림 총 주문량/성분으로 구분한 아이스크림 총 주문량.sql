SELECT INGREDIENT_TYPE
	 , SUM(TOTAL_ORDER) AS TOTAL_ORDER
FROM ICECREAM_INFO
JOIN FIRST_HALF
USING (FLAVOR)
GROUP BY INGREDIENT_TYPE
ORDER BY TOTAL_ORDER