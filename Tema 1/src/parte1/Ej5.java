package parte1;
import java.util.Scanner;


public class Ej5 {
	public static void main(String[] args) {
		double radio, area, longitud; //declaramos las variables
		Scanner sc = new Scanner(System.in); // configuramos el scanner
		System.out.println("Introduzca el radio de su circunferencia para calcular su area y longitud: "); //pide los datos por pantalla
		radio = sc.nextDouble(); //lee los datos por teclado
		area = (radio*radio*Math.PI); //calcula el area
		longitud = (radio*2*Math.PI); //calcula la longitud
		System.out.println("El área es: " + area + " y la longitud es: " + longitud); //devuelve la respuesta
	}
}
