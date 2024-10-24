package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Nombre");
		String nombre = p.nextLine();
		System.out.println("Apellidos");
		String apellidos = p.nextLine();
		System.out.println("Tu nombre completo es!!!!1 " + nombre + " " + apellidos);
		
			
		p.close();
	}

}
