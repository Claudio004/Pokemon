package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.spettro.Ombrartigli;
import it.pokèmon.basics.Moves.fuoco.Ondacalda;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.Moves.volante.AttaccoAla;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Rufflet</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>NORMALE</b></li>
 * 	<li>Second Type: <b>VOLANTE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.volante.AttaccoAla
 * @see it.pokèmon.basics.Moves.fuoco.Ondacalda
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.Moves.spettro.Ombrartigli
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Rufflet extends Pokèmon{
	
	/**
	 * Pre-generated Rufflet Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Rufflet(Abilities ability){
		super("Rufflet", Type.NORMALE, Type.VOLANTE, 83, 50, 37, 50, 60, 70, 4, 30, 70, ability);
		setMoves(new Ombrartigli());
		setMoves(new Aeroassalto());
		setMoves(new AttaccoAla());
		setMoves(new Ondacalda());
	}
	
	/**
	 * Pre-generated Rufflet Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Rufflet(HiddenAbilities ability){
		super("Rufflet", Type.NORMALE, Type.VOLANTE, 83, 50, 37, 50, 60, 70, 4, 30, 70, ability);
		setMoves(new Ombrartigli());
		setMoves(new Aeroassalto());
		setMoves(new AttaccoAla());
		setMoves(new Ondacalda());
	}
	
	/**
	 * Rufflet Pokèmon constructor
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
	public Rufflet(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ombrartigli());
				break;
			case 2:
				setMoves(new Ombrartigli());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Ombrartigli());
				setMoves(new Aeroassalto());
				setMoves(new AttaccoAla());
				break;
			case 4:
				setMoves(new Ombrartigli());
				setMoves(new Aeroassalto());
				setMoves(new AttaccoAla());
				setMoves(new Ondacalda());
				break;
		}
	}
	
	/**
	 * Rufflet Pokèmon constructor
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
	public Rufflet(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ombrartigli());
				break;
			case 2:
				setMoves(new Ombrartigli());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Ombrartigli());
				setMoves(new Aeroassalto());
				setMoves(new AttaccoAla());
				break;
			case 4:
				setMoves(new Ombrartigli());
				setMoves(new Aeroassalto());
				setMoves(new AttaccoAla());
				setMoves(new Ondacalda());
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