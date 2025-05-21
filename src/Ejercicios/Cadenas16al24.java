package Ejercicios;

import java.util.Scanner;

public class Cadenas16al24 {

//	Ejercicio 16
	public static void imprimirReversa(String cadena) {
		System.out.println(reversa(cadena));
	}

	public static String reversa(String cadena) {
		String nueva_cadena = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			nueva_cadena += cadena.charAt(i);
		}
		return nueva_cadena;
	}

//	Ejercicio 17
	public static int cantidadApariciones(String s, char c) {
		int cont = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				cont++;
			}
		}
		return cont;
	}

// 	Ejercicio 18
	public static int cantidadVocales(String s) {
		int cont = 0;
		boolean flag_a = true; // las banderas de cada vocal sirven
		boolean flag_e = true; // para que no se pueda repetir las
		boolean flag_i = true; // vocales que ya fueron verificadas
		boolean flag_o = true;
		boolean flag_u = true;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' && flag_a == true) {
				cont = cont + cantidadApariciones(s, 'a');
				flag_a = false;
			}
			if (s.charAt(i) == 'e' && flag_e == true) {
				cont += cantidadApariciones(s, 'e');
				flag_e = false;
			}
			if (s.charAt(i) == 'i' && flag_i == true) {
				cont += cantidadApariciones(s, 'i');
				flag_i = false;
			}
			if (s.charAt(i) == 'o' && flag_o == true) {
				cont += cantidadApariciones(s, 'o');
				flag_o = false;
			}
			if (s.charAt(i) == 'u' && flag_u == true) {
				cont += cantidadApariciones(s, 'u');
				flag_u = false;
			}
		}
		return cont;
	}

//	Ejercicio 19
	public static boolean esAbecedario(String s) {
		boolean flag = true;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) < s.charAt(i - 1)) {
				if (s.charAt(i - 1) > 'z') {
					flag = true;
				} else {
					flag = false;
				}
			}
		}
		return flag;
	}

//	Ejericio 20
	public static boolean esCapicua(String s) {
		int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
	

//	Ejercicio 21
	public static boolean esSinRepetidos(String s) {
		for (int i = 0; i < s.length(); i++) {
			int cont = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					cont++;
				}
			}
			if (cont == 2) {
				return false;
			}
		}
		return true;
	}

//	Ejercicio 22
	public static String sinRepetidos(String s) {
		String cadena_nueva = "";
		for (int i = 0; i < s.length(); i++) {
			char actual = s.charAt(i);
			boolean repetido = false;
			for (int j = 0; j < cadena_nueva.length(); j++) {
				if (actual == cadena_nueva.charAt(j)) {
					repetido = true;
				}
			}
			if (repetido == false) {
				cadena_nueva += actual;
			}
		}
		return cadena_nueva;
	}

//	Ejercicio 23
//	cruza_a = true;
//	int indice_a = b.indexOf(b.charAt(i));
//	System.out.println(indice_a);
//	*Necesitamos fijarnos si un caracter de a coincide con un caracter de b
	public static boolean puedenColocarse (String a, String b, String c) {
		boolean flag = true;
		boolean cruza_a = false;
		boolean cruza_c = false;
		for (int i = 0; i < b.length(); i++) { //usamos el for la b como base
			if (cruza_a == false) { // Si entra a este condicional, es porque la "a" no un caracter que conecte con la "b"            
				for (int j = 0; j < a.length(); j++) {
					if (b.charAt(i) == a.charAt(j)) {
						if (b.indexOf(b.charAt(i)) <= maximoIndice(b)) {
							cruza_a = true;
						}						
					}
				}
			}
		}
		for (int i = 0; i < b.length(); i++) { //usamos el for la b como base
			if (cruza_c == false) { // Si entra a este condicional, es porque la a no un caracter que conecte con la b            
				for (int j = 0; j < c.length(); j++) {
					if (b.charAt(i) == c.charAt(j)) {
						if (b.indexOf(b.charAt(i)) > maximoIndice(b)) {
							cruza_c = true;
						}						
					}
				}
			}
		}	
		if (cruza_a == false || cruza_c == false) {
			 flag = false;
		}
		return flag;
	}

	public static int maximoIndice (String b) {
		int indice_maximo = 0;
		if (b.length() >= 3) {
			indice_maximo = b.length() -3; 
		}
		return indice_maximo;
	}

//	Ejercicio 24
	public static boolean esDoblete (String s) {
		for (int i = 0; i <= s.length(); i++) {
            String primeraParte = s.substring(0, i);
            String segundaParte = s.substring(i);
            
            if (esCapicua(primeraParte) && esCapicua(segundaParte)) {
                return true;
            }
        }
        return false;
    }

	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
// 		Ejercicio 16 --------------------------------
//		System.out.println("ingrese una cadena: ");
//		String cadena = scan.nextLine();
//		imprimirReversa(cadena);
//		System.out.println("ingrese una cadena: ");
//		String cadena = scan.nextLine();
//		imprimirReversa(cadena);
//		Ejercicio 17 --------------------------------
//		System.out.println("ingrese una cadena: ");
//		String s = scan.nextLine();
//		System.out.println("ingrese una caracter: ");
//		char c = scan.next().charAt(0);
//		System.out.println(cantidadApariciones(s, c));
//		Ejercicio 18 -------------------------------
//		System.out.println("ingrese una cadena: ");
//		String cadena = scan.nextLine();
//		System.out.println(cantidadVocales(cadena));
//		Ejercicio 19 -------------------------------
//		System.out.println("dame una cadena: ");
//		String s = scan.nextLine();
//		System.out.println(esAbecedario(s));
//		Ejercicio 20 -------------------------------
//		System.out.println("dame una cadena: ");
//		String s = scan.nextLine();
//		System.out.println(esCapicua(s));
//		Ejercicio 21
//		System.out.println("dame una cadena: ");
//		String s = scan.nextLine();
//		System.out.println(esSinRepetidos(s));
//		Ejercicio 22
//		System.out.println("dame una cadena: ");
//		String s = scan.nextLine();
//		System.out.println(sinRepetidos(s));
//		Ejercicio 23
//		System.out.println("dame una cadena: ");
//		String a = scan.nextLine();
//		System.out.println("dame una cadena: ");
//		String b = scan.nextLine();
//		System.out.println("dame una cadena: ");
//		String c = scan.nextLine();
//		System.out.println(puedenColocarse(a, b, c));
//		Ejercicio 24
//		System.out.println("dame una cadena: ");
//		String s = scan.nextLine();
//		System.out.println(esDoblete(s));
		scan.close();
	}
}
