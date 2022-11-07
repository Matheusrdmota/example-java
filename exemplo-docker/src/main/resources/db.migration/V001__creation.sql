CREATE TABLE IF NOT EXISTS user(
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    address VARCHAR(250) NOT NULL,
    city VARCHAR(100) NOT NULL,
    uf VARCHAR(2) NOT NULL,

    PRIMARY KEY (id),
    UNIQUE (email)
);

INSERT INTO user(id, name, email, address, city, uf) VALUES (1, "Matheus Mota", "mm@gmail.com", "dom pero II", "itz", "MA");
INSERT INTO user(id, name, email, address, city, uf) VALUES (2, "Bebequinha", "bebeca@gmail.com", "dom pero II", "itz", "MA");