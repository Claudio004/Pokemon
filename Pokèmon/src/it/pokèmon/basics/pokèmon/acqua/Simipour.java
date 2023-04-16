package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Idrovampata;
import it.pokèmon.basics.Moves.acqua.Surf;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.Moves.terra.Fossa;

public class Simipour extends Pokèmon{
	Simipour(){
		super("Simipour", Type.ACQUA, 98, 63, 98, 63, 101, 75, 4, 40, 174);
		setMoves(new Surf());
		setMoves(new Geloraggio());
		setMoves(new Fossa());
		setMoves(new Idrovampata());
	}
		
	Simipour(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Surf());
				break;
			case 2:
				setMoves(new Surf());
				setMoves(new Geloraggio());
				break;
			case 3:
				setMoves(new Surf());
				setMoves(new Geloraggio());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Surf());
				setMoves(new Geloraggio());
				setMoves(new Fossa());
				setMoves(new Idrovampata());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
