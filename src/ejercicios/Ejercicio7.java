package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("¿Cual es tu altura?");
		Double altura = p.nextDouble();
		System.out.println("¿Cual es tu peso?");
		Double peso = p.nextDouble();
		Double imc = peso / (altura + altura);
		System.out.println("Su IMC sera de " + imc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		p.close();

	}

}
