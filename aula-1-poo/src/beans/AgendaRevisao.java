package beans;

import java.util.Date;

public class AgendaRevisao {

	public AgendaRevisao() {
	}

	public String cliente;

	public String modeloVeiculo;

	public String veiculo;

	public Date data;

	public Date hora;

	public void agendar() {
		
		System.out.println("Vai executar o agendamento");

	}

	public void cancelar() {
		
		System.out.println("Cliente " + this.cliente + " foi cancelado!");

	}

}