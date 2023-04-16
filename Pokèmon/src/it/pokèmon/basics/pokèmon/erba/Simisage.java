package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Energipalla;
import it.pokèmon.basics.Moves.erba.Semebomba;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.Moves.volante.Acrobazia;

public class Simisage extends Pokèmon{
	Simisage(){
		super("Simisage", Type.ERBA, 98, 63, 98, 63, 101, 75, 4, 40, 174);
		setMoves(new Semebomba());
		setMoves(new Fossa());
		setMoves(new Energipalla());
		setMoves(new Acrobazia());
	}
	
	Simisage(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Semebomba());
				break;
			case 2:
				setMoves(new Semebomba());
				setMoves(new Fossa());
				break;
			case 3:
				setMoves(new Semebomba());
				setMoves(new Fossa());
				setMoves(new Energipalla());
				break;
			case 4:
				setMoves(new Semebomba());
				setMoves(new Fossa());
				setMoves(new Energipalla());
				setMoves(new Acrobazia());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
