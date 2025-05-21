package Ejercicios;

public class Recursividad30al38 {
	
//	String
	public static String resto(String s) {
		String salida = "";
		for (int i = 1; i < s.length(); i++) {
			salida = salida + s.charAt(i);
		}
		return salida;
	}
//	Ejercicio 30
//	Escribir las versiones recursivas de los siguientes m´etodos de la Secci´on 3:
//	a) sumatoria: static int sumatoriaRec(int n)
	public static int sumatoriaRec(int n) {
		if(n == 0) {
			return 0;
		}else {
			System.out.println(n);
			return  n + sumatoriaRec((n - 1) );
		}
	}
	
//	b) sumatoriaPares: static int sumatoriaParesRec(int n)
	public static int sumatoriaParesRec(int n) {
		if (n%2 !=0) {
			n = n - 1;
		}
		if ( n <= 0) {
			return 0;
		}
		return n + sumatoriaParesRec(n - 2);
	}
	
//	c) potencia: static int potenciaRec(double x, int n)
	public static int potenciaRec(int n, double x) {
		if (n == 0 || n == 1) {
			return 2; 
		}
		if (x == 0) {
			return 1;
		}
		return n * potenciaRec(n, x-1);
	}
//	d) factorial: static int factorialRec(int n)
	public static int factorialRec(int n) {
		if (n == 0) {
			return 1;
		}else {
			return n * factorialRec(n-1);
		}
	}
	
//	Ejercicio 31
//	Fibonacci en recursividad
	public static int fiboRec(int n) {
		if (n <= 0) {
			return 1;
		}
		return fiboRec(n-1) + fiboRec(n - 2);
	}
	
	public static int fiboiter(int n) {
		int resultado = 0;
		int a = 0;
		int b = 1;
		for (int i = 0 ; i < n ; i++) {
			resultado = a + b;
			a = b;
			b = resultado;
		}
		return resultado;
	}
//	Ejercicio 32 - Sucesión de Collatz
	public static void collatz(int n) {
		if (n == 0) {
			System.out.println("La sucesion es 0");
			return;
		}
		if(n == 1) {
			System.out.println("La sucesion es 1");
			return;
		}else {
			if (n%2 == 0) {
				System.out.print("Como "+n+" es par, entonces "+ n+"/2 = ");
				n = n/2;
				System.out.println(n);
				collatz(n);
			}else {
				System.out.print("Como "+n+" es impar, entonces 3 x "+ n+" + 1 = ");
				n = 3*n + 1;
				System.out.println(n);
				collatz(n);
			}
		}
	}
	
	public static int valor(int a , int b) {
		int numero = 0;
		numero = a%b;
		return numero;
	}
	
//	Ejercicio 33
	public static int mcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return mcd(b, a%b);
		}
	}
	
//	Ejercicio 34
	public static String asterisco(String s) {
		if (s.length() == 1) {
			return s;
		}else {
			return s.charAt(0) + "*" + asterisco(resto(s));
		}
	}
	
//	Ejercicio 35
	public static String sinRepetidosContiguos(String s) {
		if(s.length()==1) {
			return s;
		}else {
			if(s.charAt(0) != s.charAt(1)) {
				return s.charAt(0) + sinRepetidosContiguos(resto(s));
			}else {
				return sinRepetidosContiguos(resto(s));
			}
		}
	}
	
//	Ejercicio 36
	public static int prodCifras(int n) {
		if(n/10 == 0) {
			return n;
		}
		if(n%10 != 0) {
			return n%10 * prodCifras(n/10);
		}else {
			return prodCifras(n/10);
		}
	}
//	Ejercicio 37
	public static String estaPrimera(String s1, String s2) {
		if(s1.length() == 0) {
			return s1;
		}
		if(s2.length() == 0) {
			return s2;
		}else {
			if(s1.charAt(0) > s2.charAt(0)) {
				return s2;
			}else {
				if(s2.charAt(0) > s1.charAt(0)) {
					return s1;
				}else {
					return s1.charAt(0) + estaPrimera(resto(s1), resto(s2)) ;
				}
			}
		}
	}
//	Ejercicio 38
	public static String rotacion(String s, int n) {
		if(n == 0) {
			return s;
		}else {
			return rotacion(resto(s) + s.charAt(0), n - 1);
		}
	}
	
	public static void main(String[] args) {
//		int a = 7;
//		int b = 2034;
//		String s = "hhhhhoooooolllllaaaaa";
//		String s = "sapo";
//		System.out.println(sumatoriaRec(n)); //Ejercicio a
//		System.out.println(sumatoriaParesRec(n)); //Ejercicio b
//		System.out.println(potenciaRec(x, n)); Ejercicio c
//		System.out.println(factorialRec(n)); Ejercicio d
//		System.out.println(fiboRec(n)); Ejercicio 31 - A
//		System.out.println(fiboiter(n));
//		collatz(n);
//		System.out.println(valor(a, b));
//		System.out.println("el mcd entre "+a+" y "+b+" es "+mcd(a, b));
//		System.out.println(asterisco(s));
//		System.out.println(sinRepetidosContiguos(s));
//		System.out.println(prodCifras(b));
//		String s1 = "abcdefghi";
//		String s2 = "canario";
//		System.out.println(estaPrimera(s1, s2));
//		System.out.println(rotacion(s1, 4));
	}
}