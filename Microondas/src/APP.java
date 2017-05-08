import java.util.Scanner;

public class APP {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Microondas m = new Microondas();
		
		
		
		m.FecharPorta();
		m.ligar();
		m.desligar();
		m.imprimir();

	}

}
