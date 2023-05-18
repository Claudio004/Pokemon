package it.pokèmon.basics.pokèmon.fuoco;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Fuocopugno;
import it.pokèmon.basics.Moves.fuoco.Fuococarica;
import it.pokèmon.basics.Moves.psico.CozzataZen;
import it.pokèmon.basics.Moves.roccia.Frana;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Darmanitan</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>FUOCO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.psico.CozzataZen
 * @see it.pokèmon.basics.Moves.fuoco.Fuocopugno
 * @see it.pokèmon.basics.Moves.fuoco.Fuococarica
 * @see it.pokèmon.basics.Moves.roccia.Frana
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Darmanitan extends Pokèmon{
	
	/**
	 * Pre-generated Darmanitan Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Darmanitan(Abilities ability){
		super("Darmanitan", Type.FUOCO, 140, 55, 30, 55, 95, 105, 4, 35, 168, ability);
		setMoves(new Fuococarica());
		setMoves(new Fuocopugno());
		setMoves(new Frana());
		setMoves(new CozzataZen());
	}
	
	/**
	 * Pre-generated Darmanitan Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Darmanitan(HiddenAbilities ability){
		super("Darmanitan", Type.FUOCO, 140, 55, 30, 55, 95, 105, 4, 35, 168, ability);
		setMoves(new Fuococarica());
		setMoves(new Fuocopugno());
		setMoves(new Frana());
		setMoves(new CozzataZen());
	}
	
	/**
	 * Darmanitan Pokèmon constructor
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
	public Darmanitan(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fuococarica());
				break;
			case 2:
				setMoves(new Fuococarica());
				setMoves(new Fuocopugno());
				break;
			case 3:
				setMoves(new Fuococarica());
				setMoves(new Fuocopugno());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Fuococarica());
				setMoves(new Fuocopugno());
				setMoves(new Frana());
				setMoves(new CozzataZen());
				break;
		}
	}
	
	/**
	 * Darmanitan Pokèmon constructor
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
	public Darmanitan(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fuococarica());
				break;
			case 2:
				setMoves(new Fuococarica());
				setMoves(new Fuocopugno());
				break;
			case 3:
				setMoves(new Fuococarica());
				setMoves(new Fuocopugno());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Fuococarica());
				setMoves(new Fuocopugno());
				setMoves(new Frana());
				setMoves(new CozzataZen());
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