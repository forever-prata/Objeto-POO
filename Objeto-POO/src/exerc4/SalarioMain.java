package exerc4;

import java.util.Scanner;

public class SalarioMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite quanto ganha por hora: ");
		float valor = scan.nextInt();
		
		System.out.print("Digite quantas horas foram trabalhadas: ");
		int hora = scan.nextInt();
		
		Salario s = new Salario(hora, valor);
		
		System.out.println(s.mostrar());
		
		
		scan.close();

	}

}
