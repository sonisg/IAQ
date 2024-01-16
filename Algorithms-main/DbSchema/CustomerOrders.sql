use DBQ;
Create table customer (
customer_id int primary key,
customer_name varchar(50),
phone_number varchar(50),
email varchar(50)
);

create table address(
address_id int primary key,
street varchar(50),
city varchar(50),
state varchar(50),
postal_code varchar(50),
customer_id int,
CONSTRAINT fk_customer_id foreign key (customer_id) references customer(customer_id)
);

create table orders(
order_id int primary key,
customer_id int,
address_id int,
order_date date,
constraint fk_customer1_id foreign key (customer_id) references customer(customer_id),
constraint fk_address_id foreign key (address_id) references address(address_id)
);

create table items(
item_id int primary key,
order_id int,
ProductName VARCHAR(100),
Quantity INT,
Price DECIMAL(10, 2),
constraint fk_order_id foreign key (order_id) references orders(order_id)
);

insert into customer (customer_id, customer_name, phone_number, email) values (4, "Sumit2", "8753434554", "sumit@gmail.com");
-- Insert data into Customer table
INSERT INTO customer (customer_id, customer_name, phone_number, email)
VALUES
    (2, 'Jane Smith', '987-654-3210', 'jane.smith@example.com'),
    (3, 'Bob Johnson', '555-123-4567', 'bob.johnson@example.com');

-- Insert data into Address table
INSERT INTO address (address_id, street, city, state, postal_code, customer_id)
VALUES
    (1, '123 Main St', 'City1', 'State1', '12345', 1),
    (2, '456 Oak St', 'City2', 'State2', '67890', 2),
    (3, '789 Pine St', 'City3', 'State3', '98765', 3);
INSERT INTO address (address_id, street, city, state, postal_code, customer_id)
VALUES
    (4, '123 Main St', 'City1', 'State1', '12345', 1),
    (5, '456 Oak St', 'City2', 'State2', '67890', 1),
    (6, '789 Pine St', 'City3', 'State3', '98765', 2);

-- Insert data into Orders table
INSERT INTO orders (order_id, customer_id, address_id, order_date)
VALUES
    (101, 1, 1, '2022-01-01'),
    (102, 2, 2, '2022-01-02'),
    (103, 3, 3, '2022-01-03');

-- Insert data into Items table
INSERT INTO items (item_id, order_id, ProductName, Quantity, Price)
VALUES
    (1001, 101, 'ProductA', 3, 20.00),
    (1002, 101, 'ProductB', 2, 15.00),
    (1003, 102, 'ProductC', 5, 10.00),
    (1004, 103, 'ProductD', 1, 25.00);
INSERT INTO items (item_id, order_id, ProductName, Quantity, Price)
VALUES
    (1005, 102, 'ProductA', 3, 20.00),
    (1006, 103, 'ProductB', 2, 15.00),
    (1007, 102, 'ProductC', 3, 10.00),
    (1008, 103, 'ProductD', 2, 25.00);
select * from customer;
select * from address;
select * from orders;
select * from items; 


/*select all customer who have not put any order yet;*/
select * from customer c left join orders o on c.customer_id = o.customer_id where o.customer_id is null;

/*select all customer who put more than 5 items in one order*/
select c.customer_name, c.phone_number from customer c join orders o on c.customer_id = o.customer_id join items i on i.order_id = o.order_id group by c.customer_id having count(item_id)>1;

/*Write a query to retrieve the total value of items sold in each order*/
select sum(price) as total_value from items i join orders o on i.order_id = o.order_id group by o.order_id;

/*How would you find the total number of items sold in a specific order*/
select count(item_id) as total_value from items i join orders o on i.order_id = o.order_id group by o.order_id;

/*Write a query to find the most recent order date for each customer.*/
select max(o.order_date) as recent_order_date from orders o inner join customer c on o.customer_id=c.customer_id group by c.customer_id order by recent_order_date desc;

/*Calculate the total quantity of each product sold across all orders*/
select i.ProductName, sum(i.Quantity) as total_quantity from items i join orders o on i.order_id = o.order_id group by i.ProductName;

/*Identify customers who have more than one address in the address table*/
select c.customer_name from customer c inner join address a on a.customer_id=c.customer_id group by c.customer_id having count(address_id)>1;
