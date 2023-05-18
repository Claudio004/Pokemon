package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Acquadisale;
import it.pokèmon.basics.Moves.acqua.Surf;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.Moves.roccia.Forzantica;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Carracosta</b><br>
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
 * @see it.pokèmon.basics.Moves.acqua.Acquadisale
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Carracosta extends Pokèmon{
	
	/**
	 * Pre-generated Carracosta Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Carracosta(Abilities ability){
		super("Carracosta", Type.ACQUA, Type.ROCCIA, 108, 133, 83, 65, 32, 74, 4, 40, 173, ability);
		setMoves(new Acquadisale());
		setMoves(new Forzantica());
		setMoves(new Geloraggio());
		setMoves(new Surf());
	}
	
	/**
	 * Pre-generated Carracosta Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Carracosta(HiddenAbilities ability){
		super("Carracosta", Type.ACQUA, Type.ROCCIA, 108, 133, 83, 65, 32, 74, 4, 40, 173, ability);
		setMoves(new Acquadisale());
		setMoves(new Forzantica());
		setMoves(new Geloraggio());
		setMoves(new Surf());
	}
	
	/**
	 * Carracosta Pokèmon constructor
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
	public Carracosta(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ACQUA, Type.ROCCIA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Acquadisale());
				break;
			case 2:
				setMoves(new Acquadisale());
				setMoves(new Forzantica());
				break;
			case 3:
				setMoves(new Acquadisale());
				setMoves(new Forzantica());
				setMoves(new Geloraggio());
				break;
			case 4:
				setMoves(new Acquadisale());
				setMoves(new Forzantica());
				setMoves(new Geloraggio());
				setMoves(new Surf());
				break;
		}
	}
	
	/**
	 * Carracosta Pokèmon constructor
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
	public Carracosta(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ACQUA, Type.ROCCIA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Acquadisale());
				break;
			case 2:
				setMoves(new Acquadisale());
				setMoves(new Forzantica());
				break;
			case 3:
				setMoves(new Acquadisale());
				setMoves(new Forzantica());
				setMoves(new Geloraggio());
				break;
			case 4:
				setMoves(new Acquadisale());
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