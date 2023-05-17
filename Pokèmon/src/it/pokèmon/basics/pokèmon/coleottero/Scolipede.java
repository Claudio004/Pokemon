package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.Moves.veleno.Velenocoda;
import it.pokèmon.basics.Moves.veleno.Velenpuntura;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Scolipede</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>VELENO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.Moves.veleno.Velenocoda
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.veleno.Velenpuntura
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Scolipede extends Pokèmon{
	
	/**
	 * Pre-generated Scolipede Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Scolipede(Abilities ability){
		super("Scolipede", Type.COLEOTTERO, Type.VELENO, 100, 89, 55, 69, 112, 60, 4, 35, 214, ability);
		setMoves(new Velenocoda());
		setMoves(new Velenpuntura());
		setMoves(new Terremoto());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Pre-generated Scolipede Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Scolipede(HiddenAbilities ability){
		super("Scolipede", Type.COLEOTTERO, Type.VELENO, 100, 89, 55, 69, 112, 60, 4, 35, 214, ability);
		setMoves(new Velenocoda());
		setMoves(new Velenpuntura());
		setMoves(new Terremoto());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Scolipede Pokèmon constructor
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
	public Scolipede(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Velenocoda());
				break;
			case 2:
				setMoves(new Velenocoda());
				setMoves(new Velenpuntura());
				break;
			case 3:
				setMoves(new Velenocoda());
				setMoves(new Velenpuntura());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Velenocoda());
				setMoves(new Velenpuntura());
				setMoves(new Terremoto());
				setMoves(new ForbiceX());
				break;
		}
	}
	
	/**
	 * Scolipede Pokèmon constructor
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
	public Scolipede(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Velenocoda());
				break;
			case 2:
				setMoves(new Velenocoda());
				setMoves(new Velenpuntura());
				break;
			case 3:
				setMoves(new Velenocoda());
				setMoves(new Velenpuntura());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Velenocoda());
				setMoves(new Velenpuntura());
				setMoves(new Terremoto());
				setMoves(new ForbiceX());
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