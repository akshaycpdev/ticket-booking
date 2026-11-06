CREATE TABLE events (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    start_time TIMESTAMP,
    end_time TIMESTAMP,
    venue VARCHAR(255),
    city VARCHAR(100)
);
