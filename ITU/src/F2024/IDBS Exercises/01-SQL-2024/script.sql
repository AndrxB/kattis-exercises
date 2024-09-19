DROP TABLE IF EXISTS Sells;
DROP TABLE IF EXISTS Coffeehouses;
DROP TABLE IF EXISTS Coffees;

CREATE TABLE Coffees (
	name VARCHAR(20) PRIMARY KEY,
	manufactorer VARCHAR(20)
);

CREATE TABLE Coffeehouses (
	name VARCHAR(20) PRIMARY KEY,
	address VARCHAR(250),
	license INT
);

CREATE TABLE Sells (
	coffeehouse VARCHAR(20) REFERENCES Coffeehouses(name), 
	coffee VARCHAR(20) REFERENCES Coffees(name), 
	price INT
);
