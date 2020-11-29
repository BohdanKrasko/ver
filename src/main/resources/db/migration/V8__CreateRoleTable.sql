CREATE TABLE IF NOT EXISTS role (
    role_id INT PRIMARY KEY NOT NULL,
    role_name VARCHAR(20) NOT NULL
);

INSERT INTO role (role_id, role_name) VALUES (1, 'admin');
INSERT INTO role (role_id, role_name) VALUES (2, 'student');
INSERT INTO role (role_id, role_name) VALUES (3, 'teacher');
