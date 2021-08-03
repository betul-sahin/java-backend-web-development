1.test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.   
```
CREATE TABLE employee (
    id INTEGER PRIMARY KEY, 
	name VARCHAR(50) NOT NULL, 
	birthday DATE NOT NULL, 
	email VARCHAR(100) NOT NULL
);
```

2.Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.   
```
insert into employee (id, name, birthday, email) values (1, 'Gottfried', '2020-08-14', 'gturford0@intel.com');
insert into employee (id, name, birthday, email) values (2, 'Harlan', '2020-08-07', 'hpenhaligon1@yahoo.co.jp');
insert into employee (id, name, birthday, email) values (3, 'Lauren', '2020-10-04', 'ltimlett2@unblog.fr');
...
```

3.Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.   
```
update employee
SET name = 'Mehmet'
WHERE id = 2;

update employee
SET email = 'lauren@gmail.com'
WHERE name = 'Lauren';

update employee
SET birthday = '2020-9-9'
WHERE name = 'Bear';
```

4.Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.   
```
delete from employee
where id = 1;

delete from employee
where name = 'Mehmet';

delete from employee
where birthday = '2021-04-18';

delete from employee
where email = 'cbriatf@soup.io';
```
