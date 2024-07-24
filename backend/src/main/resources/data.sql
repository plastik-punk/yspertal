INSERT INTO attendee (first_name, last_name) VALUES ('Max', 'Mustermann');
INSERT INTO attendee (first_name, last_name) VALUES ('Erika', 'Musterfrau');
INSERT INTO attendee (first_name, last_name) VALUES ('Hans', 'Dampf');

INSERT INTO instrument (name) VALUES ('Guitar');
INSERT INTO instrument (name) VALUES ('Piano');
INSERT INTO instrument (name) VALUES ('Drums');

INSERT INTO piece (author, title, difficulty) VALUES ('Johann Sebastian Bach', 'Air on the G String', 'A');
INSERT INTO piece (author, title, difficulty) VALUES ('Ludwig van Beethoven', 'Symphony No. 5', 'B');
INSERT INTO piece (author, title, difficulty) VALUES ('Wolfgang Amadeus Mozart', 'Eine kleine Nachtmusik', 'C');

INSERT INTO attendee_instrument (attendee_id, instrument_id) VALUES (1, 1);
INSERT INTO attendee_instrument (attendee_id, instrument_id) VALUES (1, 2);
INSERT INTO attendee_instrument (attendee_id, instrument_id, level) VALUES (2, 3, 'A');
INSERT INTO attendee_instrument (attendee_id, instrument_id, level) VALUES (3, 1, 'BC');

INSERT INTO piece_instrument (piece_id, instrument_id, amount) VALUES (1, 1, 1);
INSERT INTO piece_instrument (piece_id, instrument_id, amount) VALUES (1, 2, 1);
INSERT INTO piece_instrument (piece_id, instrument_id, amount) VALUES (2, 3, 1);
INSERT INTO piece_instrument (piece_id, instrument_id, amount) VALUES (3, 1, 1);
INSERT INTO piece_instrument (piece_id, instrument_id, amount) VALUES (3, 2, 1);

INSERT INTO instructor (last_name) VALUES ('Auzinger');
INSERT INTO instructor (last_name) VALUES ('Jo');
INSERT INTO instructor (last_name) VALUES ('Länger');

INSERT INTO project (instructor_id, piece_id) VALUES (1, 1);
INSERT INTO project (instructor_id, piece_id) VALUES (2, 2);
INSERT INTO project (instructor_id, piece_id) VALUES (3, 3);

INSERT INTO attendee_instructor (attendee_id, instructor_id, intensity) VALUES (1, 1, 'schwerpunkt');
INSERT INTO attendee_instructor (attendee_id, instructor_id, intensity) VALUES (1, 2, 'interesse');
INSERT INTO attendee_instructor (attendee_id, instructor_id, intensity) VALUES (2, 3, 'schwerpunkt');
INSERT INTO attendee_instructor (attendee_id, instructor_id, intensity) VALUES (3, 1, 'schnuppern');

INSERT INTO project_attendee (project_id, attendee_id) VALUES (1, 1);
INSERT INTO project_attendee (project_id, attendee_id) VALUES (1, 2);
INSERT INTO project_attendee (project_id, attendee_id) VALUES (2, 3);
INSERT INTO project_attendee (project_id, attendee_id) VALUES (3, 1);
INSERT INTO project_attendee (project_id, attendee_id) VALUES (3, 2);
INSERT INTO project_attendee (project_id, attendee_id) VALUES (3, 3);

