package it.pokèmon.basics.pokèmon.drago;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Codacciaio;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.drago.Dragartigli;
import it.pokèmon.basics.Moves.lotta.Vendetta;

public class Druddigon extends Pokèmon{
	Druddigon(){
		super("Druddigon", Type.DRAGO, 120, 90, 60, 90, 48, 77, 4, 30, 173);
		setMoves(new Sgranocchio());
		setMoves(new Dragartigli());
		setMoves(new Vendetta());
		setMoves(new Codacciaio());
	}
	
	Druddigon(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sgranocchio());
				break;
			case 2:
				setMoves(new Sgranocchio());
				setMoves(new Dragartigli());
				break;
			case 3:
				setMoves(new Sgranocchio());
				setMoves(new Dragartigli());
				setMoves(new Vendetta());
				break;
			case 4:
				setMoves(new Sgranocchio());
				setMoves(new Dragartigli());
				setMoves(new Vendetta());
				setMoves(new Codacciaio());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
