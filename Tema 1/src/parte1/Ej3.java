package parte1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int añoNacimiento, añoActual; //declaramos las variables
		System.out.println("Introduzca en qué año estamos: "); //pide el año actual
		Scanner sc = new Scanner(System.in); //configuramos el scanner 
		añoActual = sc.nextInt(); //ponemos que lea por teclado el proximo int
		System.out.println("Introduzca su año de nacimiento: "); //pide el año de nacimento
		añoNacimiento = sc.nextInt(); //lee el año
		System.out.println("Usted tiene " + (añoActual - añoNacimiento) + " años."); //devuelve la edad +1

	}

}
