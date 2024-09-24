package parte1;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		String nombre, direccion; // declaramos las variables string
		int numerotlf; // declaramos la variable del numero
		Scanner sc = new Scanner(System.in); // configuramos el scanner
		System.out.println("Escriba su nombre: "); // pide el nombre
		nombre = sc.nextLine(); // lee el teclado
		System.out.println("Escriba su dirección: "); // pide la direccion
		direccion = sc.nextLine(); // lee el teclado
		System.out.println("Escriba su numero de telefono: "); // pide el numero
		numerotlf = sc.nextInt(); // lee el teclado
		System.out.println("NOMBRE: " + nombre); // devuelve la info
		System.out.println("DIRECCION: " + direccion); // devuelve la info
		System.out.println("NUMERO DE TELEFONO: " + numerotlf); // devuelve la info

	}

}
