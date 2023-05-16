package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Lanciafiamme;
import it.pokèmon.basics.Moves.drago.Dragopulsar;
import it.pokèmon.basics.Moves.drago.Oltraggio;
import it.pokèmon.basics.Moves.buio.Neropulsar;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Hydreigon</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>BUIO</b></li>
 * 	<li>Second Type: <b>DRAGO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.buio.Neropulsar
 * @see it.pokèmon.basics.Moves.drago.Oltraggio
 * @see it.pokèmon.basics.Moves.drago.Dragopulsar
 * @see it.pokèmon.basics.Moves.fuoco.Lanciafiamme
 * @see it.pokèmon.basics.abilities.Abilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Hydreigon extends Pokèmon{
	
	/**
	 * Pre-generated Hydreigon Pokèmon constructor
	 */
	public Hydreigon(){
		super("Hydreigon", Type.BUIO, Type.DRAGO, 105, 90, 125, 90, 98, 92, 4, 65, 300, Abilities.LEVITAZIONE);
		setMoves(new Lanciafiamme());
		setMoves(new Dragopulsar());
		setMoves(new Neropulsar());
		setMoves(new Oltraggio());
	}
	
	/**
	 * Hydreigon Pokèmon constructor
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
	public Hydreigon(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.BUIO, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.LEVITAZIONE);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Lanciafiamme());
				break;
			case 2:
				setMoves(new Lanciafiamme());
				setMoves(new Dragopulsar());
				break;
			case 3:
				setMoves(new Lanciafiamme());
				setMoves(new Dragopulsar());
				setMoves(new Neropulsar());
				break;
			case 4:
				setMoves(new Lanciafiamme());
				setMoves(new Dragopulsar());
				setMoves(new Neropulsar());
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