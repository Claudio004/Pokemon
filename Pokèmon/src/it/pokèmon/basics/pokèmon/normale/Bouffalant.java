package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.lotta.Vendetta;
import it.pokèmon.basics.Moves.normale.Nemesi;
import it.pokèmon.basics.Moves.normale.Ricciolata;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Bouffalant</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>NORMALE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.lotta.Vendetta
 * @see it.pokèmon.basics.Moves.normale.Nemesi
 * @see it.pokèmon.basics.Moves.normale.Ricciolata
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Bouffalant extends Pokèmon{
	
	/**
	 * Pre-generated Bouffalant Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Bouffalant(Abilities ability){
		super("Bouffalant", Type.NORMALE, 110, 95, 40, 95, 55, 95, 4, 40, 172, ability);
		setMoves(new Vendetta());
		setMoves(new Ricciolata());
		setMoves(new Terremoto());
		setMoves(new Nemesi());
	}
	
	/**
	 * Pre-generated Bouffalant Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Bouffalant(HiddenAbilities ability){
		super("Bouffalant", Type.NORMALE, 110, 95, 40, 95, 55, 95, 4, 40, 172, ability);
		setMoves(new Vendetta());
		setMoves(new Ricciolata());
		setMoves(new Terremoto());
		setMoves(new Nemesi());
	}
		
	/**
	 * Bouffalant Pokèmon constructor
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
	public Bouffalant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ricciolata());
				break;
			case 2:
				setMoves(new Vendetta());
				setMoves(new Ricciolata());
				break;
			case 3:
				setMoves(new Vendetta());
				setMoves(new Ricciolata());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Vendetta());
				setMoves(new Ricciolata());
				setMoves(new Terremoto());
				setMoves(new Nemesi());
				break;
		}
	}
	
	/**
	 * Bouffalant Pokèmon constructor
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
	public Bouffalant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ricciolata());
				break;
			case 2:
				setMoves(new Vendetta());
				setMoves(new Ricciolata());
				break;
			case 3:
				setMoves(new Vendetta());
				setMoves(new Ricciolata());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Vendetta());
				setMoves(new Ricciolata());
				setMoves(new Terremoto());
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
