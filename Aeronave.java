package Exercicios;

public class Aeronave {

		String modelo;
		int passageiros;
		int velocidade;
		double capComb;
		double queimaComb;
		
		public Aeronave(String modelo, int passageiros, int velocidade, double capComb, double queimaComb) {
			super();
			this.modelo = modelo;
			this.passageiros = passageiros;
			this.velocidade = velocidade;
			this.capComb = capComb;
			this.queimaComb = queimaComb;
		}
		
		public double calcularGastoC(){
			return capComb/queimaComb;
		}
		public double calcLong(){
			return calcularGastoC()*velocidade;
		}

}
