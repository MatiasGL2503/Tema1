package ejerciciosRepaso;

import java.util.Scanner;

public class ejercicio3 {

		public static void main(String[] args) {
			Scanner p = new Scanner(System.in);
			System.out.println("Dime el primer numero");
			String numero1 = p.nextLine();
			System.out.println("Dime el segundo numero");
			String numero2 = p.nextLine();
			Long resultado = Long.parseLong(numero1) * Long.parseLong(numero2);
			
			System.out.println("El resultado de los dos numero multiplicados es " + resultado);
			
			p.close();

	}

}
