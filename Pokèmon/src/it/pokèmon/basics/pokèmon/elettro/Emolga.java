package it.pokèmon.basics.pokèmon.elettro;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Inseguimento;
import it.pokèmon.basics.Moves.coleottero.Retromarcia;
import it.pokèmon.basics.Moves.elettro.Scintilla;
import it.pokèmon.basics.Moves.volante.Acrobazia;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Emolga extends Pokèmon{
	
	public Emolga(Abilities ability){
		super("Emolga", Type.ELETTRO, Type.VOLANTE, 75, 60, 75, 60, 103, 55, 4, 30, 150, ability);
		setMoves(new Scintilla());
		setMoves(new Acrobazia());
		setMoves(new Retromarcia());
		setMoves(new Inseguimento());
	}
	
	public Emolga(HiddenAbilities ability){
		super("Emolga", Type.ELETTRO, Type.VOLANTE, 75, 60, 75, 60, 103, 55, 4, 30, 150, ability);
		setMoves(new Scintilla());
		setMoves(new Acrobazia());
		setMoves(new Retromarcia());
		setMoves(new Inseguimento());
	}
	
	public Emolga(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ELETTRO, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Scintilla());
				break;
			case 2:
				setMoves(new Scintilla());
				setMoves(new Acrobazia());
				break;
			case 3:
				setMoves(new Scintilla());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				break;
			case 4:
				setMoves(new Scintilla());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				setMoves(new Inseguimento());
				break;
		}
	}
	
	public Emolga(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ELETTRO, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Scintilla());
				break;
			case 2:
				setMoves(new Scintilla());
				setMoves(new Acrobazia());
				break;
			case 3:
				setMoves(new Scintilla());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				break;
			case 4:
				setMoves(new Scintilla());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				setMoves(new Inseguimento());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
