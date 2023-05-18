package it.pokèmon.basics.pokèmon.terra;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.spettro.Ombrartigli;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.roccia.Frana;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Krokorok</b><br>
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
 * @see it.pokèmon.basics.Moves.spettro.Ombrartigli
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.Moves.buio.Sgranocchio
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Krokorok extends Pokèmon{
	
	/**
	 * Pre-generated Krokorok Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Krokorok(Abilities ability){
		super("Krokorok", Type.TERRA, Type.BUIO, 82, 45, 45, 45, 74, 60, 4, 30, 123, ability);
		setMoves(new Fossa());
		setMoves(new Sgranocchio());
		setMoves(new Frana());
		setMoves(new Ombrartigli());
	}
	
	/**
	 * Pre-generated Krokorok Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Krokorok(HiddenAbilities ability){
		super("Krokorok", Type.TERRA, Type.BUIO, 82, 45, 45, 45, 74, 60, 4, 30, 123, ability);
		setMoves(new Fossa());
		setMoves(new Sgranocchio());
		setMoves(new Frana());
		setMoves(new Ombrartigli());
	}
		
	/**
	 * Krokorok Pokèmon constructor
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
	public Krokorok(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.TERRA, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fossa());
				break;
			case 2:
				setMoves(new Fossa());
				setMoves(new Sgranocchio());
				break;
			case 3:
				setMoves(new Fossa());
				setMoves(new Sgranocchio());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Fossa());
				setMoves(new Sgranocchio());
				setMoves(new Frana());
				setMoves(new Ombrartigli());
				break;
		}
	}
	
	/**
	 * Krokorok Pokèmon constructor
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
	public Krokorok(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.TERRA, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fossa());
				break;
			case 2:
				setMoves(new Fossa());
				setMoves(new Sgranocchio());
				break;
			case 3:
				setMoves(new Fossa());
				setMoves(new Sgranocchio());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Fossa());
				setMoves(new Sgranocchio());
				setMoves(new Frana());
				setMoves(new Ombrartigli());
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