CREATE TABLE
  customers (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100)
  );

CREATE TABLE
  products (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(100),
    amount NUMERIC(20, 2)
  );

CREATE TABLE
  orders (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    customer_id INTEGER REFERENCES customers (id),
    created_at TIMESTAMP,
    amount NUMERIC(20, 2)
  );

CREATE TABLE
  order_products (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    order_id INTEGER REFERENCES orders (id),
    product_id INTEGER REFERENCES products (id),
    amount INTEGER
  );