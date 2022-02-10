CREATE TABLE IF NOT EXISTS contact (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50),
  email VARCHAR(50),
  date VARCHAR(50),
  message VARCHAR(200),
  esttraite BOOLEAN
);