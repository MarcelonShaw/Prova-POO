import java.util.Scanner;

public class APP {

	public static void main(String[] args) {
		 
		Scanner leitor = new Scanner(System.in);
		Moto moto = new Moto(6);
		

	moto.marca = "Adoleta";
	moto.modelo = "300gh";
	moto.cor = "Azul";
	System.out.println("Marca: " + moto.marca);
	System.out.println("modelo: + " + moto.modelo);
	System.out.println("cor: " + moto.cor);
	
	System.out.println("|||||||||||||||||||||||||||||||||||||||");
	
	System.out.println("Estado: " + moto.estado());
	moto.MarchaAcima();
	System.out.println("Estado: " + moto.estado());
	moto.MarchaAcima();
	moto.MarchaAbaixo();
	moto.MarchaAbaixo();
	moto.MarchaAbaixo();
	System.out.println("Estado: " + moto.estado());
	
	}
}
	
	
		
		

