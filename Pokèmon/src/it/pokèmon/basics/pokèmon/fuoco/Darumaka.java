package it.pokèmon.basics.pokèmon.fuoco;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.normale.Bottintesta;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.Moves.fuoco.Rogodenti;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Darumaka</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>FUOCO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.normale.Bottintesta
 * @see it.pokèmon.basics.Moves.fuoco.Nitrocarica
 * @see it.pokèmon.basics.Moves.fuoco.Rogodenti
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Darumaka extends Pokèmon{
	
	/**
	 * Pre-generated Darumaka Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Darumaka(Abilities ability){
		super("Darumaka", Type.FUOCO, 90, 45, 15, 45, 50, 70, 4, 20, 63, ability);
		setMoves(new Rogodenti());
		setMoves(new Nitrocarica());
		setMoves(new Fossa());
		setMoves(new Bottintesta());
	}
	
	/**
	 * Pre-generated Darumaka Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Darumaka(HiddenAbilities ability){
		super("Darumaka", Type.FUOCO, 90, 45, 15, 45, 50, 70, 4, 20, 63, ability);
		setMoves(new Rogodenti());
		setMoves(new Nitrocarica());
		setMoves(new Fossa());
		setMoves(new Bottintesta());
	}
	
	/**
	 * Darumaka Pokèmon constructor
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
	public Darumaka(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Rogodenti());
				break;
			case 2:
				setMoves(new Rogodenti());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Rogodenti());
				setMoves(new Nitrocarica());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Rogodenti());
				setMoves(new Nitrocarica());
				setMoves(new Fossa());
				setMoves(new Bottintesta());
				break;
		}
	}
	
	/**
	 * Darumaka Pokèmon constructor
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
	public Darumaka(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Rogodenti());
				break;
			case 2:
				setMoves(new Rogodenti());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Rogodenti());
				setMoves(new Nitrocarica());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Rogodenti());
				setMoves(new Nitrocarica());
				setMoves(new Fossa());
				setMoves(new Bottintesta());
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