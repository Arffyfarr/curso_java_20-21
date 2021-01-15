package Ejer_B2;

public class Persona {

	String dni;
	String nombre;
	String apellido;
	int edad;
	boolean major=false;
	
	public Persona(String dni, String nombre, String apellido, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	//Metodes
	
	public void mayor() {
		if (edad >= 18) {
			major = true;
		}
	}
	
	public void llistar() {
		if (major == true) {
			System.out.println(nombre +" "+ apellido+" con DNI "+dni+" es major d'edat.");
		}
		else {
			System.out.println(nombre +" "+ apellido+" con DNI "+dni+" no es major d'edat.");
		}
	}
}
