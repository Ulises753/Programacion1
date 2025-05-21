package Ejercicios;

public class Arreglos25al29 {

//	Ejercicio 25
//	Escribir un método static int maximo(int[] a) que dado un arreglo 
//	de enteros no vacío, devuelve el valor más alto que aparece.
	public static int maximo(int[]a) {
		int valor = 0;
		for (int i = 0; i < a.length; i++) {
			if (valor < a[i]) {
				valor = a[i];
			}
		}
		return valor;
	}
	
//	Ejercicio 26
//	Escribir un metodo static int maximoIndice(int[] a) que dado un arreglo de enteros 
//	no vacio, devuelve el indice del valor mas alto que aparece.
	public static int maximoIndice(int[]a) {
		int valor = maximo(a);
		int indice = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == valor) {
				indice = i;
			}
		}
		return indice;
	}
	
//	Ejercicio 27
//	Escribir un metodo static int suma(int[] a) que dado un arreglo de enteros, 
//	devuelve el valor de la suma de todos sus elementos.
	
	public static int suma (int[]a) {
		int valor = 0;
		for (int i = 0; i < a.length; i++) {
			valor += a[i];
		}
		return valor;
	}
	
//	Ejercicio 28
//	Escribir un metodo static boolean estaOrdenado(int[] a) que dado un arreglo de enteros,
//	devuelve verdadero si el arreglo esta ordenado crecientemente de menor a mayor,
//	y falso en caso	contrario.
	
	public static boolean estaOrdenado(int[]a) {
		boolean flag = true;
		int valor = 0;
		for (int i = 0; i < a.length; i++) {
			if (valor > a[i]) {
				flag = false;
			}else {
				valor = a[i];
			}
		}
		return flag;
	}
	
//	Ejercicio 29
//	Escribir un metodo static double promedio(double[] a) que dado un
//	arreglo de numeros con coma, devuelve el valor del promedio de todos los elementos.
	public static double promedio (double []a) {
		double valor = sumaDecimales(a);
		double resultado = valor / a.length;
		return resultado;
	}
	
	public static double sumaDecimales(double[]a) {
		int valor = 0;
		for (int i = 0; i < a.length; i++) {
			valor += a[i];
		}
		return valor;
	}
	
	public static void main(String[] args) {
//		Ejercicio 25 y 26 -----------------
//		int[] a = new int[3];
//		a[0] = 10;
//		a[1] = 50;
//		a[2] = 22;
//		System.out.println(maximoIndice(a));
//		Ejercicio 27 y 28 -------------------
//		int[] a ={2,3,4,5};
//		System.out.println(suma(a));
//		System.out.println(estaOrdenado(a));
//		Ejercicio 29 ------------------------
//		double[] a ={10,10,8.60,10};
//		System.out.println(promedio(a));
	}
}
