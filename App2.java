package Exercicios;

public class App2 {

	public static void main(String[] args) {
		Mercado unidadeDeBlumenau = new Mercado();
		Mercado unidadeDeJoinvile = new Mercado();
		Mercado unidadeDeFlorianopolis = new Mercado();
		
		unidadeDeBlumenau.nome = "Blumenau";
		unidadeDeBlumenau.macasVendidas = 500;
		unidadeDeBlumenau.precoMaca = 4;
		unidadeDeBlumenau.laranjaVendidas = 460;
		unidadeDeBlumenau.precoLaranjas = 3;
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		
		unidadeDeJoinvile.nome = "Joinvile";
		unidadeDeJoinvile.macasVendidas = 320;
		unidadeDeJoinvile.precoMaca = 5;
		unidadeDeJoinvile.laranjaVendidas = 269;
		unidadeDeJoinvile.precoLaranjas = 4;
		
		System.out.println("--------------------------------------------------------------------------------------------------");

		
		unidadeDeFlorianopolis.nome = "Florianopolis";
		unidadeDeFlorianopolis.macasVendidas = 240;
		unidadeDeFlorianopolis.precoMaca = 6;
		unidadeDeFlorianopolis.laranjaVendidas = 196;
		unidadeDeFlorianopolis.precoLaranjas = 5;
		
		System.out.println("--------------------------------------------------------------------------------------------------");

		System.out.println("Quem teve o maior lucro vendendo maçãs?");
		System.out.println("Quem teve o maior lucro vendendo maças?");
		System.out.println("Qual das lojas teve o maior lucro nesse ano específico?");
		System.out.println("Qual das lojas teve o menor lucro?");
		System.out.println("Qual das lojas ficou no 'meio' em termos de lucro?");
		System.out.println("Juntando as 3 lojas, a franquia teve um lucro maior vendendo maças ou laranjas?");		
		
	}
	
}
