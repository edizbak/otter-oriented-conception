package com.hb.appniou;
import java.util.Scanner;

public class Blurp {

	private static boolean premier (int a, int i) {
		if (a <= 2)
			return (a == 2)? true: false;
		if (a % i == 0)
				return false;
		if (i * i > a)
			return true;
		
		return premier(a, i+1);
	}
	private static boolean premier (int a) {
		int i = 2;
		if (a <= 2)
			return (a == 2)? true: false;
		if (a % i == 0)
			return false;
		if (i * i > a)
			return true;
		
		return premier(a, i+1);
	}
	
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Entrer un nombre :");
		
		int test = scan1.nextInt();
		System.out.println(premier(test)? test + " est premier": test + " n'est pas premier");

	}

}
