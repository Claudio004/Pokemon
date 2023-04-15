package it.pokèmon.basics.pokèmon.lotta;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Fuocopugno;
import it.pokèmon.basics.Moves.lotta.Vendetta;
import it.pokèmon.basics.Moves.lotta.Vitaltiro;
import it.pokèmon.basics.Moves.terra.Terremoto;

public class Throh extends Pokèmon{
	Throh(){
		super("Throh", Type.LOTTA, 100, 85, 30, 85, 45, 120, 4, 30, 163);
		setMoves(new Vitaltiro());
		setMoves(new Vendetta());
		setMoves(new Fuocopugno());
		setMoves(new Terremoto());
	}
	
	Throh(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Vitaltiro());
				break;
			case 2:
				setMoves(new Vitaltiro());
				setMoves(new Vendetta());
				break;
			case 3:
				setMoves(new Vitaltiro());
				setMoves(new Vendetta());
				setMoves(new Fuocopugno());
				break;
			case 4:
				setMoves(new Vitaltiro());
				setMoves(new Vendetta());
				setMoves(new Fuocopugno());
				setMoves(new Terremoto());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
