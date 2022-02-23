package br.com.fiap.aula8.beans;

import java.util.HashSet;
import java.util.Set;

public class ExecutaSET {

	public static void main(String[] args) {
		
		Set <String> h_set = new HashSet<String>(); // declarando
		
		// adicionar
		
		h_set.add("Azul");
		h_set.add("Amarelo");
		h_set.add("Verde");
		
		// DEMONSTRANDO A OPERAÇÃO ADICIONADA
		
		System.out.println(h_set.add("Verde"));
		System.out.println(h_set.add("Amarelo"));
		
		// listar
		
		System.out.println(h_set);
		
		for (String elemento: h_set) {
			System.out.println("Conteúdo: " + elemento);
		}
		
		// tem elemento?
		
		System.out.println("Está vazia? " + h_set.isEmpty());
		
		// procurando elemento 
		
		System.out.println("Tem a cor azul? " + h_set.contains("Azul"));
		System.out.println("Tem a cor azul? " + h_set.contains("Cinza"));
		
		// removendo elemento
		
		h_set.remove("Azul");
		System.out.println(h_set);
		
		// trocando a cor Azul por AZUL
		
		//h_set.contains("Azul");
		h_set.remove("Azul");
		h_set.add("AZUL");
		
		System.out.println(h_set);

		
	}

}
