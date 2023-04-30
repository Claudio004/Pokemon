package it.pokèmon.basics;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Alerts extends JOptionPane{

	Alerts(){
		
	}
	
	@SuppressWarnings("static-access")
	public void non_molto_efficace() {
		this.showMessageDialog(null, "Questo attacco non è stato molto efficace...", "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@SuppressWarnings("static-access")
	public void superEfficace() {
		this.showMessageDialog(null, "Questo attacco è stato superefficace!!", "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@SuppressWarnings("static-access")
	public void pokemon_ko(Pokèmon p) {
		String message = p.getNome() + " è esausto.";
		this.showMessageDialog(null, message, "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@SuppressWarnings("static-access")
	public void invulnerabile(Pokèmon p) {
		String message = "Questo attacco non ha effetto su " + p.getNome() + "...";
		this.showMessageDialog(null, message, "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void lose() {
		showMessageDialog(null, "Hai perso!!", "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void win() {
		showMessageDialog(null, "Hai vinto!!", "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
}
