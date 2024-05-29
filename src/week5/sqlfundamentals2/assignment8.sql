-- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
-- CREATE DATABASE test TEMPLATE template0;
CREATE TABLE employee
(
    id       INTEGER,
    name     VARCHAR(50),
    birthday DATE,
    email    VARCHAR(100)
);

-- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (id, name, email, birthday) values (2, 'Paddie', 'poveril1@joomla.org', '1963-12-10');
insert into employee (id, name, email, birthday) values (3, 'Aarika', 'ascottesmoor2@webmd.com', '1985-04-23');
insert into employee (id, name, email, birthday) values (1, 'Hyman', 'hniemetz0@comsenz.com', '1946-05-21');
insert into employee (id, name, email, birthday) values (4, 'Kareem', 'kloder3@marriott.com', '1947-04-10');
insert into employee (id, name, email, birthday) values (5, 'Selby', 'sivy4@diigo.com', '1982-10-08');
insert into employee (id, name, email, birthday) values (6, 'Clarice', 'cmacdonagh5@cnbc.com', '1990-02-03');
insert into employee (id, name, email, birthday) values (7, 'Fleurette', 'flukianov6@stanford.edu', '1944-12-08');
insert into employee (id, name, email, birthday) values (8, 'Harry', 'hbilbie7@indiegogo.com', '1957-08-14');
insert into employee (id, name, email, birthday) values (9, 'Bradan', 'bgealle8@hubpages.com', '1992-02-17');
insert into employee (id, name, email, birthday) values (10, 'Eugenio', 'ehazell9@reference.com', '1948-01-17');
insert into employee (id, name, email, birthday) values (11, 'Faith', 'fbrookwooda@multiply.com', '1960-06-22');
insert into employee (id, name, email, birthday) values (12, 'Rafe', 'rchieseb@livejournal.com', '1973-09-12');
insert into employee (id, name, email, birthday) values (13, 'Tye', 'tnuttallc@bluehost.com', '1967-09-25');
insert into employee (id, name, email, birthday) values (14, 'Tova', 'tkinmand@state.tx.us', '1981-07-22');
insert into employee (id, name, email, birthday) values (15, 'Kessia', 'kedgcombee@loc.gov', '1947-04-08');
insert into employee (id, name, email, birthday) values (16, 'Nicol', 'nbullockf@guardian.co.uk', '1966-04-10');
insert into employee (id, name, email, birthday) values (17, 'Ninette', 'nlinwoodg@oracle.com', '1995-10-28');
insert into employee (id, name, email, birthday) values (18, 'Errol', 'earlotth@rediff.com', '1974-12-09');
insert into employee (id, name, email, birthday) values (19, 'Rafael', 'ringerithi@opensource.org', '1971-01-21');
insert into employee (id, name, email, birthday) values (20, 'Thaddus', 'twoodyearj@deviantart.com', '1989-12-30');
insert into employee (id, name, email, birthday) values (21, 'Arliene', 'aloudyank@ow.ly', '1985-10-05');
insert into employee (id, name, email, birthday) values (22, 'Silvie', 'sstotel@miibeian.gov.cn', '1966-02-20');
insert into employee (id, name, email, birthday) values (23, 'Barton', 'bpatem@chron.com', '1983-04-30');
insert into employee (id, name, email, birthday) values (24, 'Tressa', 'tmeakingn@smugmug.com', '1964-11-05');
insert into employee (id, name, email, birthday) values (25, 'Doy', 'debswortho@cam.ac.uk', '1987-11-07');
insert into employee (id, name, email, birthday) values (26, 'Lenette', 'lkellerp@wp.com', '1970-11-23');
insert into employee (id, name, email, birthday) values (27, 'Delora', 'dsolmanq@squidoo.com', '1951-05-17');
insert into employee (id, name, email, birthday) values (28, 'Lorena', 'lengehamr@nydailynews.com', '1998-05-26');
insert into employee (id, name, email, birthday) values (29, 'Ealasaid', 'eshadrachs@elegantthemes.com', '1948-12-06');
insert into employee (id, name, email, birthday) values (30, 'Lockwood', 'lcarettet@slideshare.net', '1984-01-18');
insert into employee (id, name, email, birthday) values (31, 'Kala', 'kklimmeku@opera.com', '1942-01-26');
insert into employee (id, name, email, birthday) values (32, 'Napoleon', 'nvlahosv@clickbank.net', '1959-08-19');
insert into employee (id, name, email, birthday) values (33, 'Granny', 'gfowlesw@mayoclinic.com', '1979-10-29');
insert into employee (id, name, email, birthday) values (34, 'Lion', 'ljorckx@psu.edu', '1981-03-18');
insert into employee (id, name, email, birthday) values (35, 'Emogene', 'efaceyy@toplist.cz', '1980-05-23');
insert into employee (id, name, email, birthday) values (36, 'Major', 'mborzonez@rediff.com', '1997-10-10');
insert into employee (id, name, email, birthday) values (37, 'Noam', 'nander10@miibeian.gov.cn', '1950-02-24');
insert into employee (id, name, email, birthday) values (38, 'Barron', 'bduhig11@independent.co.uk', '1993-03-19');
insert into employee (id, name, email, birthday) values (39, 'Pia', 'pwalkington12@google.ru', '1978-12-11');
insert into employee (id, name, email, birthday) values (40, 'Ram', 'rwimlett13@apple.com', '1953-12-14');
insert into employee (id, name, email, birthday) values (41, 'Nettie', 'nblaszczynski14@apache.org', '1982-07-21');
insert into employee (id, name, email, birthday) values (42, 'Nanny', 'nohrtmann15@fda.gov', '1941-09-22');
insert into employee (id, name, email, birthday) values (43, 'Darline', 'dosanne16@rediff.com', '1950-09-18');
insert into employee (id, name, email, birthday) values (44, 'Loralyn', 'lkilliner17@amazon.com', '1942-08-17');
insert into employee (id, name, email, birthday) values (45, 'Mallorie', 'mmonery18@infoseek.co.jp', '1968-05-12');
insert into employee (id, name, email, birthday) values (46, 'Hyman', 'hstorrah19@biglobe.ne.jp', '1986-12-18');
insert into employee (id, name, email, birthday) values (47, 'Kala', 'kmintram1a@4shared.com', '1988-05-07');
insert into employee (id, name, email, birthday) values (48, 'Dougy', 'djepperson1b@sbwire.com', '1971-04-26');
insert into employee (id, name, email, birthday) values (49, 'Mackenzie', 'mgainsburgh1c@symantec.com', '1976-08-22');
insert into employee (id, name, email, birthday) values (50, 'Astrid', 'aboon1d@google.ru', '1950-08-05');

-- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
-- 1.
UPDATE employee
SET name = 'Updated Name'
WHERE id = 10;

-- 2.
UPDATE employee
SET birthday = '2000-01-01'
WHERE name = 'Paddie';

-- 3.
UPDATE employee
SET email = 'updated.email@example.com'
WHERE birthday = '1959-08-19';

-- 4.
UPDATE employee
SET name = 'New Name'
WHERE email = 'kmintram1a@4shared.com';

-- 5.
UPDATE employee
SET birthday = '1999-12-31', email = 'new.email@example.com'
WHERE id = 25;

-- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
-- 1.
DELETE FROM employee
WHERE id = 10
RETURNING *;

-- 2.
DELETE FROM employee
WHERE name = 'Tressa'
RETURNING *;

-- 3.
DELETE FROM employee
WHERE birthday = '1978-12-11'
RETURNING *;

-- 4.
DELETE FROM employee
WHERE email = 'hstorrah19@biglobe.ne.jp'
RETURNING *;

-- 5.
DELETE FROM employee
WHERE birthday < '1950-01-01'
RETURNING *;