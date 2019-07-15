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

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int i = 0;
		while (i < 3) {
			System.out.println("Entrez un nombre de votre choix :");
			int test1 = scan1.nextInt();
			int test2 = scan1.nextInt();
			int test = test1 - test2;
			if (test < 0) {
				test = test2 - test1;
			}
			
			String bla = test + " est un nombre ";

			if (test == 0) {
				System.out.println(test + " est nul, et donc pair.");
			}
			else {
				if (test < 0) {
					bla += "négatif "; 
				}
				else {
					bla += "positif ";
				}
				bla += "et il est ";
				if (test % 2 != 0) {
					bla += "impair.";
				}
				else {
					bla += "pair.";
				}
				System.out.println(bla);
			}
			i++;
			//		for (int i = 0; i < 10; i++) {
			//			System.out.println(10 - i);
			//		}
		}
		scan1.close();
	}
}