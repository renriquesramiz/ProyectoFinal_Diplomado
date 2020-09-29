package com.agenda;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Init {

	public static void main(String[] args) {
		/*
		 * String sql_select = "SELECT * FROM contactos ORDER BY IDCONTACTO ASC"; 
		 * String * sql_insert = "INSERT INTO contactos (IDCONTACTO, NOMBRE, TELEFONO, CORREO) values (10,'Cristobal Miranda','809-789-1245','mj@home.com.do')"
		 * ; String sql_delete = "DELETE FROM contactos WHERE IDCONTACTO = 15";
		 */

		Agenda_Electronica agenda = new Agenda_Electronica();

		Scanner sc = new Scanner(System.in);

		System.out.println("<<< Agenda Electroníca >>>");	
		System.out.println("Qué desea realizar? ");
		System.out.println("1- Agregar Contacto ");
		System.out.println("2- Eliminar Contacto ");
		System.out.println("3- Realizar consulta SQL ");
		System.out.println("4- Cerrar Agenda ");
		
				
		System.out.print("\nElección: ");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:

			System.out.println("\n<< Agregar un Contacto >>");

			System.out.println("Introducir los campos correspondientes: ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nombre: ");
			String nombre = sc.next();
			System.out.print("Telefono: ");
			String telefono = sc.next();
			System.out.print("Correo: ");
			String correo = sc.next();

			agenda.AgregarContacto(id, nombre, telefono, correo);
			System.out.println("\nVizualización de la Agenda.");
			agenda.mostrarContactos("SELECT * FROM contactos");	

			break;

		case 2:
			System.out.println("\n<< Eliminar un Contacto >>");

			System.out.println("Introducir los campos correspondientes: ");
			System.out.print("Id: ");
			id = sc.nextInt();

			agenda.elimiarContacto(id);
			System.out.println("\nVizualización de la Agenda.");
			agenda.mostrarContactos("SELECT * FROM contactos");
			
			break;

		case 3:
			System.out.println("\n<< Realizando consulta SQL >>");

			System.out.println("Escriba la sentancia SQL:");
			
			String sql_select = JOptionPane.showInputDialog(null);
			
			agenda.mostrarContactos(sql_select);	
			
			break;
			
		case 4:	
			System.out.println("Agenda cerrada!!");
			System.exit(0);
			
			
			break;
			
		default:
			break;
		}

		

	}

}
