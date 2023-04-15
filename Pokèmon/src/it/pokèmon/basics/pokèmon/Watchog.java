package it.pokèmon.basics.pokèmon;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.normale.Azione;
import it.pokèmon.basics.Moves.normale.Iperzanna;

public class Watchog extends Pokèmon{
	//private Abilities ability = Abilities.AIUTOFUOCO;
	//private HiddenAbilities h_ability = HiddenAbilities.GRASSOSPESSO;
		
	Watchog(){
		super("Watchog", Type.NORMALE, 85, 69, 60, 69, 77, 60, 4, 30, 147);
		setMoves(new Azione());
		setMoves(new PallaOmbra());
		setMoves(new Sgranocchio());
		setMoves(new Iperzanna());
	}
		
	Watchog(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new PallaOmbra());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new PallaOmbra());
				setMoves(new Sgranocchio());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new PallaOmbra());
				setMoves(new Sgranocchio());
				setMoves(new Iperzanna());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
