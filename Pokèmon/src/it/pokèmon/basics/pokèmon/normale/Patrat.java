package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Morso;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.normale.Azione;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Patrat extends Pokèmon{
		
	Patrat(Abilities ability){
		super("Patrat", Type.NORMALE, 55, 39, 35, 39, 42, 45, 2, 5, 51, ability);
		setMoves(new Azione());
		setMoves(new Morso());
	}
	
	Patrat(HiddenAbilities ability){
		super("Patrat", Type.NORMALE, 55, 39, 35, 39, 42, 45, 2, 5, 51, ability);
		setMoves(new Azione());
		setMoves(new Morso());
	}
		
	Patrat(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Morso());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Morso());
				setMoves(new Sgranocchio());
				break;
		}
	}
	
	Patrat(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Morso());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Morso());
				setMoves(new Sgranocchio());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
