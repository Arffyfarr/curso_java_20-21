package Ejer_B2;

public class MainB2 {

	public static void main(String[] args) {
		 
		Persona per1 = new Persona("53489256P","Rafa","Champel",21);
		
		Persona per2 = new Persona("55454454O","Paco","Grande Paco",17);

		per1.mayor();
		per1.llistar();
		System.out.println();
		per2.mayor();
		per2.llistar();
	}

}
