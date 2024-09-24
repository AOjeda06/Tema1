package parte1;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		int edad; // declaramos variable
		Scanner sc = new Scanner(System.in); // configuramos el scanner
		System.out.println("Escriba su edad: "); // pide la edad
		edad = sc.nextInt(); // lee el teclado
		boolean esMayorDeEdad = edad >= 18; // declaramos el booleano
		System.out.println("¿Es mayor de edad? " + esMayorDeEdad); // devuelve la respuesta

	}
}
