package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Codacciaio;
import it.pokèmon.basics.Moves.coleottero.Retromarcia;
import it.pokèmon.basics.Moves.normale.Nemesi;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Cinccino</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>NORMALE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.coleottero.Retromarcia
 * @see it.pokèmon.basics.Moves.normale.Nemesi
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.Moves.acciaio.Codacciaio
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Cinccino extends Pokèmon{
	
	/**
	 * Pre-generated Cinccino Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Cinccino(Abilities ability){
		super("Cinccino", Type.NORMALE, 95, 60, 65, 60, 115, 75, 4, 40, 165, ability);
		setMoves(new Retromarcia());
		setMoves(new Fossa());
		setMoves(new Codacciaio());
		setMoves(new Nemesi());
	}
	
	/**
	 * Pre-generated Cinccino Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Cinccino(HiddenAbilities ability){
		super("Cinccino", Type.NORMALE, 95, 60, 65, 60, 115, 75, 4, 40, 165, ability);
		setMoves(new Retromarcia());
		setMoves(new Fossa());
		setMoves(new Codacciaio());
		setMoves(new Nemesi());
	}
		
	/**
	 * Cinccino Pokèmon constructor
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
	public Cinccino(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Retromarcia());
				break;
			case 2:
				setMoves(new Retromarcia());
				setMoves(new Fossa());
				break;
			case 3:
				setMoves(new Retromarcia());
				setMoves(new Fossa());
				setMoves(new Codacciaio());
				break;
			case 4:
				setMoves(new Retromarcia());
				setMoves(new Fossa());
				setMoves(new Codacciaio());
				setMoves(new Nemesi());
				break;
		}
	}
	
	/**
	 * Cinccino Pokèmon constructor
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
	public Cinccino(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Retromarcia());
				break;
			case 2:
				setMoves(new Retromarcia());
				setMoves(new Fossa());
				break;
			case 3:
				setMoves(new Retromarcia());
				setMoves(new Fossa());
				setMoves(new Codacciaio());
				break;
			case 4:
				setMoves(new Retromarcia());
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