package exerc10;

public class BombaCombustivel {
	private float precoLitro;
	private String tipoCombustivel;
	private float quantidadeCombustivel;
	
	public BombaCombustivel(float precoLitro, String tipoCombustivel, float quatidadeCombustivel) {
		this.precoLitro = precoLitro;
		this.tipoCombustivel = tipoCombustivel;
		this.quantidadeCombustivel = quatidadeCombustivel;
	}
	
	public String abastecerPreco(float preco) {
		StringBuilder str  = new StringBuilder();
		
		float litros = (preco / precoLitro) ;
		
		quantidadeCombustivel -= litros;
		
		str.append(litros);
		str.append(" Litros Abastecidos");
		
		return str.toString();
	}
	
	public String abastecerLitro(float litros) {
		StringBuilder str  = new StringBuilder();
		
		float preco = (litros * precoLitro);
		
		quantidadeCombustivel -= litros;
		
		str.append("Total = R$");
		str.append(preco);
		
		return str.toString();
	}
	
	public float getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(float precoLitro) {
		this.precoLitro = precoLitro;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public float getQuatidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuatidadeCombustivel(float quatidadeCombustivel) {
		this.quantidadeCombustivel = quatidadeCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaCombustivel [precoLitro=");
		builder.append(precoLitro);
		builder.append(", tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append(", quatidadeCombustivel=");
		builder.append(quantidadeCombustivel);
		builder.append("]");
		return builder.toString();
	}
	
	
}
