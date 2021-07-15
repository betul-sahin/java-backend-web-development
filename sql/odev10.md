1.city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.   
```
SELECT co.country, ci.city FROM city ci
LEFT JOIN country co
ON co.country_id = ci.country_id;
```

2.customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz
RIGHT JOIN sorgusunu yazınız.   
```
SELECT pa.payment_id, cu.first_name, cu.last_name FROM payment pa
RIGHT JOIN customer cu 
ON cu.customer_id = pa.customer_id;
```


3. customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz
FULL JOIN sorgusunu yazınız.   
```
SELECT re.rental_id, cu.first_name, cu.last_name  FROM rental re
FULL JOIN customer cu
ON cu.customer_id = re.customer_id;
```
