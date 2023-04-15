package it.pokèmon.basics.pokèmon.roccia;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.lotta.Spadasolenne;
import it.pokèmon.basics.Moves.normale.Nemesi;
import it.pokèmon.basics.Moves.roccia.Frana;
import it.pokèmon.basics.Moves.terra.Terremoto;

public class Terrakion extends Pokèmon{
	Terrakion(){
		super("Terrakion", Type.ROCCIA, Type.LOTTA, 129, 90, 72, 90, 108, 91, 4, 50, 290);
		setMoves(new Spadasolenne());
		setMoves(new Nemesi());
		setMoves(new Frana());
		setMoves(new Terremoto());
	}
		
	Terrakion(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.ROCCIA, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
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
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Spadasolenne());
				setMoves(new Nemesi());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
