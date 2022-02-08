package beans.Implementacao;

import beans.Pessoa;

public class ExecutarPessoa {

	public static void main(String args[]) {
		
		System.out.println("Funcionando!");
		
		Pessoa cliente1 = new Pessoa();
		
		//cliente1.nome = "Gabriel";
		//cliente1.idade = 18;
		cliente1.setNome("Gabriel");
		cliente1.setIdade(24);
		System.out.println("Cliente: " + cliente1.getNome());
		System.out.println("Idade: " + cliente1.getIdade());
		
		
		//cliente1.comer("McNificon");
		//cliente1.dormir(5);
		
		//System.out.println("Cliente: " );
		

	}
}
