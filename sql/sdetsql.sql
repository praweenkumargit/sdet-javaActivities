use employees;

CREATE database sdet4_praween;

CREATE TABLE salesman (
    salesman_id int primary key,
    name varchar(32),
    city varchar(32),
    commission int
);

-- Insert values one at a time
INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15, 100);

DESC salesman;
INSERT INTO salesman VALUES
    (5002, 'Nail Knite', 'Paris', 13),
    (5005, 'Pit Alex', 'London', 11), 
    (5006, 'McLyon', 'Paris', 14), 
    (5007, 'Paul Adam', 'Rome', 13),
    (5003, 'Lauson Hen', 'San Jose', 12);
    
DROP TABLE salesman;    
  CREATE TABLE salesman (
    salesman_id int primary key,
    name varchar(32),
    city varchar(32),
    commission int
);  
 select * from salesman;
 #Activity3
 select salesman_id, city FROM salesman;
 select * from salesman where city = 'Paris';
 SELECT salesman_id, commission FROM salesman WHERE name='Paul Adam';
 #Activity4
 
 ALTER TABLE salesman
 ADD grade int;
 UPDATE salesman SET grade=100;
 select * from salesman;
 
#Activity5
UPDATE salesman SET grade=200 where city ='Rome';
UPDATE salesman SET grade=300 where name ='James Hoog';
UPDATE salesman SET name='Piere' where name = 'McLyon';

#Activity6

select * from orders;

select distinct * from orders;
select order_no from orders ORDER by order_date;
select order_no from orders ORDER by purchase_amount DESC;
select * from orders where purchase_amount < 500;
select * from orders where purchase_amount  between 1000 AND  2000;

#Activity7

select sum(purchase_amount)  total from orders;
select max(purchase_amount)  max from orders;
select min(purchase_amount)  min from orders;
select count(distinct salesman_id)  count from orders;

#Activity 8

SELECT customer_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id;


select MAX(purchase_amount) as "highest purchase amount", salesman_id FROM orders where order_date = '2012-08-17'
group by salesman_id;

-- Write an SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list 2030, 3450, 5760, and 6000.
SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders
GROUP BY customer_id, order_date
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

#Activity9
select * from customers;
select * from salesman;

select a.customer_name, b.name AS salesman_name  FROM customers a INNER JOIN salesman b ON a.salesman_id = b.salesman_id;
-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman
SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city FROM customers a 
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300 
ORDER BY a.customer_id;

-- Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id 
WHERE b.commission>12 ORDER BY a.customer_name;

-- Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works
-- for that customer and commission rate he gets for an order.

Select a.order_no as "order number", a.order_date "as order", a.purchase_amount as "amount of order", b.customer_name, c.name as "salesman name", c.commission
 FROM orders a INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;

#Activity10
-- Write a query to find all the orders issued against the salesman who may works for customer whose id is 3007.
SELECT * FROM orders
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

-- Write a query to find all orders attributed to a salesman in New York.
SELECT * FROM orders
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

-- Write a query to count the customers with grades above New York's average.
SELECT grade, COUNT(*) FROM customers
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

-- Write a query to extract the data from the orders table for those salesman who earned the maximum commission
SELECT order_no, purchase_amount, order_date, salesman_id FROM orders
WHERE salesman_id IN( SELECT salesman_id FROM salesman
WHERE commission=( SELECT MAX(commission) FROM salesman));

#Activity11

-- Write a query that produces the name and number of each salesman and each customer with more than one current order. Put the results in alphabetical order
SELECT customer_id, customer_name FROM customers a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id)
UNION
SELECT salesman_id, name FROM salesman a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id)
ORDER BY customer_name;

-- Write a query to make a report of which salesman produce the largest and smallest orders on each date.
SELECT a.salesman_id, name, order_no, 'highest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date)
UNION
SELECT a.salesman_id, name, order_no, 'lowest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);