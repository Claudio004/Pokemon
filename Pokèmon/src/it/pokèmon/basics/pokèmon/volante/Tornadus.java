package it.pokèmon.basics.pokèmon.volante;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Legendary;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Retromarcia;
import it.pokèmon.basics.Moves.psico.Frana;
import it.pokèmon.basics.Moves.volante.Acrobazia;
import it.pokèmon.basics.Moves.volante.Eterelama;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Tornadus</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>VOLANTE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.coleottero.Retromarcia
 * @see it.pokèmon.basics.Moves.psico.Frana
 * @see it.pokèmon.basics.Moves.volante.Acrobazia
 * @see it.pokèmon.basics.Moves.volante.Eterelama
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Legendary
@Inheritance(Pokèmon = "Pokèmon")
public class Tornadus extends Pokèmon{
	
	/**
	 * Pre-generated Tornadus Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Tornadus(Abilities ability){
		super("Tornadus", Type.VOLANTE, 115, 70, 125, 80, 111, 79, 4, 45, 261, ability);
		setMoves(new Eterelama());
		setMoves(new Frana());
		setMoves(new Acrobazia());
		setMoves(new Retromarcia());
	}
	
	/**
	 * Pre-generated Tornadus Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Tornadus(HiddenAbilities ability){
		super("Tornadus", Type.VOLANTE, 115, 70, 125, 80, 111, 79, 4, 45, 261, ability);
		setMoves(new Eterelama());
		setMoves(new Frana());
		setMoves(new Acrobazia());
		setMoves(new Retromarcia());
	}
	
	/**
	 * Tornadus Pokèmon constructor
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
	public Tornadus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Eterelama());
				break;
			case 2:
				setMoves(new Eterelama());
				setMoves(new Frana());
				break;
			case 3:
				setMoves(new Eterelama());
				setMoves(new Frana());
				setMoves(new Acrobazia());
				break;
			case 4:
				setMoves(new Eterelama());
				setMoves(new Frana());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				break;
		}
	}
	
	/**
	 * Tornadus Pokèmon constructor
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
	public Tornadus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Eterelama());
				break;
			case 2:
				setMoves(new Eterelama());
				setMoves(new Frana());
				break;
			case 3:
				setMoves(new Eterelama());
				setMoves(new Frana());
				setMoves(new Acrobazia());
				break;
			case 4:
				setMoves(new Eterelama());
				setMoves(new Frana());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
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
