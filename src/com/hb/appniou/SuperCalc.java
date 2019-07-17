package com.hb.appniou;
import java.util.Scanner;

public class SuperCalc {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void table (int a) {
		int[] tab = new int[10];
		System.out.println("Table de multiplication du nombre " + a);
		System.out.println("------------------------------------");
		for (int i = 0; i<10; i++) {
			tab[i] = i + 1;
			System.out.println((i + 1) + " x " + a  + " = " + ((i + 1) * a));
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public static void calc () {
		System.out.println("On calcule quoi ?");
		System.out.println("Nombre 1:");
		double terme1 = scan.nextDouble();
		System.out.println("Opérateur:");
		char op = scan.next("[*|+|-|/]{1}").charAt(0);
		System.out.println("Nombre 2:");
		double terme2 = scan.nextDouble();
		System.out.print("Résultat: ");
		switch (op) {
		
		case '+':
			System.out.println(terme1 + terme2);
			break;
			
		case '-':
			System.out.println(terme1 - terme2);
			break;
			
		case '*':
			System.out.println(terme1 * terme2);
			break;

		case '/':
			if (terme2 == 0)
				throw new IllegalArgumentException("Tu veux casser l'univers Marty ?");
			System.out.println(terme1 / terme2);
			break;
			
		default:
			throw new IllegalArgumentException("Je ne connais pas l'opérateur " + op);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		System.out.println("Super Calculator 1999");
		System.out.println("#######################");
		System.out.println("");
		
		String wat = "";
		while (true) {
			System.out.println(" Que veux-tu faire ?");
			System.out.println(" - table : Table de multiplication");
			System.out.println(" - calc : Calculatrice");
			System.out.println(" - q : Quitter");
			
			wat = scan.next().toLowerCase();
			
			switch (wat) {
			
			case "table":
				System.out.println("Donne moi un nombre:");
				int mult = scan.nextInt();
				table(mult);
				break;
				
			case "calc":
				calc();
				break;
				
			case "q":
				System.out.println("Êtes-vous sûr de vouloir quitter l'application ? O/N");
				char quit = scan.next().toLowerCase().charAt(0);
				if (quit == 'o')
					System.exit(0);
				break;

			default:
				break;
			}
		}
	}

}
