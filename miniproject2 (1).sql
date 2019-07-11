-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 11, 2019 at 01:26 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `miniproject2`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `sl_no` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`sl_no`, `name`, `password`) VALUES
(1, 'karthik', '123'),
(2, 'ankitha', '123456'),
(3, 'admin', 'admin'),
(4, 'admin2', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `cardetail`
--

CREATE TABLE `cardetail` (
  `dname` varchar(28) NOT NULL,
  `car` varchar(30) NOT NULL,
  `carno` varchar(30) NOT NULL,
  `ac` varchar(30) NOT NULL,
  `seats` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cardetail`
--

INSERT INTO `cardetail` (`dname`, `car`, `carno`, `ac`, `seats`) VALUES
('KARTHIK K', 'maruthi suzuki', 'KA 17 EA 973', 'AC', '22'),
('Sanjay', 'Innova', 'KA17BE4352', 'non ac', '6');

-- --------------------------------------------------------

--
-- Table structure for table `ddetails`
--

CREATE TABLE `ddetails` (
  `DId` int(11) NOT NULL,
  `Dname` varchar(30) NOT NULL,
  `age` date NOT NULL,
  `email` varchar(25) NOT NULL,
  `ph` varchar(99) NOT NULL,
  `home` text NOT NULL,
  `experiance` int(4) NOT NULL,
  `Dpassword` varchar(20) NOT NULL,
  `type` varchar(25) NOT NULL DEFAULT 'DRIVER',
  `IsBlocked` varchar(6) NOT NULL DEFAULT 'no',
  `adharno` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ddetails`
--

INSERT INTO `ddetails` (`DId`, `Dname`, `age`, `email`, `ph`, `home`, `experiance`, `Dpassword`, `type`, `IsBlocked`, `adharno`) VALUES
(47, 'KARTHIK K', '1998-04-05', 'karthik4gmit@gmail.com', '9241246132', '#2294 1st main saraswathi badavane', 25, '22', 'DRIVER', 'no', '123456789'),
(41, 'Sanjay', '1992-06-12', 'sanjay123@gmail.com', '9876543276', '#4802,6th cross,SS Layout,Davangere', 12, '1010', 'DRIVER', 'no', '343456879929');

--
-- Triggers `ddetails`
--
DELIMITER $$
CREATE TRIGGER `InsertExp 5 and 40` AFTER INSERT ON `ddetails` FOR EACH ROW BEGIN 
IF 5>new.experiance OR 40<new.experiance THEN
DELETE FROM ddetails WHERE experiance=new.experiance;
END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `dlogin`
--

CREATE TABLE `dlogin` (
  `dname` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dlogin`
--

INSERT INTO `dlogin` (`dname`, `password`) VALUES
('KARTHIK K', '22'),
('Sanjay', '1010');

-- --------------------------------------------------------

--
-- Table structure for table `droute`
--

CREATE TABLE `droute` (
  `dname` varchar(29) NOT NULL,
  `place1` varchar(30) NOT NULL DEFAULT 'nan',
  `place2` varchar(30) NOT NULL DEFAULT 'nan',
  `place3` varchar(30) NOT NULL DEFAULT 'nan',
  `place4` varchar(30) NOT NULL DEFAULT 'nan',
  `place5` varchar(30) NOT NULL DEFAULT 'nan',
  `place6` varchar(30) NOT NULL DEFAULT 'nan',
  `place7` varchar(30) NOT NULL DEFAULT 'nan',
  `place8` varchar(30) NOT NULL DEFAULT 'nan',
  `place9` varchar(30) NOT NULL DEFAULT 'nan',
  `place10` varchar(30) NOT NULL DEFAULT 'nan',
  `present` varchar(29) NOT NULL DEFAULT 'NOT YET STARTED',
  `direction` varchar(20) NOT NULL DEFAULT 'forword'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `droute`
--

INSERT INTO `droute` (`dname`, `place1`, `place2`, `place3`, `place4`, `place5`, `place6`, `place7`, `place8`, `place9`, `place10`, `present`, `direction`) VALUES
('KARTHIK K', 'nan', 'nan', 'nan', 'nan', 'nan', 'nan', 'nan', 'nan', 'nan', 'nan', 'NOT YET STARTED', 'forword'),
('Sanjay', 'Saraswathi bhadavane', 'Daba stop', 'Durgambika School', 'KSS college', 'HKR circle', 'Hadadi road', 'KEB circle', 'Jayadeva circle', 'Old Bus stand', 'Railway station', 'Saraswathi bhadavane', 'forword');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `sl` int(11) NOT NULL,
  `pname` varchar(30) NOT NULL,
  `dname` varchar(30) NOT NULL,
  `type` varchar(30) NOT NULL,
  `feedback` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`sl`, `pname`, `dname`, `type`, `feedback`) VALUES
(6, 'Nandini G J', 'Sanjay', 'positive', 'Driver is good. He left safely.');

-- --------------------------------------------------------

--
-- Table structure for table `pdetails`
--

CREATE TABLE `pdetails` (
  `pname` varchar(25) NOT NULL,
  `age` date NOT NULL,
  `email` varchar(25) NOT NULL,
  `pph` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `type` varchar(25) NOT NULL DEFAULT 'PASSENGER'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pdetails`
--

INSERT INTO `pdetails` (`pname`, `age`, `email`, `pph`, `password`, `type`) VALUES
('karthik', '1998-04-05', 'kkk', '88', '88', 'PASSENGER'),
('Nandini G J', '1998-12-02', 'nandini.gj1998@gmail.com', '9972466750', '1234', 'PASSENGER'),
('Rahul B S', '1997-10-16', 'rahulbs@gmail.com', '9972457640', '9876', 'PASSENGER');

-- --------------------------------------------------------

--
-- Table structure for table `plogin`
--

CREATE TABLE `plogin` (
  `id` int(11) NOT NULL,
  `pname` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `plogin`
--

INSERT INTO `plogin` (`id`, `pname`, `password`) VALUES
(14, 'Nandini G J', '1234'),
(16, 'Rahul B S', '9876'),
(17, 'karthik', '88');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`sl_no`);

--
-- Indexes for table `cardetail`
--
ALTER TABLE `cardetail`
  ADD PRIMARY KEY (`dname`),
  ADD KEY `dname` (`dname`);

--
-- Indexes for table `ddetails`
--
ALTER TABLE `ddetails`
  ADD PRIMARY KEY (`Dname`,`Dpassword`),
  ADD UNIQUE KEY `DId` (`DId`);

--
-- Indexes for table `dlogin`
--
ALTER TABLE `dlogin`
  ADD PRIMARY KEY (`dname`,`password`),
  ADD KEY `dname` (`dname`);

--
-- Indexes for table `droute`
--
ALTER TABLE `droute`
  ADD PRIMARY KEY (`dname`),
  ADD KEY `dname` (`dname`);

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`sl`),
  ADD KEY `pname` (`pname`,`dname`),
  ADD KEY `dname` (`dname`);

--
-- Indexes for table `pdetails`
--
ALTER TABLE `pdetails`
  ADD PRIMARY KEY (`pname`,`password`,`type`);

--
-- Indexes for table `plogin`
--
ALTER TABLE `plogin`
  ADD PRIMARY KEY (`id`,`pname`),
  ADD KEY `pname` (`pname`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `sl_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `ddetails`
--
ALTER TABLE `ddetails`
  MODIFY `DId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `sl` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `plogin`
--
ALTER TABLE `plogin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cardetail`
--
ALTER TABLE `cardetail`
  ADD CONSTRAINT `cardetail_ibfk_1` FOREIGN KEY (`dname`) REFERENCES `ddetails` (`Dname`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `dlogin`
--
ALTER TABLE `dlogin`
  ADD CONSTRAINT `dlogin_ibfk_1` FOREIGN KEY (`dname`) REFERENCES `ddetails` (`Dname`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `droute`
--
ALTER TABLE `droute`
  ADD CONSTRAINT `droute_ibfk_1` FOREIGN KEY (`dname`) REFERENCES `ddetails` (`Dname`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `feedback`
--
ALTER TABLE `feedback`
  ADD CONSTRAINT `feedback_ibfk_1` FOREIGN KEY (`pname`) REFERENCES `pdetails` (`pname`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `feedback_ibfk_2` FOREIGN KEY (`dname`) REFERENCES `ddetails` (`Dname`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `plogin`
--
ALTER TABLE `plogin`
  ADD CONSTRAINT `plogin_ibfk_1` FOREIGN KEY (`pname`) REFERENCES `pdetails` (`pname`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
