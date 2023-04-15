package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Fendifoglia;
import it.pokèmon.basics.Moves.erba.Frustata;
import it.pokèmon.basics.Moves.erba.Megassorbimento;
import it.pokèmon.basics.Moves.erba.Vorticerba;

public class Servine extends Pokèmon{

	Servine(){
		super("Servine", Type.ERBA, 60, 75, 60, 75, 83, 60, 4, 20, 145);
		setMoves(new Frustata());
		setMoves(new Vorticerba());
		setMoves(new Megassorbimento());
		setMoves(new Fendifoglia());
	}
	
	Servine(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Frustata());
				break;
			case 2:
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				break;
			case 3:
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				setMoves(new Megassorbimento());
				break;
			case 4:
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				setMoves(new Megassorbimento());
				setMoves(new Fendifoglia());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
