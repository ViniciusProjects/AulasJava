package cursojava.classes;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String DataNascimento;
	protected String NumeroCpf;
	protected String NomePai;
	protected String nomeMae;
	
	public abstract double salario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNumeroCpf() {
		return NumeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		NumeroCpf = numeroCpf;
	}

	public String getNomePai() {
		return NomePai;
	}

	public void setNomePai(String nomePai) {
		NomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}

}
