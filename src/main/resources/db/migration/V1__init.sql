CREATE TABLE IF NOT EXISTS youtuber (
    id SERIAL,
    fullname VARCHAR (100) NOT NULL,
    channel VARCHAR (25) NOT NULL,
    total_videos INT DEFAULT 0,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS video(
    id SERIAL,
    title VARCHAR(100) NOT NULL,
    description VARCHAR (100) NOT NULL,
    duration INT,
    youtuber_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (youtuber_id) references youtuber(id)
);
