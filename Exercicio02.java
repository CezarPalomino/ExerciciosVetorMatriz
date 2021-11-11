package br.com.generation.ExerciciosVetorMatriz;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int[] resultadoLancamento = new int[10];
		int lancamentosTotais = 0;
		double media = 0;
		double soma = 0;
		
		for(int i = 0; i < resultadoLancamento.length; i++) {
			System.out.println("Digite o resultado do " + (i+1) + "º lançamento: ");
			resultadoLancamento[i] = read.nextInt();
			lancamentosTotais++;
			
			soma += resultadoLancamento[i];
			media = soma / lancamentosTotais;
		}
		System.out.println("Os resultados foram: " + media);
		
		read.close();
	}

}
