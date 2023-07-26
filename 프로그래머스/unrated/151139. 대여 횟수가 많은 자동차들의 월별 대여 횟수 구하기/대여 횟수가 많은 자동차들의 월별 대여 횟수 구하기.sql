SELECT MONTH(start_date) AS month
	 ,car_id
	 ,COUNT(history_id) AS records
FROM (
    SELECT *, COUNT(history_id) OVER (PARTITION BY car_id) AS cnt
    FROM car_rental_company_rental_history
    WHERE start_date BETWEEN '2022-08-01' AND '2022-10-31'
          )AS sub
WHERE cnt>=5
GROUP BY month, car_id
ORDER BY month, car_id DESC
