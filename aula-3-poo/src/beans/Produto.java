package beans;

public class Produto {
	
	private String nome;
	private String marca;
	private double valor;
	private boolean promocao;
	
	//construtor
	
	public Produto() {
		
	}
	
	
	public Produto(String nome, double valor) {
		
		this.nome = nome;
		this.valor = valor;
	}
	
	public Produto(String nome, double valor, String marca) {
		
		this.nome = nome;
		this.valor = valor;
		this.marca = marca;
	}
	
	
	
	public Produto(String nome, String marca, double valor, boolean promocao) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		this.promocao = promocao;
	}

	//getters + setters gerados na ide
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isPromocao() {
		return promocao;
	}
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
	
	//metodos
	
	//metodo detalhe
	public String detalhe() {

		return "Produto: " + this.nome + " Valor: " + this.valor + " Marca: " + this.marca + " Promoção: "
				+ this.promocao;
	}
	

}
