package it.pokèmon.basics.pokèmon.fuoco;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.Moves.lotta.Sberletese;
import it.pokèmon.basics.Moves.normale.Riduttore;
import it.pokèmon.basics.Moves.roccia.Rotolamento;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Emboar</b><br>
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
 * @see it.pokèmon.basics.Moves.fuoco.Nitrocarica
 * @see it.pokèmon.basics.Moves.lotta.Sberletese
 * @see it.pokèmon.basics.Moves.normale.Riduttore
 * @see it.pokèmon.basics.Moves.roccia.Rotolamento
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
public class Emboar extends Pokèmon{
	
	/**
	 * Pre-generated Emboar Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Emboar(Abilities ability){
		super("Emboar", Type.FUOCO, Type.LOTTA, 123, 65, 100, 65, 65, 110, 4, 40, 238, ability);
		setMoves(new Rotolamento());
		setMoves(new Nitrocarica());
		setMoves(new Sberletese());
		setMoves(new Riduttore());
	}
	
	/**
	 * Pre-generated Emboar Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Emboar(HiddenAbilities ability){
		super("Emboar", Type.FUOCO, Type.LOTTA, 123, 65, 100, 65, 65, 110, 4, 40, 238, ability);
		setMoves(new Rotolamento());
		setMoves(new Nitrocarica());
		setMoves(new Sberletese());
		setMoves(new Riduttore());
	}
	
	/**
	 * Emboar Pokèmon constructor
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
	public Emboar(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.FUOCO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Nitrocarica());
				break;
			case 2:
				setMoves(new Rotolamento());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Rotolamento());
				setMoves(new Nitrocarica());
				setMoves(new Sberletese());
				break;
			case 4:
				setMoves(new Rotolamento());
				setMoves(new Nitrocarica());
				setMoves(new Sberletese());
				setMoves(new Riduttore());
				break;
		}
	}
	
	/**
	 * Emboar Pokèmon constructor
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
	public Emboar(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.FUOCO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Nitrocarica());
				break;
			case 2:
				setMoves(new Rotolamento());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Rotolamento());
				setMoves(new Nitrocarica());
				setMoves(new Sberletese());
				break;
			case 4:
				setMoves(new Rotolamento());
				setMoves(new Nitrocarica());
				setMoves(new Sberletese());
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