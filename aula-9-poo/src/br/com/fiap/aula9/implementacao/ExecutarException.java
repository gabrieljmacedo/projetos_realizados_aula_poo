package br.com.fiap.aula9.implementacao;

import java.util.Scanner;

public class ExecutarException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite vl01");
			int vl01 = sc.nextInt();

			System.out.println("Digite vl02");
			int vl02 = sc.nextInt();

			System.out.println("Soma: " + (vl01 + vl02));
		} catch (Exception e) {

			// tratamento da exceção

			System.out.println("Ocorreu ERRO: ");
			System.out.println(e.getClass()); // identificando que erro ocorreu
			System.err.println(e.getMessage()); // verificando se há mensagem adicional de erro
			e.printStackTrace(); // mapeia linha a linha onde ocorreu o erro

		}

		// System.out.println("Fim da rotina!");

		// gerando exceção (chamar um Exception)

		try {

			System.out.println("Digite uma palavra secreta: ");
			String palavraSecreta = sc.next();

			if (!palavraSecreta.equalsIgnoreCase("java")) {
				throw new Exception("Palavra Inválida!");
			}
			System.out.println("Acertou! ;) ");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Passou por Finally");
			System.out.println("Fecha conexão BD / Limpa cache");
		}
		
		sc.close();
	}

}
