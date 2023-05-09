package it.pokèmon.basics.pokèmon.veleno;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.elettro.Fulmine;
import it.pokèmon.basics.Moves.psico.Psichico;
import it.pokèmon.basics.Moves.veleno.Fangobomba;
import it.pokèmon.basics.Moves.veleno.Velenoshock;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Garbodor</b><br>
 * Extends Pokèmon<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>VELENO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.elettro.Fulmine
 * @see it.pokèmon.basics.Moves.psico.Psichico
 * @see it.pokèmon.basics.Moves.veleno.Fangobomba
 * @see it.pokèmon.basics.Moves.veleno.Velenoshock
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
public class Garbodor extends Pokèmon{
	
	/**
	 * Pre-generated Garbodor Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Garbodor(Abilities ability){
		super("Garbodor", Type.VELENO, 95, 82, 60, 82, 75, 80, 4, 40, 166, ability);
		setMoves(new Psichico());
		setMoves(new Fulmine());
		setMoves(new Velenoshock());
		setMoves(new Fangobomba());
	}
	
	/**
	 * Pre-generated Garbodor Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Garbodor(HiddenAbilities ability){
		super("Garbodor", Type.VELENO, 95, 82, 60, 82, 75, 80, 4, 40, 166, ability);
		setMoves(new Psichico());
		setMoves(new Fulmine());
		setMoves(new Velenoshock());
		setMoves(new Fangobomba());
	}
	
	/**
	 * Garbodor Pokèmon constructor
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
	public Garbodor(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Psichico());
				break;
			case 2:
				setMoves(new Psichico());
				setMoves(new Fulmine());
				break;
			case 3:
				setMoves(new Psichico());
				setMoves(new Fulmine());
				setMoves(new Velenoshock());
				break;
			case 4:
				setMoves(new Psichico());
				setMoves(new Fulmine());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
				break;
		}
	}
	
	/**
	 * Garbodor Pokèmon constructor
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
	public Garbodor(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Psichico());
				break;
			case 2:
				setMoves(new Psichico());
				setMoves(new Fulmine());
				break;
			case 3:
				setMoves(new Psichico());
				setMoves(new Fulmine());
				setMoves(new Velenoshock());
				break;
			case 4:
				setMoves(new Psichico());
				setMoves(new Fulmine());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
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
