package it.pokèmon.basics;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class GameUI extends JFrame{
	private Pokèmon p;
	private Pokèmon p2;
	
	public GameUI(Pokèmon p, Pokèmon p2){
		this.p = p;
		this.p2 = p2;
		setFrameProperties();
	}
	
	private void setFrameProperties() {
		this.setSize(300, 300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Pokèmon Fight Simulator");
		this.setLocationRelativeTo(null);
		this.add(new GameUIpanel(this.p, this.p2, this));
		this.setVisible(true);
	}
}
