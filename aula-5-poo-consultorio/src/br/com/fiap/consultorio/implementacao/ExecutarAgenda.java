package br.com.fiap.consultorio.implementacao;

import br.com.fiap.consultorio.beans.Funcionario;
import br.com.fiap.consultorio.beans.Medico;
import br.com.fiap.consultorio.beans.Paciente;
import br.com.fiap.consultorio.beans.Pessoa;

public class ExecutarAgenda {

	public static void main(String[] args) {

		Paciente paciente = new Paciente("Gabriel", "47020450830", "11966940801");
		System.out.println(paciente.getNome());
		paciente.alterar();

		Medico medico = new Medico("Dr. Fernando", "12398765420", "1122589565", "Cardiologista", "101010");		
		System.out.println(medico.getNome() + " : " + medico.getEspecialidade());
		medico.alterar();
		
		
		Funcionario fun = new Funcionario();
		fun.setNome("Funcionário Ana");		
		System.out.println(fun.getNome());
		
		/*Pessoa p = new Pessoa("Marcelo", "123654752", "1122543698");		
		System.err.println(p.getNome());*/
		
		
	}

}
