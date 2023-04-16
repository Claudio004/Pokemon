package it.pokèmon.basics.pokèmon.drago;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.drago.Dragartigli;
import it.pokèmon.basics.Moves.drago.IraDiDrago;
import it.pokèmon.basics.Moves.drago.Oltraggio;
import it.pokèmon.basics.Moves.terra.Fossa;

public class Fraxure extends Pokèmon{
	Fraxure(){
		super("Fraxure", Type.DRAGO, 117, 70, 40, 50, 67, 66, 4, 40, 144);
		setMoves(new IraDiDrago());
		setMoves(new Dragartigli());
		setMoves(new Fossa());
		setMoves(new Oltraggio());
	}
	
	Fraxure(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new IraDiDrago());
				break;
			case 2:
				setMoves(new IraDiDrago());
				setMoves(new Dragartigli());
				break;
			case 3:
				setMoves(new IraDiDrago());
				setMoves(new Dragartigli());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new IraDiDrago());
				setMoves(new Dragartigli());
				setMoves(new Fossa());
				setMoves(new Oltraggio());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
