package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Idrovampata;
import it.pokèmon.basics.Moves.acqua.Surf;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Simipour</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ACQUA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.acqua.Idrovampata
 * @see it.pokèmon.basics.Moves.acqua.Surf
 * @see it.pokèmon.basics.Moves.ghiaccio.Geloraggio
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Simipour extends Pokèmon{
	
	/**
	 * Pre-generated Simipour Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Simipour(Abilities ability){
		super("Simipour", Type.ACQUA, 98, 63, 98, 63, 101, 75, 4, 40, 174, ability);
		setMoves(new Surf());
		setMoves(new Geloraggio());
		setMoves(new Fossa());
		setMoves(new Idrovampata());
	}
	
	/**
	 * Pre-generated Simipour Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Simipour(HiddenAbilities ability){
		super("Simipour", Type.ACQUA, 98, 63, 98, 63, 101, 75, 4, 40, 174, ability);
		setMoves(new Surf());
		setMoves(new Geloraggio());
		setMoves(new Fossa());
		setMoves(new Idrovampata());
	}
		
	/**
	 * Simipour Pokèmon constructor
	 * @param nome : String
	 * @param Attacco : int
	 * @param Difesa : int
	 * @param AttaccoSp : int
	 * @param DifesaSp : int
	 * @param Velocità : int
	 * @param HP : int
	 * @param movesNumber : int
	 * @param Level : int
	 * @param exp : int
	 * @param ability : Abilities
	 */
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
	
	/**
	 * Simipour Pokèmon constructor
	 * @param nome : String
	 * @param Attacco : int
	 * @param Difesa : int
	 * @param AttaccoSp : int
	 * @param DifesaSp : int
	 * @param Velocità : int
	 * @param HP : int
	 * @param movesNumber : int
	 * @param Level : int
	 * @param exp : int
	 * @param ability : HiddenAbilities
	 */
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
	
	/**
	 * Method used by a Pokèmon to set a move
	 * @param move : Move
	 */
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
