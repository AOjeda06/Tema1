package parte1;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// Precios por kilo
		double PRECIO_MANZANAS = 2.35;
		double PRECIO_PERAS = 1.95;

		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Pide las ventas en kilos
		System.out.print("Introduce las ventas de manzanas en kilos: ");
		double kilosManzanas = scanner.nextDouble();

		System.out.print("Introduce las ventas de peras en kilos: ");
		double kilosPeras = scanner.nextDouble();

		// Calcular el importe total
		double totalManzanas = kilosManzanas * PRECIO_MANZANAS;
		double totalPeras = kilosPeras * PRECIO_PERAS;
		double importeTotal = totalManzanas + totalPeras;

		// Devuelve el importe total
		System.out.printf("El importe total anual es: " + importeTotal);

	}

}
