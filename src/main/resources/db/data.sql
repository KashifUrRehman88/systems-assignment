DROP TABLE IF EXISTS report;
DROP TABLE IF EXISTS ticket;
DROP TABLE IF EXISTS ticket_audit;

CREATE TABLE `report` (
  `id` INT AUTO_INCREMENT  PRIMARY KEY,
  `status` VARCHAR(50) NOT NULL,
  `assignee` VARCHAR(100) NOT NULL,
  `start_date` DATE DEFAULT NULL,
  `end_date` DATE DEFAULT NULL,
);

CREATE TABLE `ticket` (
  `id` INT AUTO_INCREMENT  PRIMARY KEY,
  `report_id` INT,
  `content` VARCHAR(250) NOT NULL, <!-- it can be TEXT as well -->
  `status` VARCHAR(50) NOT NULL,
  `technical_feedback` VARCHAR(250) NOT NULL, <!-- it can also be TEXT as well -->
  `updated_by` VARCHAR(100) NOT NULL,
  `updated_date` DATE DEFAULT NULL
   FOREIGN KEY (report_id) REFERENCES report (id)
);

CREATE TABLE `ticket_audit` (
  `id` INT AUTO_INCREMENT  PRIMARY KEY,
  `ticket_id` INT NOT NULL,
  `content` VARCHAR(250) NOT NULL, <!-- it can be TEXT as well -->
  `status` VARCHAR(50) NOT NULL,
  `updated_by` VARCHAR(100) NOT NULL,
  `updated_date` DATE DEFAULT NULL,
  FOREIGN KEY (ticket_id) REFERENCES ticket (id)
);

 INSERT INTO `report` (`id`,`status`,`assignee`,`start_date`,`end_date`)
 VALUES (1, 'created','Kashif', CURDATE(), CURDATE());

INSERT INTO `ticket` (`ticket_id`, `report_id`, `content`, `status`, `technical_feedback`, `updated_by`, `updated_date`)
 VALUES (1, 1, 'Some content for ticket 1', 'Confirmed', 'Technical feed back provided by client', 'User 1' CURDATE());