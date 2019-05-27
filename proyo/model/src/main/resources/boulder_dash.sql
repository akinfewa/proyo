-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 27 mai 2019 à 11:59
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `boulder_dash`
--
CREATE DATABASE IF NOT EXISTS `boulder_dash` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `boulder_dash`;

DELIMITER $$
--
-- Procédures
--
DROP PROCEDURE IF EXISTS `getLevel`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `getLevel` (IN `p_id` INT(10))  READS SQL DATA
    SQL SECURITY INVOKER
SELECT * FROM maps WHERE maps.ID = p_id$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `maps`
--

DROP TABLE IF EXISTS `maps`;
CREATE TABLE `maps` (
  `ID` int(11) NOT NULL,
  `diamond_needed` int(11) NOT NULL,
  `time` int(11) NOT NULL,
  `map` varchar(1000) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `maps`
--

INSERT INTO `maps` (`ID`, `diamond_needed`, `time`, `map`) VALUES
(1, 9, 90, '11111111111111111111111111111111\r\n12222242224222421222242224222421\r\n12322243244423221242234223222221\r\n12222222224222221222222422422421\r\n12222432222224221242224222422421\r\n12222222244222421222224223422221\r\n12224222222224231222422222242221\r\n12222243224222220222222222222221\r\n11111111111110005000111111111111\r\n12222232222324420222222222222221\r\n12222442244224421222224224422241\r\n12222222224222321242232443222221\r\n12222442422222221222222223422221\r\n12422222222222221224224424440001\r\n12222422224424421222244222420001\r\n12222222233222221222222222220061\r\n11111111111111111111111111111111\r\n'),
(2, 12, 120, '11111111111111111111111111111111\n12322120042420223442002222102221\n10242122002242262222222240142221\n13222122422242222223222222122201\n12020122022111111111202422142021\n14222122222222212222032224102221\n13222102222032213222222202220231\n10222022223242210022202202022231\n12042442020220212222242242202221\n12222122222222012022240422222221\n12223122224422212022222242120201\n12202123222111111111220222120221\n13222142242202022242222223100201\n12002120000022250220022422102321\n10230122220402202200222222104201\n11111111111111111111111111111111\n'),
(3, 5, 60, '11111111111111111111111111111111\n12222220202222022002222222222221\n12022200222422220422222002222201\n12022202222212422122220200002371\n12244222422212202120302202024221\n10222222220212020122200402222221\n12232222411112422111120222222021\n14220242422224052222222222722021\n12220220223222000222422240022221\n12222242011112272111122223202201\n12202042202212222122422224022321\n12724222222213020124420222222221\n12242022222212224100224022220421\n12002202022440222322204202222021\n12302240422007222400422220203061\n11111111111111111111111111111111\n'),
(4, 12, 120, '11111111111111111111111111111111\n12234222222222222222244222402201\n12222222240242242220202200232021\n14220227222222202402042272022201\n10322111111111111111111111122221\n12222222342422221322222220202221\n12022202204422221222223242200021\n12222402203222225222232222000021\n10222422222422226020022022232421\n12002222222272321222224022424221\n13222204224420221222222022220201\n12042111111111111111111111122201\n12022222020222202422202232402421\n14422220240442227222222224022221\n13222422244222442234222222222241\n11111111111111111111111111111111\n'),
(5, 15, 180, '11111111111111111111111111111111\n14322222022224203224222022222241\n12040424224242000222224342422221\n12222111111111111111111111122221\n12223222224224422222220242222221\n10202822202222423024222022422221\n10202200222222022222422022322221\n12220111111111111111111111124221\n10220202222222222222422422424021\n10222202222222222222224002222221\n12232022222222322222202222220221\n13222111111111111111111111104021\n14420224220222022222200320220221\n12242222022208242222220402222221\n12002222022224422222222022002021\n11111111111111111111111111111111\n');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `maps`
--
ALTER TABLE `maps`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `maps`
--
ALTER TABLE `maps`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
