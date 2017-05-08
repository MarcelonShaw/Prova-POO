import java.util.Scanner;

public class Eletrodomestico {

	Scanner leitor = new Scanner(System.in);

	boolean ligado;

	public void ligar() {
		ligado = true;
	}
	
	public void desligar(){
		ligado = false;
	}
	
	public void imprimir(){
		if(ligado)
			System.out.println("O eletrodoméstico está ligado.");
		else
			System.out.println("O eletrodoméstico está desligado.");
			
		
	}

}
