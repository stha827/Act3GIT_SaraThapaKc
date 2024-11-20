package numeros_enteros;

import java.util.Scanner;

public class Enteros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe el primer número: ");
		int numero1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Escribe el segundo número: ");
		int numero2 = Integer.parseInt(scanner.nextLine());
		while (numero1<numero2) {
			numero1 = numero1+7;
				System.out.println(numero1);
		}
		scanner.close();
	}

}
