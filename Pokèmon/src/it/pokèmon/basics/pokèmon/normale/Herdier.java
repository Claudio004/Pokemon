package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.Moves.normale.Riduttore;
import it.pokèmon.basics.Moves.spettro.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Herdier</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>NORMALE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.buio.Sgranocchio
 * @see it.pokèmon.basics.Moves.normale.Riduttore
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.Moves.spettro.Terremoto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Herdier extends Pokèmon{
		
	/**
	 * Pre-generated Herdier Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Herdier(Abilities ability){
		super("Herdier", Type.NORMALE, 80, 65, 35, 65, 60, 65, 4, 25, 150, ability);
		setMoves(new Fossa());
		setMoves(new Sgranocchio());
		setMoves(new Riduttore());
		setMoves(new Terremoto());
	}
	
	/**
	 * Pre-generated Herdier Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Herdier(HiddenAbilities ability){
		super("Herdier", Type.NORMALE, 80, 65, 35, 65, 60, 65, 4, 25, 150, ability);
		setMoves(new Fossa());
		setMoves(new Sgranocchio());
		setMoves(new Riduttore());
		setMoves(new Terremoto());
	}
		
	/**
	 * Herdier Pokèmon constructor
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
	public Herdier(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
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
				setMoves(new Riduttore());
				break;
			case 4:
				setMoves(new Fossa());
				setMoves(new Sgranocchio());
				setMoves(new Riduttore());
				setMoves(new Terremoto());
				break;
		}
	}
	
	/**
	 * Herdier Pokèmon constructor
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
	public Herdier(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
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
			setMoves(new Riduttore());
			break;
		case 4:
			setMoves(new Fossa());
			setMoves(new Sgranocchio());
			setMoves(new Riduttore());
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