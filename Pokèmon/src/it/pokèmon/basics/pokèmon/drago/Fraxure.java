package it.pokèmon.basics.pokèmon.drago;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.drago.Dragartigli;
import it.pokèmon.basics.Moves.drago.IraDiDrago;
import it.pokèmon.basics.Moves.drago.Oltraggio;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Fraxure</b><br>
 * Extends Pokèmon<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>DRAGO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.drago.IraDiDrago
 * @see it.pokèmon.basics.Moves.drago.Oltraggio
 * @see it.pokèmon.basics.Moves.drago.Dragartigli
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
public class Fraxure extends Pokèmon{
	
	/**
	 * Pre-generated Fraxure Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Fraxure(Abilities ability){
		super("Fraxure", Type.DRAGO, 117, 70, 40, 50, 67, 66, 4, 40, 144, ability);
		setMoves(new IraDiDrago());
		setMoves(new Dragartigli());
		setMoves(new Fossa());
		setMoves(new Oltraggio());
	}
	
	/**
	 * Pre-generated Fraxure Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Fraxure(HiddenAbilities ability){
		super("Fraxure", Type.DRAGO, 117, 70, 40, 50, 67, 66, 4, 40, 144, ability);
		setMoves(new IraDiDrago());
		setMoves(new Dragartigli());
		setMoves(new Fossa());
		setMoves(new Oltraggio());
	}
	
	/**
	 * Fraxure Pokèmon constructor
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
	public Fraxure(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new IraDiDrago());
				break;
			case 2:
				setMoves(new IraDiDrago());
				setMoves(new Dragartigli());
				break;
			case 3:
				setMoves(new IraDiDrago());
				setMoves(new Dragartigli());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new IraDiDrago());
				setMoves(new Dragartigli());
				setMoves(new Fossa());
				setMoves(new Oltraggio());
				break;
		}
	}
	
	/**
	 * Fraxure Pokèmon constructor
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
	public Fraxure(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new IraDiDrago());
				break;
			case 2:
				setMoves(new IraDiDrago());
				setMoves(new Dragartigli());
				break;
			case 3:
				setMoves(new IraDiDrago());
				setMoves(new Dragartigli());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new IraDiDrago());
				setMoves(new Dragartigli());
				setMoves(new Fossa());
				setMoves(new Oltraggio());
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
