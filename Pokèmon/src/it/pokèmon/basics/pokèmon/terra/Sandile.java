package it.pokèmon.basics.pokèmon.terra;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Garanzia;
import it.pokèmon.basics.Moves.roccia.Frana;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.Moves.acciaio.Codacciaio;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Sandile</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>TERRA</b></li>
 * 	<li>Second Type: <b>BUIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.roccia.Frana
 * @see it.pokèmon.basics.Moves.acciaio.Codacciaio
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.Moves.buio.Garanzia
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Sandile extends Pokèmon{
	
	/**
	 * Pre-generated Sandile Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Sandile(Abilities ability){
		super("Sandile", Type.TERRA, Type.BUIO, 72, 35, 35, 35, 65, 50, 4, 20, 58, ability);
		setMoves(new Fossa());
		setMoves(new Garanzia());
		setMoves(new Frana());
		setMoves(new Codacciaio());
	}
	
	/**
	 * Pre-generated Sandile Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Sandile(HiddenAbilities ability){
		super("Sandile", Type.TERRA, Type.BUIO, 72, 35, 35, 35, 65, 50, 4, 20, 58, ability);
		setMoves(new Fossa());
		setMoves(new Garanzia());
		setMoves(new Frana());
		setMoves(new Codacciaio());
	}
		
	/**
	 * Sandile Pokèmon constructor
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
	public Sandile(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.TERRA, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fossa());
				break;
			case 2:
				setMoves(new Fossa());
				setMoves(new Garanzia());
				break;
			case 3:
				setMoves(new Fossa());
				setMoves(new Garanzia());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Fossa());
				setMoves(new Garanzia());
				setMoves(new Frana());
				setMoves(new Codacciaio());
				break;
		}
	}
	
	/**
	 * Sandile Pokèmon constructor
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
	public Sandile(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.TERRA, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fossa());
				break;
			case 2:
				setMoves(new Fossa());
				setMoves(new Garanzia());
				break;
			case 3:
				setMoves(new Fossa());
				setMoves(new Garanzia());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Fossa());
				setMoves(new Garanzia());
				setMoves(new Frana());
				setMoves(new Codacciaio());
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