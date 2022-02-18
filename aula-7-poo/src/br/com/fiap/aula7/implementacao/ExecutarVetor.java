package br.com.fiap.aula7.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.aula7.beans.Aluno;

public class ExecutarVetor {

	public static void main(String[] args) {

		String listaNome[] = { "Ana", "Marcela", "Beatriz" };

		// Apresentar
		System.out.println(listaNome);
		System.out.println("Visualizar 1a posição: " + listaNome[0]);

		listaNome[0] = "Marcus";
		// listaNome[3] = "Ana";

		String[] listaNome2 = new String[10];

		listaNome2[9] = "zZz";

		System.out.println(listaNome.length);
		System.out.println("Visualizar 1a posição: " + listaNome[0]);

		for (int posicao = 0; posicao < 3; posicao++) {
			System.out.println("Indice [" + posicao + "] " + listaNome[posicao]);
		}

		// Pesquisar
		String pesquisa = JOptionPane.showInputDialog("Nome para pesquisa: ");

		for (int posicao = 0; posicao < 3; posicao++) {
			if (listaNome[posicao].equalsIgnoreCase(pesquisa)) {
				System.out.println("Encontrou na posição: " + posicao);
			}
		}

		// Usando objetos

		// Aluno[] listasAlunos = new Aluno[3];

		Aluno[] listaAlunos = new Aluno[3];

		listaAlunos[0] = new Aluno("Ana", 5, 0, 20);
		listaAlunos[1] = new Aluno("Maria", 8, 0, 25);
		listaAlunos[2] = new Aluno("Beatriz", 10, 0, 30);

		// Popula o vetor

		System.out.println(
				"Lista Alunos Visualizar 1a posição: " + listaAlunos[0].getNome() + " / " + listaAlunos[0].toString());

		listaAlunos[0].setFaltas(100);
		listaAlunos[0].setIdade(50);

		System.out.println("Lista Alunos Visualizar 1a posição: " + listaAlunos[0].toString());

		// Pesquisa
		String pesquisaNome = JOptionPane.showInputDialog("Nome para pesquisa: ");

		for (int posicao = 0; posicao < 3; posicao++) {
			if (listaAlunos[posicao].getNome().equalsIgnoreCase(pesquisa)) {
				System.out.println("Encontrou o indice: " + posicao);

			}
		}

	}

}
