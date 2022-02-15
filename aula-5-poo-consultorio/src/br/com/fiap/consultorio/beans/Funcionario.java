package br.com.fiap.consultorio.beans;

import java.util.Date;

public class Funcionario extends Pessoa {

	// atributos
	private Date dtadmissao;
	private Date dtdemissao;
	private double salario;

	// contrutor
	public Funcionario() {

	}

	public Funcionario(String nome, String cpf, String telefone, Date dtadmissao, Date dtdemissao, double salario) {
		super(nome, cpf, telefone);
		this.dtadmissao = dtadmissao;
		this.dtdemissao = dtdemissao;
		this.salario = salario;
	}

	// gt + st
	public Date getDtadmissao() {
		return dtadmissao;
	}

	public void setDtadmissao(Date dtadmissao) {
		this.dtadmissao = dtadmissao;
	}

	public Date getDtdemissao() {
		return dtdemissao;
	}

	public void setDtdemissao(Date dtdemissao) {
		this.dtdemissao = dtdemissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//metodos
	public void incluir() {
		System.out.println("Adicionando");
	}
	
	public void salvar() {
		System.out.println("Alterando");
	}
	
	public void pesquisar() {
		System.out.println("Consultando");
	}
	
	public void demitir() {
		System.out.println("Demitindo");
	}

}
