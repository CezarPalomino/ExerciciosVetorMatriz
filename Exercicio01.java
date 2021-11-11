package br.com.generation.ExerciciosVetorMatriz;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double[] notas = new double[5];
		double maiorNota = 0.0;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i+1) + "ª nota: ");
			notas[i] = read.nextDouble();
			
			if(notas[i] >= maiorNota) {
				maiorNota = notas[i];
			}
		}
		System.out.println("A maior nota foi: " + maiorNota);
		read.close();
	}
}
