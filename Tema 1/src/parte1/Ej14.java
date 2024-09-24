package parte1;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {

		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Pide las notas de los tres trimestres
		System.out.print("Introduce la nota del primer trimestre: ");
		int nota1 = scanner.nextInt();
		System.out.print("Introduce la nota del segundo trimestre: ");
		int nota2 = scanner.nextInt();
		System.out.print("Introduce la nota del tercer trimestre: ");
		int nota3 = scanner.nextInt();

		// Calcular la nota media con decimales
		double notaMediaDecimal = (nota1 + nota2 + nota3) / 3.0;

		// Calcular la nota media entera convirtiendo la variable
		int notaMediaEntera = (int) notaMediaDecimal;

		// Devuelve los resultados
		System.out.println("Nota media para el boletín de calificaciones (entera): " + notaMediaEntera);
		System.out.println("Nota media para el expediente académico (con decimales): " + notaMediaDecimal);
	}

}
