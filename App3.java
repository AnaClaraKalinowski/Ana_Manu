package Exercicios;

public class App3 {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		
		p1.nome = "bala";
		p1.descricao = "menta";
		p1.precoUnitario = 0.75;
		p1.desconto = 10;
		
		System.out.println("Produto 1:");
		System.out.println(" A " + p1.nome + " de " + p1.descricao + " esta apenas " + p1.precoUnitario + " centavos, com  desconto de " + p1.desconto + "%.");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		
		Produto p2 = new Produto();
		
		p2.nome = "refrigerante";
		p2.descricao = "coca-cola";
		p2.precoUnitario = 10;
		p2.desconto = 5;
		
		System.out.println("Produto 2:");
		System.out.println(" O " + p2.nome + " é uma " + p2.descricao + " que está custando apenas " + p2.precoUnitario + " reais, e com um desconto de " + p2.desconto + "%.");
		System.out.println("------------------------------------------------------------------------------------------------------------------");

		
		Produto p3 = new Produto();
		
		p3.nome = "pão";
		p3.descricao = "de batata";
		p3.precoUnitario = 7.20;
		p3.desconto = 2;
		
		System.out.println("Produto 3:");
		System.out.println(" O " + p3.nome + " é de " + p3.descricao + " está por " + p3.precoUnitario + " reais, com desconto de " + p3.desconto + "%.");
		System.out.println("------------------------------------------------------------------------------------------------------------------");

		}
	
}
