package Ejercicios;

import java.util.Scanner;

public class del10al15 {

	// Ejercicio 10 
	public static int sumatoria(int n) {
		int valor = 0;
		for (int i = 1; i <= n; i++) {
			valor = valor + i;
		}
		return valor;
	}
	
	// Ejercicio 11 
	public static int sumatoriaPares (int n) {
		int valor = 0;
		for (int i = 1; i <= n; i++) {
			if (i%2==0) {
				valor = valor + i;
			}
		}
		return valor;
	}
	
	// Ejercicio 12
	public static double potencia (double x, int a) {
		double resultado = 1;
		for (int i =1; i <= a; i++ ) {
			resultado = resultado * x;
		}
		return resultado;
	}
	
	// Ejercicio 13
	public static double factorial (int n) {
		double resultado = 1;
		if (n == 0) {
			return resultado = 1;
		}
		for (int i = n; i >= 1; i--) {
			resultado *= i;
		}
		return resultado;
	}
	
	// Ejercicio 14
	public static int cantCifras (int n) {
		int cifras = 0;
		while (n != 0) {
			n = n / 10;
			cifras += 1;
		}
		return cifras;
	}
	
	// Ejercicio 15
	public static boolean esDivisible (int n, int m) {
		boolean flag = true;
		if (m == 0 || n == 0 ) {
			return flag= false; //No se puede dividir por 0
		}
		if (n % m == 0) {
			return flag;
		}
		return flag = false;
	}
	
	
	public static void main(String[] args) {
//		Ejercicio 10 ---------------------------
		Scanner scan= new Scanner (System.in);
//		System.out.println("Ingrese un numero: ");
//		int n = scan.nextInt();
//		System.out.println(sumatoria(n));
//		Ejercicio 11 ---------------------------
//		System.out.println("Ingrese un numero: ");
//		int n = scan.nextInt();
//		System.out.println(sumatoriaPares(n));
// 		Ejercicio 12 ---------------------------
//		double x = 9;
//		int a = 2;
//		System.out.println(potencia(x, a));
//		Ejercicio 13 ---------------------------
//		int n = 3;
//		System.out.println(factorial(n));
//		Ejercicio 14 ---------------------------
//		int n = 242320;
//		System.out.println(cantCifras(n));
// 		Ejercicio 15 ---------------------------
//		int n = 0;
//		int m = 0;
//		System.out.println(esDivisible(n, m));
		scan.close();
	}

}
