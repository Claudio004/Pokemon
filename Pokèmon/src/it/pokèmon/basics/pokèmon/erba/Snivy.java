package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Frustata;
import it.pokèmon.basics.Moves.erba.Megassorbimento;
import it.pokèmon.basics.Moves.erba.Vorticerba;
import it.pokèmon.basics.Moves.normale.Azione;

public class Snivy extends Pokèmon{
	Snivy(){
		super("Snivy", Type.ERBA, 45, 55, 45, 55, 63, 45, 2, 5, 28);
		setMoves(new Azione());
		setMoves(new Frustata());
	}
	
	Snivy(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Frustata());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				setMoves(new Megassorbimento());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
