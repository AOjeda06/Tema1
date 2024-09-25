package parte2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Configuramos el scanner

		// Declaramos variables
		int numero, resto, suma;

		System.out.println("Escribe un número entero: "); // Pide el numero
		numero = sc.nextInt(); // Lee el teclado para asignarle valor

		resto = numero % 7; // Calcular el resto
		suma = (resto == 0) ? 0 : 7 - resto; // Calculamos cuanto le falta para ser múltiplo de 7

		System.out.println("Para que " + numero + " sea múltiplo de 7, hay que sumarle: " + suma); // Devuelve la
																									// respuesta
		sc.close(); // Cierra el scanner

	}

}
