package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Energipalla;
import it.pokèmon.basics.Moves.erba.Gigassorbimento;
import it.pokèmon.basics.Moves.veleno.Fangobomba;
import it.pokèmon.basics.Moves.veleno.Velenoshock;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Amoonguss</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ERBA</b></li>
 * 	<li>Second Type: <b>VELENO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.erba.Energipalla
 * @see it.pokèmon.basics.Moves.veleno.Fangobomba
 * @see it.pokèmon.basics.Moves.veleno.Velenoshock
 * @see it.pokèmon.basics.Moves.erba.Gigassorbimento
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Amoonguss extends Pokèmon{
	
	/**
	 * Pre-generated Amoonguss Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Amoonguss(Abilities ability){
		super("Amoonguss", Type.ERBA, Type.VELENO, 85, 70, 85, 80, 30, 114, 4, 40, 162, ability);
		setMoves(new Gigassorbimento());
		setMoves(new Energipalla());
		setMoves(new Fangobomba());
		setMoves(new Velenoshock());
	}
	
	/**
	 * Pre-generated Amoonguss Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Amoonguss(HiddenAbilities ability){
		super("Amoonguss", Type.ERBA, Type.VELENO, 85, 70, 85, 80, 30, 114, 4, 40, 162, ability);
		setMoves(new Gigassorbimento());
		setMoves(new Energipalla());
		setMoves(new Fangobomba());
		setMoves(new Velenoshock());
	}
	
	/**
	 * Amoonguss Pokèmon constructor
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
	public Amoonguss(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ERBA, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
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
				setMoves(new Fangobomba());
				break;
			case 4:
				setMoves(new Gigassorbimento());
				setMoves(new Energipalla());
				setMoves(new Fangobomba());
				setMoves(new Velenoshock());
				break;
		}
	}
	
	/**
	 * Amoonguss Pokèmon constructor
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
	public Amoonguss(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ERBA, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
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
				setMoves(new Fangobomba());
				break;
			case 4:
				setMoves(new Gigassorbimento());
				setMoves(new Energipalla());
				setMoves(new Fangobomba());
				setMoves(new Velenoshock());
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