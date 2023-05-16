package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.normale.Nemesi;
import it.pokèmon.basics.Moves.fuoco.Ondacalda;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.Moves.volante.AttaccoAla;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Braviary</b><br>
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
 * @see it.pokèmon.basics.Moves.normale.Nemesi
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Braviary extends Pokèmon{
	
	/**
	 * Pre-generated Braviary Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Braviary(Abilities ability){
		super("Braviary", Type.NORMALE, Type.VOLANTE, 123, 75, 57, 75, 80, 100, 4, 54, 179, ability);
		setMoves(new Nemesi());
		setMoves(new Aeroassalto());
		setMoves(new AttaccoAla());
		setMoves(new Ondacalda());
	}
	
	/**
	 * Pre-generated Braviary Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Braviary(HiddenAbilities ability){
		super("Braviary", Type.NORMALE, Type.VOLANTE, 123, 75, 57, 75, 80, 100, 4, 54, 179, ability);
		setMoves(new Nemesi());
		setMoves(new Aeroassalto());
		setMoves(new AttaccoAla());
		setMoves(new Ondacalda());
	}
	
	/**
	 * Braviary Pokèmon constructor
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
	public Braviary(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Nemesi());
				break;
			case 2:
				setMoves(new Nemesi());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Nemesi());
				setMoves(new Aeroassalto());
				setMoves(new AttaccoAla());
				break;
			case 4:
				setMoves(new Nemesi());
				setMoves(new Aeroassalto());
				setMoves(new AttaccoAla());
				setMoves(new Ondacalda());
				break;
		}
	}
	
	/**
	 * Braviary Pokèmon constructor
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
	public Braviary(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Nemesi());
				break;
			case 2:
				setMoves(new Nemesi());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Nemesi());
				setMoves(new Aeroassalto());
				setMoves(new AttaccoAla());
				break;
			case 4:
				setMoves(new Nemesi());
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