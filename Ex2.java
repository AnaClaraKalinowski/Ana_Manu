package atividades;

import java.util.Scanner;

public class Ex2 {

		public static void main(String[] args) {
			
			 Scanner sc= new Scanner(System.in);
			 
			 System.out.println("Informe seu nome: ");
			 String nome=sc.nextLine();
			 
			 if(nome.equals("Ana")) {
				Ana();
			 }
			 else if(nome.equals("Manu")) {
				 Manu();
			 }
			 
		}
		public static void Ana() {
			System.out.println("O nome dela é: Ana");
			System.out.println("A idade dela é: 17");
			System.out.println("Ela é estudante do SENAI");
		}
		public static void Manu() {
			System.out.println("O nome dela é: Manu");
			System.out.println("A idade dela é: 17");
			System.out.println("Ela é estudante do SENAI");

	}

}
