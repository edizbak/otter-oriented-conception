package com.hb.appniou;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;

public class HashSetExample {

	public static String toString(String[] tab) {
		String res = "";
		for (int i = 0; i < tab.length; i++) {
			res = res + i + " : " + tab[i] + "\n";
		}
		return res;
	}
	
	public static String toString(ArrayList tab) {
		String res = "";
		for (int i = 0; i < tab.size(); i++) {
			res += i + " : " + tab.get(i) + "\n";
		}
		return res;
	}
	
	public static String toString(HashSet<String> tab) {
		String res = "";
		int j = 0;
		for (String i : tab) {
			res += j++ + " : " + i + "\n";
		}
		return res;
	}

	public static void main(String[] args) {

		String produits[] = { "Aileron", "Jantes Alu", "Carbu Vario", "Pot Ninja", "Volant Cuir" };
		ArrayList<String> monPanier = new ArrayList<String>();
		for (int i = 0; i < produits.length; i++) {
			monPanier.add(produits[i]);
		}
		HashSet<String> maBx = new HashSet<String>();
		Scanner scan = new Scanner(System.in);
		String input = "";
		System.out.println("-= Ma BX a des ailes =-");

		while (!input.equalsIgnoreCase("q")) {
			System.out.println("Nombre d'options sélectionnées : " + maBx.size());
			System.out.println("Que voulez-vous faire ?");
			System.out.println("Ajouter une option à ma BX (c)");
			System.out.println("Consulter les options choisies (l)");
			System.out.println("Supprimer une option (s)");
			System.out.println("Remettre les options à zéro (d)");
			System.out.println("Quitter (q)");

			input = scan.next();
			if (input.equalsIgnoreCase("c")) {
				System.out.println("Que voulez-vous acheter ?");
				String res = "";
				for (int i = 0; i < monPanier.size(); i++) {
					if (!maBx.contains(monPanier.get(i)))
							res += i + " : " + monPanier.get(i) + "\n";
				}
				System.out.println(res);
				int index = scan.nextInt();
				maBx.add(produits[index]);
			}
			if (input.equalsIgnoreCase("l")) {
				System.out.println(HashSetExample.toString(maBx));
			}
			if (input.equalsIgnoreCase("d")) {
				maBx.clear();
			}
			if (input.equalsIgnoreCase("s")) {
				System.out.println("Que voulez-vous supprimer ?");
				System.out.println(HashSetExample.toString(monPanier));
				int index = scan.nextInt();
				monPanier.remove(index);
			}
		}
	}
}
