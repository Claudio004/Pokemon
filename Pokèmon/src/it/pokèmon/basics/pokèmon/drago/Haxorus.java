package it.pokèmon.basics.pokèmon.drago;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.drago.Dragartigli;
import it.pokèmon.basics.Moves.drago.Oltraggio;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.Moves.volante.Aeroassalto;

public class Haxorus extends Pokèmon{
	Haxorus(){
		super("Haxorus", Type.DRAGO, 147, 90, 60, 70, 97, 76, 4, 50, 270);
		setMoves(new Dragartigli());
		setMoves(new Oltraggio());
		setMoves(new Terremoto());
		setMoves(new Aeroassalto());
	}
	
	Haxorus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Dragartigli());
				break;
			case 2:
				setMoves(new Dragartigli());
				setMoves(new Oltraggio());
				break;
			case 3:
				setMoves(new Dragartigli());
				setMoves(new Oltraggio());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Dragartigli());
				setMoves(new Oltraggio());
				setMoves(new Terremoto());
				setMoves(new Aeroassalto());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
