package it.pokèmon.basics.pokèmon.ghiaccio;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.spettro.Ombrartigli;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.Moves.ghiaccio.Gelopugno;
import it.pokèmon.basics.Moves.ghiaccio.Ventogelato;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Cubchoo</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>GHIACCIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.spettro.Ombrartigli
 * @see it.pokèmon.basics.Moves.ghiaccio.Geloraggio
 * @see it.pokèmon.basics.Moves.ghiaccio.Gelopugno
 * @see it.pokèmon.basics.Moves.ghiaccio.Ventogelato
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Cubchoo extends Pokèmon{
	
	/**
	 * Pre-generated Cubchoo Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Cubchoo(Abilities ability){
		super("Cubchoo", Type.GHIACCIO, 70, 40, 60, 50, 40, 55, 4, 25, 61, ability);
		setMoves(new Geloraggio());
		setMoves(new Gelopugno());
		setMoves(new Ombrartigli());
		setMoves(new Ventogelato());
	}
	
	/**
	 * Pre-generated Cubchoo Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Cubchoo(HiddenAbilities ability){
		super("Cubchoo", Type.GHIACCIO, 70, 40, 60, 50, 40, 55, 4, 25, 61, ability);
		setMoves(new Geloraggio());
		setMoves(new Gelopugno());
		setMoves(new Ombrartigli());
		setMoves(new Ventogelato());
	}
	
	/**
	 * Cubchoo Pokèmon constructor
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
	public Cubchoo(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.GHIACCIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Geloraggio());
				break;
			case 2:
				setMoves(new Geloraggio());
				setMoves(new Gelopugno());
				break;
			case 3:
				setMoves(new Geloraggio());
				setMoves(new Gelopugno());
				setMoves(new Ombrartigli());
				break;
			case 4:
				setMoves(new Geloraggio());
				setMoves(new Gelopugno());
				setMoves(new Ombrartigli());
				setMoves(new Ventogelato());
				break;
		}
	}
	
	/**
	 * Cubchoo Pokèmon constructor
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
	public Cubchoo(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.GHIACCIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Geloraggio());
				break;
			case 2:
				setMoves(new Geloraggio());
				setMoves(new Gelopugno());
				break;
			case 3:
				setMoves(new Geloraggio());
				setMoves(new Gelopugno());
				setMoves(new Ombrartigli());
				break;
			case 4:
				setMoves(new Geloraggio());
				setMoves(new Gelopugno());
				setMoves(new Ombrartigli());
				setMoves(new Ventogelato());
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