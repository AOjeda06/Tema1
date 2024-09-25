package parte2;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner
		
		// Declaramos variables
		double milimetros, centimetros, metros, totalCentimetros;

		// Solicitar la primera distancia en milímetros
		System.out.print("Introduce la primera distancia (en milímetros): ");
		milimetros = scanner.nextDouble();

		// Solicitar la segunda distancia en centímetros
		System.out.print("Introduce la segunda distancia (en centímetros): ");
		centimetros = scanner.nextDouble();

		// Solicitar la tercera distancia en metros
		System.out.print("Introduce la tercera distancia (en metros): ");
		metros = scanner.nextDouble();

		// Convertir todas las distancias a centímetros
		totalCentimetros = (milimetros / 10) + centimetros + (metros * 100);

		// Mostrar la suma de las distancias en centímetros
		System.out.println("La suma de las tres distancias en centímetros es: " + totalCentimetros + " cm");

		scanner.close(); // Cierra el scanner
	}

}
