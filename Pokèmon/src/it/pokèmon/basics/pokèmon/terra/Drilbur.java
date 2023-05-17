package it.pokèmon.basics.pokèmon.terra;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.Moves.acciaio.Ferrartigli;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Drilbur</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>TERRA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.Moves.acciaio.Ferrartigli
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Drilbur extends Pokèmon{
	
	/**
	 * Pre-generated Drilbur Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Drilbur(Abilities ability){
		super("Drilbur", Type.TERRA, 85, 40, 30, 45, 68, 60, 4, 20, 66, ability);
		setMoves(new Ferrartigli());
		setMoves(new Fossa());
		setMoves(new ForbiceX());
		setMoves(new Terremoto());
	}
	
	/**
	 * Pre-generated Drilbur Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Drilbur(HiddenAbilities ability){
		super("Drilbur", Type.TERRA, 85, 40, 30, 45, 68, 60, 4, 20, 66, ability);
		setMoves(new Ferrartigli());
		setMoves(new Fossa());
		setMoves(new ForbiceX());
		setMoves(new Terremoto());
	}
		
	/**
	 * Drilbur Pokèmon constructor
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
	public Drilbur(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.TERRA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ferrartigli());
				break;
			case 2:
				setMoves(new Ferrartigli());
				setMoves(new Fossa());
				break;
			case 3:
				setMoves(new Ferrartigli());
				setMoves(new Fossa());
				setMoves(new ForbiceX());
				break;
			case 4:
				setMoves(new Ferrartigli());
				setMoves(new Fossa());
				setMoves(new ForbiceX());
				setMoves(new Terremoto());
				break;
		}
	}
	
	/**
	 * Drilbur Pokèmon constructor
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
	public Drilbur(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.TERRA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ferrartigli());
				break;
			case 2:
				setMoves(new Ferrartigli());
				setMoves(new Fossa());
				break;
			case 3:
				setMoves(new Ferrartigli());
				setMoves(new Fossa());
				setMoves(new ForbiceX());
				break;
			case 4:
				setMoves(new Ferrartigli());
				setMoves(new Fossa());
				setMoves(new ForbiceX());
				setMoves(new Terremoto());
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