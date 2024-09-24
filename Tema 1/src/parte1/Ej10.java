package parte1;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // configuramos el scanner
		System.out.print("Introduce un número: "); // pide el numero
		int numero = scanner.nextInt(); // declaramos la variable, y hacemos que se le asigne como valor lo que lea por
										// el teclado
		boolean esPar = (numero % 2 == 0); // declaramos el booleano
		System.out.println("¿El número es par? " + esPar); // devuelve la respuesta

	}

}
