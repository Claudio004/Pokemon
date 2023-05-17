package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.lotta.Breccia;
import it.pokèmon.basics.Moves.buio.Finta;
import it.pokèmon.basics.Moves.lotta.Calciobasso;
import it.pokèmon.basics.Moves.normale.Bottintesta;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Scraggy</b><br>
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
 * @see it.pokèmon.basics.Moves.lotta.Calciobasso
 * @see it.pokèmon.basics.Moves.normale.Bottintesta
 * @see it.pokèmon.basics.Moves.buio.Finta
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Scraggy extends Pokèmon{
	
	/**
	 * Pre-generated Scraggy Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Scraggy(Abilities ability){
		super("Scraggy", Type.BUIO, Type.LOTTA, 75, 70, 35, 70, 48, 50, 4, 25, 70, ability);
		setMoves(new Finta());
		setMoves(new Bottintesta());
		setMoves(new Breccia());
		setMoves(new Calciobasso());
	}
	
	/**
	 * Pre-generated Scraggy Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Scraggy(HiddenAbilities ability){
		super("Scraggy", Type.BUIO, Type.LOTTA, 75, 70, 35, 70, 48, 50, 4, 25, 70, ability);
		setMoves(new Finta());
		setMoves(new Bottintesta());
		setMoves(new Breccia());
		setMoves(new Calciobasso());
	}
	
	/**
	 * Scraggy Pokèmon constructor
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
	public Scraggy(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.BUIO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Finta());
				break;
			case 2:
				setMoves(new Finta());
				setMoves(new Bottintesta());
				break;
			case 3:
				setMoves(new Finta());
				setMoves(new Bottintesta());
				setMoves(new Breccia());
				break;
			case 4:
				setMoves(new Finta());
				setMoves(new Bottintesta());
				setMoves(new Breccia());
				setMoves(new Calciobasso());
				break;
		}
	}
	
	/**
	 * Scraggy Pokèmon constructor
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
	public Scraggy(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.BUIO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Finta());
				break;
			case 2:
				setMoves(new Finta());
				setMoves(new Bottintesta());
				break;
			case 3:
				setMoves(new Finta());
				setMoves(new Bottintesta());
				setMoves(new Breccia());
				break;
			case 4:
				setMoves(new Finta());
				setMoves(new Bottintesta());
				setMoves(new Breccia());
				setMoves(new Calciobasso());
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