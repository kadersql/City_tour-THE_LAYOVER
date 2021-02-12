create table daysopen (
daysId serial,
landmarkid int,
monday varchar not null,
tuesday varchar not null,
wednesday varchar not null,
thursday varchar not null,
friday varchar not null,
saturday varchar not null,
sunday varchar not null,
constraint pk_daysid primary key(daysId),
Foreign key (landmarkid) references landmark(id)
);

insert into daysopen (landmarkid
,monday, tuesday, wednesday, thursday, friday,saturday, sunday)
values ((select id from landmark where name='Motown Museum'),'open','open','open','open','open','close','close'); 

insert into daysopen (landmarkid
,monday, tuesday, wednesday, thursday, friday,saturday, sunday)
values ((select id from landmark where name='Detroit Institute of Arts'),'close','close','close','open','open','open','openose'); 

insert into daysopen (landmarkid
,monday, tuesday, wednesday, thursday, friday,saturday, sunday)
values ((select id from landmark where name='Columbus Zoo and Aquarium'),
'open','open','open','open','open','open','open');

insert into daysopen (landmarkid
,monday, tuesday, wednesday, thursday, friday,saturday, sunday)
values ((select id from landmark where name='Franklin Park Conservatory and Botanical Gardens'),
'open','open','open','open','open','open','open'); 

insert into daysopen (landmarkid
,monday, tuesday, wednesday, thursday, friday,saturday, sunday)
values ((select id from landmark where name='Liberty Bell'),
'open','open','open','open','open','open','open'); 

insert into daysopen (landmarkid
,monday, tuesday, wednesday, thursday, friday,saturday, sunday)
values ((select id from landmark where name='The Franklin Institute'),
'close','close','open','open','open','open','open'); 

insert into daysopen (landmarkid
,monday, tuesday, wednesday, thursday, friday,saturday, sunday)
values ((select id from landmark where name='Boston Public Library'),'open','open','open','open','open','open','close'); 


insert into daysopen (landmarkid
,monday, tuesday, wednesday, thursday, friday,saturday, sunday)
values ((select id from landmark where name='USS Constitution'),'close','close','open','open','open','open','open'); 

insert into daysopen (landmarkid
,monday, tuesday, wednesday, thursday, friday,saturday, sunday)
values ((select id from landmark where name='Millennium Park'),'open','open','open','open','open','open','close'); 


insert into daysopen (landmarkid
,monday, tuesday, wednesday, thursday, friday,saturday, sunday)
values ((select id from landmark where name='Maggie Daley Park'),'open','open','open','open','open','open','open'); 


insert into daysopen (landmarkid
,monday, tuesday, wednesday, thursday, friday,saturday, sunday)
values ((select id from landmark where name='Central Park'),'open','open','open','open','open','open','open'); 


insert into daysopen (landmarkid
,monday, tuesday, wednesday, thursday, friday,saturday, sunday)
values ((select id from landmark where name='Empire State Building'),'open','open','open','open','open','open','open'); 




