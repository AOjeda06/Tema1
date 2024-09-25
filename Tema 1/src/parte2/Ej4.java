package parte2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		double a, b, c, x, y; // Declaramos las variables
		Scanner sc = new Scanner(System.in); // Configuramos el scanner

		// Pedimos que asigne valores a las variables declaradas
		System.out.println("Dado el polinomio de segundo grado y=ax^2+bx+c, asigne valores para: ");
		System.out.print("a: ");
		a = sc.nextDouble();
		System.out.print("b: ");
		b = sc.nextDouble();
		System.out.print("c: ");
		c = sc.nextDouble();
		System.out.print("x: ");
		x = sc.nextDouble();

		y = (a * (x * x)) + (b * x) + c; // Calculamos el valor de "y"

		System.out.println("El resultado es y = " + y); // Devuelve el resultado

		sc.close(); // Cierra el scanner

	}

}
