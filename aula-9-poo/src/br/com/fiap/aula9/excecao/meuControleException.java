package br.com.fiap.aula9.excecao;

public class meuControleException extends Exception {

	private static final long serialVersionUID = 1L;

	// atributos

	private String smtpServer = "smtp://www.suporte.com.br";
	private String smtpPorta = "22";

	// construtor

	public meuControleException(String message, Exception ex) {
		super(message, ex);

		if (message.equalsIgnoreCase("email"));
		EnviarEmail();
		if (message.equalsIgnoreCase("log"));
		logBanco();

		print();

	}

	public void EnviarEmail() {
		System.out.println("Abrindo conexão de e-mail: ");
		System.out.println("E-mail Suporte: suporte@suporte.com.br");

		System.out.println("---------- DETALHE ----------");
		System.out.println(getMessage());
	}

	public void logBanco() {
		System.out.println("Abrindo conexão BD ");
		System.out.println("---------- GRAVANDO DETALHE ----------");
		System.out.println(getMessage());
		printStackTrace();

	}

	public void print() {
		System.out.println("---------- MEU ERRO ----------");
		System.out.println(getMessage());

	}

}
