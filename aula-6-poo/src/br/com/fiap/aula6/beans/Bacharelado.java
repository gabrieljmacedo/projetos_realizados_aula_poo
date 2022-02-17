package br.com.fiap.aula6.beans;

public class Bacharelado extends Formacao {

	// atributos

	private short cargaHorariaEstagio;
	private String projetoConclusao;

	// construtor

	public Bacharelado() {

	}

	public Bacharelado(short cargaHorariaEstagio, String projetoConclusao) {
		super();
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		this.projetoConclusao = projetoConclusao;
	}

	// gt + st

	public short getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(short cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	// metodos

	@Override
	public void calcularMensalidade() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calcularMensalidade(double fator) {
		// TODO Auto-generated method stub
		this.mensalidade = (float) (this.duracao * fator * 200) + (this.cargaHorariaEstagio * 12);
	}

}
