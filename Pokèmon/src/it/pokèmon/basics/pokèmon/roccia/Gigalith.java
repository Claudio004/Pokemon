package it.pokèmon.basics.pokèmon.roccia;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Cannonflash;
import it.pokèmon.basics.Moves.acciaio.Metaltestata;
import it.pokèmon.basics.Moves.roccia.Frana;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Gigalith</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ROCCIA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.Moves.roccia.Frana
 * @see it.pokèmon.basics.Moves.acciaio.Metaltestata
 * @see it.pokèmon.basics.Moves.acciaio.Cannonflash
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Gigalith extends Pokèmon{
		
	/**
	 * Pre-generated Gigalith Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Gigalith(Abilities ability){
		super("Gigalith", Type.ROCCIA, 135, 130, 60, 80, 25, 85, 4, 45, 258, ability);
		setMoves(new Metaltestata());
		setMoves(new Frana());
		setMoves(new Terremoto());
		setMoves(new Cannonflash());
	}
	
	/**
	 * Pre-generated Gigalith Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Gigalith(HiddenAbilities ability){
		super("Gigalith", Type.ROCCIA, 135, 130, 60, 80, 25, 85, 4, 45, 258, ability);
		setMoves(new Metaltestata());
		setMoves(new Frana());
		setMoves(new Terremoto());
		setMoves(new Cannonflash());
	}
		
	/**
	 * Gigalith Pokèmon constructor
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
	public Gigalith(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ROCCIA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Metaltestata());
				break;
			case 2:
				setMoves(new Metaltestata());
				setMoves(new Frana());
				break;
			case 3:
				setMoves(new Metaltestata());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Metaltestata());
				setMoves(new Frana());
				setMoves(new Terremoto());
				setMoves(new Cannonflash());
				break;
		}
	}
	
	/**
	 * Gigalith Pokèmon constructor
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
	public Gigalith(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ROCCIA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Metaltestata());
				break;
			case 2:
				setMoves(new Metaltestata());
				setMoves(new Frana());
				break;
			case 3:
				setMoves(new Metaltestata());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Metaltestata());
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