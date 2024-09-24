package parte1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		System.out.println("Introduzca un número: "); // Sale la frase por pantalla
		int numero; // declaramos la variable
		Scanner sc = new Scanner(System.in); // declaramos el scanner
		numero = sc.nextInt(); // configuramos que lea el scanner el siguiente int
		System.out.println("Usted ha introducido el número " + numero); // devuelve la respuesta

	}

}
