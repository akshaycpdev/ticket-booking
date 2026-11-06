CREATE TABLE restaurants (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    city VARCHAR(100),
    cuisine VARCHAR(100),
    address TEXT
);

-- Update hotels table from V4 if needed or just ensure consistency
-- V4 already created hotels and transport, but let's add more columns if missing
ALTER TABLE hotels ADD COLUMN IF NOT EXISTS address TEXT;
ALTER TABLE hotels ADD COLUMN IF NOT EXISTS rating DOUBLE PRECISION;

ALTER TABLE transport ADD COLUMN IF NOT EXISTS name VARCHAR(255);
