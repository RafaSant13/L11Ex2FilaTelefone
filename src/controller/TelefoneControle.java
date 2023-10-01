package controller;

import model.Fila;

public class TelefoneControle {

	public TelefoneControle() {
		super();
	}
	
	public void insereLigacoes(Fila<String> fila, String numero) {
		fila.insert(numero);
	}
	
	public void consultaLigacoes(Fila<String> fila) {
		try {
			String numero = fila.remove();
			System.out.println(numero);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	

}
