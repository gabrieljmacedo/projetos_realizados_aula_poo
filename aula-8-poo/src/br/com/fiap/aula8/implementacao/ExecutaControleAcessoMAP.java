package br.com.fiap.aula8.implementacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import br.com.fiap.aula8.util.Input;

public class ExecutaControleAcessoMAP {

	public static void main(String[] args) {

		Map<String, Date> controleAcesso = new HashMap<String, Date>();

		DateFormat dataFormato = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");

		String tipo, cracha;

		while (true) {

			tipo = Input.texto("Digite <E>ntrada ou <S>aida");

			if (tipo.equalsIgnoreCase("E")) {
				cracha = Input.texto("Leitor Crachá: ");
				if (!controleAcesso.containsKey(cracha)) {
					Input.mensagem("Bem Vindo! \n\t Acesso Liberado!" + cracha);

					// captura data do sistema

					Date dataSistema = new Date();

					controleAcesso.put(cracha, dataSistema);

				} else {
					Input.mensagem("Entrada já registrada para esse cracha" + cracha + " - Acesso bloqueado!"
							+ dataFormato.format(controleAcesso.get(cracha)));
				}
			}

			System.out.println(controleAcesso.entrySet());

		}

	}
}
