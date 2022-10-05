package exerc5;

import java.util.Scanner;

public class ContaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int inputid = 0;
		int inputqtd = 0;
		
		Conta c = new Conta();
		
		do {
			
			System.out.println(c.cardapio());
			
			System.out.print("Digite o id do produto ");
			inputid = scan.nextInt();
			
			if (inputid != 0) {
				System.out.println("Digite a quantidade ");
				inputqtd = scan.nextInt();
				
				c.adicionar(inputid, inputqtd);
			}
		} while (inputid != 0);
		
		System.out.println("Total = "+c.getTotal());
		
		scan.close();

	}

}
