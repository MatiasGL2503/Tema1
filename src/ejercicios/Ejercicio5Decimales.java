package ejercicios;

import java.util.Scanner;

public class Ejercicio5Decimales {
	public static void main(String[] args) {
Scanner p = new Scanner(System.in);
		
		System.out.println("¿Cuanto te gustaria ganar al año?");
		Double sueldoAnual = p.nextDouble();
		Double sueldoMensual = sueldoAnual / 12;
		System.out.println("Tu sueldo mensual seria de " + sueldoMensual + " €");
		
		
		
		
		
		
		
		
		
		
		p.close();
}
}
