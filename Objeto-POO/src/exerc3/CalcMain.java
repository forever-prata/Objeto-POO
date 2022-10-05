package exerc3;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int n1 = scan.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		int n2 = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Digite a operação ( + , - , * , / ) : ");
		String operation = scan.nextLine();
		
		Calc c = new Calc(n1, n2, operation);
		
		System.out.println(c.calcular());
		
		
		scan.close();


	}

}
