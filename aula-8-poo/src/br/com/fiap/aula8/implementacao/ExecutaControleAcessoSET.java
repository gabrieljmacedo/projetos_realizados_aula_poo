package br.com.fiap.aula8.implementacao;

import java.util.HashSet;
import java.util.Set;

import br.com.fiap.aula8.util.Input;

public class ExecutaControleAcessoSET {

	public static void main(String[] args) {

		Set<String> controleAcesso = new HashSet<String>();
		String cracha, tipo;

		while (true) {

			tipo = Input.texto("Digite <E>ntrada ou <S>aida");

			if (tipo.equalsIgnoreCase("E")) {
				cracha = Input.texto("Leitor Crachá: ");
				if (!controleAcesso.contains(cracha)) {
					Input.mensagem("Bem Vindo! \n\t Acesso Liberado!" + cracha);
					controleAcesso.add(cracha);
				} else {
					Input.mensagem("Entrada já registrada para esse cracha" + cracha + " - Acesso bloqueado!");
				}

				if (tipo.equalsIgnoreCase("S")) {
					cracha = Input.texto("Leitor Crachá: ");
					if ((!controleAcesso.contains(cracha))) {
						Input.mensagem("Entrada NÃO registrada para esse cracha" + cracha + " - Acesso bloqueado para sair!");
					} else {
						Input.mensagem("Obrigado pela visita!" + cracha);
						controleAcesso.remove(cracha);
					}
				}

			}

		}

	}
}
