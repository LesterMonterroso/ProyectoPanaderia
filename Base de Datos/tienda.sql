-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-05-2020 a las 02:43:46
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tienda`
--
CREATE DATABASE IF NOT EXISTS `tienda` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `tienda`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleta`
--

DROP TABLE IF EXISTS `boleta`;
CREATE TABLE `boleta` (
  `num_bol` varchar(8) NOT NULL,
  `cod_cli` varchar(6) NOT NULL,
  `pre_tot` varchar(10) NOT NULL,
  `fecha` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `cod_cli` varchar(6) NOT NULL,
  `nom_cli` varchar(30) NOT NULL,
  `ape_cli` varchar(30) NOT NULL,
  `sexo_cli` varchar(1) NOT NULL,
  `dpi_cli` varchar(13) NOT NULL,
  `tel_cli` varchar(9) NOT NULL,
  `nit_cli` varchar(11) NOT NULL,
  `email_cli` varchar(30) NOT NULL,
  `dir_cli` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cod_cli`, `nom_cli`, `ape_cli`, `sexo_cli`, `dpi_cli`, `tel_cli`, `nit_cli`, `email_cli`, `dir_cli`) VALUES
('CC0001', 'Lester Marcelino', 'Monterroso Solares', 'M', '1234578965412', '12345678', '14754785698', 'lesolares12@gmail.com', 'Cuilapa'),
('CC0002', 'Fatima', 'Hernandez', 'F', '4578545222222', '458965862', '56587458965', 'fatima@gmail.com', 'Cuilapa'),
('CC0003', 'Carlos Ivan', 'Olivares Marroquin', 'M', '4445458565212', '475874585', '55522221444', 'Ivan@gmail.com', 'Cuilapa'),
('CC0004', 'Luis Fernando', 'Castellanos Lorenzana', 'M', '5632658789658', '236545555', '55226546548', 'Luis@gmail.com', 'Santa Cruz'),
('CC0005', 'Jhon Franklin', 'Castillo Rodas', 'M', '2455526636544', '225456554', '78568896326', 'mamad@gmail.com', 'Barberena');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleboleta`
--

DROP TABLE IF EXISTS `detalleboleta`;
CREATE TABLE `detalleboleta` (
  `num_bol` varchar(10) NOT NULL,
  `cod_pro` varchar(6) NOT NULL,
  `des_pro` varchar(30) NOT NULL,
  `cant_pro` varchar(3) NOT NULL,
  `pre_unit` varchar(10) NOT NULL,
  `pre_venta` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallefactura`
--

DROP TABLE IF EXISTS `detallefactura`;
CREATE TABLE `detallefactura` (
  `num_fac` varchar(10) NOT NULL,
  `cod_pro` varchar(6) NOT NULL,
  `des_pro` varchar(30) NOT NULL,
  `cant_pro` varchar(3) NOT NULL,
  `pre_unit` varchar(10) NOT NULL,
  `pre_tot` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detallefactura`
--

INSERT INTO `detallefactura` (`num_fac`, `cod_pro`, `des_pro`, `cant_pro`, `pre_unit`, `pre_tot`) VALUES
('00000001', 'CP0002', 'Tira de Pan', '2', '2.00', '4.0'),
('00000001', 'CP0004', 'Panini de Jamon', '5', '3.00', '15.0'),
('00000002', 'CP0002', 'Tira de Pan', '5', '2.00', '10.0'),
('00000002', 'CP0005', 'Pastel de Chocolate', '10', '20', '200.0'),
('00000003', 'CP0007', 'Chocolate Caliente', '5', '10', '50.0'),
('00000003', 'CP0008', 'Trenza de Pan', '7', '5', '35.0'),
('00000003', 'CP0009', 'donas', '3', '5', '15.0'),
('00000004', 'CP0005', 'Pastel de Chocolate', '3', '20', '60.0'),
('00000005', 'CP0007', 'Chocolate Caliente', '10', '10', '100.0'),
('00000005', 'CP0008', 'Trenza de Pan', '7', '5', '35.0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

DROP TABLE IF EXISTS `factura`;
CREATE TABLE `factura` (
  `num_fac` varchar(8) NOT NULL,
  `cod_cli` varchar(6) NOT NULL,
  `Nit_cli` varchar(11) NOT NULL,
  `subtotal` varchar(10) NOT NULL,
  `IVA` varchar(40) NOT NULL,
  `total` varchar(20) NOT NULL,
  `fec_fac` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`num_fac`, `cod_cli`, `Nit_cli`, `subtotal`, `IVA`, `total`, `fec_fac`) VALUES
('00000001', 'CC0002', '56587458965', '19.0', '2.28', '21.28', '25/05/2020'),
('00000002', 'CC0003', '55522221444', '210.0', '25.2', '235.2', '25/05/2020'),
('00000003', 'CC0004', '55226546548', '100.0', '12.0', '112.0', '25/05/2020'),
('00000004', 'CC0005', '78568896326', '60.0', '7.2', '67.2', '25/05/2020'),
('00000005', 'CC0003', '55522221444', '135.0', '16.2', '151.2', '25/05/2020');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE `producto` (
  `cod_pro` varchar(6) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `precio` varchar(10) NOT NULL,
  `Stock` varchar(10) NOT NULL,
  `idtip` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`cod_pro`, `descripcion`, `precio`, `Stock`, `idtip`) VALUES
('CP0001', 'Pastel 3 leches', '25.00', '8', 1),
('CP0002', 'Tira de Pan', '2.00', '5', 3),
('CP0003', 'Bollo', '1.00', '5', 3),
('CP0004', 'Panini de Jamon', '3.00', '9', 5),
('CP0005', 'Pastel de Chocolate', '20', '34', 1),
('CP0006', 'Pastel de Limon', '25', '27', 1),
('CP0007', 'Chocolate Caliente', '10', '35', 4),
('CP0008', 'Trenza de Pan', '5', '11', 2),
('CP0009', 'donas', '5', '7', 5),
('CP0010', 'Pastel de Fresa', '30', '25', 1),
('CP0011', 'Pie de elote', '25', '10', 1),
('CP0012', 'Pastel de Queso', '20', '15', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prueba2`
--

DROP TABLE IF EXISTS `prueba2`;
CREATE TABLE `prueba2` (
  `as` int(11) NOT NULL,
  `ass` int(11) NOT NULL,
  `sa` int(11) NOT NULL,
  `asss` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoproducto`
--

DROP TABLE IF EXISTS `tipoproducto`;
CREATE TABLE `tipoproducto` (
  `idtip` int(11) NOT NULL,
  `descrip` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipoproducto`
--

INSERT INTO `tipoproducto` (`idtip`, `descrip`) VALUES
(1, 'Pasteles'),
(2, 'Pan Dulce'),
(3, 'Frances'),
(4, 'Bebida'),
(5, 'Panes Preparados');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `nick` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `tipousuario` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `nick`, `password`, `tipousuario`) VALUES
(1, 'Lester', 'Lester21', 'Administrador'),
(3, 'Luis', 'Luis12', 'Administrador'),
(4, 'Ivan', 'Ivan12', 'Administrador'),
(5, 'Gener', 'gener12', 'Administrador'),
(6, 'Jona', 'Jona12', 'Administrador'),
(7, 'Jhon', 'Jhon12', 'Administrador'),
(8, 'Admin', 'Admin', 'Administrador'),
(9, 'administrador', 'root', 'Administrador'),
(10, 'Gener', '1234', 'Administrador'),
(11, 'Juan', 'Juan123', 'Administrador'),
(12, 'Fatima', 'Fatima/21', 'Administrador');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD PRIMARY KEY (`num_bol`),
  ADD KEY `cod_cli` (`cod_cli`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cod_cli`);

--
-- Indices de la tabla `detalleboleta`
--
ALTER TABLE `detalleboleta`
  ADD KEY `num_bol` (`num_bol`),
  ADD KEY `cod_pro` (`cod_pro`);

--
-- Indices de la tabla `detallefactura`
--
ALTER TABLE `detallefactura`
  ADD KEY `num_fac` (`num_fac`),
  ADD KEY `cod_pro` (`cod_pro`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`num_fac`),
  ADD KEY `cod_cli` (`cod_cli`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`cod_pro`,`descripcion`),
  ADD KEY `idtip` (`idtip`);

--
-- Indices de la tabla `tipoproducto`
--
ALTER TABLE `tipoproducto`
  ADD PRIMARY KEY (`idtip`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tipoproducto`
--
ALTER TABLE `tipoproducto`
  MODIFY `idtip` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalleboleta`
--
ALTER TABLE `detalleboleta`
  ADD CONSTRAINT `detalleboleta_ibfk_1` FOREIGN KEY (`num_bol`) REFERENCES `boleta` (`num_bol`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detalleboleta_ibfk_2` FOREIGN KEY (`cod_pro`) REFERENCES `producto` (`cod_pro`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detallefactura`
--
ALTER TABLE `detallefactura`
  ADD CONSTRAINT `detallefactura_ibfk_1` FOREIGN KEY (`num_fac`) REFERENCES `factura` (`num_fac`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detallefactura_ibfk_2` FOREIGN KEY (`cod_pro`) REFERENCES `producto` (`cod_pro`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`cod_cli`) REFERENCES `cliente` (`cod_cli`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`idtip`) REFERENCES `tipoproducto` (`idtip`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
