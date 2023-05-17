package it.pokèmon.basics.pokèmon.elettro;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Inseguimento;
import it.pokèmon.basics.Moves.coleottero.Segnoraggio;
import it.pokèmon.basics.Moves.elettro.Fulmine;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Zebstrika</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ELETTRO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.buio.Inseguimento
 * @see it.pokèmon.basics.Moves.coleottero.Segnoraggio
 * @see it.pokèmon.basics.Moves.elettro.Fulmine
 * @see it.pokèmon.basics.Moves.fuoco.Nitrocarica
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Zebstrika extends Pokèmon{
	
	/**
	 * Pre-generated Zebstrika Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Zebstrika(Abilities ability){
		super("Zebstrika", Type.ELETTRO, 100, 63, 80, 63, 116, 75, 4, 35, 174, ability);
		setMoves(new Fulmine());
		setMoves(new Nitrocarica());
		setMoves(new Inseguimento());
		setMoves(new Segnoraggio());
	}
	
	/**
	 * Pre-generated Zebstrika Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Zebstrika(HiddenAbilities ability){
		super("Zebstrika", Type.ELETTRO, 100, 63, 80, 63, 116, 75, 4, 35, 174, ability);
		setMoves(new Fulmine());
		setMoves(new Nitrocarica());
		setMoves(new Inseguimento());
		setMoves(new Segnoraggio());
	}
	
	/**
	 * Zebstrika Pokèmon constructor
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
	public Zebstrika(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ELETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fulmine());
				break;
			case 2:
				setMoves(new Fulmine());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Fulmine());
				setMoves(new Nitrocarica());
				setMoves(new Inseguimento());
				break;
			case 4:
				setMoves(new Fulmine());
				setMoves(new Nitrocarica());
				setMoves(new Inseguimento());
				setMoves(new Segnoraggio());
				break;
		}
	}
	
	/**
	 * Zebstrika Pokèmon constructor
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
	public Zebstrika(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ELETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fulmine());
				break;
			case 2:
				setMoves(new Fulmine());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Fulmine());
				setMoves(new Nitrocarica());
				setMoves(new Inseguimento());
				break;
			case 4:
				setMoves(new Fulmine());
				setMoves(new Nitrocarica());
				setMoves(new Inseguimento());
				setMoves(new Segnoraggio());
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