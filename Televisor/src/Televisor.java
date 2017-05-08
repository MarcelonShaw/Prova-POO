import java.util.Scanner;

public class Televisor {

	Scanner leitor = new Scanner(System.in);

	int canal = 1;
	int volume = 0;
	boolean ligado;
	int numcanais;
	int volmax;

	public Televisor(int numeroscanais, int volumemaximo) {
		numcanais = numeroscanais;
		volmax = volumemaximo;

	}

	public void ligar() {
		ligado = true;

	}

	public void desligar() {
		ligado = false;
	}

	public void AumentarVolume() {
		if (ligado)
			if (volume < volmax)
				volume++;
	}

	public void DiminuirVolume() {
		if (ligado)
			if (volume > 0)
				volume--;
	}

	public void SubirCanal() {
		if (ligado)
			if (canal < numcanais)
				canal++;

	}

	public void DescerCanal() {
		if (ligado)
			if (canal > 0)
				canal--;
	}

	public void imprimir() {
		if (ligado) {
			System.out.println("Televisor ligado.");
			System.out.println("Canal: " + canal);
			System.out.println("Volume: " + volume);
		} else {
			System.out.println("Televisor desligado.");
		}
	}

}
