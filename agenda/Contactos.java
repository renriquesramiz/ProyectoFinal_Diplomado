package com.agenda;

public class Contactos {

	//Atributos de la Clase Contactos
	private int IdContacto;
	private String Nombre;
	private String Telefono;
	private String Correo;


	
	//Constructor de la Clase Contactos
	public Contactos(int idcontactos) {
		
		this.IdContacto = idcontactos;
		
	}
	
	public Contactos(int idcontactos, String nombre, String telefono, String correo) {
		this.IdContacto = idcontactos;
		this.Nombre = nombre;
		this.Telefono = telefono;
		this.Correo = correo;
	}

	//Métodos de la Clase Contactos
	public int getIdContacto() {
		return IdContacto;
	}

	public void setIdContacto(int idContacto) {
		IdContacto = idContacto;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	
	@Override
	public String toString() {
		return "Contactos [IdContacto=" + IdContacto + ", Nombre=" + Nombre + ", Telefono=" + Telefono + ", Correo="
				+ Correo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdContacto;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contactos other = (Contactos) obj;
		if (IdContacto != other.IdContacto)
			return false;
		return true;
	}


	

}
