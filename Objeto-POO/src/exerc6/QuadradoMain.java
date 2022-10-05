package exerc6;

import java.util.Scanner;

public class QuadradoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do lado do quadrado : ");
		float lado = scan.nextInt();
		
		Quadrado q = new Quadrado(lado);
		int op = 0;
		
		do {
			System.out.println("O que fazer com o quadrado?");
			System.out.println("1 - Mudar lado");
			System.out.println("2 - Calcular Área");
			System.out.println("3 - Explodir");
			op = scan.nextInt();
			
			if (op == 1) {
				System.out.print("Digite o novo lado");
				lado = scan.nextFloat();
				q.setLado(lado);
			}else if (op == 2) {
				System.out.println("Área = "+q.calcArea());
			}else if (op == 3) {
				System.out.println("Quadrado Explodido");
			}
		} while (op != 3);
		
		scan.close();

	}

}
