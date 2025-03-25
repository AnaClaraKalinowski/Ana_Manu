package atividades;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] numeros = {-9,-3,0,1,2,3,4,5};
		
		maiorValor(numeros);
		menorValor(numeros);
		mediaValor(numeros);


	}
		public static void maiorValor(int numeros[]) {
			int maior=Integer.MIN_VALUE;
			for (int num : numeros) {
				if (num > maior) {
					maior = num;
				}
			}
				System.out.println("Maior valor: "+ maior);
			
		}
		public static void menorValor(int numeros[]) {
			int menor= Integer.MAX_VALUE;
			for(int num: numeros) {
				if(num < menor) {
					menor=num;
				}
			}
			System.out.println("Menor numero: " + menor);
		}
		public static void mediaValor(int numeros[]) {
			double soma=0;
			for(int num : numeros) {
				soma+=num;
			}
			double media = (double)soma / numeros.length;
			System.out.println("Media dos numero: " + media);
			
		}

}


