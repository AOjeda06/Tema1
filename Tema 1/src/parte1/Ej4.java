package parte1;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		float numero1, numero2; // declaramos variables
		Scanner sc = new Scanner(System.in); // configuramos el scanner
		System.out.println("Introduzca el primer numero: "); // pide el primer numero
		numero1 = sc.nextFloat(); // lee el primer numero
		System.out.println("Introduzca el segundo numero: "); // pide el segundo numero
		numero2 = sc.nextFloat(); // lee el segundo numero
		System.out.println("La media de los dos números es: " + ((numero1 + numero2) / 2)); // devuelve su respuesta

	}

}
