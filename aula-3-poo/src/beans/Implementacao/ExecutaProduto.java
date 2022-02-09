package beans.Implementacao;

import java.util.Scanner;

import beans.Produto;

public class ExecutaProduto {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		
		p1.setNome("Notebook 14'");
		p1.setValor(1.000);
		System.out.println(p1.detalhe());
		
		Produto p2 = new Produto("Impressora HP", 100);		
		System.out.println(p2.detalhe());
		System.out.println(p2.getMarca());
		
		Produto p3 = new Produto("Samsung TV", "LG", 500, true);
		System.out.println("p3-" + p3.detalhe());
		
		System.out.println(p3.getMarca());
		
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma marca para p2: ");
		p2.setMarca(leitor.next());
		System.out.println("p2-marca: " + p2.getMarca());
		
		leitor.close();
	}

}
