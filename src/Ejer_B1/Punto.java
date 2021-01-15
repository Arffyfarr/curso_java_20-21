package Ejer_B1;

public class Punto {

	int x;
	int y;
	double a;
	double b;
	
	//Constructors
	
	public Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Punto(double x, double y){
		a = x;
		b = y;
	}
	
	public Punto(int x){
		this.x = x;
	}

	//Metodes
	public void print(int x) {
		int y = 2;
		System.out.println(x+","+y);
	}
	
	public void print(int x, int y) {
		System.out.println(x+","+y);
	}
	
	public void print(double x, double y) {
		System.out.println(x+","+y);
	}
	
	
	
	
	
	public void operador_s(int x) {
		int y = 2;
		System.out.println(x+"+"+y+"="+(x+y));
	}
	
	public void operador_s(int x, int y) {
		System.out.println(x+"+"+y+"="+(x+y));
	}
	
	public void operador_s(double x, double y) {
		System.out.println(x+"+"+y+"="+(x+y));
	}
	
}
