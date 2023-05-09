package it.pokèmon.basics.pokèmon.drago;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.drago.IraDiDrago;
import it.pokèmon.basics.Moves.normale.Graffio;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Axew</b><br>
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
 * @see it.pokèmon.basics.Moves.normale.Graffio
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
public class Axew extends Pokèmon{
	
	/**
	 * Pre-generated Axew Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Axew(Abilities ability){
		super("Axew", Type.DRAGO, 87, 60, 30, 40, 57, 46, 3, 10, 64, ability);
		setMoves(new Graffio());
		setMoves(new IraDiDrago());
		setMoves(new Fossa());
	}
	
	/**
	 * Pre-generated Axew Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Axew(HiddenAbilities ability){
		super("Axew", Type.DRAGO, 87, 60, 30, 40, 57, 46, 3, 10, 64, ability);
		setMoves(new Graffio());
		setMoves(new IraDiDrago());
		setMoves(new Fossa());
	}
	
	/**
	 * Axew Pokèmon constructor
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
	public Axew(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Graffio());
				break;
			case 2:
				setMoves(new Graffio());
				setMoves(new IraDiDrago());
				break;
			case 3:
				setMoves(new Graffio());
				setMoves(new IraDiDrago());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Graffio());
				setMoves(new IraDiDrago());
				setMoves(new Fossa());
				setMoves(new Aeroassalto());
				break;
		}
	}
	
	/**
	 * Axew Pokèmon constructor
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
	public Axew(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Graffio());
				break;
			case 2:
				setMoves(new Graffio());
				setMoves(new IraDiDrago());
				break;
			case 3:
				setMoves(new Graffio());
				setMoves(new IraDiDrago());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Graffio());
				setMoves(new IraDiDrago());
				setMoves(new Fossa());
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
