package br.com.fiap.aula6.beans.implementacao;

import br.com.fiap.aula6.beans.Medio;
import br.com.fiap.aula6.beans.Tecnologo;

public class ExecutarFormacao {

	public static void main(String[] args) {
		
		Medio m = new Medio("Ensino m�dio", 3, 0f, (short) 1, "Obrigat�rio");
		System.out.println("M�dio Mensalidade: " + m.getMensalidade());
		
		m.calcularMensalidade(5);
		System.out.println("M�dio Mensalidade: " + m.getMensalidade());
		
		Tecnologo t = new Tecnologo("Ensino tecnologo", 2, 0f, (short) 1, true);
		System.out.println("Tecnologo Mensalidade: " + t.getMensalidade());
		
		t.calcularMensalidade(5);
		System.out.println("Tecnologo Mensalidade: " + t.getMensalidade());
		
		System.out.println("Tecnologo: " + t.getDuracao());
		
		

	}

}
