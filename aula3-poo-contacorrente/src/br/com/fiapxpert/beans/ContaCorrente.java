package br.com.fiapxpert.beans;

public class ContaCorrente {

	// atributos
	private String numConta;
	private double saldo;
	private Cliente cliente;
	private double limiteEspecial;
	private String tipo;
	private int agencia;
	private Banco banco;

	// getters e setters
	public String getNumero() {
		return numConta;
	}

	public void setNumero(String numero) {
		this.numConta = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	

	// construtor	

	public ContaCorrente() {

	}
	
	public ContaCorrente(String numConta, double saldo, Cliente cliente, double limiteEspecial, String tipo,
			int agencia, Banco banco) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.cliente = cliente;
		this.limiteEspecial = limiteEspecial;
		this.tipo = tipo;
		this.agencia = agencia;
		this.banco = banco;
	}	

	// metodos	

	public void extrato() {
		System.out.println("Cliente: " + this.cliente.getNome() + " Banco: " + this.banco.getRazao() + " Conta: " + this.numConta + " Limite: " + this.limiteEspecial
				+ " Saldo: " + this.saldo);

	}

	public void saque(double valor) {
		if (valor > this.saldo + this.limiteEspecial) {
			System.out.println("O valor excedeu seu limite!");
		} else {
			this.saldo = this.saldo - valor;
		}

	}

	public void deposito(double valor) {
		this.saldo = this.saldo + valor;

	}

	public void denifinirLimite() {

	}

}
