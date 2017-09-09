insert into countries (name) values ('Poland');
insert into countries (name) values ('USA');
insert into countries (name) values ('Spain');
insert into countries (name) values ('England');

select * from countries;

insert into cities (countryID, name, population) values (1, 'Krakow', 700);
insert into cities (countryID, name, population) values (1, 'Rzeszow', 300);
insert into cities (countryID, name, population) values (1, 'Warszawa', 1000);
insert into cities (countryID, name, population) values (1, 'Poznan', 450);
insert into cities (countryID, name, population) values (1, 'Gdansk', 300);
insert into cities (countryID, name, population) values (2, 'New York', 2000);
insert into cities (countryID, name, population) values (2, 'Chicago',1500);
insert into cities (countryID, name, population) values (2, 'Washington',4000);
insert into cities (countryID, name, population) values (2, 'Dallas',900);
insert into cities (countryID, name, population) values (2, 'Miami',1500);
insert into cities (countryID, name, population) values (3, 'Madrit',2000);
insert into cities (countryID, name, population) values (3, 'Barcelona',2000);
insert into cities (countryID, name, population) values (3, 'Valencia',900);
insert into cities (countryID, name, population) values (3, 'Seville',400);
insert into cities (countryID, name, population) values (3, 'Malaga',500);
insert into cities (countryID, name, population) values (4, 'London',800);
insert into cities (countryID, name, population) values (4, 'Machester',900);
insert into cities (countryID, name, population) values (4, 'Leeds',450);
insert into cities (countryID, name, population) values (4, 'Liverpool',500);
insert into cities (countryID, name, population) values (4, 'Bristol',350);

select * from cities;

insert into buildings (cityID, name, floors) values (1, 'Wawel', 5);
insert into buildings (cityID, name, floors) values (3, 'PKiN', 42);
insert into buildings (cityID, name, floors) values (5, 'Zuraw', 10);
insert into buildings (cityID, name, floors) values (7, 'Trump', 98);
insert into buildings (cityID, name, floors) values (8, 'White House', 4);
insert into buildings (cityID, name, floors) values (16, 'Big Ben', 96);
insert into buildings (cityID, name, floors) values (19, 'Royal Liver Building', 13);

select * from buildings;

select countries.name, buildings.name from countries, cities join buildings on cities.cityID = buildings.cityID where cities.countryID = countries.countryID;