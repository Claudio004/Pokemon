package it.pokèmon.basics.pokèmon.drago;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.drago.Dragopulsar;
import it.pokèmon.basics.Moves.drago.Oltraggio;
import it.pokèmon.basics.Moves.elettro.Fulmine;
import it.pokèmon.basics.Moves.elettro.Incrotuono;
import it.pokèmon.basics.abilities.Abilities;

public class Zekrom extends Pokèmon{
	
	Zekrom(){
		super("Zekrom", Type.DRAGO, Type.ELETTRO, 150, 120, 120, 100, 90, 100, 4, 65, 340, Abilities.TERAVOLT);
		setMoves(new Incrotuono());
		setMoves(new Fulmine());
		setMoves(new Dragopulsar());
		setMoves(new Oltraggio());
	}
	
	Zekrom(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.DRAGO, Type.ELETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.TERAVOLT);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Incrotuono());
				break;
			case 2:
				setMoves(new Incrotuono());
				setMoves(new Dragopulsar());
				break;
			case 3:
				setMoves(new Incrotuono());
				setMoves(new Fulmine());
				setMoves(new Dragopulsar());
				break;
			case 4:
				setMoves(new Incrotuono());
				setMoves(new Fulmine());
				setMoves(new Dragopulsar());
				setMoves(new Oltraggio());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
