package Ejer_B1;

public class MainB1 {

	public static void main(String[] args) {
		
		//Constructors
		
		Punto P1 = new Punto(5,0);

		Punto P2 = new Punto(7.23, 8.12);
		
		Punto P3 = new Punto(8);
	
		//Objectes realitzant metodes
		
		P1.print(5,0);
		P1.operador_s(5,0);
		System.out.println();
		
		P2.print(7.23, 8.12);
		P2.operador_s(7.23, 8.12);
		System.out.println();
		
		P3.print(8);
		P3.operador_s(8);
		System.out.println();
	}

}
