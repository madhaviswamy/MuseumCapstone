insert into Museum (id, curator, location, name ) values(100, 'Pete', 'London', 'British Museum');
insert into Museum (id, curator, location, name ) values(200, 'Hank', 'Paris', 'Louvre');


insert into Artist (id, museum_id, year_born, year_down, name ) values(150, 100, 2001, 2023, 'Vincent Van Gogh');
insert into Artist (id, museum_id, year_born, year_down, name ) values(250, 200, 1988, 2009, 'Leonardo-Da-Vinci');
insert into Artist (id, museum_id, year_born, year_down, name ) values(350, 100, 2008, 2012, 'Picasso');

insert into Painting (artist_id, id, year_completed, backstory, medium, name, style) values(150, 100, 2011, 'was a talented man', 'oil', 'Starry Nights', 'freestyle');
insert into Painting (artist_id, id, year_completed, backstory, medium, name, style) values(250, 200, 1990, 'Mysterious girl', 'acrylic', 'Monalisa', 'freestyle');
insert into Painting (artist_id, id, year_completed, backstory, medium, name, style) values(350, 300, 1900, 'Painting of a Family', 'acrylic', 'La Vie', 'freestyle');





