package it.pokèmon.basics.pokèmon.psico;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Cannonflash;
import it.pokèmon.basics.Moves.erba.Energipalla;
import it.pokèmon.basics.Moves.psico.Frana;
import it.pokèmon.basics.Moves.spettro.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Musharna</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>PSICO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.spettro.Terremoto
 * @see it.pokèmon.basics.Moves.psico.Frana
 * @see it.pokèmon.basics.Moves.erba.Energipalla
 * @see it.pokèmon.basics.Moves.coleottero.Cannonflash
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Musharna extends Pokèmon{
		
	/**
	 * Pre-generated Musharna Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Musharna(Abilities ability){
		super("Musharna", Type.PSICO, 55, 85, 107, 95, 29, 116, 4, 40, 170, ability);
		setMoves(new Energipalla());
		setMoves(new Frana());
		setMoves(new Terremoto());
		setMoves(new Cannonflash());
	}
	
	/**
	 * Pre-generated Musharna Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Musharna(HiddenAbilities ability){
		super("Musharna", Type.PSICO, 55, 85, 107, 95, 29, 116, 4, 40, 170, ability);
		setMoves(new Energipalla());
		setMoves(new Frana());
		setMoves(new Terremoto());
		setMoves(new Cannonflash());
	}
		
	/**
	 * Musharna Pokèmon constructor
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
	public Musharna(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.PSICO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Energipalla());
				break;
			case 2:
				setMoves(new Energipalla());
				setMoves(new Frana());
				break;
			case 3:
				setMoves(new Energipalla());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Energipalla());
				setMoves(new Frana());
				setMoves(new Terremoto());
				setMoves(new Cannonflash());
				break;
		}
	}
	
	/**
	 * Musharna Pokèmon constructor
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
	public Musharna(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.PSICO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Energipalla());
				break;
			case 2:
				setMoves(new Energipalla());
				setMoves(new Frana());
				break;
			case 3:
				setMoves(new Energipalla());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Energipalla());
				setMoves(new Frana());
				setMoves(new Terremoto());
				setMoves(new Cannonflash());
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