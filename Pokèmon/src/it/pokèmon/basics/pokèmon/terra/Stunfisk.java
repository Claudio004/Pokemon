package it.pokèmon.basics.pokèmon.terra;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.elettro.Fulmine;
import it.pokèmon.basics.Moves.roccia.Frana;
import it.pokèmon.basics.Moves.terra.Pantanobomba;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Stunfisk extends Pokèmon{
	
	public Stunfisk(Abilities ability){
		super("Stunfisk", Type.TERRA, Type.ELETTRO, 66, 84, 81, 99, 32, 109, 4, 40, 165, ability);
		setMoves(new Pantanobomba());
		setMoves(new Fulmine());
		setMoves(new Frana());
		setMoves(new Terremoto());
	}
	
	public Stunfisk(HiddenAbilities ability){
		super("Stunfisk", Type.TERRA, Type.ELETTRO, 66, 84, 81, 99, 32, 109, 4, 40, 165, ability);
		setMoves(new Pantanobomba());
		setMoves(new Fulmine());
		setMoves(new Frana());
		setMoves(new Terremoto());
	}
		
	public Stunfisk(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.TERRA, Type.ELETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pantanobomba());
				break;
			case 2:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				break;
			case 3:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
		}
	}
	
	public Stunfisk(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.TERRA, Type.ELETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pantanobomba());
				break;
			case 2:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				break;
			case 3:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
