package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Legendary;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.lotta.Spadamistica;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.lotta.Spadasolenne;
import it.pokèmon.basics.Moves.normale.Nemesi;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Keldeo</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ACQUA</b></li>
 * 	<li>Second Type: <b>LOTTA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.lotta.Spadamistica
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.lotta.Spadasolenne
 * @see it.pokèmon.basics.Moves.normale.Nemesi
 * @see it.pokèmon.basics.abilities.Abilities
 */
@Legendary
@Inheritance(Pokèmon = "Pokèmon")
public class Keldeo extends Pokèmon{
	
	/**
	 * Pre-generated Keldeo Pokèmon constructor
	 */
	public Keldeo(){
		super("Keldeo", Type.ACQUA, Type.LOTTA, 72, 90, 129, 90, 108, 91, 4, 50, 290, Abilities.GIUSTIZIA);
		setMoves(new Spadasolenne());
		setMoves(new Nemesi());
		setMoves(new Spadamistica());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Keldeo Pokèmon constructor
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
	public Keldeo(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.ACQUA, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.GIUSTIZIA);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Spadasolenne());
				break;
			case 2:
				setMoves(new Spadasolenne());
				setMoves(new Nemesi());
				break;
			case 3:
				setMoves(new Spadasolenne());
				setMoves(new Nemesi());
				setMoves(new Spadamistica());
				break;
			case 4:
				setMoves(new Spadasolenne());
				setMoves(new Nemesi());
				setMoves(new Spadamistica());
				setMoves(new ForbiceX());
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