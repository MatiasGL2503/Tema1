package ejercicios;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Dime un numero");
		String a = p.nextLine();
		System.out.println("Dime un numero decimal");
		Double b = p.nextDouble();
		System.out.println("Dime un numero entero");
		Float c = p.nextFloat();
		Long x1 = Long.parseLong(a);
		String x2 = b.toString();
		Float x3 = b.floatValue();
		Long x4 = c.longValue();
		System.out.println( x1 +"\n" + x2 +"\n" + x3 +"\n" +x4);
		
		
		
		
		
		
		p.close();

	}

}
