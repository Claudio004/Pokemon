package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Codacciaio;
import it.pokèmon.basics.Moves.normale.Graffio;
import it.pokèmon.basics.Moves.normale.Sfuriate;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Purrloin</b><br>
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
 * @see it.pokèmon.basics.Moves.normale.Graffio
 * @see it.pokèmon.basics.Moves.normale.Sfuriate
 * @see it.pokèmon.basics.Moves.spettro.PallaOmbra
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
public class Purrloin extends Pokèmon{
	
	/**
	 * Pre-generated Purrloin Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Purrloin(Abilities ability){
		super("Purrloin", Type.BUIO, 50, 37, 50, 37, 66, 41, 2, 6, 56, ability);
		setMoves(new Graffio());
		setMoves(new Sfuriate());
	}
	
	/**
	 * Pre-generated Purrloin Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Purrloin(HiddenAbilities ability){
		super("Purrloin", Type.BUIO, 50, 37, 50, 37, 66, 41, 2, 6, 56, ability);
		setMoves(new Graffio());
		setMoves(new Sfuriate());
	}
		
	/**
	 * Purrloin Pokèmon constructor
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
	public Purrloin(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Graffio());
				break;
			case 2:
				setMoves(new Graffio());
				setMoves(new Sfuriate());
				break;
			case 3:
				setMoves(new Graffio());
				setMoves(new Sfuriate());
				setMoves(new Codacciaio());
				break;
			case 4:
				setMoves(new Graffio());
				setMoves(new Sfuriate());
				setMoves(new Codacciaio());
				setMoves(new PallaOmbra());
		}
	}
	
	/**
	 * Purrloin Pokèmon constructor
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
	public Purrloin(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Graffio());
				break;
			case 2:
				setMoves(new Graffio());
				setMoves(new Sfuriate());
				break;
			case 3:
				setMoves(new Graffio());
				setMoves(new Sfuriate());
				setMoves(new Codacciaio());
				break;
			case 4:
				setMoves(new Graffio());
				setMoves(new Sfuriate());
				setMoves(new Codacciaio());
				setMoves(new PallaOmbra());
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
