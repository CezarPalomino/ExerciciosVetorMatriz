package br.com.generation.ExerciciosVetorMatriz;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double[][] n1 = new double [4] [6];
		double[][] n2 = new double [4] [6];
		double[][] m1 = new double [4] [6];
		double[][] m2 = new double [4] [6];
	
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				
				//ENTRADA: 
				
				System.out.println("Insira o valor de N1["+i+"]["+j+"]: ");
				n1[i][j] = read.nextDouble();
				System.out.println("Insira o valor de N2["+i+"]["+j+"]: ");
				n2[i][j] = read.nextDouble();
				
				//PROCESSAMENTO:
				
				m1[i][j] = n1[i][j] + n2[i][j];
				m2[i][j] = n1[i][j] - n2[i][j];
			}
			
			}
		//SAÍDA:
		
		System.out.println("Valores de m1: \n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(" "+m1[i][j]);
			}
		}
		
		System.out.println("Valores de m2: \n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(" "+m2[i][j]);
			}
		}
		
		read.close();
	}
}


