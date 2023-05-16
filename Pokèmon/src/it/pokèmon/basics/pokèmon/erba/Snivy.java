package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Starter;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Frustata;
import it.pokèmon.basics.Moves.erba.Megassorbimento;
import it.pokèmon.basics.Moves.erba.Vorticerba;
import it.pokèmon.basics.Moves.normale.Azione;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Snivy</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ERBA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.erba.Frustata
 * @see it.pokèmon.basics.Moves.erba.Megassorbimento
 * @see it.pokèmon.basics.Moves.erba.Vorticerba
 * @see it.pokèmon.basics.Moves.normale.Azione
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Starter
@Inheritance(Pokèmon = "Pokèmon")
public class Snivy extends Pokèmon{
	
	/**
	 * Pre-generated Snivy Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Snivy(Abilities ability){
		super("Snivy", Type.ERBA, 45, 55, 45, 55, 63, 45, 2, 5, 28, ability);
		setMoves(new Azione());
		setMoves(new Frustata());
	}

	/**
	 * Pre-generated Snivy Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Snivy(HiddenAbilities ability){
		super("Snivy", Type.ERBA, 45, 55, 45, 55, 63, 45, 2, 5, 28, ability);
		setMoves(new Azione());
		setMoves(new Frustata());
	}
	
	/**
	 * Snivy Pokèmon constructor
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
	public Snivy(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Frustata());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				setMoves(new Megassorbimento());
				break;
		}
	}
	
	/**
	 * Snivy Pokèmon constructor
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
	public Snivy(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Frustata());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new Frustata());
				setMoves(new Vorticerba());
				setMoves(new Megassorbimento());
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
