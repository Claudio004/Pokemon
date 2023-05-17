package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.roccia.Abbattimento;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.coleottero.Tagliofuria;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Dwebble</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>ROCCIA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.roccia.Abbattimento
 * @see it.pokèmon.basics.Moves.coleottero.Tagliofuria
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Dwebble extends Pokèmon{
	
	/**
	 * Pre-generated Dwebble Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Dwebble(Abilities ability){
		super("Dwebble", Type.COLEOTTERO, Type.ROCCIA, 65, 85, 35, 35, 55, 50, 4, 20, 65, ability);
		setMoves(new Abbattimento());
		setMoves(new Tagliofuria());
		setMoves(new ForbiceX());
		setMoves(new Fossa());
	}
	
	/**
	 * Pre-generated Dwebble Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Dwebble(HiddenAbilities ability){
		super("Dwebble", Type.COLEOTTERO, Type.ROCCIA, 65, 85, 35, 35, 55, 50, 4, 20, 65, ability);
		setMoves(new Abbattimento());
		setMoves(new Tagliofuria());
		setMoves(new ForbiceX());
		setMoves(new Fossa());
	}
	
	/**
	 * Dwebble Pokèmon constructor
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
	public Dwebble(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.ROCCIA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Abbattimento());
				break;
			case 2:
				setMoves(new Abbattimento());
				setMoves(new Tagliofuria());
				break;
			case 3:
				setMoves(new Abbattimento());
				setMoves(new Tagliofuria());
				setMoves(new ForbiceX());
				break;
			case 4:
				setMoves(new Abbattimento());
				setMoves(new Tagliofuria());
				setMoves(new ForbiceX());
				setMoves(new Fossa());
				break;
		}
	}
	
	/**
	 * Dwebble Pokèmon constructor
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
	public Dwebble(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.ROCCIA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Abbattimento());
				break;
			case 2:
				setMoves(new Abbattimento());
				setMoves(new Tagliofuria());
				break;
			case 3:
				setMoves(new Abbattimento());
				setMoves(new Tagliofuria());
				setMoves(new ForbiceX());
				break;
			case 4:
				setMoves(new Abbattimento());
				setMoves(new Tagliofuria());
				setMoves(new ForbiceX());
				setMoves(new Fossa());
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