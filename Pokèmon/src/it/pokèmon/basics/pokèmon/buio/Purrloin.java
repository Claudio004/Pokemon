package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Codacciaio;
import it.pokèmon.basics.Moves.normale.Graffio;
import it.pokèmon.basics.Moves.normale.Sfuriate;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;

public class Purrloin extends Pokèmon{
	Purrloin(){
		super("Purrloin", Type.BUIO, 50, 37, 50, 37, 66, 41, 2, 6, 56);
		setMoves(new Graffio());
		setMoves(new Sfuriate());
	}
		
	Purrloin(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Graffio());
				break;
			case 2:
				setMoves(new Graffio());
				setMoves(new Sfuriate());
				break;
			case 3:
				setMoves(new Graffio());
				setMoves(new Sfuriate());
				setMoves(new Codacciaio());
				break;
			case 4:
				setMoves(new Graffio());
				setMoves(new Sfuriate());
				setMoves(new Codacciaio());
				setMoves(new PallaOmbra());
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
