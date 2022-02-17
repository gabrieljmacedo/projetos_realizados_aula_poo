package br.com.fiap.consultorio.beans;

import java.util.Date;

public class Medico extends Funcionario{

	// atributos
	
	private String especialidade;
	private String crm;
	

	// construtor
	
	public Medico() {

	}

	public Medico(String nome, String cpf, String telefone, Date dtadmissao, Date dtdemissao, double salario,
			String especialidade, String crm) {
		super(nome, cpf, telefone, dtadmissao, dtdemissao, salario);
		this.especialidade = especialidade;
		this.crm = crm;
	}


	// gt + st
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	
	//metodos		
	
	@Override //puxo o metodo mas mudo a logica
	public double calcularparticipacaoLucros() {
		
		return this.salario * 0.6;
		//get salario caso não use o modificador protected
		//return this.getSalario() * 0.6;
	}
	
}
