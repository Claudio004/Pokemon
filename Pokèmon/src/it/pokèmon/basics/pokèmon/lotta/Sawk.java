package it.pokèmon.basics.pokèmon.lotta;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.ghiaccio.Gelopugno;
import it.pokèmon.basics.Moves.lotta.Breccia;
import it.pokèmon.basics.Moves.lotta.Doppiocalcio;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Sawk extends Pokèmon{
	
	public Sawk(Abilities ability){
		super("Sawk", Type.LOTTA, 125, 75, 30, 75, 85, 75, 4, 30, 163, ability);
		setMoves(new Doppiocalcio());
		setMoves(new Breccia());
		setMoves(new Gelopugno());
		setMoves(new Terremoto());
	}
	
	public Sawk(HiddenAbilities ability){
		super("Sawk", Type.LOTTA, 125, 75, 30, 75, 85, 75, 4, 30, 163, ability);
		setMoves(new Doppiocalcio());
		setMoves(new Breccia());
		setMoves(new Gelopugno());
		setMoves(new Terremoto());
	}
	
	public Sawk(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Doppiocalcio());
				break;
			case 2:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				break;
			case 3:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				setMoves(new Gelopugno());
				break;
			case 4:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				setMoves(new Gelopugno());
				setMoves(new Terremoto());
				break;
		}
	}
	
	public Sawk(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Doppiocalcio());
				break;
			case 2:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				break;
			case 3:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				setMoves(new Gelopugno());
				break;
			case 4:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				setMoves(new Gelopugno());
				setMoves(new Terremoto());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
