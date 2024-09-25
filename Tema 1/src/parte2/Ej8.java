package parte2;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner
		
		// Declaramos variables
		double longitudMetros;
		int longitudCentimetros;

		// Solicitar la longitud del lanzamiento en metros y declaramos variable
		System.out.print("Introduce la longitud del lanzamiento en metros: ");
		longitudMetros = scanner.nextDouble();

		// Convertir la longitud a centímetros
		longitudCentimetros = (int) (longitudMetros * 100);

		// Mostrar la parte entera en centímetros
		System.out.println(
				"La longitud del lanzamiento en centímetros (sin decimales) es: " + longitudCentimetros + " cm");

		scanner.close(); // Cerramos el scanner
	}

}
