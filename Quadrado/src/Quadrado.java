import java.util.Scanner;

public class Quadrado {

	Scanner leitor = new Scanner(System.in);

	double lado;
	double area;
	double perimetro;

	double CalcularArea() {

		area = lado * lado;
		return area;
	}

	double CalcularPerimetro() {

		perimetro = 4 * lado;
		return perimetro;
	}

	public void Construtor() {
		System.out.println("Informe o lado: " + lado);
		lado = leitor.nextDouble();
	}

	public void Imprimir(){
		System.out.println("A �rea do quadrado � de: " + CalcularArea());
		System.out.println("O per�metro do quadrado � de: " + CalcularPerimetro());
}
}
