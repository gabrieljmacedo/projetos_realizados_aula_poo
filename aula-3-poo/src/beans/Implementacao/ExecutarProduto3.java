package beans.Implementacao;

import beans.Input;
import beans.Produto;

public class ExecutarProduto3 {

	public static void main(String[] args) {
		
		//Input ler = new Input();
		
		Produto p1 = new Produto();
		
		p1.setMarca(Input.texto("Informe a Marca"));
		p1.setNome(Input.texto("Informe o nome/descri��o"));
		p1.setValor(Input.decimal("Informe o Valor"));
		p1.setPromocao(Input.logico("Est� em promo��o?"));
		
		System.out.println(p1.detalhe());

	}

}
