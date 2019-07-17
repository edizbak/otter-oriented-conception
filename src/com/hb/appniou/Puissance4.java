package com.hb.appniou;

import java.util.Scanner;

public class Puissance4 {
	public static Scanner scan = new Scanner(System.in);

	private static class Grille {
		int ligne = 0, col = 0;
		boolean win = false, end = false;
		char[][] grid;

		public Grille(int ligne, int col) {
			this.grid = new char[this.ligne][this.col];
			for (int i = 0; i < this.ligne; i++) {
				for (int j = 0; j < this.col; j++) {
					grid[i][j] = '.';
				}
			}
		}

		public void winLine(char token) {
			int winLigne = 0;
			for (int i = 1; i < this.ligne; i++) {
				for (int j = 1; j < this.col; j++) {
					if (this.grid[i][j] == token) {
						if (this.grid[i][j - 1] == this.grid[i][j]) {
							winLigne++;
							if (winLigne > 3) {
								this.win = true;
								return;
							}
						}
						else
							winLigne = 0;
					}
				}
			}
		}

		public void winCol(char token) {
			int winColonne = 0;
			for (int i = 1; i < this.col; i++) {
				for (int j = 1; j < this.ligne; j++) {
					if (this.grid[j][i] == token && this.grid[j - 1][i] == this.grid[j][i]) {
						winColonne++;
						if (winColonne > 3 ) {
							this.win = true;
							return;
						}
					} else
						winColonne = 0;
				}
			}
		}
		
		public void winDiag1(char token) {
			int winDiag = 0;
			for (int i = 1; i < this.col; i++) {
				for (int j = 1; j < this.ligne; j++) {
					if (this.grid[j][i] == token && this.grid[j - 1][i - 1] == this.grid[j][i]) {
						winDiag++;
						if (winDiag > 3) {
							this.win = true;
							return;
						}
					} else
						winDiag = 0;
				}
			}
		}

		public boolean placeToken(int colonne, boolean player) {
			for (int i = this.ligne - 1; i >= 0; i--) {
				if (this.grid[i][colonne] == '.') {
					this.grid[i][colonne] = player == false ? 'O' : 'X';
					return true;
				} else
					continue;
			}
			return false;
		}

		public void end() {
			int compteur = 0;
			for (int i = 0; i < this.ligne; i++) {
				for (int j = 0; j < this.col; j++) {
					if (this.grid[i][j] == '.') {
						compteur++;
					}
				}
			}
			if (compteur == 0)
				this.end = true;
		}

		public static String toString() {

		}
	}

	public static void main(String[] args) {

	}

}
