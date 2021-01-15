package Ejer_B4;

public class Articulo {
	String nombre;
	float precio;
	int iva = 21;
	int cuantosQuedan;

	public Articulo(String nombre, int precio, int cuantosQuedan){
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}
	
	//Metodes
	
	public void precio() {
		System.out.println(nombre+" - Precio: "+precio+"$ - IVA: "+iva+"% - PVP: "+((((float)iva/100)*precio)+precio)+"$.");
	}
}
