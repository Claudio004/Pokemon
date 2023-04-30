package it.pokèmon.basics.pokèmon.drago;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.drago.Dragopulsar;
import it.pokèmon.basics.Moves.drago.Oltraggio;
import it.pokèmon.basics.Moves.fuoco.Incrofiamma;
import it.pokèmon.basics.Moves.fuoco.Lanciafiamme;
import it.pokèmon.basics.abilities.Abilities;

public class Reshiram extends Pokèmon{
	
	Reshiram(){
		super("Reshiram", Type.DRAGO, Type.FUOCO, 120, 100, 150, 120, 90, 100, 4, 65, 340, Abilities.PIROTURBINA);
		setMoves(new Incrofiamma());
		setMoves(new Lanciafiamme());
		setMoves(new Dragopulsar());
		setMoves(new Oltraggio());
	}
	
	Reshiram(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.DRAGO, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.PIROTURBINA);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Incrofiamma());
				break;
			case 2:
				setMoves(new Incrofiamma());
				setMoves(new Dragopulsar());
				break;
			case 3:
				setMoves(new Incrofiamma());
				setMoves(new Lanciafiamme());
				setMoves(new Dragopulsar());
				break;
			case 4:
				setMoves(new Incrofiamma());
				setMoves(new Lanciafiamme());
				setMoves(new Dragopulsar());
				setMoves(new Oltraggio());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
