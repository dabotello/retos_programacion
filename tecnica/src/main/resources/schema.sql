-- Crear tabla Category
CREATE TABLE IF NOT EXISTS category (
    categoryId BIGINT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255)
);

-- Crear tabla Film
CREATE TABLE IF NOT EXISTS film (
    filmId BIGINT PRIMARY KEY,
    title VARCHAR(255),
    description VARCHAR(255),
    "YEAR" INT,
    rental_duration INT,
    rating VARCHAR(255),
    duration INT,
    rental_price DECIMAL(5, 2)
);

-- Crear tabla FilmCategory
CREATE TABLE IF NOT EXISTS filmCategory (
    filmCategoryId BIGINT PRIMARY KEY,
    filmId BIGINT,
    categoryId BIGINT,
    FOREIGN KEY (filmId) REFERENCES film(filmId),
    FOREIGN KEY (categoryId) REFERENCES category(categoryId)
);

-- Crear tabla Store
CREATE TABLE IF NOT EXISTS store (
    storeId BIGINT PRIMARY KEY,
    address VARCHAR(255)
);

-- Crear tabla Inventory
CREATE TABLE IF NOT EXISTS inventory (
    inventoryId BIGINT PRIMARY KEY,
    filmId BIGINT,
    storeId BIGINT,
    quantity INT,
    FOREIGN KEY (filmId) REFERENCES film(filmId),
    FOREIGN KEY (storeId) REFERENCES store(storeId)
);

INSERT INTO Category (categoryId, name, description) VALUES
(1, 'Action', 'Movies with action scenes'),
(2, 'Drama', 'Emotional and thought-provoking films'),
(3, 'Comedy', 'Funny and entertaining movies');

-- Datos para la tabla Film
INSERT INTO Film (filmId, title, description, "YEAR", rental_duration, rating, duration, rental_price) VALUES
(1, 'The Matrix', 'A sci-fi action film', 1999, 2, 'R', 136, 2.99),
(2, 'The Shawshank Redemption', 'A drama film about hope', 1994, 3, 'R', 142, 2.49),
(3, 'Dumb and Dumber', 'A comedy film with slapstick humor', 1994, 2, 'PG-13', 107, 1.99);

-- Datos para la tabla FilmCategory
INSERT INTO FilmCategory (filmCategoryId, filmId, categoryId) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3);


-- Datos para la tabla Store
INSERT INTO Store (storeId, address) VALUES
(1, '123 Main St'),
(2, '456 Elm St');

-- Datos para la tabla Inventory
INSERT INTO Inventory (inventoryId, filmId, storeId, quantity) VALUES
(1, 1, 1, 10),
(2, 2, 2, 15),
(3, 3, 1, 8);
