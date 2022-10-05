package exerc1;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	
	public String mensagem() {
		StringBuilder str = new StringBuilder();
		
		str.append("Seu nome completo é: ");
		str.append(nome);
		str.append(" ");
		str.append(sobrenome);
		
		return str.toString();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
