package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {
	private String rg;
	private String tempoDireção;
	private String titulação;

	private String login;
	private String senha;

	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public Diretor() {

	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTempoDireção() {
		return tempoDireção;
	}

	public void setTempoDireção(String tempoDireção) {
		this.tempoDireção = tempoDireção;
	}

	public String getTitulação() {
		return titulação;
	}

	public void setTitulação(String titulação) {
		this.titulação = titulação;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {

		return login.equals("Vinicius") && senha.equals("123");
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
