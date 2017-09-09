create table countries (
countryID int primary key auto_increment not null,
name varchar (50) not null
);
 
create table cities (
cityID int primary key auto_increment not null,
countryID int not null,
name varchar(50) not null,
population int not null,
foreign key (countryID) references countries (countryID)
);


create table buildings(
buildingID int primary key auto_increment not null,
cityID int not null,
name varchar (50) not null,
floors int not null,
foreign key (cityID) references cities (cityID)
);




