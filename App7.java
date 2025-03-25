package Exercicios;

public class App7 {

	public static void main(String[] args) {

		ImpostoRenda ir = new ImpostoRenda("Manu", "204.772.805-79", "RJ", 20000);
		ImpostoRenda ir2 = new ImpostoRenda("Ana", "110.420.301-66", "SC", 30000);
		ImpostoRenda ir3 = new ImpostoRenda("Michelle", "119.303.956.58", "SC", 15000);
		ImpostoRenda ir4 = new ImpostoRenda("Júlio", "111.577.203-94", "RS", 17000);
		ImpostoRenda ir5 = new ImpostoRenda("Gabriel", "112.929.305-82", "MS", 10000);
		
		ImpostoRenda vetor[] = { ir, ir2, ir3, ir4, ir5 };
		
		double maiorImposto = Double.MIN_NORMAL;
		double menorImposto = Double.MAX_VALUE;
		String nomeMaiorI = "";
		String nomeMenorI = "";
		
		
	double totalImposto = 0;
	
	for(int i=0; i<vetor.length; i++) {
		
	if(vetor[i].calcularImposto() > maiorImposto) {
		maiorImposto = vetor[i].calcularImposto();
		nomeMaiorI = vetor[i].getNome();
		
	}
	
	if(vetor[i].calcularImposto() < menorImposto) {
		
		menorImposto = vetor[i].calcularImposto();
		nomeMenorI = vetor[i].getNome();
		
	}

	totalImposto += vetor[i].calcularImposto();
	
	}
	
	System.out.println("Quem paga mais imposto: " + nomeMaiorI);
	System.out.println("Quem paga menos imposto: " + nomeMenorI);
	System.out.println("Qual o total de impostos pago entre os 5? " + totalImposto + " reais.");

	}
	
}
	
