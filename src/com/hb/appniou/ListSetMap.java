package com.hb.appniou;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSetMap {

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

	public static void main(String[] args) {

		String produits[] = { "Tomate", "Salade", "Oignon", "Orange", "Banane" };
		ArrayList<String> monPanier = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		String input = "";
		System.out.println("-= Supermarché fantastique =-\n");

		while (!input.equalsIgnoreCase("q")) {
			System.out.println("Nombre d'éléments dans le panier : " + monPanier.size());
			System.out.println("Que voulez-vous faire ?");
			System.out.println("Ajouter des éléments au panier (c)");
			System.out.println("Consulter votre panier (l)");
			System.out.println("Supprimer un élément du panier (s)");
			System.out.println("Vider votre panier (d)");
			System.out.println("Quitter (q)");

			input = scan.next();
			if (input.equalsIgnoreCase("c")) {
				System.out.println("Que voulez-vous acheter ?");
				System.out.println(ListSetMap.toString(produits));
				int index = scan.nextInt();
				monPanier.add(produits[index]);
			}
			if (input.equalsIgnoreCase("l")) {
				System.out.println(ListSetMap.toString(monPanier));
			}
			if (input.equalsIgnoreCase("d")) {
				monPanier.clear();
			}
			if (input.equalsIgnoreCase("s")) {
				System.out.println("Que voulez-vous supprimer ?");
				System.out.println(ListSetMap.toString(monPanier));
				int index = scan.nextInt();
				monPanier.remove(index);
			}
		}
	}
}
