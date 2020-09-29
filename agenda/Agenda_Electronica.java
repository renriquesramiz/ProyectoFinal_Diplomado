package com.agenda;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.conexion.ConexionDB;

public class Agenda_Electronica extends ConexionDB {

	private PreparedStatement ps;
	private ResultSet rs;
	private final ConexionDB cn;

	private ArrayList<Contactos> contactos;

	public Agenda_Electronica() {

		ps = null;
		rs = null;
		cn = new ConexionDB();
		contactos = new ArrayList<Contactos>();

	}

	public int AgregarContacto(int idcontactos, String nombre, String telefono, String correo) {
		Contactos c = new Contactos(idcontactos, nombre, telefono, correo);

		String sql_insert = "INSERT INTO contactos (IDCONTACTO, NOMBRE, TELEFONO, CORREO) values ('" + c.getIdContacto()
				+ "','" + c.getNombre() +"','" + c.getTelefono() + "','" + c.getCorreo() + "')";

		int res = 0;
		try {

			ps = cn.getConexion().prepareStatement(sql_insert);

			res = ps.executeUpdate();

			if (res > 0) {
				System.out.println("Registro Guardado en la Base de Datos Correctamente.");

			}

			contactos.add(c);

		} catch (SQLException e) {
			System.out.println("Error al ingresar datos, Error al guardar los datos " + e.getMessage());
		} finally {
			ps = null;
			cn.cerrarConexion();
			System.out.println("La Conexión a la Base de Datos esta finalizada!");
		}
		return res;
	}

	public int elimiarContacto(int IdContactos) {
		
		Contactos c = new Contactos(IdContactos);
		
		String sql_delete = "DELETE FROM contactos WHERE IDCONTACTO = "+c.getIdContacto();

		int res = 0;
		try {
			ps = cn.getConexion().prepareStatement(sql_delete);
			res = ps.executeUpdate();
			if (res > 0) {
				System.out.println("Registro Eliminado");

			}
			
			contactos.remove(c);
			
		} catch (SQLException e) {
			System.out.println("Error al eliminar el dato " + e.getMessage());
		} finally {
			ps = null;
			cn.cerrarConexion();
			System.out.println("La Conexión a la Base de Datos esta finalizada!");
		}
		return res;
	}

	public void mostrarContactos(String sql_select) {

		try {
			ps = cn.getConexion().prepareStatement(sql_select);
			rs = ps.executeQuery();

			Contactos c;
			while (rs.next()) {

				c = new Contactos(rs.getInt(1), rs.getString("NOMBRE"),rs.getString("TELEFONO"), rs.getString("CORREO") );
				
				 System.out.print("Id: " + rs.getString(1));
				 System.out.print("\tNombre: " + rs.getString("NOMBRE"));
				 System.out.print("\tTelefono: "+ rs.getString("TELEFONO"));
				 System.out.print("\tCorreo: " + rs.getString("CORREO"));
				 System.out.println("");
				 
				
				contactos.add(c);

			}

		} catch (SQLException e) {
			System.out.println("Error al listar los datos." + e.getMessage());
		} finally {
			ps = null;
			rs = null;
			cn.cerrarConexion();
		}

	}

}
