package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Finta;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.Moves.acciaio.Ferrartigli;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Pawniard</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>BUIO</b></li>
 * 	<li>Second Type: <b>ACCIAIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.acciaio.Ferrartigli
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.Moves.buio.Finta
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Pawniard extends Pokèmon{
	
	/**
	 * Pre-generated Pawniard Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Pawniard(Abilities ability){
		super("Pawniard", Type.BUIO, Type.ACCIAIO, 85, 70, 40, 40, 60, 45, 4, 30, 68, ability);
		setMoves(new Finta());
		setMoves(new Aeroassalto());
		setMoves(new Ferrartigli());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Pre-generated Pawniard Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Pawniard(HiddenAbilities ability){
		super("Pawniard", Type.BUIO, Type.ACCIAIO, 85, 70, 40, 40, 60, 45, 4, 30, 68, ability);
		setMoves(new Finta());
		setMoves(new Aeroassalto());
		setMoves(new Ferrartigli());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Pawniard Pokèmon constructor
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
	public Pawniard(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.BUIO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Finta());
				break;
			case 2:
				setMoves(new Finta());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Finta());
				setMoves(new Aeroassalto());
				setMoves(new Ferrartigli());
				break;
			case 4:
				setMoves(new Finta());
				setMoves(new Aeroassalto());
				setMoves(new Ferrartigli());
				setMoves(new ForbiceX());
				break;
		}
	}
	
	/**
	 * Pawniard Pokèmon constructor
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
	public Pawniard(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.BUIO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Finta());
				break;
			case 2:
				setMoves(new Finta());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Finta());
				setMoves(new Aeroassalto());
				setMoves(new Ferrartigli());
				break;
			case 4:
				setMoves(new Finta());
				setMoves(new Aeroassalto());
				setMoves(new Ferrartigli());
				setMoves(new ForbiceX());
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