package beans;

public class ContaCorrente {

	// atributos
	private String numero;
	private double saldo;
	private String cliente;
	private double limiteEspecial;
	private String tipo;

	// getters e setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
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

	// construtor

	public ContaCorrente() {

	}

	public ContaCorrente(String numero, String cliente, double limiteEspecial, String tipo) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.limiteEspecial = limiteEspecial;
		this.tipo = tipo;
	}

	// metodos

	public void extrato() {
		System.out.println("Cliente:" + this.cliente + " Conta: " + this.numero + "Limite: " + this.limiteEspecial
				+ "Saldo: " + this.saldo);

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
