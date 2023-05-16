package it.pokèmon.basics.pokèmon.terra;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Legendary;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.drago.Oltraggio;
import it.pokèmon.basics.Moves.lotta.Breccia;
import it.pokèmon.basics.Moves.roccia.Rocciotomba;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Landorus</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>TERRA</b></li>
 * 	<li>Second Type: <b>VOLANTE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.drago.Oltraggio
 * @see it.pokèmon.basics.Moves.lotta.Breccia
 * @see it.pokèmon.basics.Moves.roccia.Rocciotomba
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Legendary
@Inheritance(Pokèmon = "Pokèmon")
public class Landorus extends Pokèmon{
	
	/**
	 * Pre-generated Landorus Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Landorus(Abilities ability){
		super("Landorus", Type.TERRA, Type.VOLANTE, 125, 90, 115, 80, 101, 89, 4, 45, 270, ability);
		setMoves(new Terremoto());
		setMoves(new Oltraggio());
		setMoves(new Breccia());
		setMoves(new Rocciotomba());
	}
	
	/**
	 * Pre-generated Landorus Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Landorus(HiddenAbilities ability){
		super("Landorus", Type.TERRA, Type.VOLANTE, 125, 90, 115, 80, 101, 89, 4, 45, 270, ability);
		setMoves(new Terremoto());
		setMoves(new Oltraggio());
		setMoves(new Breccia());
		setMoves(new Rocciotomba());
	}
	
	/**
	 * Landorus Pokèmon constructor
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
	public Landorus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.TERRA, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Oltraggio());
				break;
			case 2:
				setMoves(new Terremoto());
				setMoves(new Oltraggio());
				break;
			case 3:
				setMoves(new Terremoto());
				setMoves(new Oltraggio());
				setMoves(new Breccia());
				break;
			case 4:
				setMoves(new Terremoto());
				setMoves(new Oltraggio());
				setMoves(new Breccia());
				setMoves(new Rocciotomba());
				break;
		}
	}
	
	/**
	 * Landorus Pokèmon constructor
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
	public Landorus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.TERRA, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Oltraggio());
				break;
			case 2:
				setMoves(new Terremoto());
				setMoves(new Oltraggio());
				break;
			case 3:
				setMoves(new Terremoto());
				setMoves(new Oltraggio());
				setMoves(new Breccia());
				break;
			case 4:
				setMoves(new Terremoto());
				setMoves(new Oltraggio());
				setMoves(new Breccia());
				setMoves(new Rocciotomba());
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