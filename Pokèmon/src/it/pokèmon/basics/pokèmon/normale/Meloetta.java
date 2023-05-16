package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Legendary;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Energipalla;
import it.pokèmon.basics.Moves.spettro.Terremoto;
import it.pokèmon.basics.Moves.normale.Echeggiavoce;
import it.pokèmon.basics.Moves.psico.Frana;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Meloetta</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>NORMALE</b></li>
 * 	<li>Second Type: <b>PSICO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.spettro.Terremoto
 * @see it.pokèmon.basics.Moves.erba.Energipalla
 * @see it.pokèmon.basics.Moves.normale.Echeggiavoce
 * @see it.pokèmon.basics.Moves.psico.Frana
 * @see it.pokèmon.basics.abilities.Abilities
 */
@Legendary
@Inheritance(Pokèmon = "Pokèmon")
public class Meloetta extends Pokèmon{
	
	/**
	 * Pre-generated Meloetta Pokèmon constructor
	 */
	public Meloetta(){
		super("Meloetta", Type.NORMALE, Type.PSICO, 77, 77, 128, 128, 90, 100, 4, 50, 270, Abilities.LEGGIADRO);
		setMoves(new Echeggiavoce());
		setMoves(new Frana());
		setMoves(new Terremoto());
		setMoves(new Energipalla());
	}
	
	/**
	 * Meloetta Pokèmon constructor
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
	public Meloetta(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.NORMALE, Type.PSICO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.LEGGIADRO);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Echeggiavoce());
				break;
			case 2:
				setMoves(new Echeggiavoce());
				setMoves(new Frana());
				break;
			case 3:
				setMoves(new Echeggiavoce());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Echeggiavoce());
				setMoves(new Frana());
				setMoves(new Terremoto());
				setMoves(new Energipalla());
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