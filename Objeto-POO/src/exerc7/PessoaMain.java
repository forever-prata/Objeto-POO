package exerc7;

import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o nome ");
		String nome = scan.nextLine();
		
		System.out.print("Digite a altura ");
		Float altura = scan.nextFloat();
		
		System.out.print("Digite o peso ");
		Float peso = scan.nextFloat();
		
		System.out.print("Digite a idade ");
		int idade = scan.nextInt();
		
		Pessoa p = new Pessoa(nome, altura, peso, idade);
		
		System.out.println(p.toString());
		
		scan.close();
	}

}
