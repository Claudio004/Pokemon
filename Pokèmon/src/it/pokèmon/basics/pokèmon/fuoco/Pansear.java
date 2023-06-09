package it.pokèmon.basics.pokèmon.fuoco;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Codacciaio;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.Moves.normale.Graffio;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Pansear</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>FUOCO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.acciaio.Codacciaio
 * @see it.pokèmon.basics.Moves.fuoco.Nitrocarica
 * @see it.pokèmon.basics.Moves.normale.Graffio
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Pansear extends Pokèmon{
	
	/**
	 * Pre-generated Pansear Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Pansear(Abilities ability){
		super("Pansear", Type.FUOCO, 53, 48, 53, 48, 64, 50, 4, 10, 63, ability);
		setMoves(new Graffio());
		setMoves(new Nitrocarica());
		setMoves(new Fossa());
		setMoves(new Codacciaio());
	}
	
	/**
	 * Pre-generated Pansear Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Pansear(HiddenAbilities ability){
		super("Pansear", Type.FUOCO, 53, 48, 53, 48, 64, 50, 4, 10, 63, ability);
		setMoves(new Graffio());
		setMoves(new Nitrocarica());
		setMoves(new Fossa());
		setMoves(new Codacciaio());
	}
	
	/**
	 * Pansear Pokèmon constructor
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
	public Pansear(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Graffio());
				break;
			case 2:
				setMoves(new Graffio());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Graffio());
				setMoves(new Nitrocarica());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Graffio());
				setMoves(new Nitrocarica());
				setMoves(new Fossa());
				setMoves(new Codacciaio());
				break;
		}
	}
	
	/**
	 * Pansear Pokèmon constructor
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
	public Pansear(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Graffio());
				break;
			case 2:
				setMoves(new Graffio());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Graffio());
				setMoves(new Nitrocarica());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Graffio());
				setMoves(new Nitrocarica());
				setMoves(new Fossa());
				setMoves(new Codacciaio());
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
