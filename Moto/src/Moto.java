import java.util.Scanner;

public class Moto {

	Scanner leitor = new Scanner(System.in);

	String marca;
	String modelo;
	String cor;
	int marcha;
	int qmarcha;// quantidade de marchas.
	boolean estado;
	String on;

	Moto() {

	}

	Moto(int marchamax) {
		qmarcha = marchamax;
	}

	void inicializar1(int marchamin) {
		marcha = marchamin;

	}

	void inicializar2(int marchamax) {
		marcha = marchamax;
	}

	void MarchaAcima() {
		if ((marcha >= 0) && (marcha < qmarcha)) {
			marcha++;
			System.out.println("Marcha atual: " + marcha);
		} else {
			System.out.println("Marcha máxima alcançada: ");
		}
	}

	void MarchaAbaixo() {
		if (marcha > 0) {
			marcha--;
			System.out.println("Marcha atual: " + marcha);
		} else {
			System.out.println("Marcha mínima alcançada ");
		}

	}
	String estado() {
		if (marcha > 0) {
			estado = true;
			on = "ligado";
		} else {
			estado = false;
			on = "desligado";
		}
		return on;
}
}
