package parte1;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Pide al usuario los datos necesarios
		System.out.print("¿Está lloviendo? (true/false): ");
		boolean estaLloviendo = scanner.nextBoolean();

		System.out.print("¿Has finalizado tus tareas? (true/false): ");
		boolean tareasFinalizadas = scanner.nextBoolean();

		System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
		boolean irBiblioteca = scanner.nextBoolean();

		// Determinar si se puede salir a la calle
		boolean puedeSalir = (!estaLloviendo && tareasFinalizadas) || irBiblioteca;

		// Mostrar el resultado
		System.out.println("¿Puedes salir a la calle? " + puedeSalir);
	}

}
