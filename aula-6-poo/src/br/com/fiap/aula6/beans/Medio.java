package br.com.fiap.aula6.beans;

public class Medio extends Formacao {

	// atributos

	private String tipo;

	// construtor

	public Medio() {

	}

	public Medio(String descricao, int duracao, float mensalidade, short periodo, String tipo) {
		super(descricao, duracao, mensalidade, periodo);
		this.tipo = tipo;
	}

	// gt + st

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// metodos

	@Override
	public void calcularMensalidade(double fator) {

		this.mensalidade = (float) (this.duracao * fator * 100);

	}

	@Override
	public void calcularMensalidade() {

	}

}
