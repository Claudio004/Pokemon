package it.pokèmon.basics.pokèmon.roccia;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Cannonflash;
import it.pokèmon.basics.Moves.roccia.Abbattimento;
import it.pokèmon.basics.Moves.roccia.Frana;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Boldore</b><br>
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
 * @see it.pokèmon.basics.Moves.roccia.Abbattimento
 * @see it.pokèmon.basics.Moves.acciaio.Cannonflash
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Boldore extends Pokèmon{
		
	/**
	 * Pre-generated Boldore Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Boldore(Abilities ability){
		super("Boldore", Type.ROCCIA, 105, 105, 50, 40, 20, 70, 4, 25, 56, ability);
		setMoves(new Abbattimento());
		setMoves(new Frana());
		setMoves(new Terremoto());
		setMoves(new Cannonflash());
	}
	
	/**
	 * Pre-generated Boldore Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Boldore(HiddenAbilities ability){
		super("Boldore", Type.ROCCIA, 105, 105, 50, 40, 20, 70, 4, 25, 56, ability);
		setMoves(new Abbattimento());
		setMoves(new Frana());
		setMoves(new Terremoto());
		setMoves(new Cannonflash());
	}
		
	/**
	 * Boldore Pokèmon constructor
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
	public Boldore(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ROCCIA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Abbattimento());
				break;
			case 2:
				setMoves(new Abbattimento());
				setMoves(new Frana());
				break;
			case 3:
				setMoves(new Abbattimento());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Abbattimento());
				setMoves(new Frana());
				setMoves(new Terremoto());
				setMoves(new Cannonflash());
				break;
		}
	}
	
	/**
	 * Boldore Pokèmon constructor
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
	public Boldore(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ROCCIA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Abbattimento());
				break;
			case 2:
				setMoves(new Abbattimento());
				setMoves(new Frana());
				break;
			case 3:
				setMoves(new Abbattimento());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Abbattimento());
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