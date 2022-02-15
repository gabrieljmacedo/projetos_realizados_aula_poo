package br.com.fiap.consultorio.beans;

public class Medico extends Pessoa {

	// atributos
	private String especialidade;
	private String crm;

	// construtor
	public Medico() {

	}

	public Medico(String nome, String cpf, String telefone, String especialidade, String crm) {
		super(nome, cpf, telefone);
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
	public void criar() {
		
	}
	
	public void alterar() {
		System.out.println("Alterando da class Medico");
		
	}
	
	public void pesquisar() {
		
	}

}
