package beans;

public class Televisor {

    
    public Televisor() {
    }

    //Atributos
    private Short canal;
   
    private Short volume = 0;
    
    private boolean ligado;
    
    //Getters
	public Short getCanal() {
		return canal;
	}

	public void setCanal(Short canal) {
		this.canal = canal;
	}

	public Short getVolume() {
		return volume;
	}

	public void setVolume(Short volume) {
		if (this.volume > 0 && this.volume < 10) 
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	//Métodos	
	public void ligar() {
		
	}
	
	public void desligar() {
		
	}
	
	public void mostrarStatus() {
		System.out.println("Canal: " + this.canal +
							" / Vol.: " + this.volume +
							" / Ligado: " + this.ligado);
		
	}
	
	public void aumentarVolume() {
		
		if (this.volume < 10) {
		this.volume++;
		} 
		
		System.out.println("Volume++");
	}
	
	public void diminuirVolume() {	
		short volumeAtual = getVolume();		
		short novoVolume = (short) (volumeAtual - 1);
		setVolume(novoVolume);
		
		
		setVolume((short) (getVolume() - 1)); 
				
		System.out.println("Volume--");
	}
    
}