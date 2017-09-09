/*Select countries where a total number of inhabitants (population) in all cities is greater
than 400.*/
select name from countries where 400 < all (select cities.population from cities where countries.countryID = cities.countryID);

/* Select names of the countries that have no buildings at all.*/
select name from countries where not exists (select * from cities join buildings on buildings.cityID = cities.cityID where cities.countryID = countries.countryID);