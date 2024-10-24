package ejerciciosRepaso;

import java.util.Scanner;

public class ejercicio1 {

	public static final double PI = 3.14159265358979323846;

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("¿Cual es el radio de un circulo?");
		Double radio = p.nextDouble();
		Double circunferencia = 2 * radio * PI;
		Double area = PI * (radio * radio);
		System.out.println("La circunferencia del circulo de radio " + radio + " es " + circunferencia + "," + "\nEl area del circulo es " + area);
		
		p.close();
	}

}
