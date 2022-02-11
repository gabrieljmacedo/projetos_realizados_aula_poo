package br.com.fiapxpert.aula4.beans;

public class Motor {
	
	//atributos
	private int potencia;
	
	private int cilindros;
	
	private String combustivel;
	
	
	//construtor	
	public Motor() {
		
	}
	
	public Motor(int potencia, int cilindros, String combustivel) {
		this.potencia = potencia;
		this.cilindros = cilindros;
		this.combustivel = combustivel;
	}
	
	
	//getters e setters	
	public int getPotencia() {
		return potencia;
	}	

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	
	//metodos	
	public void ligar() {
		System.out.println("Ligou!");
	}
	
	public void desligar() {
		System.out.println("Desligou!");
	}
}
