package beans.implementacao;

import java.util.Scanner;

import beans.Livro;

public class ExecutaLivro {

	public static void main(String[] args) {
		
		System.out.println("Iniciando!");
		System.out.println("");
		
		Livro objetoLivro = new Livro();
		
		objetoLivro.titulo = "Aprendendo UML";
		objetoLivro.editora = "EditoraBook";
		objetoLivro.autor = "Gabriel";
		objetoLivro.numPagina = 250;
		objetoLivro.preco = 150.00;
		
		System.out.println("Dados do Livro");
		System.out.println("Título: " + objetoLivro.titulo);
		System.out.println("Preço: " + objetoLivro.preco);
		System.out.println("");
		
		Livro objetoLivro2 = new Livro();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um título: ");
		objetoLivro2.titulo = leitor.nextLine();
		System.out.println("Digite um autor: ");
		objetoLivro2.autor = leitor.nextLine();
		
		System.out.println("Dados do Livro 2");
		System.out.println("Título: " + objetoLivro2.titulo);
		System.out.println("Autor: " + objetoLivro2.autor);
		
		
		leitor.close();
	}

}
