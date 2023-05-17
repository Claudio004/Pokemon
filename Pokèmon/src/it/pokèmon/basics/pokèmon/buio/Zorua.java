package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.Moves.buio.Finta;
import it.pokèmon.basics.Moves.buio.Neropulsar;
import it.pokèmon.basics.Moves.buio.Urlorabbia;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Zorua</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>BUIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.spettro.PallaOmbra
 * @see it.pokèmon.basics.Moves.buio.Finta
 * @see it.pokèmon.basics.Moves.buio.Neropulsar
 * @see it.pokèmon.basics.Moves.buio.Urlorabbia
 * @see it.pokèmon.basics.abilities.Abilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Zorua extends Pokèmon{
	
	/**
	 * Pre-generated Zorua Pokèmon constructor
	 */
	public Zorua(){
		super("Zorua", Type.BUIO, 65, 40, 80, 40, 65, 40, 4, 25, 66, Abilities.ILLUSIONE);
		setMoves(new Finta());
		setMoves(new Neropulsar());
		setMoves(new PallaOmbra());
		setMoves(new Urlorabbia());
	}
	
	/**
	 * Zorua Pokèmon constructor
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
	public Zorua(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.ILLUSIONE);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Finta());
				break;
			case 2:
				setMoves(new Finta());
				setMoves(new Neropulsar());
				break;
			case 3:
				setMoves(new Finta());
				setMoves(new Neropulsar());
				setMoves(new PallaOmbra());
				break;
			case 4:
				setMoves(new Finta());
				setMoves(new Neropulsar());
				setMoves(new PallaOmbra());
				setMoves(new Urlorabbia());
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