DROP TABLE IF EXISTS rating;
CREATE TABLE rating (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  user_name VARCHAR(250) NOT NULL,
  rating INTEGER DEFAULT 0,
  product_id INTEGER NOT NULL
);

INSERT INTO rating (user_name, rating, product_id) VALUES
  ('Ansh123', 5, 1),
  ('Divya123', 2, 2),
  ('test123', 4, 3);
