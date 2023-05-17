package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Foglielama;
import it.pokèmon.basics.Moves.erba.Megassorbimento;
import it.pokèmon.basics.Moves.normale.Coro;
import it.pokèmon.basics.Moves.erba.Semebomba;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Cottonee</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ERBA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.erba.Semebomba
 * @see it.pokèmon.basics.Moves.erba.Megassorbimento
 * @see it.pokèmon.basics.Moves.erba.Foglielama
 * @see it.pokèmon.basics.Moves.normale.Coro
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Cottonee extends Pokèmon{
	
	/**
	 * Pre-generated Cottonee Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Cottonee(Abilities ability){
		super("Cottonee", Type.ERBA, 27, 60, 37, 50, 66, 40, 4, 20, 56, ability);
		setMoves(new Megassorbimento());
		setMoves(new Foglielama());
		setMoves(new Coro());
		setMoves(new Semebomba());
	}
	
	/**
	 * Pre-generated Cottonee Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Cottonee(HiddenAbilities ability){
		super("Cottonee", Type.ERBA, 27, 60, 37, 50, 66, 40, 4, 20, 56, ability);
		setMoves(new Megassorbimento());
		setMoves(new Foglielama());
		setMoves(new Coro());
		setMoves(new Semebomba());
	}
	
	/**
	 * Cottonee Pokèmon constructor
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
	public Cottonee(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Megassorbimento());
				break;
			case 2:
				setMoves(new Megassorbimento());
				setMoves(new Foglielama());
				break;
			case 3:
				setMoves(new Megassorbimento());
				setMoves(new Foglielama());
				setMoves(new Coro());
				break;
			case 4:
				setMoves(new Megassorbimento());
				setMoves(new Foglielama());
				setMoves(new Coro());
				setMoves(new Semebomba());
				break;
		}
	}
	
	/**
	 * Cottonee Pokèmon constructor
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
	public Cottonee(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Megassorbimento());
				break;
			case 2:
				setMoves(new Megassorbimento());
				setMoves(new Foglielama());
				break;
			case 3:
				setMoves(new Megassorbimento());
				setMoves(new Foglielama());
				setMoves(new Coro());
				break;
			case 4:
				setMoves(new Megassorbimento());
				setMoves(new Foglielama());
				setMoves(new Coro());
				setMoves(new Semebomba());
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