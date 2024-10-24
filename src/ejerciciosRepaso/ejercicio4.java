package ejerciciosRepaso;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Dime tu numero favorito");
		String numero = p.nextLine();
		System.out.println("Dime tu ciudad favorita ");
		String ciudad = p.nextLine();
		System.out.println("Tu numero favorito es: " + numero + "\nTu ciudad favorita es: " + ciudad);
		p.close();
		
		

	}

}
