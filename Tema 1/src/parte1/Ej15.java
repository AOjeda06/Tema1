package parte1;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// Declarar la constante IVA
		final double IVA = 21.0;

		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario que introduzca el precio
		System.out.print("Introduce el precio del producto: ");
		double precio = scanner.nextDouble();

		// Calcular el precio final con el IVA aplicado
		double precioConIVA = precio + (precio * IVA / 100);

		// Mostrar el precio final
		System.out.printf("El precio final con IVA es: " + precioConIVA);
	}

}
