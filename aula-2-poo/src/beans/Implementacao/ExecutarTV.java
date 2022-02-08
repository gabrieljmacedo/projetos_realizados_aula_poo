package beans.Implementacao;

import beans.Televisor;

public class ExecutarTV {

	public static void main(String[] args) {
		
		Televisor lg = new Televisor();
		
		lg.ligar();
		
		lg.aumentarVolume();
		lg.aumentarVolume();
		lg.aumentarVolume();
		lg.aumentarVolume();
		lg.aumentarVolume();
		lg.aumentarVolume();
		lg.aumentarVolume();
		lg.aumentarVolume();
		lg.mostrarStatus();
		
		lg.diminuirVolume();		
		lg.mostrarStatus();

	}

}
