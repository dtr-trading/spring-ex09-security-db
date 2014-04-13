CREATE TABLE `users` (
    `id` int(6) NOT NULL AUTO_INCREMENT,  
    `username` VARCHAR(50) NOT NULL UNIQUE,
    `password` VARCHAR(50) NOT NULL,
    `enabled` BOOLEAN NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8; 

INSERT INTO `users` (`username`, `password`, `enabled`) VALUES
    ('admin', 'password', TRUE),
    ('trader', 'password', TRUE),
    ('user', 'password', TRUE);
