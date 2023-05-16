package it.pokèmon.basics.pokèmon.elettro;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Legendary;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.elettro.Scarica;
import it.pokèmon.basics.Moves.lotta.Breccia;
import it.pokèmon.basics.Moves.lotta.Vendetta;
import it.pokèmon.basics.Moves.acciaio.Cannonflash;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Thundurus</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ELETTRO</b></li>
 * 	<li>Second Type: <b>VOLANTE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.elettro.Scarica
 * @see it.pokèmon.basics.Moves.lotta.Breccia
 * @see it.pokèmon.basics.Moves.acciaio.Cannonflash
 * @see it.pokèmon.basics.Moves.lotta.Vendetta
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Legendary
@Inheritance(Pokèmon = "Pokèmon")
public class Thundurus extends Pokèmon{
	
	/**
	 * Pre-generated Thundurus Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Thundurus(Abilities ability){
		super("Thundurus", Type.ELETTRO, Type.VOLANTE, 115, 70, 125, 80, 111, 79, 4, 45, 261, ability);
		setMoves(new Vendetta());
		setMoves(new Scarica());
		setMoves(new Breccia());
		setMoves(new Cannonflash());
	}
	
	/**
	 * Pre-generated Thundurus Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Thundurus(HiddenAbilities ability){
		super("Thundurus", Type.ELETTRO, Type.VOLANTE, 115, 70, 125, 80, 111, 79, 4, 45, 261, ability);
		setMoves(new Vendetta());
		setMoves(new Scarica());
		setMoves(new Breccia());
		setMoves(new Cannonflash());
	}
	
	/**
	 * Thundurus Pokèmon constructor
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
	public Thundurus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.TERRA, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Scarica());
				break;
			case 2:
				setMoves(new Vendetta());
				setMoves(new Scarica());
				break;
			case 3:
				setMoves(new Vendetta());
				setMoves(new Scarica());
				setMoves(new Breccia());
				break;
			case 4:
				setMoves(new Vendetta());
				setMoves(new Scarica());
				setMoves(new Breccia());
				setMoves(new Cannonflash());
				break;
		}
	}
	
	/**
	 * Thundurus Pokèmon constructor
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
	public Thundurus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.TERRA, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Scarica());
				break;
			case 2:
				setMoves(new Vendetta());
				setMoves(new Scarica());
				break;
			case 3:
				setMoves(new Vendetta());
				setMoves(new Scarica());
				setMoves(new Breccia());
				break;
			case 4:
				setMoves(new Vendetta());
				setMoves(new Scarica());
				setMoves(new Breccia());
				setMoves(new Cannonflash());
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