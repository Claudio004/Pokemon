package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.psico.CozzataZen;
import it.pokèmon.basics.Moves.drago.Dragospiro;
import it.pokèmon.basics.Moves.drago.Oltraggio;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Deino</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>BUIO</b></li>
 * 	<li>Second Type: <b>DRAGO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.psico.CozzataZen
 * @see it.pokèmon.basics.Moves.drago.Oltraggio
 * @see it.pokèmon.basics.Moves.drago.Dragospiro
 * @see it.pokèmon.basics.Moves.buio.Sgranocchio
 * @see it.pokèmon.basics.abilities.Abilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Deino extends Pokèmon{
	
	/**
	 * Pre-generated Deino Pokèmon constructor
	 */
	public Deino(){
		super("Deino", Type.BUIO, Type.DRAGO, 65, 50, 45, 50, 38, 52, 4, 25, 60, Abilities.TUTTAFRETTA);
		setMoves(new Sgranocchio());
		setMoves(new Dragospiro());
		setMoves(new CozzataZen());
		setMoves(new Oltraggio());
	}
	
	/**
	 * Deino Pokèmon constructor
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
	public Deino(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.BUIO, Type.DRAGO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.TUTTAFRETTA);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sgranocchio());
				break;
			case 2:
				setMoves(new Sgranocchio());
				setMoves(new Dragospiro());
				break;
			case 3:
				setMoves(new Sgranocchio());
				setMoves(new Dragospiro());
				setMoves(new CozzataZen());
				break;
			case 4:
				setMoves(new Sgranocchio());
				setMoves(new Dragospiro());
				setMoves(new CozzataZen());
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