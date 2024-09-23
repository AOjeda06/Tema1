package parte1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		System.out.println("Introduzca su edad: "); //pide la edad
		int edad; //declaramos la variable
		Scanner sc = new Scanner(System.in); //configuramos el scanner 
		edad = sc.nextInt(); //ponemos que lea por teclado el proximo int
		System.out.println("Usted el año que viene tendrá " + (edad + 1) + " años."); //devuelve la edad +1

	}

}
