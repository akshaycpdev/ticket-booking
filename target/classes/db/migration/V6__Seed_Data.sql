-- Sample Seed Data
INSERT INTO events (name, start_time, end_time, venue, city) VALUES
('RCB vs CSK', '2026-11-07 19:30:00', '2026-11-07 23:30:00', 'M. Chinnaswamy Stadium', 'Bengaluru'),
('Mysuru Dasara', '2026-10-15 09:00:00', '2026-10-25 22:00:00', 'Mysuru Palace', 'Mysuru');

INSERT INTO transport (type, name, origin, destination, fare) VALUES
('BUS', 'KSRTC Airavat Club Class', 'Mysuru', 'Bengaluru', 420.00),
('TRAIN', 'Shatabdi Express', 'Mysuru', 'Bengaluru', 670.00),
('METRO', 'Namma Metro Purple Line', 'Kengeri', 'MG Road', 50.00);

INSERT INTO hotels (name, city, address, nightly_price, rating) VALUES
('Indiranagar Homestay', 'Bengaluru', 'Indiranagar 12th Main', 3200.00, 4.5),
('MG Road Business Hotel', 'Bengaluru', 'MG Road', 5800.00, 4.2),
('Heritage Inn', 'Mysuru', 'Near Palace', 4500.00, 4.7);

INSERT INTO restaurants (name, city, cuisine, address) VALUES
('Vidyarthi Bhavan', 'Bengaluru', 'South Indian', 'Gandhi Bazaar'),
('MTR', 'Bengaluru', 'South Indian', 'Lalbagh Road'),
('Toit', 'Bengaluru', 'Brewery', 'Indiranagar');

-- Stadium setup for RCB vs CSK
INSERT INTO stadium_sections (name, stadium_id) VALUES ('North', 1), ('South', 1), ('East', 1), ('West', 1);
INSERT INTO stadium_blocks (section_id, block_code) VALUES (3, 'East D1'), (3, 'East D2');
INSERT INTO stadium_rows (block_id, row_number) VALUES (1, 1), (1, 2);
INSERT INTO stadium_seats (row_id, seat_number, price, status) VALUES
(1, 1, 1800.00, 'AVAILABLE'),
(1, 2, 1800.00, 'AVAILABLE'),
(2, 1, 2500.00, 'AVAILABLE');
