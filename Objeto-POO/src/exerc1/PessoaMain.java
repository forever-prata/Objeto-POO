package exerc1;

import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = scan.nextLine();
		
		System.out.print("Digite o sobrenome: ");
		String sobrenome = scan.nextLine();
		
		Pessoa p = new Pessoa(nome, sobrenome);
		
		System.out.println(p.mensagem());
		
		
		scan.close();
	}

}
