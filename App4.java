package Exercicios;

public class App4 {

	
public static void main(String[] args) {
		
		Circulo c1= new Circulo(4.5);
		Circulo c2= new Circulo(7);
		Circulo c3= new Circulo(9.6);
		Circulo c4= new Circulo(1.5);
		Circulo c5= new Circulo(3.5);
		
		
		System.out.println("Área do CIRCULO 1:" + c1.calcularArea());
		System.out.println("Área do CIRCULO 2:" + c2.calcularArea());
		System.out.println("Área do CIRCULO 3:" + c3.calcularArea());
		System.out.println("Área do CIRCULO 4:" + c4.calcularArea());
		System.out.println("Área do CIRCULO 5:" + c5.calcularArea());
	}

}
