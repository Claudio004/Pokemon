package it.pokèmon.basics.pokèmon.terra;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.elettro.Fulmine;
import it.pokèmon.basics.Moves.roccia.Frana;
import it.pokèmon.basics.Moves.terra.Pantanobomba;
import it.pokèmon.basics.Moves.terra.Terremoto;

public class Stunfisk extends Pokèmon{
	
	Stunfisk(){
		super("Stunfisk", Type.TERRA, Type.ELETTRO, 66, 84, 81, 99, 32, 109, 4, 40, 165);
		setMoves(new Pantanobomba());
		setMoves(new Fulmine());
		setMoves(new Frana());
		setMoves(new Terremoto());
	}
		
	Stunfisk(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.TERRA, Type.ELETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pantanobomba());
				break;
			case 2:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				break;
			case 3:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
