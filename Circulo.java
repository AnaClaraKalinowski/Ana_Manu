package Exercicios;

public class Circulo {
		
		double raio;
		
		
		public Circulo(double raio) {
			super();
			this.raio = raio;
		}


		public double calcularArea(){
			return raio*raio*Math.PI;

	}

}
