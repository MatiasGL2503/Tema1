package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		
		System.out.println("¿Cual es tu año de nacimiento?");
		Integer añoNacimiento = sc.nextInt();
		Integer edad = 2024 - añoNacimiento;
		System.out.println("Tienes " + edad + " años");
		
		
		
		
		sc.close();

	}

}
