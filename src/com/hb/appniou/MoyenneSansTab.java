package com.hb.appniou;

import java.util.Scanner;

public class MoyenneSansTab {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double entree = -1 ;
		int compteur = 0;
		double moy = 0;
		while (entree != 0) {
			System.out.println("prochaine valeur ? 0 pour quitter");
			entree = scan.nextDouble();
			moy += entree;
			if (entree !=0)
				compteur++;
		}
		System.out.println("La moyenne des valeurs entrées est : " + (moy / compteur));
	}

}
