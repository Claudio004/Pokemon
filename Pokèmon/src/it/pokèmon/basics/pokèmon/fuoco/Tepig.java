package it.pokèmon.basics.pokèmon.fuoco;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Braciere;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.Moves.normale.Azione;
import it.pokèmon.basics.Moves.veleno.Smog;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Tepig extends Pokèmon{

	public Tepig(Abilities ability){
		super("Tepig", Type.FUOCO, 63, 45, 45, 45, 45, 65, 2, 5, 28, ability);
		setMoves(new Azione());
		setMoves(new Nitrocarica());
	}
	
	public Tepig(HiddenAbilities ability){
		super("Tepig", Type.FUOCO, 63, 45, 45, 45, 45, 65, 2, 5, 28, ability);
		setMoves(new Azione());
		setMoves(new Nitrocarica());
	}
	
	public Tepig(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				setMoves(new Braciere());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				setMoves(new Braciere());
				setMoves(new Smog());
				break;
		}
	}
	
	public Tepig(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				setMoves(new Braciere());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				setMoves(new Braciere());
				setMoves(new Smog());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}