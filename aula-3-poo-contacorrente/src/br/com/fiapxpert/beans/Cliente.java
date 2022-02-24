package br.com.fiapxpert.beans;

public class Cliente {

	// atributos
	private String cpf;

	private String nome;

	private String telefone;

	private Banco agencia;

	// construtor

	public Cliente() {

	}

	public Cliente(String cpf, String nome, String telefone, Banco agencia) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.agencia = agencia;
	}

	// getters + setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Banco getAgencia() {
		return agencia;
	}

	public void setAgencia(Banco agencia) {
		this.agencia = agencia;
	}

	// metodos
	public void saque(double valor) {

	}

	public void deposito(double valor) {

	}

	public void extrato() {

	}

}