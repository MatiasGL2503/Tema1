package ejerciciosRepaso;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Dime el primer numero");
		Double numero1 = p.nextDouble();
		System.out.println("Dime el segundo numero");
		Double numero2 = p.nextDouble();
		
		System.out.println("El resultado de los dos numero multiplicados es " + numero1 * numero2);
		
		p.close();

	}

}
