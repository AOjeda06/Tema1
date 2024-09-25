package parte2;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Configuramos el scanner

		// Declaramos variables
		double precioInfantil = 15.50;
		double precioAdulto = 20.00;
		int numInfantiles, numAdultos;
		double total;

		// Solicitar el número de entradas infantiles y de adultos
		System.out.print("Introduce el número de entradas infantiles: ");
		numInfantiles = scanner.nextInt();

		System.out.print("Introduce el número de entradas de adultos: ");
		numAdultos = scanner.nextInt();

		// Calcular el importe total
		total = (numInfantiles * precioInfantil) + (numAdultos * precioAdulto);

		// Aplicar descuento si el importe total es igual o superior a 100€
		if (total >= 100) {
			total *= 0.95; // Aplicar un descuento del 5%
			System.out.println("Su precio final ha recibido un 5% de descuento y es: " + total);
		} else

			// Mostrar el importe total
			System.out.printf("El importe total a cobrar es: " + total);

		scanner.close(); // Cierra el scanner
	}
}
