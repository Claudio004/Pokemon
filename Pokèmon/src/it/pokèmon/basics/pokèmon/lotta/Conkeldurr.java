package it.pokèmon.basics.pokèmon.lotta;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Fuocopugno;
import it.pokèmon.basics.Moves.lotta.Breccia;
import it.pokèmon.basics.Moves.lotta.Martelpugno;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Conkeldurr</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>LOTTA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.fuoco.Fuocopugno
 * @see it.pokèmon.basics.Moves.lotta.Breccia
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.Moves.lotta.Martelpugno
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Conkeldurr extends Pokèmon{
	
	/**
	 * Pre-generated Conkeldurr Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Conkeldurr(Abilities ability){
		super("Conkeldurr", Type.LOTTA, 149, 95, 55, 65, 45, 105, 4, 45, 253, ability);
		setMoves(new Terremoto());
		setMoves(new Breccia());
		setMoves(new Fuocopugno());
		setMoves(new Martelpugno());
	}
	
	/**
	 * Pre-generated Conkeldurr Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Conkeldurr(HiddenAbilities ability){
		super("Conkeldurr", Type.LOTTA, 140, 95, 55, 65, 45, 105, 4, 45, 253, ability);
		setMoves(new Terremoto());
		setMoves(new Breccia());
		setMoves(new Fuocopugno());
		setMoves(new Martelpugno());
	}
	
	/**
	 * Conkeldurr Pokèmon constructor
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
	public Conkeldurr(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Terremoto());
				break;
			case 2:
				setMoves(new Terremoto());
				setMoves(new Breccia());
				break;
			case 3:
				setMoves(new Terremoto());
				setMoves(new Breccia());
				setMoves(new Fuocopugno());
				break;
			case 4:
				setMoves(new Terremoto());
				setMoves(new Breccia());
				setMoves(new Fuocopugno());
				setMoves(new Martelpugno());
				break;
		}
	}
	
	/**
	 * Conkeldurr Pokèmon constructor
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
	public Conkeldurr(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Terremoto());
				break;
			case 2:
				setMoves(new Terremoto());
				setMoves(new Breccia());
				break;
			case 3:
				setMoves(new Terremoto());
				setMoves(new Breccia());
				setMoves(new Fuocopugno());
				break;
			case 4:
				setMoves(new Terremoto());
				setMoves(new Breccia());
				setMoves(new Fuocopugno());
				setMoves(new Martelpugno());
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