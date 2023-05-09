package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Codacciaio;
import it.pokèmon.basics.Moves.buio.Inseguimento;
import it.pokèmon.basics.Moves.normale.Bruciapelo;
import it.pokèmon.basics.Moves.spettro.Ombrartigli;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Liepard</b><br>
 * Extends Pokèmon<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>BUIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.acciaio.Codacciaio
 * @see it.pokèmon.basics.Moves.buio.Inseguimento
 * @see it.pokèmon.basics.Moves.normale.Bruciapelo
 * @see it.pokèmon.basics.Moves.spettro.Ombrartigli
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
public class Liepard extends Pokèmon{
	
	/**
	 * Pre-generated Liepard Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Liepard(Abilities ability){
		super("Liepard", Type.BUIO, 88, 50, 88, 50, 106, 64, 4, 30, 156, ability);
		setMoves(new Inseguimento());
		setMoves(new Bruciapelo());
		setMoves(new Codacciaio());
		setMoves(new Ombrartigli());
	}
	
	/**
	 * Pre-generated Liepard Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Liepard(HiddenAbilities ability){
		super("Liepard", Type.BUIO, 88, 50, 88, 50, 106, 64, 4, 30, 156, ability);
		setMoves(new Inseguimento());
		setMoves(new Bruciapelo());
		setMoves(new Codacciaio());
		setMoves(new Ombrartigli());
	}
	
	/**
	 * Liepard Pokèmon constructor
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
	public Liepard(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Inseguimento());
				break;
			case 2:
				setMoves(new Inseguimento());
				setMoves(new Bruciapelo());
				break;
			case 3:
				setMoves(new Inseguimento());
				setMoves(new Bruciapelo());
				setMoves(new Codacciaio());
				break;
			case 4:
				setMoves(new Inseguimento());
				setMoves(new Bruciapelo());
				setMoves(new Codacciaio());
				setMoves(new Ombrartigli());
		}
	}
	
	/**
	 * Liepard Pokèmon constructor
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
	public Liepard(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Inseguimento());
				break;
			case 2:
				setMoves(new Inseguimento());
				setMoves(new Bruciapelo());
				break;
			case 3:
				setMoves(new Inseguimento());
				setMoves(new Bruciapelo());
				setMoves(new Codacciaio());
				break;
			case 4:
				setMoves(new Inseguimento());
				setMoves(new Bruciapelo());
				setMoves(new Codacciaio());
				setMoves(new Ombrartigli());
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
