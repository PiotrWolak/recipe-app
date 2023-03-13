CREATE TABLE IF NOT EXISTS Recipes (
    id int,
    name varchar(255),
    instruction varchar(255),
    author varchar(255)
);

INSERT INTO Recipes (id, name, instruction, author) VALUES (1, 'Kisiel', '1. open kisiel, 2. throw kisiel into a boiling water, 3. stir','me@gmail.com');
--INSERT INTO Recipes (id, name, instruction, author) VALUES (2, 'ziemniak', '1. open ziemniak, 2. throw ziemniak into a boiling water','me@gmail.com');
