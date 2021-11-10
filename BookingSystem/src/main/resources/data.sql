INSERT INTO authority (id, role)
VALUES
(1, 'ROLE_USER'),
(2, 'ROLE_ADMIN');

INSERT INTO `user`(id, email, navn, passord, brukernavn, authority_id)
VALUES
(1, 'ali@email.com','Ali Farah', 'pass', 'ali', 4),
(2, 'ahmed@email.com','Ahmed Farah', 'pass', 'ahmed', 2),
(3, 'abdillahi@email.com','Abdillahi Farah', 'pass', 'abdillahi', 1),
(4, 'abdirazzaq@email.com','Abdirazzaq Farah', 'pass', 'abdirazzaq', 3),
(5, 'muna@email.com','Muna Qamis', 'pass', 'muna', 3);
(6, 'mohamed@email.com','Mohamed Farah', 'pass', 'mohamed', 3);

insert into booking (id, start_dato, slutt_dato, status, user_id) values (1, '2015-12-03 12:00:00', '2015-12-05 12:00:00', TRUE, 1);
insert into booking (id, start_dato, slutt_date, status, user_id) values (2, '2015-12-04 12:00:00', '2015-12-07 12:00:00', TRUE, 2);
insert into booking (id, start_dato, slutt_dato, status, user_id) values (3, '2015-11-29 14:00:00', '2015-12-02 11:00:00', TRUE, 3);
insert into booking (id, start_dato, slutt_dato, status, user_id) values (4, '2015-11-27 02:16:13', '2015-11-29 05:30:55', false, 4);
insert into booking (id, start_dato, slutt_dato, status, user_id) values (5, '2015-12-05 16:53:12', '2015-12-07 14:04:27', false, 5);
insert into booking (id, start_dato, slutt_dato, status, user_id) values (6, '2015-12-21 15:43:32', '2015-12-23 21:49:40', false, 6);
insert into booking (id, start_dato, slutt_dato, status, user_id) values (7, '2015-11-23 20:22:39', '2014-11-24 16:22:16', true, 7);
