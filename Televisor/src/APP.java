import java.util.Scanner;

public class APP {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Televisor tv = new Televisor(10, 10);

		tv.ligar();
		tv.AumentarVolume();
		tv.AumentarVolume();
		tv.SubirCanal();
        tv.imprimir();

	}

}
