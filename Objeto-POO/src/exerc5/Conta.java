package exerc5;

public class Conta {
	private float total;
	
	public Conta() {
		
	}
	
	public void adicionar(int id, int quantidade) {
		float totalfunc = 0;
		float preco = 0;
		
		if (id == 100) {
			preco = (float) 1.20;
		}else if (id == 101) {
			preco = (float) 1.30;
		}else if (id == 102) {
			preco = (float) 1.50;
		}else if (id == 103) {
			preco = (float) 1.20;
		}else if (id == 104) {
			preco = (float) 1.30;
		}else if (id == 105) {
			preco = (float) 1;
		}
		
		totalfunc = preco*quantidade;
		
		total = total + totalfunc;
	}
	
	public String cardapio() {
		StringBuilder str = new StringBuilder();
		
		str.append("-----------Cardápio-----------\n");
		str.append("100- Cachorro Quente R$ 1,20 \n");
		str.append("101- Bauru Simples   R$ 1,30 \n");
		str.append("102- Bauru com ovo   R$ 1,50 \n");
		str.append("103- Hambúrguer      R$ 1,20 \n");
		str.append("104- Cheeseburguer   R$ 1,30 \n");
		str.append("105- Refrigerante    R$ 1,00 \n");
		str.append("------------------------------");
		
		return str.toString();
	}
	
	
	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [total=");
		builder.append(total);
		builder.append("]");
		return builder.toString();
	}
	
	
}
