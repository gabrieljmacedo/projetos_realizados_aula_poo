package br.com.fiap.consultorio.implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import br.com.fiap.consultorio.beans.Funcionario;
import br.com.fiap.consultorio.beans.Gerente;
import br.com.fiap.consultorio.beans.Medico;
import br.com.fiap.consultorio.beans.Paciente;

public class ExecutarAgenda {

	public static void main(String[] args)  throws ParseException {
		
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
		Paciente paciente = new Paciente("Gabriel", "123654", "113333");
				
		Funcionario funcionario = new Funcionario("Marcelo", "332255", "11555444", formatoData.parse("03/02/2021"), null, 5000);
		
		Medico medico = new Medico("Dr. Lucas", "365241", "11554477", formatoData.parse("02/07/2021"), null, 9000, "Cardiologista", "55224");
		
		Gerente gerente = new Gerente("Marcio", "556633", "11552245", formatoData.parse("28/01/2021"), null, 8000, "TI");
		
		JOptionPane.showMessageDialog(null, "Medico: " +  medico.getNome() + " Salario: " + medico.getSalario() + " Participacao: " + medico.calcularparticipacaoLucros());
		JOptionPane.showMessageDialog(null, "Funcionario: " +  funcionario.getNome() + " Salario: " + funcionario.getSalario() + " Participacao: " + funcionario.calcularparticipacaoLucros());
		JOptionPane.showMessageDialog(null, "Gerente: " +  gerente.getNome() + " Salario: " + gerente.getSalario() + " Participacao: " + gerente.calcularparticipacaoLucros());
		
		
	}

}
