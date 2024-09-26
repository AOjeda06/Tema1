package parte1;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// Declaramos variables
		double PRECIO_MANZANAS = 2.35;
		double PRECIO_PERAS = 1.95;
		double kilosManzanas, kilosPeras, totalManzanas, totalPeras, importeTotal;

		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Pide las ventas en kilos
		System.out.print("Introduce las ventas de manzanas en kilos: ");
		kilosManzanas = scanner.nextDouble();

		System.out.print("Introduce las ventas de peras en kilos: ");
		kilosPeras = scanner.nextDouble();

		// Calcular el importe total
		totalManzanas = kilosManzanas * PRECIO_MANZANAS;
		totalPeras = kilosPeras * PRECIO_PERAS;
		importeTotal = totalManzanas + totalPeras;

		// Devuelve el importe total
		System.out.printf("El importe total anual es: " + importeTotal);

	}

}
