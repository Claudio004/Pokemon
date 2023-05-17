package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.roccia.Pietrataglio;
import it.pokèmon.basics.Moves.roccia.Frana;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Crustle</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>ROCCIA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.roccia.Frana
 * @see it.pokèmon.basics.Moves.roccia.Pietrataglio
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Crustle extends Pokèmon{
	
	/**
	 * Pre-generated Crustle Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Crustle(Abilities ability){
		super("Crustle", Type.COLEOTTERO, Type.ROCCIA, 105, 125, 65, 75, 45, 70, 4, 35, 166, ability);
		setMoves(new Frana());
		setMoves(new Pietrataglio());
		setMoves(new ForbiceX());
		setMoves(new Fossa());
	}
	
	/**
	 * Pre-generated Crustle Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Crustle(HiddenAbilities ability){
		super("Crustle", Type.COLEOTTERO, Type.ROCCIA, 105, 125, 65, 75, 45, 70, 4, 35, 166, ability);
		setMoves(new Frana());
		setMoves(new Pietrataglio());
		setMoves(new ForbiceX());
		setMoves(new Fossa());
	}
	
	/**
	 * Crustle Pokèmon constructor
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
	public Crustle(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.ROCCIA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Frana());
				break;
			case 2:
				setMoves(new Frana());
				setMoves(new Pietrataglio());
				break;
			case 3:
				setMoves(new Frana());
				setMoves(new Pietrataglio());
				setMoves(new ForbiceX());
				break;
			case 4:
				setMoves(new Frana());
				setMoves(new Pietrataglio());
				setMoves(new ForbiceX());
				setMoves(new Fossa());
				break;
		}
	}
	
	/**
	 * Crustle Pokèmon constructor
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
	public Crustle(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.ROCCIA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Frana());
				break;
			case 2:
				setMoves(new Frana());
				setMoves(new Pietrataglio());
				break;
			case 3:
				setMoves(new Frana());
				setMoves(new Pietrataglio());
				setMoves(new ForbiceX());
				break;
			case 4:
				setMoves(new Frana());
				setMoves(new Pietrataglio());
				setMoves(new ForbiceX());
				setMoves(new Fossa());
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