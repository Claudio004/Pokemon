package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Fendifoglia;
import it.pokèmon.basics.Moves.erba.Frustata;
import it.pokèmon.basics.Moves.erba.Megassorbimento;
import it.pokèmon.basics.Moves.erba.Vorticerba;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Servine</b><br>
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
 * @see it.pokèmon.basics.Moves.erba.Megassorbimento
 * @see it.pokèmon.basics.Moves.erba.Vorticerba
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
public class Servine extends Pokèmon{

	/**
	 * Pre-generated Servine Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Servine(Abilities ability){
		super("Servine", Type.ERBA, 60, 75, 60, 75, 83, 60, 4, 20, 145, ability);
		setMoves(new Frustata());
		setMoves(new Vorticerba());
		setMoves(new Megassorbimento());
		setMoves(new Fendifoglia());
	}
	
	/**
	 * Pre-generated Servine Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Servine(HiddenAbilities ability){
		super("Servine", Type.ERBA, 60, 75, 60, 75, 83, 60, 4, 20, 145, ability);
		setMoves(new Frustata());
		setMoves(new Vorticerba());
		setMoves(new Megassorbimento());
		setMoves(new Fendifoglia());
	}
	
	/**
	 * Servine Pokèmon constructor
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
	public Servine(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
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
				setMoves(new Megassorbimento());
				break;
			case 4:
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				setMoves(new Megassorbimento());
				setMoves(new Fendifoglia());
				break;
		}
	}
	
	/**
	 * Servine Pokèmon constructor
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
	public Servine(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
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
				setMoves(new Megassorbimento());
				break;
			case 4:
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				setMoves(new Megassorbimento());
				setMoves(new Fendifoglia());
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
