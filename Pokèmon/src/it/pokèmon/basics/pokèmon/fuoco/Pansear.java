package it.pokèmon.basics.pokèmon.fuoco;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Codacciaio;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.Moves.normale.Graffio;
import it.pokèmon.basics.Moves.terra.Fossa;

public class Pansear extends Pokèmon{
	Pansear(){
		super("Pansear", Type.FUOCO, 53, 48, 53, 48, 64, 50, 4, 10, 63);
		setMoves(new Graffio());
		setMoves(new Nitrocarica());
		setMoves(new Fossa());
		setMoves(new Codacciaio());
	}
	
	Pansear(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Graffio());
				break;
			case 2:
				setMoves(new Graffio());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Graffio());
				setMoves(new Nitrocarica());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Graffio());
				setMoves(new Nitrocarica());
				setMoves(new Fossa());
				setMoves(new Codacciaio());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
