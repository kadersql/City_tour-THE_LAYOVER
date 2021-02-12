CREATE TABLE landMark (
id serial,
name varchar(50) NOT NULL,
description varchar NOT NULL,
img varchar,
operatingDays varchar NOT NULL, 
openingTime time NULL, 
closingTime time NULL,
venueType varchar,
location varchar NOT NULL,
address varchar,
latitude decimal,
longitude decimal,
thumbsup int,
thumbsdown int,
constraint pk_id primary key (id)
);



insert into landmark (name, description, img, operatingdays, openingtime, closingtime, 
venuetype, location, address, latitude, longitude, thumbsup, thumbsdown )
values ('Motown Museum', 
'the nickname given to Motowns first headquarters. 
A former photographers studio located at 2648 West Grand Boulevard in Detroit', 
'https://img.particlenews.com/img/id/3eK4uc_0PT1sRm600?type=thumbnail_512x288', 
'Monday-Friday', 
'10:00 am', 
'6:00 pm',
'Museum', 
'Detroit',  
'2648 W Grand Blvd, Detroit, MI 48208',
'42.364141', '-83.088346', 12, 5);

insert into landmark (name, description, img, operatingdays, openingtime, closingtime, 
venuetype, location, address, latitude, longitude, thumbsup, thumbsdown )
values 
('Detroit Institute of Arts', 
'The Detroit Institute of Arts, located in Midtown Detroit, Michigan, 
has one of the largest and most significant art collections in the United States.', 
'https://www.dia.org/sites/default/files/styles/featured_image/public/Museum-General-2.jpg?itok=_OnqeYvR', 
'Wednesday-Sunday', 
'9:00 am', 
'6:00 pm',
'Museum', 
'Detroit',
'5200 Woodward Ave, Detroit, MI 48202',
'42.3594', 
'-83.0645', 10, 3);     

insert into landmark (name, description, img, operatingdays, openingtime, closingtime, 
venuetype, location, address, latitude, longitude, thumbsup, thumbsdown )
values 
('Columbus Zoo and Aquarium', 
'Columbus Zoo and Aquarium is home to animals representing various species from around the globe. 
It is a recreational and education destination that includes Zoombezi Bay water 
park and a 18-hole safari golf club.', 
'http://awesomeocean.com/wp-content/uploads/2016/11/Manatees-8754-Grahm-S.-Jones-Columbus-Zoo-and-Aquarium.jpg', 
'Monday-Sunday', 
'10:00 am', 
'4:00 pm',
'Zoo', 
'Columbus',
'4850 W Powell Rd, Powell, OH 43065',
'40.1538', 
'-83.1177', 49, 2);  


insert into landmark (name, description, img, operatingdays, openingtime, closingtime, 
venuetype, location, address, latitude, longitude, thumbsup, thumbsdown )
values 
('Franklin Park Conservatory and Botanical Gardens', 
'Franklin Park Conservatory and Botanical Gardens is a 
botanical garden and conservatory located in Columbus, Ohio. 
It is open daily and an admission fee is charged. Today, it is a
 horticultural and educational institution showcasing exotic plant 
collections, special exhibitions, and Dale Chihuly artworks. 
The conservatory contains more than 400 plant species.', 
'https://media-cdn.tripadvisor.com/media/photo-s/15/a0/61/58/franklin-park-conservatory.jpg', 
'Monday-Sunday', 
'10:00 am', 
'7:00 pm',
'Park', 
'Columbus',
'1777 E Broad St, Columbus, OH 43203',
'39.965869', 
'-82.952827', 44, 5);  

insert into landmark (name, description, img, operatingdays, openingtime, closingtime, 
venuetype, location, address, latitude, longitude, thumbsup, thumbsdown )
values 
('Liberty Bell', 
'The Liberty Bell, previously called the State House 
Bell or Old State House Bell, is an iconic symbol of American independence, 
located in Philadelphia, Pennsylvania. Once placed in the steeple of the 
Pennsylvania State House, the bell today is located across the street in 
the Liberty Bell Center in Independence National Historical Park. ', 
'https://media-cdn.tripadvisor.com/media/photo-m/1280/17/7b/c2/7d/photo0jpg.jpg', 
'Monday-Sunday', 
'9:00 am', 
'7:00 pm',
'Park', 
'Philadelphia',
'526 Market St, Philadelphia, PA 19106',
'39.94961', 
'-75.150282', 231, 3);  


insert into landmark (name, description, img, operatingdays, openingtime, closingtime, 
venuetype, location, address, latitude, longitude, thumbsup, thumbsdown )
values 
('The Franklin Institute', 
'The Franklin Institute is a science and technology center 
that primarily focuses on promoting public understanding of science. 
The institute operates a science museum, which displays exhibits on 
subjects such as science and industry, physics, astronomy, and 
history and The Tuttleman IMAX Theater.', 
'https://phillyfunguide.com/uploads/files/397948433257397375-the-franklin-institute-brain-cropped.0.91.665.509.full.jpg', 
'Monday-Sunday', 
'10:00 am', 
'7:00 pm',
'Museum', 
'Philadelphia',
'222 N 20th St, Philadelphia, PA 19103',
'39.9580', 
'-75.1724', 144, 2);  


insert into landmark (name, description, img, operatingdays, openingtime, closingtime, 
venuetype, location, address, latitude, longitude, thumbsup, thumbsdown )
values ('Boston Public Library', 
'On the National Register of Historic Places, the library 
opened in 1852 as the first free, publicly-supported municipal library in America.', 
'https://www.exhalelifestyle.com/wp-content/uploads/2018/08/Boston-Public-Library-Reading-Room-960x600.jpg', 
'Monday-Saturday', 
'9:00 am', 
'9:00 pm',
'Library', 
'Boston',  
'700 Boylston St At Copley Sq., Boston, MA 02116-2813',
'42.349396', '-71.078369', 122, 2);



insert into landmark (name, description, img, operatingdays, openingtime, closingtime, 
venuetype, location, address, latitude, longitude, thumbsup, thumbsdown )
values ('USS Constitution', 
'USS Constitution, also known as Old Ironsides, is a wooden-hulled,
 three-masted heavy frigate of the United States Navy. She is 
 the worlds oldest commissioned naval vessel still afloat.', 
'https://upload.wikimedia.org/wikipedia/commons/e/ed/USS_Constitution_fires_a_17-gun_salute.jpg', 
'Wednesday-Sunday', 
'10:00 am', 
'4:00 pm',
'Museum ', 
'Boston',  
'Building 22, Charlestown Navy Yard, Charlestown, MA 02129',
'42.221169', '-71.031205', 500, 7);



insert into landmark (name, description, img, operatingdays, openingtime, closingtime, 
venuetype, location, address, latitude, longitude, thumbsup, thumbsdown )
values ('Millennium Park', 
'Millennium Park is a public park located in the Loop community area of Chicago in 
Illinois operated by the Chicago Department of Cultural Affairs and managed by MB 
Real Estate. The park was intended to celebrate the third millennium and is a 
prominent civic center near the citys Lake Michigan shoreline that covers a 24.5-acre 
section of northwestern Grant Park.', 
'https://d21xlh2maitm24.cloudfront.net/wdc/millenium-park.png?mtime=20170131102110', 
'Monday-Sunday', 
'8:00 am', 
'9:00 pm',
'Park', 
'Chicago',  
'201 E Randolph St, Chicago, IL 60602',
'41.882702', '-87.619392', 522, 2);


insert into landmark (name, description, img, operatingdays, openingtime, closingtime, 
venuetype, location, address, latitude, longitude, thumbsup, thumbsdown )
values ('Maggie Daley Park', 
'Maggie Daley Park is a 20-acre public park in the Loop community area of Chicago operated
 by the Chicago Park District and managed by MB Real Estate. It is near the 
 Lake Michigan shoreline in northeastern Grant Park where Daley Bicentennial 
 Plaza previously stood.', 
'https://urbanmatter.com/chicago/wp-content/uploads/2015/06/Maggie-Daley-Park.jpg', 
'Monday-Sunday', 
'6:00 pm', 
'9:00 pm',
'Park', 
'Chicago',  
'337 E Randolph St, Chicago, IL 60601',
'41.525741', '-87.370832', 211, 9);


insert into landmark (name, description, img, operatingdays, openingtime, closingtime, 
venuetype, location, address, latitude, longitude, thumbsup, thumbsdown )
values ('Central Park',
'Central Park is an urban park in New York City located between the 
Upper West and Upper East Sides of Manhattan. It is the fifth-largest park in the city by area, 
covering 843 acres. It is the most visited urban park in the United States with an estimated 38 
million visitors annually, and is the most filmed location in the world.', 
'https://images.adsttc.com/media/images/5bc8/ad3b/f197/cc6b/2200/03c9/newsletter/06_Alternative-Central-Park-6.jpg?1539878195', 
'Monday-Sunday', 
'06:00 am', 
'01:00 am',
'Park', 
'New York',  
'110th Street to Central Park South (59th Street)',
'40.785091', '-73.968285', 322, 43);



insert into landmark (name, description, img, operatingdays, openingtime, closingtime, 
venuetype, location, address, latitude, longitude, thumbsup, thumbsdown )
values ('Empire State Building',
'The Empire State Building is a 102-story Art Deco skyscraper in Midtown Manhattan in New York 
City, United States. It was designed by Shreve, Lamb & Harmon and built from 1930 to 1931. 
Its name is derived from "Empire State", the nickname of the state of New York. 
The building has a roof height of 1,250 feet and stands a total of 1,454 feet tall, 
including its antenna. ', 
'https://90northgroup.com/wp-content/uploads/2016/09/shutterstock_129799142.jpg', 
'Monday-Sunday', 
'12:00 pm', 
'9:00 pm',
'Park', 
'New York',  
'20 W 34th St, New York, NY 10001',
'40.748817', '-73.985428', 221, 21);



