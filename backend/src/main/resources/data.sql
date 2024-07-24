INSERT INTO attendee (firstName, lastName) VALUES ('Max', 'Mustermann');
INSERT INTO attendee (firstName, lastName) VALUES ('Erika', 'Musterfrau');
INSERT INTO attendee (firstName, lastName) VALUES ('Hans', 'Dampf');

INSERT INTO instrument (name) VALUES ('Guitar');
INSERT INTO instrument (name) VALUES ('Piano');
INSERT INTO instrument (name) VALUES ('Drums');

INSERT INTO piece (author, title, difficulty) VALUES ('Johann Sebastian Bach', 'Air on the G String', 'A');
INSERT INTO piece (author, title, difficulty) VALUES ('Ludwig van Beethoven', 'Symphony No. 5', 'B');
INSERT INTO piece (author, title, difficulty) VALUES ('Wolfgang Amadeus Mozart', 'Eine kleine Nachtmusik', 'C');

INSERT INTO attendee_instrument (attendee_id, instrument_id) VALUES (1, 1);
INSERT INTO attendee_instrument (attendee_id, instrument_id) VALUES (1, 2);
INSERT INTO attendee_instrument (attendee_id, instrument_id) VALUES (2, 3);
INSERT INTO attendee_instrument (attendee_id, instrument_id) VALUES (3, 1);

INSERT INTO piece_instrument (piece_id, instrument_id, amount) VALUES (1, 1, 1);
INSERT INTO piece_instrument (piece_id, instrument_id, amount) VALUES (1, 2, 1);
INSERT INTO piece_instrument (piece_id, instrument_id, amount) VALUES (2, 3, 1);
INSERT INTO piece_instrument (piece_id, instrument_id, amount) VALUES (3, 1, 1);
INSERT INTO piece_instrument (piece_id, instrument_id, amount) VALUES (3, 2, 1);

INSERT INTO project (instructor, piece_id) VALUES ('Auzinger', 1);
INSERT INTO project (instructor, piece_id) VALUES ('Jo', 2);
INSERT INTO project (instructor, piece_id) VALUES ('Länger', 3);

INSERT INTO project_attendee (project_id, attendee_id) VALUES (1, 1);
INSERT INTO project_attendee (project_id, attendee_id) VALUES (1, 2);
INSERT INTO project_attendee (project_id, attendee_id) VALUES (2, 3);
INSERT INTO project_attendee (project_id, attendee_id) VALUES (3, 1);
INSERT INTO project_attendee (project_id, attendee_id) VALUES (3, 2);
INSERT INTO project_attendee (project_id, attendee_id) VALUES (3, 3);

