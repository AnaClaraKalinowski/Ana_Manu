package atividades;

import java.util.Scanner;

public class Ex3 {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int numero=sc.nextInt();
		algarismo(numero);
		

	}
	
	public static void algarismo(int numero) {
		for(int i=numero+1;i<=numero+20;i++) {
		System.out.println("Os proximos 20 sao: " + i);
		}
	}

}

