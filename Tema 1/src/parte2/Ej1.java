package parte2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner

		// Declaramos variables
		double numeroDecimal;
		int numeroRedondeado;

		System.out.print("Introduce un número con decimales: "); // Pedimos el numero
		numeroDecimal = scanner.nextDouble(); // Declaramos la variable y le asignamos como valor lo que lea el
												// scanner

		numeroRedondeado = (int) (numeroDecimal + 0.5); // Redondear al entero más próximo

		System.out.println("Número redondeado: " + numeroRedondeado); // Devuelve la respuesta

		scanner.close(); // Cierra el scanner
	}

}