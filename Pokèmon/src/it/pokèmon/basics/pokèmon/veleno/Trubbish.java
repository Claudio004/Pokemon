package it.pokèmon.basics.pokèmon.veleno;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.normale.Doppiasberla;
import it.pokèmon.basics.Moves.veleno.Fango;
import it.pokèmon.basics.Moves.veleno.Fangobomba;
import it.pokèmon.basics.Moves.veleno.Velenoshock;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Trubbish</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>VELENO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.normale.Doppiasberla
 * @see it.pokèmon.basics.Moves.veleno.Fango
 * @see it.pokèmon.basics.Moves.veleno.Fangobomba
 * @see it.pokèmon.basics.Moves.veleno.Velenoshock
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Trubbish extends Pokèmon{
	
	/**
	 * Pre-generated Trubbish Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Trubbish(Abilities ability){
		super("Trubbish", Type.VELENO, 50, 62, 40, 62, 65, 50, 4, 20, 66, ability);
		setMoves(new Fango());
		setMoves(new Doppiasberla());
		setMoves(new Velenoshock());
		setMoves(new Fangobomba());
	}
	
	/**
	 * Pre-generated Trubbish Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Trubbish(HiddenAbilities ability){
		super("Trubbish", Type.VELENO, 50, 62, 40, 62, 65, 50, 4, 20, 66, ability);
		setMoves(new Fango());
		setMoves(new Doppiasberla());
		setMoves(new Velenoshock());
		setMoves(new Fangobomba());
	}
	
	/**
	 * Trubbish Pokèmon constructor
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
	public Trubbish(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fango());
				break;
			case 2:
				setMoves(new Fango());
				setMoves(new Doppiasberla());
				break;
			case 3:
				setMoves(new Fango());
				setMoves(new Doppiasberla());
				setMoves(new Velenoshock());
				break;
			case 4:
				setMoves(new Fango());
				setMoves(new Doppiasberla());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
				break;
		}
	}
	
	/**
	 * Trubbish Pokèmon constructor
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
	public Trubbish(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fango());
				break;
			case 2:
				setMoves(new Fango());
				setMoves(new Doppiasberla());
				break;
			case 3:
				setMoves(new Fango());
				setMoves(new Doppiasberla());
				setMoves(new Velenoshock());
				break;
			case 4:
				setMoves(new Fango());
				setMoves(new Doppiasberla());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
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
