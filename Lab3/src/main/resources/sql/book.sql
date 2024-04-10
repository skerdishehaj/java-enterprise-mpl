CREATE Database IF NOT EXISTS library;
USE library;

CREATE TABLE book (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    author VARCHAR(255),
);

-- Insert some data
INSERT INTO book (title, author) VALUES ('The Great Gatsby', 'F. Scott Fitzgerald');
INSERT INTO book (title, author) VALUES ('To Kill a Mockingbird', 'Harper Lee');
INSERT INTO book (title, author) VALUES ('1984', 'George Orwell');
INSERT INTO book (title, author) VALUES ('Pride and Prejudice', 'Jane Austen');
INSERT INTO book (title, author) VALUES ('The Catcher in the Rye', 'J.D. Salinger');
INSERT INTO book (title, author) VALUES ('The Hobbit', 'J.R.R. Tolkien');
INSERT INTO book (title, author) VALUES ('The Lord of the Rings', 'J.R.R. Tolkien');
INSERT INTO book (title, author) VALUES ('The Chronicles of Narnia', 'C.S. Lewis');
INSERT INTO book (title, author) VALUES ('The Hitchhiker''s Guide to the Galaxy', 'Douglas Adams');
INSERT INTO book (title, author) VALUES ('The Hunger Games', 'Suzanne Collins');

