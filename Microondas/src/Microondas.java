import java.util.Scanner;

public class Microondas {

	Scanner leitor = new Scanner(System.in);

	boolean ligado;
	boolean portaFechada;

	public void ligar() {
		if (portaFechada)
			ligado = true;
		else
			System.out.println("Feche a porta!");

	}

	public void desligar() {
		ligado = false;
	}

	public void FecharPorta() {
		portaFechada = true;
	}

	public void AbrirPorta() {
		portaFechada = false;
	}

	public void imprimir(){
		if(ligado)
			System.out.println("Microondas ligado.");
		else
			System.out.println("Microondas desligado.");
			
	}

}
