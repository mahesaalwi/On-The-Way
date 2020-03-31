-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Mar 2019 pada 05.44
-- Versi server: 10.1.35-MariaDB
-- Versi PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `otw`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `angkot`
--

CREATE TABLE `angkot` (
  `nama` varchar(25) DEFAULT NULL,
  `Jk` varchar(10) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `rute` varchar(25) DEFAULT NULL,
  `harga` varchar(30) DEFAULT NULL,
  `jenis` varchar(10) DEFAULT NULL,
  `tujuan` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `angkot`
--

INSERT INTO `angkot` (`nama`, `Jk`, `Status`, `rute`, `harga`, `jenis`, `tujuan`) VALUES
('Danny', 'Laki-laki', 'Pekerja', 'PS.MINGGU', ' RP.20.000,00', 'Angkot', 'Kali Bata'),
('Mahesa', 'Laki-laki', 'Mahasiswa', 'CITAYAM', 'RP.10.000,00', 'Angkot', 'Kampus Unindra '),
('Andika Dian', 'Laki-laki', 'Mahasiswa', 'JL.RAYA BOGOR', 'RP.10.000,00', 'Angkot', 'Gandaria City'),
('danny', 'Laki-laki', 'Pekerja', 'PS.MINGGU', 'RP.10.000,00', 'Angkot', 'Kali Bata'),
('rani', 'Perempuan', 'Mahasiswa', 'PS.MINGGU', 'RP.10.000,00', 'Angkot', 'Kampus Unindra '),
('danu', 'Laki-laki', 'Mahasiswa', 'PS.MINGGU', ' RP.20.000,00', 'Angkot', 'Kali Bata');

-- --------------------------------------------------------

--
-- Struktur dari tabel `bajaj`
--

CREATE TABLE `bajaj` (
  `nama` varchar(30) DEFAULT NULL,
  `jk` varchar(10) DEFAULT NULL,
  `rute_awal` varchar(35) DEFAULT NULL,
  `rute_akhir` varchar(35) DEFAULT NULL,
  `harga` varchar(25) DEFAULT NULL,
  `jenis` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `bus`
--

CREATE TABLE `bus` (
  `nama` varchar(25) DEFAULT NULL,
  `jk` varchar(15) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `rute_awal` varchar(35) DEFAULT NULL,
  `rute_akhir` varchar(35) DEFAULT NULL,
  `harga` varchar(25) DEFAULT NULL,
  `jenis` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `bus`
--

INSERT INTO `bus` (`nama`, `jk`, `status`, `rute_awal`, `rute_akhir`, `harga`, `jenis`) VALUES
('Dita Rizky', 'Perempuan', 'Mahasiswa', 'SENEN', 'Tanah Abang', 'BUS', 'RP.12.000,00'),
('Doni Isfandy', 'Laki-laki', 'Pekerja', 'KAMPUNG MELAYU', 'Sudirman', 'BUS', 'RP.25.000,00'),
('Milea', 'Perempuan', 'Pelajar', 'KAMPUNG MELAYU', 'Sudirman', 'BUS', 'RP.12.000,00'),
('Danang Suherman', 'Laki-laki', 'Pekerja', 'KAMPUNG MELAYU', 'Sudirman', 'BUS', 'RP.12.000,00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(23) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('hesa', 'hesa123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `lrt`
--

CREATE TABLE `lrt` (
  `nama` varchar(25) DEFAULT NULL,
  `gender` varchar(25) DEFAULT NULL,
  `status` varchar(26) DEFAULT NULL,
  `rute_awal` varchar(35) DEFAULT NULL,
  `rute_akhir` varchar(35) DEFAULT NULL,
  `jenis` varchar(10) DEFAULT NULL,
  `harga` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `lrt`
--

INSERT INTO `lrt` (`nama`, `gender`, `status`, `rute_awal`, `rute_akhir`, `jenis`, `harga`) VALUES
('nana', 'Perempuan', 'Mahasiswa', 'KebayoranLama', 'KEBAYORAN LAMA ', 'LRT', 'RP.50.000,00'),
('Dilan', 'Laki-laki', 'Pelajar', 'KebayoranLama', 'KEBAYORAN LAMA ', 'LRT', 'RP.50.000,00'),
('Mahesa', 'Laki-laki', 'Mahasiswa', 'KebayoranLama', 'KEBAYORAN LAMA ', 'LRT', 'RP.50.000,00'),
('hesa', 'Laki-laki', 'Mahasiswa', 'KebayoranLama', 'KEBAYORAN LAMA ', 'LRT', 'RP.50.000,00'),
('dana', 'Laki-laki', 'Pekerja', 'KebayoranLama', 'KEBAYORAN LAMA ', 'LRT', 'RP.50.000,00'),
('yoga', 'Laki-laki', 'Pekerja', 'KebayoranLama', 'KEBAYORAN LAMA ', 'LRT', 'RP.50.000,00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `m20`
--

CREATE TABLE `m20` (
  `harga` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `m20`
--

INSERT INTO `m20` (`harga`) VALUES
('RP.10.000,00'),
('RP.10.000,00'),
('RP.10.000,00'),
('RP.10.000,00'),
('RP.10.000,00'),
('RP.10.000,00'),
('RP.10.000,00');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
