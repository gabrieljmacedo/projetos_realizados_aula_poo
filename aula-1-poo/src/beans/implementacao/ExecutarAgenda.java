package beans.implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import beans.AgendaRevisao;

public class ExecutarAgenda {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		AgendaRevisao agenda1 = new AgendaRevisao();
		
		agenda1.cliente = "Ana Maria";
		agenda1.veiculo = "Carro";
		agenda1.modeloVeiculo = "Gol";
		agenda1.data = formatoData.parse("03/02/2022");
		
		System.out.println("Dados do Agendamento");
		System.out.println("Cliente: " + agenda1.cliente);
		System.out.println("Veículo: " + agenda1.veiculo);
		System.out.println("Data: " + agenda1.data);
		
		agenda1.agendar();
		
		agenda1.cancelar();
		
		//formatoData.format(agenda1.dataAgendamento));

	}

}
