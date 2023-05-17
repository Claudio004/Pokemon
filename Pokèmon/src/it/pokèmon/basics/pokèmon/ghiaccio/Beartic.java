package it.pokèmon.basics.pokèmon.ghiaccio;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.ghiaccio.Gelopugno;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.Moves.ghiaccio.Scagliagelo;
import it.pokèmon.basics.Moves.spettro.Ombrartigli;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Beartic</b><br>
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
 * @see it.pokèmon.basics.Moves.ghiaccio.Scagliagelo
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Beartic extends Pokèmon{
	
	/**
	 * Pre-generated Beartic Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Beartic(Abilities ability){
		super("Beartic", Type.GHIACCIO, 130, 80, 70, 80, 50, 95, 4, 40, 170, ability);
		setMoves(new Geloraggio());
		setMoves(new Gelopugno());
		setMoves(new Ombrartigli());
		setMoves(new Scagliagelo());
	}
	
	/**
	 * Pre-generated Beartic Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Beartic(HiddenAbilities ability){
		super("Beartic", Type.GHIACCIO, 130, 80, 70, 80, 50, 95, 4, 40, 170, ability);
		setMoves(new Geloraggio());
		setMoves(new Gelopugno());
		setMoves(new Ombrartigli());
		setMoves(new Scagliagelo());
	}
	
	/**
	 * Beartic Pokèmon constructor
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
	public Beartic(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
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
				setMoves(new Scagliagelo());
				break;
		}
	}
	
	/**
	 * Beartic Pokèmon constructor
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
	public Beartic(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
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
				setMoves(new Scagliagelo());
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