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
  `report_id` INT NOT NULL,
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

-- Insert a row into 'report' table
INSERT INTO `report` (`status`, `assignee`, `start_date`, `end_date`)
VALUES ('created', 'John Doe', '2023-08-01', '2023-08-31');

-- Insert a row into 'ticket' table linked to the inserted report
INSERT INTO `ticket` (`report_id`, `content`, `status`, `technical_feedback`, `updated_by`, `updated_date`)
VALUES (1, 'Ticket content', 'created', 'No feedback yet', 'Jane Smith', '2023-08-15');

-- Insert a row into 'ticket_audit' table linked to the inserted ticket
INSERT INTO `ticket_audit` (`ticket_id`, `content`, `status`, `updated_by`, `updated_date`)
VALUES (1, 'Ticket content', 'created', 'Jane Smith', '2023-08-15');