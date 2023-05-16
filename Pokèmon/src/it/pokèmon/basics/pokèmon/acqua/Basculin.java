package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Idrondata;
import it.pokèmon.basics.Moves.acqua.Surf;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.Moves.acqua.Cascata;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Basculin</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ACQUA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.acqua.Idropulsar
 * @see it.pokèmon.basics.Moves.acqua.Surf
 * @see it.pokèmon.basics.Moves.ghiaccio.Geloraggio
 * @see it.pokèmon.basics.Moves.acqua.Cascata
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Basculin extends Pokèmon{
	
	/**
	 * Pre-generated Basculin Pokèmon constructor
	 * @param ability : Abilities
	 */
	Basculin(Abilities ability){
		super("Basculin", Type.ACQUA, 92, 65, 80, 55, 98, 70, 4, 40, 161, ability);
		setMoves(new Idrondata());
		setMoves(new Geloraggio());
		setMoves(new Cascata());
		setMoves(new Surf());
	}
	
	/**
	 * Pre-generated Basculin Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	Basculin(HiddenAbilities ability){
		super("Basculin", Type.ACQUA, 92, 65, 80, 55, 98, 70, 4, 40, 161, ability);
		setMoves(new Idrondata());
		setMoves(new Geloraggio());
		setMoves(new Cascata());
		setMoves(new Surf());
	}
		
	/**
	 * Basculin Pokèmon constructor
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
	Basculin(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Idrondata());
				break;
			case 2:
				setMoves(new Idrondata());
				setMoves(new Geloraggio());
				break;
			case 3:
				setMoves(new Idrondata());
				setMoves(new Geloraggio());
				setMoves(new Cascata());
				break;
			case 4:
				setMoves(new Idrondata());
				setMoves(new Geloraggio());
				setMoves(new Cascata());
				setMoves(new Surf());
				break;
		}
	}
	
	/**
	 * Basculin Pokèmon constructor
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
	Basculin(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Idrondata());
				break;
			case 2:
				setMoves(new Idrondata());
				setMoves(new Geloraggio());
				break;
			case 3:
				setMoves(new Idrondata());
				setMoves(new Geloraggio());
				setMoves(new Cascata());
				break;
			case 4:
				setMoves(new Idrondata());
				setMoves(new Geloraggio());
				setMoves(new Cascata());
				setMoves(new Surf());
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