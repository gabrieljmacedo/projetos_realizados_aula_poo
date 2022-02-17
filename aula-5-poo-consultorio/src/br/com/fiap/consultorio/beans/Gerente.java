package br.com.fiap.consultorio.beans;

import java.util.Date;

public class Gerente extends Funcionario{
	
	//atributos
	
	private String depResponsavel;
	
	//construtor
	
	public Gerente(){
		
	}

	public Gerente(String nome, String cpf, String telefone, Date dtadmissao, Date dtdemissao, double salario,
			String depResponsavel) {
		super(nome, cpf, telefone, dtadmissao, dtdemissao, salario);
		this.depResponsavel = depResponsavel;
	}

	//gt + st
	
	public String getDepResponsavel() {
		return depResponsavel;
	}

	public void setDepResponsavel(String depResponsavel) {
		this.depResponsavel = depResponsavel;
	}

		
	//metodos
	
	@Override
	public double calcularparticipacaoLucros() {
		
		return this.salario * 0.6;
		
		//return this.getSalario() * 0.6;
	}	
	

}
