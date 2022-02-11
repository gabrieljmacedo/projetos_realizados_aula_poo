package br.com.fiapxpert.Implementacao;

import br.com.fiapxpert.beans.Banco;
import br.com.fiapxpert.beans.Cliente;
import br.com.fiapxpert.beans.ContaCorrente;
import br.com.fiapxpert.util.Input;

public class ExecutarConta {

	public static void main(String[] args) {
		
		//Dados Fixos
		
		Cliente cliente1 = new Cliente("47020450830","Gabriel","11966940801", null);
		
		Banco santander = new Banco("Santander", 237);
		
		ContaCorrente ccCliente = new ContaCorrente("Corrente", 10000, cliente1, 0, null, 0, santander);
		
		ccCliente.extrato();
		
		//Entrada via tela usando JOptionPane
		
		Cliente cliente2 = new Cliente(Input.texto("47020450831"),
										Input.texto("Gabriel"),
										Input.texto("11966940802"), null);
										
										
		
		Banco banco2 = new Banco(Input.texto("RAzao SOcial")
								Input.inteiro("NumBanco"));

		
		ContaCorrente contaNew = new ContaCorrente(null, 0, cliente2, 0, null, 0, banco2)
				
				
		contaNew.extrato();
		
		
		//corrigir input + estrato
		

	}

}
