package Ejer_B4;

public class MainB4 {

	public static void main(String[] args) {
		Articulo art1 =  new Articulo("Pijama",23,9);

		Articulo art2 = new Articulo("Manta",12,43);
		
		art1.precio();
		System.out.println();
		
		art2.precio();
	}

}
