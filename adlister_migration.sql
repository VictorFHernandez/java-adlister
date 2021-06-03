USE adlister_db;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS ads;

CREATE TABLE users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR (75) NOT NULL,
    email VARCHAR (150) NOT NULL,
    password VARCHAR (100) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id VARCHAR (75) NOT NULL,
    title VARCHAR (100) NOT NULL,
    description TEXT NOT NULL,
    PRIMARY KEY (id),
    foreign key (id) references users (id)
);