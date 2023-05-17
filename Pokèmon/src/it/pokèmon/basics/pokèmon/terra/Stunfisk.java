package it.pokèmon.basics.pokèmon.terra;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.elettro.Fulmine;
import it.pokèmon.basics.Moves.roccia.Frana;
import it.pokèmon.basics.Moves.terra.Pantanobomba;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Stunfisk</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>TERRA</b></li>
 * 	<li>Second Type: <b>ELETTRO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.roccia.Frana
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.Moves.terra.Pantanobomba
 * @see it.pokèmon.basics.Moves.elettro.Fulmine
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Stunfisk extends Pokèmon{
	
	/**
	 * Pre-generated Stunfisk Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Stunfisk(Abilities ability){
		super("Stunfisk", Type.TERRA, Type.ELETTRO, 66, 84, 81, 99, 32, 109, 4, 40, 165, ability);
		setMoves(new Pantanobomba());
		setMoves(new Fulmine());
		setMoves(new Frana());
		setMoves(new Terremoto());
	}
	
	/**
	 * Pre-generated Stunfisk Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Stunfisk(HiddenAbilities ability){
		super("Stunfisk", Type.TERRA, Type.ELETTRO, 66, 84, 81, 99, 32, 109, 4, 40, 165, ability);
		setMoves(new Pantanobomba());
		setMoves(new Fulmine());
		setMoves(new Frana());
		setMoves(new Terremoto());
	}
		
	/**
	 * Stunfisk Pokèmon constructor
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
	public Stunfisk(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.TERRA, Type.ELETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pantanobomba());
				break;
			case 2:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				break;
			case 3:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
		}
	}
	
	/**
	 * Stunfisk Pokèmon constructor
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
	public Stunfisk(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.TERRA, Type.ELETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pantanobomba());
				break;
			case 2:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				break;
			case 3:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Pantanobomba());
				setMoves(new Fulmine());
				setMoves(new Frana());
				setMoves(new Terremoto());
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
