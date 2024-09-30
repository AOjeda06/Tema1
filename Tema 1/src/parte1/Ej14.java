package parte1;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {

		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Declaramos las variables
		int nota1, nota2, nota3, notaMediaEntera;
		double notaMediaDecimal;

		// Pide las notas de los tres trimestres
		System.out.print("Introduce la nota del primer trimestre: ");
		nota1 = scanner.nextInt();
		System.out.print("Introduce la nota del segundo trimestre: ");
		nota2 = scanner.nextInt();
		System.out.print("Introduce la nota del tercer trimestre: ");
		nota3 = scanner.nextInt();

		// Calcular la nota media con decimales
		notaMediaDecimal = (nota1 + nota2 + nota3) / 3.0;

		// Calcular la nota media entera convirtiendo la variable
		notaMediaEntera = (int) notaMediaDecimal;

		// Devuelve los resultados
		System.out.println("Nota media para el boletín de calificaciones (entera): " + notaMediaEntera);
		System.out.println("Nota media para el expediente académico (con decimales): " + notaMediaDecimal);
		
		scanner.close(); // Cierra el scanner

	}

}
