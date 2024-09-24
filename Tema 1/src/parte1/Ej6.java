package parte1;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		float numero1, numero2, suma, resta, multiplicacion, division; // declaramos las variables
		Scanner sc = new Scanner(System.in); // configuramos el scanner
		System.out.println("Escriba el primer numero: "); // pide el primer numero
		numero1 = sc.nextFloat(); // lee el teclado
		System.out.println("Escriba el segundo numero: "); // pide el segundo numero
		numero2 = sc.nextFloat(); // lee el teclado
		suma = numero1 + numero2; // calcula la suma
		resta = numero1 - numero2; // calcula la resta
		multiplicacion = numero1 * numero2; // calcula la multiplicacion
		division = numero1 / numero2; // calcula la division
		System.out.println("El resultado de la suma del primer y segundo número es: " + suma); // devuelve la suma
		System.out.println("El resultado de la resta del primer y segundo número es: " + resta); // devuelve la resta
		System.out.println("El resultado de la multiplicacion del primer y segundo número es: " + multiplicacion); // devuelve
																													// la
																													// multiplicacion
		System.out.println("El resultado de la division del primer numero por el segundo número es: " + division); // devuelve
																													// la
																													// division

	}
}
