package br.com.fiap.aula8.implementacao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExecutaMAP {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Map<Integer, String> h_map = new HashMap<Integer, String>();

		// adicionar

		h_map.put(10, "Azul");
		h_map.put(01, "Verde");
		h_map.put(20, "Vermelho");

		h_map.put(20, "Preto");

		// listar

		System.out.println(h_map.entrySet());
		System.out.println(h_map.values());
		System.out.println(h_map.keySet());

		for (Entry elemento : h_map.entrySet()) {
			System.out.println("Conteúdo: " + elemento.getKey() + " " + elemento.getValue());
		}

		// procurar elemento

		System.out.println("Tem a chave 20? " + h_map.containsKey(20));
		System.out.println("Tem a cor cinza? " + h_map.containsValue("Cinza"));

		System.out.println("Conteúdo da chave 01: " + h_map.get(01));

		// remover

		System.out.println("Remover a chave 01: " + h_map.remove(01));
		System.out.println(h_map.entrySet());

	}

}
