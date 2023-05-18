package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Energipalla;
import it.pokèmon.basics.Moves.erba.Gigassorbimento;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.Moves.normale.Coro;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Whimsicott</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ERBA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.spettro.PallaOmbra
 * @see it.pokèmon.basics.Moves.erba.Gigassorbimento
 * @see it.pokèmon.basics.Moves.erba.Energipalla
 * @see it.pokèmon.basics.Moves.normale.Coro
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Whimsicott extends Pokèmon{
	
	/**
	 * Pre-generated Whimsicott Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Whimsicott(Abilities ability){
		super("Whimsicott", Type.ERBA, 67, 85, 77, 75, 116, 60, 4, 35, 168, ability);
		setMoves(new Gigassorbimento());
		setMoves(new Energipalla());
		setMoves(new Coro());
		setMoves(new PallaOmbra());
	}
	
	/**
	 * Pre-generated Whimsicott Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Whimsicott(HiddenAbilities ability){
		super("Whimsicott", Type.ERBA, 67, 85, 77, 75, 116, 60, 4, 35, 168, ability);
		setMoves(new Gigassorbimento());
		setMoves(new Energipalla());
		setMoves(new Coro());
		setMoves(new PallaOmbra());
	}
	
	/**
	 * Whimsicott Pokèmon constructor
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
	public Whimsicott(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Gigassorbimento());
				break;
			case 2:
				setMoves(new Gigassorbimento());
				setMoves(new Energipalla());
				break;
			case 3:
				setMoves(new Gigassorbimento());
				setMoves(new Energipalla());
				setMoves(new Coro());
				break;
			case 4:
				setMoves(new Gigassorbimento());
				setMoves(new Energipalla());
				setMoves(new Coro());
				setMoves(new PallaOmbra());
				break;
		}
	}
	
	/**
	 * Whimsicott Pokèmon constructor
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
	public Whimsicott(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Gigassorbimento());
				break;
			case 2:
				setMoves(new Gigassorbimento());
				setMoves(new Energipalla());
				break;
			case 3:
				setMoves(new Gigassorbimento());
				setMoves(new Energipalla());
				setMoves(new Coro());
				break;
			case 4:
				setMoves(new Gigassorbimento());
				setMoves(new Energipalla());
				setMoves(new Coro());
				setMoves(new PallaOmbra());
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