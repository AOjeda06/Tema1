package parte2;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Configuramos el scanner
		System.out.println("Escribe un número entero: "); // Pide el primer numero
		int num1 = sc.nextInt(); // Declara la variable y lee el teclado para asignarle valor
		System.out.println("Escribe otro número entero: "); // Pide el segundo numero
		int num2 = sc.nextInt(); // Declara la variable y lee el teclado para asignarle valor

		int resto = num1 % num2; // Declaramos una variable para calcular el resto
		int suma = (resto == 0) ? 0 : num2 - resto; // Calculamos cuanto le falta para ser múltiplo de 7

		System.out.println("Para que " + num1 + " sea múltiplo de " + num2 +", hay que sumarle: " + suma); // Devuelve la
																									// respuesta
		sc.close(); // Cierra el scanner
	}

}
