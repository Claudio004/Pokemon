package it.pokèmon.basics.pokèmon.drago;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.drago.Dragartigli;
import it.pokèmon.basics.Moves.drago.Oltraggio;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Haxorus</b><br>
 * Extends Pokèmon<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>DRAGO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.Moves.drago.Oltraggio
 * @see it.pokèmon.basics.Moves.drago.Dragartigli
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
public class Haxorus extends Pokèmon{
	
	/**
	 * Pre-generated Haxorus Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Haxorus(Abilities ability){
		super("Haxorus", Type.DRAGO, 147, 90, 60, 70, 97, 76, 4, 50, 270, ability);
		setMoves(new Dragartigli());
		setMoves(new Oltraggio());
		setMoves(new Terremoto());
		setMoves(new Aeroassalto());
	}
	
	/**
	 * Pre-generated Haxorus Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Haxorus(HiddenAbilities ability){
		super("Haxorus", Type.DRAGO, 147, 90, 60, 70, 97, 76, 4, 50, 270, ability);
		setMoves(new Dragartigli());
		setMoves(new Oltraggio());
		setMoves(new Terremoto());
		setMoves(new Aeroassalto());
	}
	
	/**
	 * Haxorus Pokèmon constructor
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
	public Haxorus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Dragartigli());
				break;
			case 2:
				setMoves(new Dragartigli());
				setMoves(new Oltraggio());
				break;
			case 3:
				setMoves(new Dragartigli());
				setMoves(new Oltraggio());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Dragartigli());
				setMoves(new Oltraggio());
				setMoves(new Terremoto());
				setMoves(new Aeroassalto());
				break;
		}
	}
	
	/**
	 * Haxorus Pokèmon constructor
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
	public Haxorus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Dragartigli());
				break;
			case 2:
				setMoves(new Dragartigli());
				setMoves(new Oltraggio());
				break;
			case 3:
				setMoves(new Dragartigli());
				setMoves(new Oltraggio());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Dragartigli());
				setMoves(new Oltraggio());
				setMoves(new Terremoto());
				setMoves(new Aeroassalto());
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
