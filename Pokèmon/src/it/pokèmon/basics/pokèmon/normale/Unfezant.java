package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Retromarcia;
import it.pokèmon.basics.Moves.fuoco.Ondacalda;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.Moves.volante.Eterelama;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Unfezant</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>NORMALE</b></li>
 * 	<li>Second Type: <b>VOLANTE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.volante.Eterelama
 * @see it.pokèmon.basics.Moves.coleottero.Retromarcia
 * @see it.pokèmon.basics.Moves.fuoco.Ondacalda
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Unfezant extends Pokèmon{
		
	/**
	 * Pre-generated Unfezant Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Unfezant(Abilities ability){
		super("Unfezant", Type.NORMALE, Type.VOLANTE, 115, 80, 65, 55, 93, 80, 4, 40, 244, ability);
		setMoves(new Ondacalda());
		setMoves(new Eterelama());
		setMoves(new Retromarcia());
		setMoves(new Aeroassalto());
	}
	
	/**
	 * Pre-generated Unfezant Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Unfezant(HiddenAbilities ability){
		super("Unfezant", Type.NORMALE, Type.VOLANTE, 115, 80, 65, 55, 93, 80, 4, 40, 244, ability);
		setMoves(new Ondacalda());
		setMoves(new Eterelama());
		setMoves(new Retromarcia());
		setMoves(new Aeroassalto());
	}
		
	/**
	 * Unfezant Pokèmon constructor
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
	public Unfezant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ondacalda());
				break;
			case 2:
				setMoves(new Ondacalda());
				setMoves(new Eterelama());
				break;
			case 3:
				setMoves(new Ondacalda());
				setMoves(new Eterelama());
				setMoves(new Retromarcia());
				break;
			case 4:
				setMoves(new Ondacalda());
				setMoves(new Eterelama());
				setMoves(new Retromarcia());
				setMoves(new Aeroassalto());
				break;
		}
	}
	
	/**
	 * Unfezant Pokèmon constructor
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
	public Unfezant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ondacalda());
				break;
			case 2:
				setMoves(new Ondacalda());
				setMoves(new Eterelama());
				break;
			case 3:
				setMoves(new Ondacalda());
				setMoves(new Eterelama());
				setMoves(new Retromarcia());
				break;
			case 4:
				setMoves(new Ondacalda());
				setMoves(new Eterelama());
				setMoves(new Retromarcia());
				setMoves(new Aeroassalto());
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