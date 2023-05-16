package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Morso;
import it.pokèmon.basics.Moves.normale.Riduttore;
import it.pokèmon.basics.Moves.normale.Azione;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Lillipup</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>NORMALE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.buio.Morso
 * @see it.pokèmon.basics.Moves.normale.Riduttore
 * @see it.pokèmon.basics.Moves.normale.Azione
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Lillipup extends Pokèmon{
		
	/**
	 * Pre-generated Lillipup Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Lillipup(Abilities ability){
		super("Lillipup", Type.NORMALE, 60, 45, 25, 45, 55, 45, 2, 5, 55, ability);
		setMoves(new Azione());
		setMoves(new Morso());
	}
	
	/**
	 * Pre-generated Lillipup Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Lillipup(HiddenAbilities ability){
		super("Lillipup", Type.NORMALE, 60, 45, 25, 45, 55, 45, 2, 5, 55, ability);
		setMoves(new Azione());
		setMoves(new Morso());
	}
		
	/**
	 * Lillipup Pokèmon constructor
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
	public Lillipup(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Morso());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Morso());
				setMoves(new Riduttore());
				break;
		}
	}
	
	/**
	 * Lillipup Pokèmon constructor
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
	public Lillipup(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Morso());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Morso());
				setMoves(new Riduttore());
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