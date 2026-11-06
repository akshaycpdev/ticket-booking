CREATE TABLE stadium_sections (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    stadium_id BIGINT
);
CREATE TABLE stadium_blocks (
    id BIGSERIAL PRIMARY KEY,
    section_id BIGINT,
    block_code VARCHAR(20) NOT NULL
);
CREATE TABLE stadium_rows (
    id BIGSERIAL PRIMARY KEY,
    block_id BIGINT,
    row_number INT NOT NULL
);
CREATE TABLE stadium_seats (
    id BIGSERIAL PRIMARY KEY,
    row_id BIGINT,
    seat_number INT NOT NULL,
    price NUMERIC(10,2),
    status VARCHAR(20) DEFAULT 'AVAILABLE'
);

CREATE TABLE seat_holds (
    id BIGSERIAL PRIMARY KEY,
    seat_id BIGINT NOT NULL,
    user_id BIGINT,
    expires_at TIMESTAMP NOT NULL
);
