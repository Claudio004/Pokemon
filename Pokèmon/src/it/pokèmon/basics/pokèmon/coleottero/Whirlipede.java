package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.veleno.Velenocoda;
import it.pokèmon.basics.Moves.coleottero.Coleomorso;
import it.pokèmon.basics.Moves.veleno.Fangobomba;
import it.pokèmon.basics.Moves.veleno.Velenoshock;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Whirlipede</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>VELENO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.veleno.Fangobomba
 * @see it.pokèmon.basics.Moves.veleno.Velenocoda
 * @see it.pokèmon.basics.Moves.coleottero.Coleomorso
 * @see it.pokèmon.basics.Moves.veleno.Velenoshock
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Whirlipede extends Pokèmon{
	
	/**
	 * Pre-generated Whirlipede Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Whirlipede(Abilities ability){
		super("Whirlipede", Type.COLEOTTERO, Type.VELENO, 55, 99, 40, 79, 47, 40, 4, 24, 122, ability);
		setMoves(new Velenocoda());
		setMoves(new Velenoshock());
		setMoves(new Fangobomba());
		setMoves(new Coleomorso());
	}
	
	/**
	 * Pre-generated Whirlipede Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Whirlipede(HiddenAbilities ability){
		super("Whirlipede", Type.COLEOTTERO, Type.VELENO, 55, 99, 40, 79, 47, 40, 4, 24, 122, ability);
		setMoves(new Velenocoda());
		setMoves(new Velenoshock());
		setMoves(new Fangobomba());
		setMoves(new Coleomorso());
	}
	
	/**
	 * Whirlipede Pokèmon constructor
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
	public Whirlipede(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Velenocoda());
				break;
			case 2:
				setMoves(new Velenocoda());
				setMoves(new Velenoshock());
				break;
			case 3:
				setMoves(new Velenocoda());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
				break;
			case 4:
				setMoves(new Velenocoda());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
				setMoves(new Coleomorso());
				break;
		}
	}
	
	/**
	 * Whirlipede Pokèmon constructor
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
	public Whirlipede(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Velenocoda());
				break;
			case 2:
				setMoves(new Velenocoda());
				setMoves(new Velenoshock());
				break;
			case 3:
				setMoves(new Velenocoda());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
				break;
			case 4:
				setMoves(new Velenocoda());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
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