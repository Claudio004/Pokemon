package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Codacciaio;
import it.pokèmon.basics.Moves.buio.Inseguimento;
import it.pokèmon.basics.Moves.normale.Bruciapelo;
import it.pokèmon.basics.Moves.spettro.Ombrartigli;

public class Liepard extends Pokèmon{
	Liepard(){
		super("Liepard", Type.BUIO, 88, 50, 88, 50, 106, 64, 4, 30, 156);
		setMoves(new Inseguimento());
		setMoves(new Bruciapelo());
		setMoves(new Codacciaio());
		setMoves(new Ombrartigli());
	}
		
	Liepard(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Inseguimento());
				break;
			case 2:
				setMoves(new Inseguimento());
				setMoves(new Bruciapelo());
				break;
			case 3:
				setMoves(new Inseguimento());
				setMoves(new Bruciapelo());
				setMoves(new Codacciaio());
				break;
			case 4:
				setMoves(new Inseguimento());
				setMoves(new Bruciapelo());
				setMoves(new Codacciaio());
				setMoves(new Ombrartigli());
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
