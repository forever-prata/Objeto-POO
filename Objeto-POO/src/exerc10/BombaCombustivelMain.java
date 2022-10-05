package exerc10;

public class BombaCombustivelMain {

	public static void main(String[] args) {

		BombaCombustivel b = new BombaCombustivel((float)1.5, "Gasolina Aditivada", 150);
		
		System.out.println(b.abastecerPreco(15));
		
		System.out.println(b.getQuatidadeCombustivel());
		
		System.out.println(b.abastecerLitro(15));
		
		System.out.println(b.getQuatidadeCombustivel());

	}

}
