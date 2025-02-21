create database week3;
use week3;
CREATE TABLE faculty (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    pass VARCHAR(255) NOT NULL,
    mob VARCHAR(15) NOT NULL
);

CREATE TABLE course (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    duration VARCHAR(50) NOT NULL
);

CREATE TABLE assignment (
    id INT PRIMARY KEY AUTO_INCREMENT,
    faculty_id INT NOT NULL,
    course_id INT NOT NULL,
    FOREIGN KEY (faculty_id) REFERENCES faculty(id) ON DELETE CASCADE,
    FOREIGN KEY (course_id) REFERENCES course(id) ON DELETE CASCADE
);

INSERT INTO faculty (name, email, pass, mob) VALUES
('Saumyajit Das', 'saumyajitdas@12gmail.com', 'password123', '4545445568');

INSERT INTO course (name, duration) VALUES
('Mathematics', 6),
('Physics', 4);
