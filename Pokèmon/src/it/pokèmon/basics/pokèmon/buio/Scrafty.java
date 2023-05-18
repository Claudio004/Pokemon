package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.lotta.Breccia;
import it.pokèmon.basics.Moves.lotta.Calcinvolo;
import it.pokèmon.basics.Moves.normale.Bottintesta;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Scrafty</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>BUIO</b></li>
 * 	<li>Second Type: <b>LOTTA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.lotta.Breccia
 * @see it.pokèmon.basics.Moves.lotta.Calcinvolo
 * @see it.pokèmon.basics.Moves.normale.Bottintesta
 * @see it.pokèmon.basics.Moves.buio.Sgranocchio
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Scrafty extends Pokèmon{
	
	/**
	 * Pre-generated Scrafty Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Scrafty(Abilities ability){
		super("Scrafty", Type.BUIO, Type.LOTTA, 90, 115, 45, 115, 58, 65, 4, 40, 171, ability);
		setMoves(new Sgranocchio());
		setMoves(new Bottintesta());
		setMoves(new Breccia());
		setMoves(new Calcinvolo());
	}
	
	/**
	 * Pre-generated Scrafty Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Scrafty(HiddenAbilities ability){
		super("Scrafty", Type.BUIO, Type.LOTTA, 90, 115, 45, 115, 58, 65, 4, 40, 171, ability);
		setMoves(new Sgranocchio());
		setMoves(new Bottintesta());
		setMoves(new Breccia());
		setMoves(new Calcinvolo());
	}
	
	/**
	 * Scrafty Pokèmon constructor
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
	public Scrafty(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.BUIO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sgranocchio());
				break;
			case 2:
				setMoves(new Sgranocchio());
				setMoves(new Bottintesta());
				break;
			case 3:
				setMoves(new Sgranocchio());
				setMoves(new Bottintesta());
				setMoves(new Breccia());
				break;
			case 4:
				setMoves(new Sgranocchio());
				setMoves(new Bottintesta());
				setMoves(new Breccia());
				setMoves(new Calcinvolo());
				break;
		}
	}
	
	/**
	 * Scrafty Pokèmon constructor
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
	public Scrafty(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.BUIO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sgranocchio());
				break;
			case 2:
				setMoves(new Sgranocchio());
				setMoves(new Bottintesta());
				break;
			case 3:
				setMoves(new Sgranocchio());
				setMoves(new Bottintesta());
				setMoves(new Breccia());
				break;
			case 4:
				setMoves(new Sgranocchio());
				setMoves(new Bottintesta());
				setMoves(new Breccia());
				setMoves(new Calcinvolo());
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