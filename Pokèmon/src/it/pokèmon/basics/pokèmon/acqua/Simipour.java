package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Idrovampata;
import it.pokèmon.basics.Moves.acqua.Surf;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Simipour extends Pokèmon{
	
	public Simipour(Abilities ability){
		super("Simipour", Type.ACQUA, 98, 63, 98, 63, 101, 75, 4, 40, 174, ability);
		setMoves(new Surf());
		setMoves(new Geloraggio());
		setMoves(new Fossa());
		setMoves(new Idrovampata());
	}
	
	public Simipour(HiddenAbilities ability){
		super("Simipour", Type.ACQUA, 98, 63, 98, 63, 101, 75, 4, 40, 174, ability);
		setMoves(new Surf());
		setMoves(new Geloraggio());
		setMoves(new Fossa());
		setMoves(new Idrovampata());
	}
		
	public Simipour(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Surf());
				break;
			case 2:
				setMoves(new Surf());
				setMoves(new Geloraggio());
				break;
			case 3:
				setMoves(new Surf());
				setMoves(new Geloraggio());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Surf());
				setMoves(new Geloraggio());
				setMoves(new Fossa());
				setMoves(new Idrovampata());
				break;
		}
	}
	
	public Simipour(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Surf());
				break;
			case 2:
				setMoves(new Surf());
				setMoves(new Geloraggio());
				break;
			case 3:
				setMoves(new Surf());
				setMoves(new Geloraggio());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Surf());
				setMoves(new Geloraggio());
				setMoves(new Fossa());
				setMoves(new Idrovampata());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
