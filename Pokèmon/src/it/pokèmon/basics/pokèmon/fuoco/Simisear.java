package it.pokèmon.basics.pokèmon.fuoco;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Lanciafiamme;
import it.pokèmon.basics.Moves.fuoco.Pirolancio;
import it.pokèmon.basics.Moves.spettro.Ombrartigli;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Simisear</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>FUOCO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.fuoco.Lanciafiamme
 * @see it.pokèmon.basics.Moves.fuoco.Pirolancio
 * @see it.pokèmon.basics.Moves.spettro.Ombrartigli
 * @see it.pokèmon.basics.Moves.terra.Fossa
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Simisear extends Pokèmon{
	
	/**
	 * Pre-generated Simisear Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Simisear(Abilities ability){
		super("Simisear", Type.FUOCO, 98, 63, 98, 63, 101, 65, 4, 40, 174, ability);
		setMoves(new Pirolancio());
		setMoves(new Lanciafiamme());
		setMoves(new Fossa());
		setMoves(new Ombrartigli());
	}
	
	/**
	 * Pre-generated Simisear Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Simisear(HiddenAbilities ability){
		super("Simisear", Type.FUOCO, 98, 63, 98, 63, 101, 65, 4, 40, 174, ability);
		setMoves(new Pirolancio());
		setMoves(new Lanciafiamme());
		setMoves(new Fossa());
		setMoves(new Ombrartigli());
	}
	
	/**
	 * Simisear Pokèmon constructor
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
	public Simisear(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pirolancio());
				break;
			case 2:
				setMoves(new Pirolancio());
				setMoves(new Lanciafiamme());
				break;
			case 3:
				setMoves(new Pirolancio());
				setMoves(new Lanciafiamme());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Pirolancio());
				setMoves(new Lanciafiamme());
				setMoves(new Fossa());
				setMoves(new Ombrartigli());
				break;
		}
	}
	
	/**
	 * Simisear Pokèmon constructor
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
	public Simisear(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pirolancio());
				break;
			case 2:
				setMoves(new Pirolancio());
				setMoves(new Lanciafiamme());
				break;
			case 3:
				setMoves(new Pirolancio());
				setMoves(new Lanciafiamme());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Pirolancio());
				setMoves(new Lanciafiamme());
				setMoves(new Fossa());
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
