package beans.Implementacao;

import beans.ContaCorrente;

public class ExecutarConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.setSaldo(100);
		System.out.println("O saldo é: " + cc.getSaldo());

	}

}
