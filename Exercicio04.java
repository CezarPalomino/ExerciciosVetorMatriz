package br.com.generation.ExerciciosVetorMatriz;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int[][] m1 = new int[3][3];
		int soma = 0, somaDiag = 0;

				for(int l = 0; l < 3; l++){
					for(int c = 0; c < 3; c++){
						System.out.println("Digite um valor para a Matriz: ");
						m1[l][c] = read.nextInt();

						soma = m1[0][0] + m1[0][1] + m1[0][2] +
							   m1[1][0] + m1[1][1] + m1[1][2] +
							   m1[2][0] + m1[2][1] + m1[2][2];

						somaDiag = m1[0][0] + m1[1][1] + m1[2][2];
					}
				}
						System.out.println("A soma dos valores da Matriz é: " + soma);
						System.out.println("\nA soma dos valores da Diagonal Principal da Matriz é: " + somaDiag);
						
						read.close();
	}
}
