package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.lotta.Vendetta;
import it.pokèmon.basics.Moves.normale.Nemesi;
import it.pokèmon.basics.Moves.normale.Ricciolata;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Bouffalant extends Pokèmon{
	
	Bouffalant(Abilities ability){
		super("Bouffalant", Type.NORMALE, 110, 95, 40, 95, 55, 95, 4, 40, 172, ability);
		setMoves(new Vendetta());
		setMoves(new Ricciolata());
		setMoves(new Terremoto());
		setMoves(new Nemesi());
	}
	
	Bouffalant(HiddenAbilities ability){
		super("Bouffalant", Type.NORMALE, 110, 95, 40, 95, 55, 95, 4, 40, 172, ability);
		setMoves(new Vendetta());
		setMoves(new Ricciolata());
		setMoves(new Terremoto());
		setMoves(new Nemesi());
	}
		
	Bouffalant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
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
	
	Bouffalant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
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
