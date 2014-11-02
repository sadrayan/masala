CREATE TABLE `customer` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL DEFAULT '',
  `last_name` varchar(255) NOT NULL DEFAULT '',
  `address` varchar(255) DEFAULT NULL,
  'telephone' varchar (255) DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `meal`;
CREATE TABLE IF NOT EXISTS `meal` (
  `id` int (11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `rating` int(11) DEFAULT NULL,
  `ordered_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `meal`
--

INSERT INTO `meal` (`customer_id`, `date`, `quantity`, `rating`, `ordered_at`) VALUES
  (1, 5, '2014-11-05', 1, NULL, '2014-11-01 22:27:42'),
  (2, 6, '2014-11-06', 1, NULL, '2014-11-01 22:28:02');
commit;