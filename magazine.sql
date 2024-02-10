-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 09, 2024 at 09:26 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `magazine`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `ID` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`ID`, `Name`, `Password`) VALUES
(1, 'Anas.rehman', 'anas anas'),
(2, 'laiba.afzal', 'laiba 123');

-- --------------------------------------------------------

--
-- Table structure for table `posts`
--

CREATE TABLE `posts` (
  `Post_Id` int(11) NOT NULL,
  `title` varchar(45) NOT NULL,
  `image_Url` varchar(255) NOT NULL,
  `description` varchar(2000) NOT NULL,
  `date` date NOT NULL,
  `likes` int(11) NOT NULL,
  `category` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `posts`
--

INSERT INTO `posts` (`Post_Id`, `title`, `image_Url`, `description`, `date`, `likes`, `category`) VALUES
(2, 'hadith', 'C:\\Users\\TechDotPK\\Desktop\\online-magazine\\src\\components\\images\\backimage.jpeg ', 'huzoor S.A.W ne farmaya: jis ne bhi dhoka dia wo ham mn se nahi hai.', '2024-01-07', 0, 'hadith'),
(3, 'ayat', 'C:\\Users\\TechDotPK\\Desktop\\online-magazine\\src\\components\\images\\backimage.jpeg', 'beshak har mushkil k baad asaani hai ', '2024-01-07', 0, 'ayat'),
(4, 'sher', 'C:UsersTechDotPKDesktoponline-magazinesrccomponentsimagesackimage.jpeg ', 'ye ishq nahi asaan bs itna smjh lijie. ik aag ka darya hai aur doob k jana hai ', '2024-01-24', 0, 'sher'),
(5, 'hadith', 'C:UsersTechDotPKDesktoponline-magazinesrccomponent...', 'tum main se behtreen shaks wo hai jo quran seekhe aur doosroon ko sikhae ', '2024-01-01', 0, 'hadith'),
(6, 'ayat', 'C:UsersTechDotPKOneDriveDesktoponline-magazinesrccomponentsimagesackimage.jpeg', 'aur tumhara rab na tumhe bhoola hai aur na tumse naraz hua hai ', '2024-02-05', 0, 'ayat'),
(7, 'null', '', 'null', '0000-00-00', 0, 'null'),
(8, 'sher', '', 'dil e nadaan tujhe hua kia hai akhir is dard ki dawakia hai ', '0000-00-00', 0, 'sher'),
(10, 'sher', '', 'ooo main to lut gayaaaa. lut phut gaya', '0000-00-00', 0, 'sher'),
(11, 'sher', '', 'wow ye to chal gaya', '0000-00-00', 0, 'sher');

-- --------------------------------------------------------

--
-- Table structure for table `reviews`
--

CREATE TABLE `reviews` (
  `Post_Id` int(11) NOT NULL,
  `Comments` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reviews`
--

INSERT INTO `reviews` (`Post_Id`, `Comments`) VALUES
(1, 'bhai yahan to kuch smjh he ni araha '),
(0, 'oee hoeee'),
(0, 'maza agaya'),
(0, 'ab chal ja ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Name` (`Name`);

--
-- Indexes for table `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`Post_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `posts`
--
ALTER TABLE `posts`
  MODIFY `Post_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
