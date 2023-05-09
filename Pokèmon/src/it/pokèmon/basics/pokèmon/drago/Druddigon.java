package it.pokèmon.basics.pokèmon.drago;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Codacciaio;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.drago.Dragartigli;
import it.pokèmon.basics.Moves.lotta.Vendetta;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Druddigon</b><br>
 * Extends Pokèmon<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>DRAGO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.acciaio.Codacciaio
 * @see it.pokèmon.basics.Moves.buio.Sgranocchio
 * @see it.pokèmon.basics.Moves.drago.Dragartigli
 * @see it.pokèmon.basics.Moves.lotta.Vendetta
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
public class Druddigon extends Pokèmon{
	
	/**
	 * Pre-generated Druddigon Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Druddigon(Abilities ability){
		super("Druddigon", Type.DRAGO, 120, 90, 60, 90, 48, 77, 4, 30, 173, ability);
		setMoves(new Sgranocchio());
		setMoves(new Dragartigli());
		setMoves(new Vendetta());
		setMoves(new Codacciaio());
	}
	
	/**
	 * Pre-generated Druddigon Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Druddigon(HiddenAbilities ability){
		super("Druddigon", Type.DRAGO, 120, 90, 60, 90, 48, 77, 4, 30, 173, ability);
		setMoves(new Sgranocchio());
		setMoves(new Dragartigli());
		setMoves(new Vendetta());
		setMoves(new Codacciaio());
	}
	
	/**
	 * Druddigon Pokèmon constructor
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
	public Druddigon(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sgranocchio());
				break;
			case 2:
				setMoves(new Sgranocchio());
				setMoves(new Dragartigli());
				break;
			case 3:
				setMoves(new Sgranocchio());
				setMoves(new Dragartigli());
				setMoves(new Vendetta());
				break;
			case 4:
				setMoves(new Sgranocchio());
				setMoves(new Dragartigli());
				setMoves(new Vendetta());
				setMoves(new Codacciaio());
				break;
		}
	}
	
	/**
	 * Druddigon Pokèmon constructor
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
	public Druddigon(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sgranocchio());
				break;
			case 2:
				setMoves(new Sgranocchio());
				setMoves(new Dragartigli());
				break;
			case 3:
				setMoves(new Sgranocchio());
				setMoves(new Dragartigli());
				setMoves(new Vendetta());
				break;
			case 4:
				setMoves(new Sgranocchio());
				setMoves(new Dragartigli());
				setMoves(new Vendetta());
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
