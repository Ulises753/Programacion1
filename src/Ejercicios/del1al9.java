package Ejercicios;

import java.util.Scanner;

public class del1al9 {
	
// Ejercicio 1
	public static void saludoMundo() {
		System.out.println("Hola Mundo");
	}
	
// Ejercicio 2
	public static void saludoNombre() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = scan.nextLine();
		System.out.println("Hola "+ nombre);
	}
	
// Ejercicio 3
	public static int suma(int a, int b){
		int suma = a + b;
		return suma;
	}
	
// Ejercicio 4
	public static void imprimir() {
		System.out.println(1/2); //<-- 0
		System.out.println(1.0/2.0); //<-- 0.5
		System.out.println(1.0/2); //<-- 0.5
		System.out.println(1/2.0); //<-- 0.5
		System.out.println("1/2"); //En esto nos sale Error
		System.out.println(1+2); //<-- 3
		System.out.println("1"+"2"); //<-- 12
		System.out.println(16/2*4); //<-- 32
		System.out.println(16/(2*4)); //<-- 2

	}
	
// Ejercicio 5
	public static int promedio (int a, int b) {
		int promedio= (a + b) / 2; 
		return promedio;
	}
	
// Ejercicio 6
	public static void imprimirSuma (int a, int b) {
		System.out.println("la suma es: "+suma(a, b));
	}
	
// Ejercicio 7
	public static void imprimirPromedio (int a, int b) {
		System.out.println("el promedio es: " + promedio(a, b));
	}
	
// Ejercicio 8
	public static void ponerNota(double x, double y) {
		double promedio = (x + y) / 2;
		if(promedio >= 7) {
			System.out.println("Promociona, su nota final es: "+ promedio);
		}
		if(promedio >= 4  && promedio < 7) {
			System.out.println("Aprobado, su nota final es: "+ promedio);
		} 
		if(promedio < 4) {
			System.out.println("Recupera, su nota final es: "+ promedio);
		}
	}
	
// Ejercicio 9
	public static void  imprimirFecha(int dia, int mes, int anio) {
		if(mes == 1) {
			System.out.println("la fecha es: "+dia+ " de Enero de "+anio);
		}
		if(mes == 2) {
			System.out.println("la fecha es: "+dia+ " de Febrero de "+anio);

		}
		if(mes == 3) {
			System.out.println("la fecha es: "+dia+ " de Marzo de "+anio);

		}
		if(mes == 4) {
			System.out.println("la fecha es: "+dia+ " de Abril de "+anio);

		}
		if(mes == 5) {
			System.out.println("la fecha es: "+dia+ " de Mayo de "+anio);

		}
		if(mes == 6) {
			System.out.println("la fecha es: "+dia+ " de Junio de "+anio);

		}
		if(mes == 7) {
			System.out.println("la fecha es: "+dia+ " de Julio de "+anio);

		}
		if(mes == 8) {
			System.out.println("la fecha es: "+dia+ " de Agosto de "+anio);

		}
		if(mes == 9) {
			System.out.println("la fecha es: "+dia+ " de Septiembre de "+anio);

		}
		if(mes == 10) {
			System.out.println("la fecha es: "+dia+ " de Octubre de "+anio);

		}
		if(mes == 11) {
			System.out.println("la fecha es: "+dia+ " de Noviembre de "+anio);

		}
		if(mes == 12) {
			System.out.println("la fecha es: "+dia+ "de Diciembre de "+anio);

		}
	}
	
	public static void main (String []args) {
		Scanner scan = new Scanner (System.in);
		//saludoNombre(); ejercicio 2
		//suma(); ejercicio 3
		//imprimir(); ejercicio 4
		//promedio(); ejercicio 5
//ejercicio 6
//		System.out.println("Dame un Número: ");
//		int a = scan.nextInt();
//		System.out.println("Dame un Número: ");
//		int b = scan.nextInt();
//		imprimirSuma(a,b);
// Ejercicio 7
//		System.out.println("Dame un Número: ");
//		int a = scan.nextInt();
//		System.out.println("Dame un Número: ");
//		int b = scan.nextInt();
//		imprimirPromedio(a,b);
// Ejercicio 8
//		System.out.println("Dame un Número: ");
//		double x = scan.nextDouble();
//		System.out.println("Dame un Número: ");
//		double y = scan.nextDouble();
//		ponerNota(x, y);
//		
//Ejercicio 9
//		System.out.println("Dime un día: ");
//		int dia = scan.nextInt();
//		System.out.println("Dime el numero de un mes: ");
//		int mes = scan.nextInt();
//		System.out.println("Dime un año: ");
//		int anio = scan.nextInt();
//		imprimirFecha(dia, mes, anio);
	}
}
