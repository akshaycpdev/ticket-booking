CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    mobile_number VARCHAR(20) UNIQUE NOT NULL,
    password VARCHAR(255),
    full_name VARCHAR(100),
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);
