package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Fanghiglia;
import it.pokèmon.basics.Moves.acqua.Surf;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.Moves.veleno.Fangobomba;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Seismitoad</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ACQUA</b></li>
 * 	<li>Second Type: <b>TERRA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.veleno.Fangobomba
 * @see it.pokèmon.basics.Moves.acqua.Surf
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.Moves.acqua.Fanghiglia
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Seismitoad extends Pokèmon{
	
	/**
	 * Pre-generated Seismitoad Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Seismitoad(Abilities ability){
		super("Seismitoad", Type.ACQUA, Type.TERRA, 95, 75, 85, 75, 74, 105, 4, 40, 255, ability);
		setMoves(new Fanghiglia());
		setMoves(new Terremoto());
		setMoves(new Fangobomba());
		setMoves(new Surf());
	}
	
	/**
	 * Pre-generated Seismitoad Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Seismitoad(HiddenAbilities ability){
		super("Seismitoad", Type.ACQUA, Type.TERRA, 95, 75, 85, 75, 74, 105, 4, 40, 255, ability);
		setMoves(new Fanghiglia());
		setMoves(new Terremoto());
		setMoves(new Fangobomba());
		setMoves(new Surf());
	}
	
	/**
	 * Seismitoad Pokèmon constructor
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
	public Seismitoad(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ACQUA, Type.TERRA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fanghiglia());
				break;
			case 2:
				setMoves(new Fanghiglia());
				setMoves(new Terremoto());
				break;
			case 3:
				setMoves(new Fanghiglia());
				setMoves(new Terremoto());
				setMoves(new Fangobomba());
				break;
			case 4:
				setMoves(new Fanghiglia());
				setMoves(new Terremoto());
				setMoves(new Fangobomba());
				setMoves(new Surf());
				break;
		}
	}
	
	/**
	 * Seismitoad Pokèmon constructor
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
	public Seismitoad(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ACQUA, Type.TERRA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fanghiglia());
				break;
			case 2:
				setMoves(new Fanghiglia());
				setMoves(new Terremoto());
				break;
			case 3:
				setMoves(new Fanghiglia());
				setMoves(new Terremoto());
				setMoves(new Fangobomba());
				break;
			case 4:
				setMoves(new Fanghiglia());
				setMoves(new Terremoto());
				setMoves(new Fangobomba());
				setMoves(new Surf());
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