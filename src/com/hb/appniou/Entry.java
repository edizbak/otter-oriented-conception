package com.hb.appniou;
import java.util.Scanner;
public class Entry {

	//	public static void toString(char[] a) {
	//		String c = "";
	//		for (int i = 0; i<a.length; i++) {
	//			c += a[i];
	//		}
	//		System.out.print(c);
	//	}
	private float operons(char a, int b, int c) {
		float z = 0;
		switch (a){
		case '+':
			z = b + c;
			return z;
			
		case '-':
			z = b - c;
			return z;
			
		case '*':
			z = b * c;
			return z;
			
		case '/':
			z = b / c;
			return z;
		
		default :
			return z;
		}
	}

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int i = 0;
		while (i < 3) {
			System.out.println("nombre 1 :");
			int test1 = scan1.nextInt();
			System.out.println("opérateur :");
			String test3 = scan1.next();
			char truc = test3.charAt(test3.length() - 1);
			System.out.println("nombre 2 :");
			int test2 = scan1.nextInt();
		
			switch(truc) {
			case '+':
				System.out.println("Résultat : " + (test1 + test2));
				break;
				
			case '-':
				System.out.println("Résultat : " + (test1 - test2));
				break;
				
			case '*':
				System.out.println("Résultat : " + (test1 * test2));
				break;
				
			case '/':
				if (test2 == 0) {
					throw new IllegalStateException("pas de div par zéro petit malin");
				}
				System.out.println("Résultat : " + (test1 / test2));
				break;
				
			default:
				System.out.println("Me prends pas pour un jambon");
				break;
				
			}
//			int test = test1 - test2;
//			if (test < 0) {
//				test = test2 - test1;
//			}
//			
//			String bla = test + " est un nombre ";
//
//			if (test == 0) {
//				System.out.println(test + " est nul, et donc pair.");
//			}
//			else {
//				if (test < 0) {
//					bla += "négatif "; 
//				}
//				else {
//					bla += "positif ";
//				}
//				bla += "et il est ";
//				if (test % 2 != 0) {
//					bla += "impair.";
//				}
//				else {
//					bla += "pair.";
//				}
//				System.out.println(bla);
//			}
			i++;
			//		for (int i = 0; i < 10; i++) {
			//			System.out.println(10 - i);
			//		}
		}
		scan1.close();
	}
}