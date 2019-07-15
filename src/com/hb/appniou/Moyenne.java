package com.hb.appniou;

import java.util.Scanner;

public class Moyenne {

	private static double mid(double[] a) { // calcule la moyenne des nombres dans un tableau
		double tot = 0;
		for (int i = 0; i < a.length; i++) {
			tot += a[i];
		}
		return tot / a.length;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Combien de nombres ?");
		int taille = scan.nextInt();
		double[] tab = new double[taille];
		double entrees = 0;
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Prochain nombre ?");
			entrees = scan.nextDouble();
			tab[i] = entrees;
		}

		System.out.println("La moyenne des nombres entrés est : " + mid(tab));
	}

}
