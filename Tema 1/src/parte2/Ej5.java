package parte2;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Configuramos el scanner

		// Declaramos variables
		int segundosTotales, horas, minutos, segundos;

		// Solicitar al usuario que introduzca la cantidad de segundos
		System.out.print("Introduce la cantidad de segundos: ");
		segundosTotales = sc.nextInt();

		// Declaramos variables y calcular horas, minutos y segundos
		horas = segundosTotales / 3600;
		minutos = (segundosTotales % 3600) / 60;
		segundos = segundosTotales % 60;

		// Mostrar el resultado
		System.out.println("Horas: " + horas);
		System.out.println("Minutos: " + minutos);
		System.out.println("Segundos: " + segundos);

		sc.close(); // Cierra el scanner
	}

}
