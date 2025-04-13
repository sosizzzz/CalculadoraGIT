package principal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	//Funcion para sumar 
	public static void suma(Scanner leer, int a, int b) {
		
		try {
			System.out.println("\nSUMA");
			System.out.print("A = ");
			a = leer.nextInt();
			System.out.print("B = ");
			b = leer.nextInt();
			System.out.println(a + " + " + b + " = " + (a + b) + "\n");
		} catch (InputMismatchException e) {
			System.err.println("ERROR: No has introducido un valor numérico.\n");
		}
	}
	
	//Funcion para restar dos numeros
	public static void resta(Scanner leer, int a, int b) {

		try {
			System.out.println("\nRESTA");
			System.out.print("A = ");
			a = leer.nextInt();
			System.out.print("B = ");
			b = leer.nextInt();
			System.out.println(a + " - " + b + " = " + (a - b) + "\n");
		} catch (InputMismatchException e) {
			System.err.println("ERROR: No has introducido un valor numérico.\n");
		}
		;

	}

	
	//Funcion para multiplicar dos numeros
	public static void multi(Scanner leer, int a, int b) {

		try {
			System.out.println("\nMULTIPLICACION");
			System.out.print("A = ");
			a = leer.nextInt();
			System.out.print("B = ");
			b = leer.nextInt();
			System.out.println(a + " X " + b + " = " + (a * b) + "\n");
		} catch (InputMismatchException e) {
			System.err.println("ERROR: No has introducido un valor numérico.\n");
		}

	}

	//Funcion para dividir dos numeros
	public static void division(Scanner leer, int a, int b) {

		try {
			System.out.println("\nDIVISION");
			System.out.print("A = ");
			a = leer.nextInt();
			System.out.print("B = ");
			b = leer.nextInt();

			System.out.println(a + " / " + b + " = " + (a / b) + "\n");
		} catch (InputMismatchException e) {
			System.err.println("ERROR: No has introducido un valor numérico.\n");
		} catch (ArithmeticException e) {
			System.err.println("ERROR: No se puede dividir entre cero.\n");
		}

	}

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		int op;
		int  a =0, b = 0;

		do {
			System.out.println("CALCULADORA");
			System.out.println("1 - Suma\n2 - Resta\n3 - Multiplicación\n4 - División\n0 - Salir");
			System.out.print("-> ");
			op = 10;
			try {
				op = leer.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("ERROR: No has introducido un valor correcto.\n");
			}
			switch (op) {
			case 1:
				suma(leer, a, b);
				break;
			case 2:
				resta(leer, a, b);
				break;

			case 3:
				multi(leer, a, b);
				break;

			case 4:
				division(leer, a, b);
				break;

			case 0:
				System.out.println("\nFin del programa.");
				break;

			default:
				break;
			}
			leer.nextLine();
		} while (op != 0);
		
	//Participantes del grupo 

		
		System.out.println("Adrián, Cristian, Maria, Nora");
		leer.close();

	}

}
