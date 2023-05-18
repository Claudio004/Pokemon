package it.pokèmon.basics.pokèmon.lotta;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Fuocopugno;
import it.pokèmon.basics.Moves.lotta.Vendetta;
import it.pokèmon.basics.Moves.lotta.Vitaltiro;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Throh</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>LOTTA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.fuoco.Fuocopugno
 * @see it.pokèmon.basics.Moves.lotta.Vendetta
 * @see it.pokèmon.basics.Moves.lotta.Vitaltiro
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Throh extends Pokèmon{
	
	/**
	 * Pre-generated Throh Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Throh(Abilities ability){
		super("Throh", Type.LOTTA, 100, 85, 30, 85, 45, 120, 4, 30, 163, ability);
		setMoves(new Vitaltiro());
		setMoves(new Vendetta());
		setMoves(new Fuocopugno());
		setMoves(new Terremoto());
	}
	
	/**
	 * Pre-generated Throh Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Throh(HiddenAbilities ability){
		super("Throh", Type.LOTTA, 100, 85, 30, 85, 45, 120, 4, 30, 163, ability);
		setMoves(new Vitaltiro());
		setMoves(new Vendetta());
		setMoves(new Fuocopugno());
		setMoves(new Terremoto());
	}
	
	/**
	 * Throh Pokèmon constructor
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
	public Throh(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Vitaltiro());
				break;
			case 2:
				setMoves(new Vitaltiro());
				setMoves(new Vendetta());
				break;
			case 3:
				setMoves(new Vitaltiro());
				setMoves(new Vendetta());
				setMoves(new Fuocopugno());
				break;
			case 4:
				setMoves(new Vitaltiro());
				setMoves(new Vendetta());
				setMoves(new Fuocopugno());
				setMoves(new Terremoto());
				break;
		}
	}
	
	/**
	 * Throh Pokèmon constructor
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
	public Throh(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Vitaltiro());
				break;
			case 2:
				setMoves(new Vitaltiro());
				setMoves(new Vendetta());
				break;
			case 3:
				setMoves(new Vitaltiro());
				setMoves(new Vendetta());
				setMoves(new Fuocopugno());
				break;
			case 4:
				setMoves(new Vitaltiro());
				setMoves(new Vendetta());
				setMoves(new Fuocopugno());
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
