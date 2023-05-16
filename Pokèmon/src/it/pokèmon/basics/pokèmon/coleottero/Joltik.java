package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Coleomorso;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.elettro.Elettrotela;
import it.pokèmon.basics.Moves.veleno.Velenpuntura;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Joltik</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>ELETTRO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.coleottero.Coleomorso
 * @see it.pokèmon.basics.Moves.elettro.Elettrotela
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.veleno.Velenpuntura
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Joltik extends Pokèmon{
	
	/**
	 * Pre-generated Joltik Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Joltik(Abilities ability){
		super("Joltik", Type.COLEOTTERO, Type.ELETTRO, 47, 50, 57, 50, 65, 50, 4, 20, 64, ability);
		setMoves(new Coleomorso());
		setMoves(new Elettrotela());
		setMoves(new ForbiceX());
		setMoves(new Velenpuntura());
	}
	
	/**
	 * Pre-generated Joltik Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Joltik(HiddenAbilities ability){
		super("Joltik", Type.COLEOTTERO, Type.ELETTRO, 47, 50, 57, 50, 65, 50, 4, 20, 64, ability);
		setMoves(new Coleomorso());
		setMoves(new Elettrotela());
		setMoves(new ForbiceX());
		setMoves(new Velenpuntura());
	}
	
	/**
	 * Joltik Pokèmon constructor
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
	public Joltik(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.ELETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Coleomorso());
				break;
			case 2:
				setMoves(new Coleomorso());
				setMoves(new Elettrotela());
				break;
			case 3:
				setMoves(new Coleomorso());
				setMoves(new Elettrotela());
				setMoves(new ForbiceX());
				break;
			case 4:
				setMoves(new Coleomorso());
				setMoves(new Elettrotela());
				setMoves(new ForbiceX());
				setMoves(new Velenpuntura());
				break;
		}
	}
	
	/**
	 * Joltik Pokèmon constructor
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
	public Joltik(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.ELETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Coleomorso());
				break;
			case 2:
				setMoves(new Coleomorso());
				setMoves(new Elettrotela());
				break;
			case 3:
				setMoves(new Coleomorso());
				setMoves(new Elettrotela());
				setMoves(new ForbiceX());
				break;
			case 4:
				setMoves(new Coleomorso());
				setMoves(new Elettrotela());
				setMoves(new ForbiceX());
				setMoves(new Velenpuntura());
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
