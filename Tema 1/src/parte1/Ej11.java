package parte1;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // configuramos el scanner
		System.out.print("Introduce un número de euros: "); // pide el numero
		int numero = scanner.nextInt(); // declaramos la variable, y hacemos que se le asigne como valor lo que lea por
		int cambio; // declaramos la variable cambio
		cambio = numero * 166; // calculamos el valor de la variable
		System.out.println("Eso equivale a " + cambio + " pesetas."); // devuelve la respuesta

	}

}