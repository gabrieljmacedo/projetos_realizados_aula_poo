package beans.Implementacao;

import javax.swing.JOptionPane;

import beans.Produto;

public class ExecutarProduto2 {

	public static void main(String[] args) {
		
		Produto impressora = new Produto();
		
		String texto; 
		//detalhada
		texto = JOptionPane.showInputDialog("Marca");
		impressora.setMarca(texto);
		
		texto = JOptionPane.showInputDialog("Descri��o");
		impressora.setNome(texto);
		
		
		System.out.println(impressora.detalhe());
		
		texto = JOptionPane.showInputDialog("Informe o valor");
		impressora.setValor(Double.parseDouble(texto));
		
		int resp = JOptionPane.showConfirmDialog(null, "Promo��o?", "Informe", JOptionPane.YES_NO_OPTION);
		
		if (resp == 0) {
			impressora.setPromocao(true);
		} else {
			impressora.setPromocao(false);
		}
		
		System.out.println(impressora.detalhe());
		
		//usando o construtor
		
		Produto note = new Produto(texto = JOptionPane.showInputDialog("Descri��o"),
				JOptionPane.showInputDialog("Marca"),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o valor")),
				Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Promo��o?")));

		System.out.println("Note - " + note.detalhe());

	}

}
