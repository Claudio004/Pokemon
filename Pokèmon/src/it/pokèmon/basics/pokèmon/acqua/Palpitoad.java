package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Bollaraggio;
import it.pokèmon.basics.Moves.acqua.Surf;
import it.pokèmon.basics.Moves.terra.Colpodifango;
import it.pokèmon.basics.Moves.veleno.Fangobomba;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Palpitoad</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ACQUA</b></li>
 * 	<li>Second Type: <b>TERRA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.veleno.Fangobomba
 * @see it.pokèmon.basics.Moves.acqua.Surf
 * @see it.pokèmon.basics.Moves.terra.Colpodifango
 * @see it.pokèmon.basics.Moves.acqua.Bollaraggio
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Palpitoad extends Pokèmon{
	
	/**
	 * Pre-generated Palpitoad Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Palpitoad(Abilities ability){
		super("Palpitoad", Type.ACQUA, Type.TERRA, 65, 55, 65, 55, 69, 75, 4, 26, 134, ability);
		setMoves(new Bollaraggio());
		setMoves(new Colpodifango());
		setMoves(new Fangobomba());
		setMoves(new Surf());
	}
	
	/**
	 * Pre-generated Palpitoad Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Palpitoad(HiddenAbilities ability){
		super("Palpitoad", Type.ACQUA, Type.TERRA, 65, 55, 65, 55, 69, 75, 4, 26, 134, ability);
		setMoves(new Bollaraggio());
		setMoves(new Colpodifango());
		setMoves(new Fangobomba());
		setMoves(new Surf());
	}
	
	/**
	 * Palpitoad Pokèmon constructor
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
	public Palpitoad(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ACQUA, Type.TERRA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Bollaraggio());
				break;
			case 2:
				setMoves(new Bollaraggio());
				setMoves(new Colpodifango());
				break;
			case 3:
				setMoves(new Bollaraggio());
				setMoves(new Colpodifango());
				setMoves(new Fangobomba());
				break;
			case 4:
				setMoves(new Bollaraggio());
				setMoves(new Colpodifango());
				setMoves(new Fangobomba());
				setMoves(new Surf());
				break;
		}
	}
	
	/**
	 * Palpitoad Pokèmon constructor
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
	public Palpitoad(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ACQUA, Type.TERRA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Bollaraggio());
				break;
			case 2:
				setMoves(new Bollaraggio());
				setMoves(new Colpodifango());
				break;
			case 3:
				setMoves(new Bollaraggio());
				setMoves(new Colpodifango());
				setMoves(new Fangobomba());
				break;
			case 4:
				setMoves(new Bollaraggio());
				setMoves(new Colpodifango());
				setMoves(new Fangobomba());
				setMoves(new Surf());
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