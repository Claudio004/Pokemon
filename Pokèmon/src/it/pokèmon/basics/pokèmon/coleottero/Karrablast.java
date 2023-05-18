package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Entomoblocco;
import it.pokèmon.basics.Moves.coleottero.Coleomorso;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.veleno.Velenpuntura;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Karrablast</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.coleottero.Coleomorso
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.coleottero.Entomoblocco
 * @see it.pokèmon.basics.Moves.veleno.Velenpuntura
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Karrablast extends Pokèmon{
	
	/**
	 * Pre-generated Karrablast Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Karrablast(Abilities ability){
		super("Karrablast", Type.COLEOTTERO, 75, 45, 40, 45, 60, 50, 4, 25, 63, ability);
		setMoves(new ForbiceX());
		setMoves(new Entomoblocco());
		setMoves(new Velenpuntura());
		setMoves(new Coleomorso());
	}
	
	/**
	 * Pre-generated Karrablast Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Karrablast(HiddenAbilities ability){
		super("Karrablast", Type.COLEOTTERO, 75, 45, 40, 45, 60, 50, 4, 25, 63, ability);
		setMoves(new ForbiceX());
		setMoves(new Entomoblocco());
		setMoves(new Velenpuntura());
		setMoves(new Coleomorso());
	}
	
	/**
	 * Karrablast Pokèmon constructor
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
	public Karrablast(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new ForbiceX());
				break;
			case 2:
				setMoves(new ForbiceX());
				setMoves(new Entomoblocco());
				break;
			case 3:
				setMoves(new ForbiceX());
				setMoves(new Entomoblocco());
				setMoves(new Velenpuntura());
				break;
			case 4:
				setMoves(new ForbiceX());
				setMoves(new Entomoblocco());
				setMoves(new Velenpuntura());
				setMoves(new Coleomorso());
				break;
		}
	}
	
	/**
	 * Karrablast Pokèmon constructor
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
	public Karrablast(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new ForbiceX());
				break;
			case 2:
				setMoves(new ForbiceX());
				setMoves(new Entomoblocco());
				break;
			case 3:
				setMoves(new ForbiceX());
				setMoves(new Entomoblocco());
				setMoves(new Velenpuntura());
				break;
			case 4:
				setMoves(new ForbiceX());
				setMoves(new Entomoblocco());
				setMoves(new Velenpuntura());
				setMoves(new Coleomorso());
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