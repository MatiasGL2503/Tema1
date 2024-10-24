package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		System.out.println("¿Cuanto te gustaria ganar al año?");
		Integer sueldoAnual = p.nextInt();
		Integer sueldoMensual = sueldoAnual / 12;
		System.out.println("Tu sueldo mensual seria de " + sueldoMensual + " €");
		
		
		
		
		
		
		
		
		
		
		p.close();
		

	}

}
