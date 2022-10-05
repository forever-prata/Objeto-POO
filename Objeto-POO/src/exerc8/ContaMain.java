package exerc8;

public class ContaMain {

	public static void main(String[] args) {
		Conta c = new Conta(0,"A",50);
	
		c.sacar(1);
		
		System.out.println(c.getSaldo());

	}

}
