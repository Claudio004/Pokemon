package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Energipalla;
import it.pokèmon.basics.Moves.erba.Semebomba;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.Moves.volante.Acrobazia;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Simisage</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ERBA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.erba.Energipalla
 * @see it.pokèmon.basics.Moves.erba.Semebomba
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.Moves.volante.Acrobazia
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Simisage extends Pokèmon{
	
	/**
	 * Pre-generated Simisage Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Simisage(Abilities ability){
		super("Simisage", Type.ERBA, 98, 63, 98, 63, 101, 75, 4, 40, 174, ability);
		setMoves(new Semebomba());
		setMoves(new Fossa());
		setMoves(new Energipalla());
		setMoves(new Acrobazia());
	}
	
	/**
	 * Pre-generated Simisage Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Simisage(HiddenAbilities ability){
		super("Simisage", Type.ERBA, 98, 63, 98, 63, 101, 75, 4, 40, 174, ability);
		setMoves(new Semebomba());
		setMoves(new Fossa());
		setMoves(new Energipalla());
		setMoves(new Acrobazia());
	}
	
	/**
	 * Simisage Pokèmon constructor
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
	public Simisage(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Semebomba());
				break;
			case 2:
				setMoves(new Semebomba());
				setMoves(new Fossa());
				break;
			case 3:
				setMoves(new Semebomba());
				setMoves(new Fossa());
				setMoves(new Energipalla());
				break;
			case 4:
				setMoves(new Semebomba());
				setMoves(new Fossa());
				setMoves(new Energipalla());
				setMoves(new Acrobazia());
				break;
		}
	}
	
	/**
	 * Simisage Pokèmon constructor
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
	public Simisage(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Semebomba());
				break;
			case 2:
				setMoves(new Semebomba());
				setMoves(new Fossa());
				break;
			case 3:
				setMoves(new Semebomba());
				setMoves(new Fossa());
				setMoves(new Energipalla());
				break;
			case 4:
				setMoves(new Semebomba());
				setMoves(new Fossa());
				setMoves(new Energipalla());
				setMoves(new Acrobazia());
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
