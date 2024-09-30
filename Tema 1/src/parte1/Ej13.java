package parte1;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {

		// Declaramos variables
		boolean estaLloviendo, tareasFinalizadas, irBiblioteca, puedeSalir;

		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Pide al usuario los datos necesarios
		System.out.print("¿Está lloviendo? (true/false): ");
		estaLloviendo = scanner.nextBoolean();

		System.out.print("¿Has finalizado tus tareas? (true/false): ");
		tareasFinalizadas = scanner.nextBoolean();

		System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
		irBiblioteca = scanner.nextBoolean();

		// Determinar si se puede salir a la calle
		puedeSalir = (!estaLloviendo && tareasFinalizadas) || irBiblioteca;

		// Mostrar el resultado
		System.out.println("¿Puedes salir a la calle? " + puedeSalir);
		
		scanner.close(); // Cierra el scanner

	}

}
