package br.com.fiap.aula9.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.aula9.excecao.meuControleException;

public class ExecutarMeuControleException {

	public static void main(String[] args) throws meuControleException {

		try {
			int vl01 = Integer.parseInt(JOptionPane.showInputDialog("Valor 01: "));
			int vl02 = Integer.parseInt(JOptionPane.showInputDialog("Valor 02: "));

			JOptionPane.showMessageDialog(null, "Resultado: " + (vl01 + vl02));
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Estamos com indisponibilidade!");
			throw new meuControleException("E-MAIL", e);
			
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Estamos com indisponibilidade!");
			throw new meuControleException("LOG", e);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Estamos com indisponibilidade!");
			//
			// System.out.println("ERRO ");
			throw new meuControleException("ERRO", e); // convocando minha classe para tratamento da exceção

		} finally {
			JOptionPane.showMessageDialog(null, "Processo finalizado!");
		}
	}

}
