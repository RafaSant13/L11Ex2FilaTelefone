package view;

import javax.swing.JOptionPane;

import controller.TelefoneControle;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		TelefoneControle t = new TelefoneControle();
		Fila<String> fila = new Fila<>();
		int x = 0;
		while(x!=9) {
			x = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1 - Inserir n�mero\n2 - Consultar n�mero\n9 - Fim"));
			switch (x) {
			case 1: 
				String numero = JOptionPane.showInputDialog("Insira o n�mero: ");
				t.insereLigacoes(fila, numero);
				break;
			case 2:
				t.consultaLigacoes(fila);
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor Inv�lido");
				break;
			}
		}

	}

}
