package br.com.fiapxpert.aula4.implementacao;

import br.com.fiapxpert.aula4.beans.Motor;
import br.com.fiapxpert.aula4.beans.Veiculo;

public class ExecutarVeiculo {

	public static void main(String[] args) {
		
		Veiculo golf = new Veiculo();
		
		Motor motor = new Motor(120,4,"Flex");
		
		golf.setCategoria("Hatch");
		golf.setPlaca("ADC1452");
		golf.setMotor(motor);
		
		
		System.out.println("Dados do veículo: " + golf.getPlaca() + " - " + golf.getMotor());
		System.out.println("Dados do veículo: " + golf.getPlaca() + " - " + golf.getMotor()+ " conteúdo do motor " + golf.getMotor().getCombustivel());
	}

}
