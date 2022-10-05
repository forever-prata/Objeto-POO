package exerc8;

public class Conta {
	private int nconta;
	private String nome;
	private float saldo;
	
	
	
	public Conta(int nconta, String nome, float saldo) {
		this.nconta = nconta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public void deposito(float qtd) {
		setSaldo(saldo+qtd);
	}
	
	public void sacar(float qtd) {
		if (qtd <= saldo) {
			setSaldo(saldo-qtd);
		}
	}
	
	public int getNconta() {
		return nconta;
	}

	public void setNconta(int nconta) {
		this.nconta = nconta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [nconta=");
		builder.append(nconta);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
