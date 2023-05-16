package it.pokèmon.basics.pokèmon.drago;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Legendary;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Metaltestata;
import it.pokèmon.basics.Moves.drago.Dragopulsar;
import it.pokèmon.basics.Moves.drago.Oltraggio;
import it.pokèmon.basics.Moves.ghiaccio.Gelamondo;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Kyurem</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>DRAGO</b></li>
 * 	<li>Second Type: <b>GHIACCIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.drago.Dragopulsar
 * @see it.pokèmon.basics.Moves.drago.Oltraggio
 * @see it.pokèmon.basics.Moves.acciaio.Metaltestata
 * @see it.pokèmon.basics.Moves.ghiaccio.Gelamondo
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Legendary
@Inheritance(Pokèmon = "Pokèmon")
public class Kyurem extends Pokèmon{
	
	/**
	 * Pre-generated Kyurem Pokèmon constructor
	 */
	public Kyurem(){
		super("Kyurem", Type.DRAGO, Type.GHIACCIO, 130, 90, 130, 90, 95, 125, 4, 65, 330, HiddenAbilities.PRESSIONE);
		setMoves(new Gelamondo());
		setMoves(new Metaltestata());
		setMoves(new Dragopulsar());
		setMoves(new Oltraggio());
	}
	
	/**
	 * Kyurem Pokèmon constructor
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
	public Kyurem(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.DRAGO, Type.GHIACCIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, HiddenAbilities.PRESSIONE);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Gelamondo());
				break;
			case 2:
				setMoves(new Gelamondo());
				setMoves(new Dragopulsar());
				break;
			case 3:
				setMoves(new Gelamondo());
				setMoves(new Metaltestata());
				setMoves(new Dragopulsar());
				break;
			case 4:
				setMoves(new Gelamondo());
				setMoves(new Metaltestata());
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