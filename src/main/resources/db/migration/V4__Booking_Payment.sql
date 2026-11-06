CREATE TABLE bookings (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT,
    status VARCHAR(50),
    created_at TIMESTAMP DEFAULT NOW()
);
CREATE TABLE booking_items (
    id BIGSERIAL PRIMARY KEY,
    booking_id BIGINT,
    event_id BIGINT,
    seat_id BIGINT,
    price NUMERIC(10,2)
);
CREATE TABLE payments (
    id BIGSERIAL PRIMARY KEY,
    booking_id BIGINT,
    amount NUMERIC(12,2),
    status VARCHAR(50)
);
CREATE TABLE hotels (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    city VARCHAR(100),
    nightly_price NUMERIC(10,2)
);
CREATE TABLE transport (
    id BIGSERIAL PRIMARY KEY,
    type VARCHAR(50),
    origin VARCHAR(100),
    destination VARCHAR(100),
    fare NUMERIC(10,2)
);
