package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Cual es tu nombre?");
		
		String nombre = p.nextLine();
		System.out.println("Bienvenido " + nombre + "\nDe donde eres?");
		System.out.println();
		String localidad = p.nextLine();
		
		System.out.println("Que tal se vive en " + localidad + "? ");
		p.nextLine();
		
		System.out.println("Gracias, un saludo ");
		
		p.close();
		
	}

}
