package br.com.fiapxpert.beans;

public class Banco {

	// atributos
	private String razao;

	private int idBancario;

	// construtor
	public Banco() {

	}	

	public Banco(String razao, int idBancario) {
		super();
		this.razao = razao;
		this.idBancario = idBancario;
	}



	// getters + setters
	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public int getIdBancario() {
		return idBancario;
	}

	public void setIdBancario(int idBancario) {
		this.idBancario = idBancario;
	}

	// metodos

}