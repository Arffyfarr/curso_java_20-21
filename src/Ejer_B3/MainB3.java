package Ejer_B3;

public class MainB3 {

	public static void main(String[] args) {
		Rectangulo rec1 = new Rectangulo(0,0,5,5);
		
		Rectangulo rec2 = new Rectangulo(7,9,2,3);
		
		rec1.mostrar();
		rec1.perimetro();
		rec1.area();
		
		System.out.println();
		
		rec2.mostrar();
		rec2.perimetro();
		rec2.area();
		
	}

}
