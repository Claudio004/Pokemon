package it.pokèmon.basics.pokèmon.fuoco;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Braciere;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.Moves.lotta.Sberletese;
import it.pokèmon.basics.Moves.veleno.Smog;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Pignite</b><br>
 * Extends Pokèmon<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>FUOCO</b></li>
 * 	<li>Second Type: <b>LOTTA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.fuoco.Braciere
 * @see it.pokèmon.basics.Moves.fuoco.Nitrocarica
 * @see it.pokèmon.basics.Moves.lotta.Sberletese
 * @see it.pokèmon.basics.Moves.veleno.Smog
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
public class Pignite extends Pokèmon{
	
	/**
	 * Pre-generated Pignite Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Pignite(Abilities ability){
		super("Pignite", Type.FUOCO, Type.LOTTA, 93, 55, 70, 55, 55, 90, 4, 20, 146, ability);
		setMoves(new Braciere());
		setMoves(new Nitrocarica());
		setMoves(new Sberletese());
		setMoves(new Smog());
	}
	
	/**
	 * Pre-generated Pignite Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Pignite(HiddenAbilities ability){
		super("Pignite", Type.FUOCO, Type.LOTTA, 93, 55, 70, 55, 55, 90, 4, 20, 146, ability);
		setMoves(new Braciere());
		setMoves(new Nitrocarica());
		setMoves(new Sberletese());
		setMoves(new Smog());
	}
	
	/**
	 * Pignite Pokèmon constructor
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
	public Pignite(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.FUOCO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Braciere());
				break;
			case 2:
				setMoves(new Braciere());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Braciere());
				setMoves(new Nitrocarica());
				setMoves(new Sberletese());
				break;
			case 4:
				setMoves(new Braciere());
				setMoves(new Nitrocarica());
				setMoves(new Sberletese());
				setMoves(new Smog());
				break;
		}
	}
	
	/**
	 * Pignite Pokèmon constructor
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
	public Pignite(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.FUOCO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Braciere());
				break;
			case 2:
				setMoves(new Braciere());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Braciere());
				setMoves(new Nitrocarica());
				setMoves(new Sberletese());
				break;
			case 4:
				setMoves(new Braciere());
				setMoves(new Nitrocarica());
				setMoves(new Sberletese());
				setMoves(new Smog());
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