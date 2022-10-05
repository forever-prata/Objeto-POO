package exerc2;

import java.util.Scanner;

public class IntervaloMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int n1 = scan.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		int n2 = scan.nextInt();
		
		if (n1<n2) {
			System.out.println("Ordem invertida");
			
			int aux = n1;
			n1 = n2;
			n2 = aux;
		}
		
		Intervalo i = new Intervalo(n1, n2);
		
		System.out.println(i.calcIntervalo());
		
		
		scan.close();

	}

}
