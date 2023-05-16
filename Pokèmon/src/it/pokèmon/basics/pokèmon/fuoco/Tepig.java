package it.pokèmon.basics.pokèmon.fuoco;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Starter;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Braciere;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.Moves.normale.Azione;
import it.pokèmon.basics.Moves.veleno.Smog;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Tepig</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>FUOCO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.fuoco.Braciere
 * @see it.pokèmon.basics.Moves.fuoco.Nitrocarica
 * @see it.pokèmon.basics.Moves.normale.Azione
 * @see it.pokèmon.basics.Moves.veleno.Smog
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Starter
@Inheritance(Pokèmon = "Pokèmon")
public class Tepig extends Pokèmon{

	/**
	 * Pre-generated Tepig Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Tepig(Abilities ability){
		super("Tepig", Type.FUOCO, 63, 45, 45, 45, 45, 65, 2, 5, 28, ability);
		setMoves(new Azione());
		setMoves(new Nitrocarica());
	}
	
	/**
	 * Pre-generated Tepig Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Tepig(HiddenAbilities ability){
		super("Tepig", Type.FUOCO, 63, 45, 45, 45, 45, 65, 2, 5, 28, ability);
		setMoves(new Azione());
		setMoves(new Nitrocarica());
	}
	
	/**
	 * Tepig Pokèmon constructor
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
	public Tepig(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				setMoves(new Braciere());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				setMoves(new Braciere());
				setMoves(new Smog());
				break;
		}
	}
	
	/**
	 * Tepig Pokèmon constructor
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
	public Tepig(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				setMoves(new Braciere());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				setMoves(new Braciere());
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