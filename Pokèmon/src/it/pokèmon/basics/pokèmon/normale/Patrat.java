package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Morso;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.normale.Azione;

public class Patrat extends Pokèmon{
	//private Abilities ability = Abilities.AIUTOFUOCO;
	//private HiddenAbilities h_ability = HiddenAbilities.GRASSOSPESSO;
		
	Patrat(){
		super("Patrat", Type.NORMALE, 55, 39, 35, 39, 42, 45, 2, 5, 51);
		setMoves(new Azione());
		setMoves(new Morso());
	}
		
	Patrat(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
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
