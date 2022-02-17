package br.com.fiap.aula6.beans;

import br.com.fiap.aula6.beans.interfaces.persistencia;

abstract class Formacao implements persistencia {

	// atributos

	protected String descricao;
	protected int duracao;
	protected float mensalidade;
	protected short periodo;

	// construtor

	public Formacao() {

	}

	public Formacao(String descricao, int duracao, float mensalidade, short periodo) {
		super();
		this.descricao = descricao;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
		this.periodo = periodo;
	}

	// gt + st

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public short getPeriodo() {
		return periodo;
	}

	public void setPeriodo(short periodo) {
		this.periodo = periodo;
	}

	// metodos

	public float retornarMedia(float ps1, float ps2) {

		return (ps1 + ps2) / 2;

	}

	public float retornarMedia(float ps1, float ps2, float nac1, float nac2) {

		return ((ps1 + ps2) / 2) + ((nac1 + nac2) / 2) * 0.5f;

	}

	public float retornarMedia(float ps1, float ps2, float nac1, float nac2, float am1, float am2) {

		return (ps1 + ps2 + nac1 + nac2 + am1 + am2) / 6;

	}

	public void definirDuracao() {

	}

	public void calcularMensalidade(double fator) {

	}

}
