package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Acquagetto;
import it.pokèmon.basics.Moves.acqua.Surf;
import it.pokèmon.basics.Moves.roccia.Forzantica;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Tirtouga</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ACQUA</b></li>
 * 	<li>Second Type: <b>ROCCIA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.ghiaccio.Geloraggio
 * @see it.pokèmon.basics.Moves.acqua.Surf
 * @see it.pokèmon.basics.Moves.roccia.Forzantica
 * @see it.pokèmon.basics.Moves.acqua.Acquagetto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Tirtouga extends Pokèmon{
	
	/**
	 * Pre-generated Tirtouga Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Tirtouga(Abilities ability){
		super("Tirtouga", Type.ACQUA, Type.ROCCIA, 78, 103, 53, 45, 22, 54, 4, 25, 71, ability);
		setMoves(new Acquagetto());
		setMoves(new Forzantica());
		setMoves(new Geloraggio());
		setMoves(new Surf());
	}
	
	/**
	 * Pre-generated Tirtouga Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Tirtouga(HiddenAbilities ability){
		super("Tirtouga", Type.ACQUA, Type.ROCCIA, 78, 103, 53, 45, 22, 54, 4, 25, 71, ability);
		setMoves(new Acquagetto());
		setMoves(new Forzantica());
		setMoves(new Geloraggio());
		setMoves(new Surf());
	}
	
	/**
	 * Tirtouga Pokèmon constructor
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
	public Tirtouga(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ACQUA, Type.ROCCIA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Acquagetto());
				break;
			case 2:
				setMoves(new Acquagetto());
				setMoves(new Forzantica());
				break;
			case 3:
				setMoves(new Acquagetto());
				setMoves(new Forzantica());
				setMoves(new Geloraggio());
				break;
			case 4:
				setMoves(new Acquagetto());
				setMoves(new Forzantica());
				setMoves(new Geloraggio());
				setMoves(new Surf());
				break;
		}
	}
	
	/**
	 * Tirtouga Pokèmon constructor
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
	public Tirtouga(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ACQUA, Type.ROCCIA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Acquagetto());
				break;
			case 2:
				setMoves(new Acquagetto());
				setMoves(new Forzantica());
				break;
			case 3:
				setMoves(new Acquagetto());
				setMoves(new Forzantica());
				setMoves(new Geloraggio());
				break;
			case 4:
				setMoves(new Acquagetto());
				setMoves(new Forzantica());
				setMoves(new Geloraggio());
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