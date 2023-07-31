CREATE DATABASE IF NOT EXISTS sunduk_db;
USE sunduk_db;

CREATE USER 'sunduk'@'%' IDENTIFIED BY 'pass';
GRANT ALL PRIVILEGES ON sunduk_db.* TO 'sunduk'@'%';
FLUSH PRIVILEGES;

CREATE TABLE IF NOT EXISTS person (
    id VARCHAR(36) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL
);

INSERT INTO person (id, name, age) VALUES ('1', 'sexysinny', 34);
INSERT INTO person (id, name, age) VALUES ('2', 'soon suk', 34);
INSERT INTO person (id, name, age) VALUES ('3', 'nakamura seo', 52);
INSERT INTO person (id, name, age) VALUES ('4', 'hyangyee lee', 29);
