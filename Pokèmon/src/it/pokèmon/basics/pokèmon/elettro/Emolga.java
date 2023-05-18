package it.pokèmon.basics.pokèmon.elettro;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Inseguimento;
import it.pokèmon.basics.Moves.coleottero.Retromarcia;
import it.pokèmon.basics.Moves.elettro.Scintilla;
import it.pokèmon.basics.Moves.volante.Acrobazia;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Emolga</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ELETTRO</b></li>
 * 	<li>Second Type: <b>VOLANTE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.buio.Inseguimento
 * @see it.pokèmon.basics.Moves.coleottero.Retromarcia
 * @see it.pokèmon.basics.Moves.elettro.Scintilla
 * @see it.pokèmon.basics.Moves.volante.Acrobazia
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Emolga extends Pokèmon{
	
	/**
	 * Pre-generated Emolga Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Emolga(Abilities ability){
		super("Emolga", Type.ELETTRO, Type.VOLANTE, 75, 60, 75, 60, 103, 55, 4, 30, 150, ability);
		setMoves(new Scintilla());
		setMoves(new Acrobazia());
		setMoves(new Retromarcia());
		setMoves(new Inseguimento());
	}
	
	/**
	 * Pre-generated Emolga Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Emolga(HiddenAbilities ability){
		super("Emolga", Type.ELETTRO, Type.VOLANTE, 75, 60, 75, 60, 103, 55, 4, 30, 150, ability);
		setMoves(new Scintilla());
		setMoves(new Acrobazia());
		setMoves(new Retromarcia());
		setMoves(new Inseguimento());
	}
	
	/**
	 * Emolga Pokèmon constructor
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
	public Emolga(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ELETTRO, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Scintilla());
				break;
			case 2:
				setMoves(new Scintilla());
				setMoves(new Acrobazia());
				break;
			case 3:
				setMoves(new Scintilla());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				break;
			case 4:
				setMoves(new Scintilla());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				setMoves(new Inseguimento());
				break;
		}
	}
	
	/**
	 * Emolga Pokèmon constructor
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
	public Emolga(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ELETTRO, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Scintilla());
				break;
			case 2:
				setMoves(new Scintilla());
				setMoves(new Acrobazia());
				break;
			case 3:
				setMoves(new Scintilla());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				break;
			case 4:
				setMoves(new Scintilla());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				setMoves(new Inseguimento());
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
