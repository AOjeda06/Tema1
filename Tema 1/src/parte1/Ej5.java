package parte1;
import java.util.Scanner;


public class Ej5 {
	public static void main(String[] args) {
		float radio, area, longitud; //declaramos las variables
		Scanner sc = new Scanner(System.in); //configuramos el scanner
		System.out.println("Introduzca el radio de su circunferencia para calcular su area y longitud: "); //pide los datos por pantalla
		radio = sc.nextFloat(); //lee los datos por teclado
		System.out.println("El área es: " + (radio*radio*Math.PI) + " y la longitud es: " + (radio*2*Math.PI)); //calcula y devuelve la respuesta
	}
}
