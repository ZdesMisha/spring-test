/* Database Schema */
CREATE SEQUENCE user_id_seq;
CREATE SEQUENCE note_id_seq;
-- CREATE SEQUENCE hibernate_sequence;



CREATE TABLE users (
  id       INT  NOT NULL DEFAULT nextval('user_id_seq') PRIMARY KEY,
  name     TEXT NOT NULL,
  password TEXT NOT NULL,
  role     TEXT NOT NULL
);


CREATE TABLE notes (
  id      INT       NOT NULL DEFAULT nextval('note_id_seq') PRIMARY KEY,
  user_id INT REFERENCES users (id) ON UPDATE CASCADE ON DELETE CASCADE,
  text    TEXT      NOT NULL,
  date    TIMESTAMP NOT NULL
);

COMMIT;


INSERT INTO users (name, password, role) VALUES ('admin', 'admin', 'admin');
INSERT INTO users (name, password, role) VALUES ('misha', '12345', 'user');

INSERT INTO notes (user_id, text, date) VALUES ('2', 'Test note 1', now());
INSERT INTO notes (user_id, text, date) VALUES ('2', 'Test note 2', now());
INSERT INTO notes (user_id, text, date) VALUES ('2', 'Test note 3', now());
INSERT INTO notes (user_id, text, date) VALUES ('2', 'Test note 4', now());
INSERT INTO notes (user_id, text, date) VALUES ('2', 'Test note 5', now());


SELECT *
FROM users;


