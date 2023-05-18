package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.normale.Nemesi;
import it.pokèmon.basics.Moves.normale.Comete;
import it.pokèmon.basics.Moves.acciaio.Codacciaio;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Minccino</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>NORMALE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.normale.Comete
 * @see it.pokèmon.basics.Moves.normale.Nemesi
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.Moves.acciaio.Codacciaio
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Minccino extends Pokèmon{
	
	/**
	 * Pre-generated Minccino Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Minccino(Abilities ability){
		super("Minccino", Type.NORMALE, 50, 40, 40, 40, 75, 55, 4, 25, 60, ability);
		setMoves(new Comete());
		setMoves(new Fossa());
		setMoves(new Codacciaio());
		setMoves(new Nemesi());
	}
	
	/**
	 * Pre-generated Minccino Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Minccino(HiddenAbilities ability){
		super("Minccino", Type.NORMALE, 50, 40, 40, 40, 75, 55, 4, 25, 60, ability);
		setMoves(new Comete());
		setMoves(new Fossa());
		setMoves(new Codacciaio());
		setMoves(new Nemesi());
	}
		
	/**
	 * Minccino Pokèmon constructor
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
	public Minccino(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Comete());
				break;
			case 2:
				setMoves(new Comete());
				setMoves(new Fossa());
				break;
			case 3:
				setMoves(new Comete());
				setMoves(new Fossa());
				setMoves(new Codacciaio());
				break;
			case 4:
				setMoves(new Comete());
				setMoves(new Fossa());
				setMoves(new Codacciaio());
				setMoves(new Nemesi());
				break;
		}
	}
	
	/**
	 * Minccino Pokèmon constructor
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
	public Minccino(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Comete());
				break;
			case 2:
				setMoves(new Comete());
				setMoves(new Fossa());
				break;
			case 3:
				setMoves(new Comete());
				setMoves(new Fossa());
				setMoves(new Codacciaio());
				break;
			case 4:
				setMoves(new Comete());
				setMoves(new Fossa());
				setMoves(new Codacciaio());
				setMoves(new Nemesi());
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