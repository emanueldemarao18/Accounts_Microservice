CREATE TABLE IF NOT EXISTS `customer` (
`customer_id` int AUTO_INCREMENT PRIMARY KEY,
`name` varchar(100) NOT NULL,
`email` varchar(100) NOT NULL,
`mobile_number` varchar(200) NOT NULL,
`created_at` date NOT NULL,
`updated_at` date DEFAULT NULL,
`updated_by`varchar DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `accounts` (
`customer_id` int NOT NULL,
`account_number` INT AUTO_INCREMENT PRIMARY KEY,
`account_type` varchar(100) NOT NULL,
`branch_address` varchar(200) NOT NULL,
`created_at` date NOT NULL,
`updated_at` date DEFAULT NULL,
`updated_by`varchar DEFAULT NULL
);