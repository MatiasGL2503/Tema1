package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	public static final Double PORCENTAJE_IVA = 0.21;
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		System.out.println("¿Cual es el precio sin IVA de este articulo? ");
		
		Double precio = p.nextDouble();
		
		Double precioConIva = precio * PORCENTAJE_IVA + precio;
		
		System.out.println("Resultado con IVA " + precioConIva + "\n y sin IVA " + precio);
		
		
		
		
		p.close();
	}

}
