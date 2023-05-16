package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.normale.Sdoppiatore;
import it.pokèmon.basics.Moves.normale.Nemesi;
import it.pokèmon.basics.Moves.spettro.Terremoto;
import it.pokèmon.basics.Moves.psico.CozzataZen;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Audino</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>NORMALE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.normale.Sdoppiatore
 * @see it.pokèmon.basics.Moves.normale.Nemesi
 * @see it.pokèmon.basics.Moves.spettro.Terremoto
 * @see it.pokèmon.basics.Moves.psico.CozzataZen
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Audino extends Pokèmon{
	
	/**
	 * Pre-generated Audino Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Audino(Abilities ability){
		super("Audino", Type.NORMALE, 60, 86, 60, 86, 50, 103, 4, 60, 390, ability);
		setMoves(new Sdoppiatore());
		setMoves(new Terremoto());
		setMoves(new CozzataZen());
		setMoves(new Nemesi());
	}
	
	/**
	 * Pre-generated Audino Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Audino(HiddenAbilities ability){
		super("Audino", Type.NORMALE, 60, 86, 60, 86, 50, 103, 4, 60, 390, ability);
		setMoves(new Sdoppiatore());
		setMoves(new Terremoto());
		setMoves(new CozzataZen());
		setMoves(new Nemesi());
	}
		
	/**
	 * Audino Pokèmon constructor
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
	public Audino(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sdoppiatore());
				break;
			case 2:
				setMoves(new Sdoppiatore());
				setMoves(new Terremoto());
				break;
			case 3:
				setMoves(new Sdoppiatore());
				setMoves(new Terremoto());
				setMoves(new CozzataZen());
				break;
			case 4:
				setMoves(new Sdoppiatore());
				setMoves(new Terremoto());
				setMoves(new CozzataZen());
				setMoves(new Nemesi());
				break;
		}
	}
	
	/**
	 * Audino Pokèmon constructor
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
	public Audino(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sdoppiatore());
				break;
			case 2:
				setMoves(new Sdoppiatore());
				setMoves(new Terremoto());
				break;
			case 3:
				setMoves(new Sdoppiatore());
				setMoves(new Terremoto());
				setMoves(new CozzataZen());
				break;
			case 4:
				setMoves(new Sdoppiatore());
				setMoves(new Terremoto());
				setMoves(new CozzataZen());
				setMoves(new Nemesi());
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