package parte2;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Configuramos el scanner

		// Declaramos variables
		final double PRECIOINFANTIL = 15.50;
		final double PRECIOADULTO = 20.00;
		int numInfantiles, numAdultos;
		double total;
		double precioFinal;

		// Solicitar el número de entradas infantiles y de adultos
		System.out.print("Introduce el número de entradas infantiles: ");
		numInfantiles = scanner.nextInt();

		System.out.print("Introduce el número de entradas de adultos: ");
		numAdultos = scanner.nextInt();

		// Calcular el importe total
		total = (numInfantiles * PRECIOINFANTIL) + (numAdultos * PRECIOADULTO);

		// Calcula si hay descuento
		precioFinal = total >= 100 ? total * 0.95 : total;

		// Mostrar el importe total
		System.out.printf("El importe total a cobrar es: " + precioFinal);

		scanner.close(); // Cierra el scanner
	}
}
