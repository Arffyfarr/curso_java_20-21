package Ejer_B3;

public class Rectangulo {
//Rectangle
	//Atributs
	int x1;
	int y1;
		
	int x2;
	int y2;
		
	public Rectangulo(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	//Metodes
		
	public void mostrar() {
		System.out.println("Coordenadas: "+x1+" "+y1+" "+x2+" "+y2);
	}
		
	public void perimetro() {
		System.out.println("Perimetro: "+(x1+x2+y1+y2));
	}
		
	public void area() {
		System.out.println("Area: "+(Math.abs(x1-x2)*Math.abs(y1-y2)));
	}
}
