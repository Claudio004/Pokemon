package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Codacciaio;
import it.pokèmon.basics.Moves.acqua.Pistolacqua;
import it.pokèmon.basics.Moves.normale.Graffio;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Panpour extends Pokèmon{
	
	public Panpour(Abilities ability){
		super("Panpour", Type.ACQUA, 53, 48, 53, 48, 64, 50, 4, 10, 63, ability);
		setMoves(new Graffio());
		setMoves(new Pistolacqua());
		setMoves(new Fossa());
		setMoves(new Codacciaio());
	}
	
	public Panpour(HiddenAbilities ability){
		super("Panpour", Type.ACQUA, 53, 48, 53, 48, 64, 50, 4, 10, 63, ability);
		setMoves(new Graffio());
		setMoves(new Pistolacqua());
		setMoves(new Fossa());
		setMoves(new Codacciaio());
	}
		
	public Panpour(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Graffio());
				break;
			case 2:
				setMoves(new Graffio());
				setMoves(new Pistolacqua());
				break;
			case 3:
				setMoves(new Graffio());
				setMoves(new Pistolacqua());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Graffio());
				setMoves(new Pistolacqua());
				setMoves(new Fossa());
				setMoves(new Codacciaio());
				break;
		}
	}
	
	public Panpour(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Graffio());
				break;
			case 2:
				setMoves(new Graffio());
				setMoves(new Pistolacqua());
				break;
			case 3:
				setMoves(new Graffio());
				setMoves(new Pistolacqua());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Graffio());
				setMoves(new Pistolacqua());
				setMoves(new Fossa());
				setMoves(new Codacciaio());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
