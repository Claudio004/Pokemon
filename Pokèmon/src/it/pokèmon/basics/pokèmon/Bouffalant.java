package it.pokèmon.basics.pokèmon;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.lotta.Vendetta;
import it.pokèmon.basics.Moves.normale.Nemesi;
import it.pokèmon.basics.Moves.normale.Ricciolata;
import it.pokèmon.basics.Moves.terra.Terremoto;

public class Bouffalant extends Pokèmon{
	Bouffalant(){
		super("Bouffalant", Type.NORMALE, 110, 95, 40, 95, 55, 95, 4, 40, 172);
		setMoves(new Vendetta());
		setMoves(new Ricciolata());
		setMoves(new Terremoto());
		setMoves(new Nemesi());
	}
		
	Bouffalant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ricciolata());
				break;
			case 2:
				setMoves(new Vendetta());
				setMoves(new Ricciolata());
				break;
			case 3:
				setMoves(new Vendetta());
				setMoves(new Ricciolata());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Vendetta());
				setMoves(new Ricciolata());
				setMoves(new Terremoto());
				setMoves(new Nemesi());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
