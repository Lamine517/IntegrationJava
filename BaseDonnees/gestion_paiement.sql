-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : sam. 31 juil. 2021 à 23:23
-- Version du serveur :  8.0.21
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestion_paiement`
--

-- --------------------------------------------------------

--
-- Structure de la table `employe`
--

DROP TABLE IF EXISTS `employe`;
CREATE TABLE IF NOT EXISTS `employe` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `prenom` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `nom` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `salaire` float NOT NULL,
  `taux_horaire` float NOT NULL,
  `nbr_heures_travail` int NOT NULL,
  `type` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `type` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `employe`
--

INSERT INTO `employe` (`ID`, `prenom`, `nom`, `salaire`, `taux_horaire`, `nbr_heures_travail`, `type`) VALUES
(22, 'Lamine', 'DIOP', 40, 100, 45, 'Ingenieur'),
(23, 'Moussa', 'DIOP', 48, 120, 9, 'Ingenieur'),
(24, 'Adama', 'NDIAYE', 48, 120, 52, 'Ingenieur'),
(25, 'Mame', 'NDIAYE', 80, 200, 56, 'Ingenieur'),
(26, 'Mamadou', 'NDIAYE', 92, 230, 14, 'Manager'),
(27, 'Fatou', 'SALL', 80, 209, 12, 'Manager'),
(37, 'Laye', 'GUEYE', 8, 200, 46, 'Manager'),
(45, 'Adama', 'NDIAYE', 19, 120, 89, 'Ingenieur'),
(46, 'Mame', 'NDIAYE', 80, 200, 13, 'Ingenieur'),
(51, 'Mamour', 'Sarr', 67, 6, 100, 'Manager');

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `prenom` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `nom` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `mpd` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `type` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`id`, `prenom`, `nom`, `email`, `mpd`, `type`) VALUES
(44, 'lamine', 'dieme', 'dd@gmail.com', 'dieme', 'user'),
(45, 'abdou', 'tine', 'tine@gmail.com', 'tine', 'admin'),
(46, 'lamzo', 'zo', 'zo@gmail.com', 'zozo', 'user'),
(48, 'lami', 'dieme', 'dieme@gmail.com', 'dieme12', 'user'),
(49, 'lami', 'dieme', 'dieme@gmail.com', 'dieme12', 'user');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
