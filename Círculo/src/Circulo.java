import java.util.Scanner;

public class Circulo {

	Scanner leitor = new Scanner(System.in);

	double raio;
	double area;
	double perimetro;
	double pi = 3.141516;

	double CalcularArea() {
		area = (pi * raio) * raio;
		return area;
	}

	double CalcularPerimetro() {
		perimetro = (2 * pi) * raio;
		return perimetro;
	}

	public void construtor() {
		System.out.println("Informe o raio do c�rculo: ");
		raio = leitor.nextDouble();
	}
	
	public void imprimir(){
		System.out.println("A �rea do c�rculo � de: " + CalcularArea());
		System.out.println("O perimetro so c�rculo � de: "+ CalcularPerimetro());
	}

}
