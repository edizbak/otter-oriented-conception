package com.hb.appniou;

public class MumuseTab {

	public static void main(String[] args) {
		int[][] mult = new int[10][10];
		for (int i = 0; i < mult.length ; i++) {
			for (int j = 0; j < mult[i].length ; j++) {
				mult[i][j] = (i +1) * (j + 1);
			}
		}
		for (int k = 0; k < mult.length; k++) {
			for (int k2 = 0; k2 < mult[k].length - 2; k2++) {
				System.out.print(" %d" + mult[k][k2]);
			}
			System.out.println(" " + mult[k][mult[k].length-1]);
		}
	}

}
