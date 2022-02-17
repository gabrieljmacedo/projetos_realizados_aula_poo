package br.com.fiap.aula6.beans;

public class Tecnologo extends Formacao {

	// atributos

	private boolean planoEstendido;
	{

	}

	// construtor

	public Tecnologo() {

	}

	public Tecnologo(String descricao, int duracao, float mensalidade, short periodo, boolean planoEstendido) {
		super(descricao, duracao, mensalidade, periodo);
		this.planoEstendido = planoEstendido;
	}

	// gt + st

	// metodos

	@Override
	public void calcularMensalidade(double fator) {

		this.mensalidade = (float) (this.duracao * fator * 200);

	}

	@Override
	public void calcularMensalidade() {
		// TODO Auto-generated method stub

	}

}
