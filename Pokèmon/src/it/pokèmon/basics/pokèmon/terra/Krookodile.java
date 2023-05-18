package it.pokèmon.basics.pokèmon.terra;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.drago.Oltraggio;
import it.pokèmon.basics.Moves.spettro.Ombrartigli;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Krookodile</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>TERRA</b></li>
 * 	<li>Second Type: <b>BUIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.drago.Oltraggio
 * @see it.pokèmon.basics.Moves.spettro.Ombrartigli
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.Moves.buio.Sgranocchio
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Krookodile extends Pokèmon{
	
	/**
	 * Pre-generated Krookodile Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Krookodile(Abilities ability){
		super("Krookodile", Type.TERRA, Type.BUIO, 117, 80, 65, 70, 92, 95, 4, 45, 229, ability);
		setMoves(new Terremoto());
		setMoves(new Sgranocchio());
		setMoves(new Oltraggio());
		setMoves(new Ombrartigli());
	}
	
	/**
	 * Pre-generated Krookodile Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Krookodile(HiddenAbilities ability){
		super("Krookodile", Type.TERRA, Type.BUIO, 117, 80, 65, 70, 92, 95, 4, 45, 229, ability);
		setMoves(new Terremoto());
		setMoves(new Sgranocchio());
		setMoves(new Oltraggio());
		setMoves(new Ombrartigli());
	}
		
	/**
	 * Krookodile Pokèmon constructor
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
	public Krookodile(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.TERRA, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Terremoto());
				break;
			case 2:
				setMoves(new Terremoto());
				setMoves(new Sgranocchio());
				break;
			case 3:
				setMoves(new Terremoto());
				setMoves(new Sgranocchio());
				setMoves(new Oltraggio());
				break;
			case 4:
				setMoves(new Terremoto());
				setMoves(new Sgranocchio());
				setMoves(new Oltraggio());
				setMoves(new Ombrartigli());
				break;
		}
	}
	
	/**
	 * Krookodile Pokèmon constructor
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
	public Krookodile(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.TERRA, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Terremoto());
				break;
			case 2:
				setMoves(new Terremoto());
				setMoves(new Sgranocchio());
				break;
			case 3:
				setMoves(new Terremoto());
				setMoves(new Sgranocchio());
				setMoves(new Oltraggio());
				break;
			case 4:
				setMoves(new Terremoto());
				setMoves(new Sgranocchio());
				setMoves(new Oltraggio());
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