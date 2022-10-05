package exerc7;

public class Pessoa {
	private String nome;
	private float altura;
	private float peso;
	private int idade;
	
	public Pessoa(String nome, float altura, float peso, int idade) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
	}
	
	public String envelhecer() {
		StringBuilder str = new StringBuilder();
		
		idade ++;
		
		if (idade<21) {
			altura += 0.5;
		}
		
		if (idade<120) {
			str.append("Voce envelheceu 1 ano e agora está com ");
			str.append(this.getIdade());
			str.append(" anos");
		}else {
			str.append("Você não resistiu a idade");
		}
		
		return str.toString();
	}
	
	public String engordar(float peso) {
		StringBuilder str = new StringBuilder();
		
		this.peso += peso;
		
		str.append("Voce engordou e agora está com ");
		str.append(this.getPeso());
		str.append("Kg");
		
		return str.toString();
	}
	
	public String emagrecer(float peso) {
		StringBuilder str = new StringBuilder();
		
		this.peso -= peso;
		
		str.append("Voce emagreceu e agora está com ");
		str.append(this.getPeso());
		str.append("Kg");
		
		return str.toString();
	}
	
	public String crescer(float altura) {
		StringBuilder str = new StringBuilder();
		
		this.altura += altura;
		
		str.append("Voce cresceu e agora está com ");
		str.append(this.getAltura());
		str.append("m");
		
		return str.toString();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", idade=");
		builder.append(idade);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
