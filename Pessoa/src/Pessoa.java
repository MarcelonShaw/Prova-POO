import java.util.Scanner;

public class Pessoa {

	Scanner leitor = new Scanner(System.in);

	String nome;
	String endereco;
	String telefone;

	public void imprimir(){
		System.out.println("Nome: " + nome);
		System.out.println("Endere�o: " + endereco);
		System.out.println("Telefone: " + telefone);
	}
	
		
		
	public void construtor(){
		System.out.println("Informe seu nome: ");
		nome = leitor.next();
		System.out.println("Informe seu endere�o sem usar espa�o: ");
		endereco = leitor.next();
		System.out.println("Informe seu telefone: ");
		telefone = leitor.next();
		}
		
	}


