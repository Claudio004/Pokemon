package it.pokèmon.basics;

import javax.swing.JOptionPane;

/**
 * Game alerts.<br>
 * Extends JOptionPane
 * @version 1.0
 * @author Claudio Togni 4CI
 * @see javax.swing.JOptionPane
 * @see it.pokèmon.basics.Pokèmon
 */
@SuppressWarnings("serial")
public class Alerts extends JOptionPane{

	public Alerts(){
		
	}
	
	public static void non_molto_efficace() {
		showMessageDialog(null, "Questo attacco non è stato molto efficace...", "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void superEfficace() {
		showMessageDialog(null, "Questo attacco è stato superefficace!!", "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void pokemon_ko(Pokèmon p) {
		String message = p.getNome() + " è esausto.";
		showMessageDialog(null, message, "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void invulnerabile() {
		String message = "Questo attacco non ha effetto...";
		showMessageDialog(null, message, "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void lose() {
		showMessageDialog(null, "Hai perso!!", "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void win() {
		showMessageDialog(null, "Hai vinto!!", "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void Assorbacqua() {
		showMessageDialog(null, "Il pokèmon avversario possiede l'abilità Assorbacqua.", "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void Levitazione() {
		showMessageDialog(null, "Il pokèmon avversario possiede l'abilità Levitazione.", "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void Fuocardore() {
		showMessageDialog(null, "Il pokèmon avversario possiede l'abilità Fuocardore.", "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void Assorbivolt() {
		showMessageDialog(null, "Il pokèmon avversario possiede l'abilità Assorbivolt.", "Pokèmon", JOptionPane.INFORMATION_MESSAGE);
	}
}
