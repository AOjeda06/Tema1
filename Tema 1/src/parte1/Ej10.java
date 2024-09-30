package parte1;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // configuramos el scanner

		// Declaramos variables
		int numero;
		boolean esPar;

		System.out.print("Introduce un número: "); // pide el numero
		numero = scanner.nextInt(); // declaramos la variable, y hacemos que se le asigne como valor lo que lea por
									// el teclado
		esPar = (numero % 2 == 0); // declaramos el booleano
		System.out.println("¿El número es par? " + esPar); // devuelve la respuesta
		
		scanner.close(); // Cierra el scanner


	}

}
