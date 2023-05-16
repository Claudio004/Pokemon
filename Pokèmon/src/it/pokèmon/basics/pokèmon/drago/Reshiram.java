package it.pokèmon.basics.pokèmon.drago;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Legendary;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.drago.Dragopulsar;
import it.pokèmon.basics.Moves.drago.Oltraggio;
import it.pokèmon.basics.Moves.fuoco.Incrofiamma;
import it.pokèmon.basics.Moves.fuoco.Lanciafiamme;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Reshiram</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>DRAGO</b></li>
 * 	<li>Second Type: <b>FUOCO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.drago.Dragopulsar
 * @see it.pokèmon.basics.Moves.drago.Oltraggio
 * @see it.pokèmon.basics.Moves.fuoco.Incrofiamma
 * @see it.pokèmon.basics.Moves.fuoco.Lanciafiamme
 * @see it.pokèmon.basics.abilities.Abilities
 */
@Legendary
@Inheritance(Pokèmon = "Pokèmon")
public class Reshiram extends Pokèmon{
	
	/**
	 * Pre-generated Reshiram Pokèmon constructor
	 */
	public Reshiram(){
		super("Reshiram", Type.DRAGO, Type.FUOCO, 120, 100, 150, 120, 90, 100, 4, 65, 340, Abilities.PIROTURBINA);
		setMoves(new Incrofiamma());
		setMoves(new Lanciafiamme());
		setMoves(new Dragopulsar());
		setMoves(new Oltraggio());
	}
	
	/**
	 * Reshiram Pokèmon constructor
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
	 */
	public Reshiram(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.DRAGO, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.PIROTURBINA);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Incrofiamma());
				break;
			case 2:
				setMoves(new Incrofiamma());
				setMoves(new Dragopulsar());
				break;
			case 3:
				setMoves(new Incrofiamma());
				setMoves(new Lanciafiamme());
				setMoves(new Dragopulsar());
				break;
			case 4:
				setMoves(new Incrofiamma());
				setMoves(new Lanciafiamme());
				setMoves(new Dragopulsar());
				setMoves(new Oltraggio());
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
