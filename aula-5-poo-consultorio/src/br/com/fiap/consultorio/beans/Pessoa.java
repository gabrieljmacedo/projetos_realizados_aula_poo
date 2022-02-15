package br.com.fiap.consultorio.beans;

import br.com.fiap.consultorio.interfaces.crud;

public abstract class Pessoa implements crud{

	// atributos
	private String nome;
	private String cpf;
	private String telefone;

	// contrutor
	public Pessoa() {

	}

	public Pessoa(String nome, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	// gt + st
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// metodos
	/*
	public void incluir() {
		System.out.println("Incluindo");
	}
	
	public void alterar() {
		System.out.println("Alterando da class Pessoa");
	}
	
	public void consultar() {
		System.out.println("Consultando");
	}*/
	

}
