package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Fogliamagica;
import it.pokèmon.basics.Moves.erba.Gigassorbimento;
import it.pokèmon.basics.Moves.erba.Energipalla;
import it.pokèmon.basics.Moves.normale.Coro;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Lilligant</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ERBA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.erba.Energipalla
 * @see it.pokèmon.basics.Moves.erba.Gigassorbimento
 * @see it.pokèmon.basics.Moves.erba.Fogliamagica
 * @see it.pokèmon.basics.Moves.normale.Coro
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Lilligant extends Pokèmon{
	
	/**
	 * Pre-generated Lilligant Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Lilligant(Abilities ability){
		super("Lilligant", Type.ERBA, 60, 75, 110, 75, 90, 70, 4, 35, 168, ability);
		setMoves(new Gigassorbimento());
		setMoves(new Fogliamagica());
		setMoves(new Coro());
		setMoves(new Energipalla());
	}
	
	/**
	 * Pre-generated Lilligant Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Lilligant(HiddenAbilities ability){
		super("Lilligant", Type.ERBA, 60, 75, 110, 75, 90, 70, 4, 35, 168, ability);
		setMoves(new Gigassorbimento());
		setMoves(new Fogliamagica());
		setMoves(new Coro());
		setMoves(new Energipalla());
	}
	
	/**
	 * Lilligant Pokèmon constructor
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
	public Lilligant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Gigassorbimento());
				break;
			case 2:
				setMoves(new Gigassorbimento());
				setMoves(new Fogliamagica());
				break;
			case 3:
				setMoves(new Gigassorbimento());
				setMoves(new Fogliamagica());
				setMoves(new Coro());
				break;
			case 4:
				setMoves(new Gigassorbimento());
				setMoves(new Fogliamagica());
				setMoves(new Coro());
				setMoves(new Energipalla());
				break;
		}
	}
	
	/**
	 * Lilligant Pokèmon constructor
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
	public Lilligant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Gigassorbimento());
				break;
			case 2:
				setMoves(new Gigassorbimento());
				setMoves(new Fogliamagica());
				break;
			case 3:
				setMoves(new Gigassorbimento());
				setMoves(new Fogliamagica());
				setMoves(new Coro());
				break;
			case 4:
				setMoves(new Gigassorbimento());
				setMoves(new Fogliamagica());
				setMoves(new Coro());
				setMoves(new Energipalla());
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