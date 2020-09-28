-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-09-2020 a las 01:27:13
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `contactosdb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contactos`
--

CREATE TABLE `contactos` (
  `IDCONTACTO` int(10) NOT NULL,
  `NOMBRE` varchar(150) NOT NULL,
  `TELEFONO` varchar(12) NOT NULL,
  `CORREO` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `contactos`
--

INSERT INTO `contactos` (`IDCONTACTO`, `NOMBRE`, `TELEFONO`, `CORREO`) VALUES
(1, 'Enrique Sala', '809-238-3924', 'ramon@home.com.do'),
(2, 'Ramon', '809-239-8989', 'ramon@homerun.com.do'),
(3, 'Deyabel Mercedes', '789-236-4578', 'dm@home.com.do'),
(4, 'Miguel', '809-238-4444', 'm@home.com.do'),
(5, 'Abel Mercedes', '849-225-5555', 'am@home.com.do'),
(6, 'Miguel', '809-238-4444', 'm@home.com.do'),
(7, 'Juan', '809-238-4444', 'j@home.com.do'),
(8, 'Juan', '809-238-4444', 'j@home.com.do'),
(9, 'Juan', '809-238-4444', 'j@home.com.do'),
(10, 'Cristobal Miranda', '809-789-1245', 'mj@home.com.do'),
(11, 'Ramon', '789-123-2589', 'R@hotmail.com'),
(12, 'Jose', '879-236-4578', 'j@hotmail.com'),
(13, 'Miguel', '809-235-6987', 'M@hotmail.com'),
(14, 'grabriel', '809-235-9874', 'g@home.com'),
(15, 'Federico', '809-694-5645', '.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `IdEmpleado` int(10) NOT NULL,
  `Nombre` varchar(150) NOT NULL,
  `Apellido` varchar(150) NOT NULL,
  `Salario` decimal(18,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`IdEmpleado`, `Nombre`, `Apellido`, `Salario`) VALUES
(1, 'Deyabel', 'Ramírez', '18000'),
(2, 'Luis', 'Lopez', '18000'),
(3, 'Miguel', 'Méndez', '20000'),
(4, 'José', 'Rodríguez', '25000'),
(5, 'Enrique', 'Sala', '25000'),
(6, 'Enrique', 'Sala', '25000');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contactos`
--
ALTER TABLE `contactos`
  ADD PRIMARY KEY (`IDCONTACTO`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`IdEmpleado`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contactos`
--
ALTER TABLE `contactos`
  MODIFY `IDCONTACTO` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `IdEmpleado` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
