import java.util.Scanner;

public class Retangulo {

	Scanner leitor = new Scanner(System.in);

	double comprimento;
	double largura;
	double area;
	double perimetro;

	double CalcularArea() {
		area = comprimento * largura;
		return area;
	}

	double CalcularPerimetro() {
		perimetro = (2 * comprimento) + (2 * largura);
		return comprimento;
	}

	public void construtor() {
		System.out.println("Informe o comprimento do ret�ngulo: ");
		comprimento = leitor.nextDouble();
		System.out.println("Informe a largura: ");
		largura = leitor.nextDouble();
	}

	public void imprimir() {
		System.out.println("A �rea � de: " + CalcularArea());
		System.out.println("O per�metro � de: " + CalcularPerimetro());
	}

}
