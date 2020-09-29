package com.conexion;

import java.sql.*;

public class ConexionDB {

	// Datos para realizar la conexión a la base de datos como privados y constante
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String DATABASE = "ContactosDB";
	private final String HOST = "127.0.0.1"; // LOCALHOST = 127.0.0.1
	private final String DB_URL = "jdbc:mysql://" + HOST + "/" + DATABASE;
	private final String USER = "rsala";
	private final String PASS = "rsala1237456";

	private Connection conn;

	// Constructor con la variable conn en NUll
	public ConexionDB() {

		conn = null;

	}

	// Método para realizar la conexión a la base de datos
	public Connection getConexion() {

		try {

			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// System.out.println("La Conexión esta cerrada? " + conn.isClosed());

		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
			System.out.println("Error al Conectar con la Base de Datos!!");
		}

		return conn;

	}

	// Método para cerrar la conexión a la base de datos
	public void cerrarConexion() {

		try {

			conn.close();
			if (conn.isClosed()) {

			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al cerrar la conexión a la Base de Datos!!");

		}

	}

}