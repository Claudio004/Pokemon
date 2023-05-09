package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Fendifoglia;
import it.pokèmon.basics.Moves.erba.Frustata;
import it.pokèmon.basics.Moves.erba.Gigassorbimento;
import it.pokèmon.basics.Moves.erba.Vorticerba;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Serperior</b><br>
 * Extends Pokèmon<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ERBA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.erba.Fendifoglia
 * @see it.pokèmon.basics.Moves.erba.Frustata
 * @see it.pokèmon.basics.Moves.erba.Gigassorbimento
 * @see it.pokèmon.basics.Moves.erba.Vorticerba
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
public class Serperior extends Pokèmon{
	
	/**
	 * Pre-generated Serperior Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Serperior(Abilities ability){
		super("Serperior", Type.ERBA, 75, 95, 75, 95, 113, 75, 4, 40, 238, ability);
		setMoves(new Frustata());
		setMoves(new Vorticerba());
		setMoves(new Gigassorbimento());
		setMoves(new Fendifoglia());
	}
	
	/**
	 * Pre-generated Serperior Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Serperior(HiddenAbilities ability){
		super("Serperior", Type.ERBA, 75, 95, 75, 95, 113, 75, 4, 40, 238, ability);
		setMoves(new Frustata());
		setMoves(new Vorticerba());
		setMoves(new Gigassorbimento());
		setMoves(new Fendifoglia());
	}
	
	/**
	 * Serperior Pokèmon constructor
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
	public Serperior(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Frustata());
				break;
			case 2:
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				break;
			case 3:
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				setMoves(new Fendifoglia());
				break;
			case 4:
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				setMoves(new Fendifoglia());
				setMoves(new Gigassorbimento());
				break;
		}
	}
	
	/**
	 * Serperior Pokèmon constructor
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
	public Serperior(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Frustata());
				break;
			case 2:
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				break;
			case 3:
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				setMoves(new Fendifoglia());
				break;
			case 4:
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				setMoves(new Fendifoglia());
				setMoves(new Gigassorbimento());
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
