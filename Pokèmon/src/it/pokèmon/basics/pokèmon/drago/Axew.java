package it.pokèmon.basics.pokèmon.drago;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.drago.IraDiDrago;
import it.pokèmon.basics.Moves.normale.Graffio;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.Moves.volante.Aeroassalto;

public class Axew extends Pokèmon{
	Axew(){
		super("Axew", Type.DRAGO, 87, 60, 30, 40, 57, 46, 3, 10, 64);
		setMoves(new Graffio());
		setMoves(new IraDiDrago());
		setMoves(new Fossa());
	}
	
	Axew(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Graffio());
				break;
			case 2:
				setMoves(new Graffio());
				setMoves(new IraDiDrago());
				break;
			case 3:
				setMoves(new Graffio());
				setMoves(new IraDiDrago());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Graffio());
				setMoves(new IraDiDrago());
				setMoves(new Fossa());
				setMoves(new Aeroassalto());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
