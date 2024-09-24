package parte1;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		String nombre; // declaramos la variable del nombre
		int edad; // declaramos la variable de la edad
		Scanner sc = new Scanner(System.in); // configuramos el scanner
		System.out.println("Escriba su nombre: "); // pide el nombre
		nombre = sc.nextLine(); // lee el teclado
		System.out.println("Escriba su edad: "); // pide la edad
		edad = sc.nextInt(); // lee el teclado
		System.out.println("“Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!”. \r\n"); // devuelve la
																										// respuesta
	}

}
