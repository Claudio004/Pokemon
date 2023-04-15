package it.pokèmon.basics.pokèmon.acciaio;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Metaltestata;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.lotta.Spadasolenne;
import it.pokèmon.basics.Moves.normale.Nemesi;

public class Cobalion extends Pokèmon{
	Cobalion(){
		super("Cobalion", Type.ACCIAIO, Type.LOTTA, 90, 129, 90, 72, 108, 91, 4, 50, 290);
		setMoves(new Spadasolenne());
		setMoves(new Nemesi());
		setMoves(new Metaltestata());
		setMoves(new ForbiceX());
	}
		
	Cobalion(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.ACCIAIO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Spadasolenne());
				break;
			case 2:
				setMoves(new Spadasolenne());
				setMoves(new Nemesi());
				break;
			case 3:
				setMoves(new Spadasolenne());
				setMoves(new Nemesi());
				setMoves(new Metaltestata());
				break;
			case 4:
				setMoves(new Spadasolenne());
				setMoves(new Nemesi());
				setMoves(new Metaltestata());
				setMoves(new ForbiceX());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
