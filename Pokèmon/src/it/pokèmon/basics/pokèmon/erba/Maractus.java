package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Energipalla;
import it.pokèmon.basics.Moves.erba.Megassorbimento;
import it.pokèmon.basics.Moves.veleno.Velenpuntura;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Maractus</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ERBA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.Moves.erba.Megassorbimento
 * @see it.pokèmon.basics.Moves.erba.Energipalla
 * @see it.pokèmon.basics.Moves.veleno.Velenpuntura
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Maractus extends Pokèmon{
	
	/**
	 * Pre-generated Maractus Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Maractus(Abilities ability){
		super("Maractus", Type.ERBA, 86, 67, 106, 67, 60, 75, 4, 25, 161, ability);
		setMoves(new Megassorbimento());
		setMoves(new Energipalla());
		setMoves(new Velenpuntura());
		setMoves(new Aeroassalto());
	}
	
	/**
	 * Pre-generated Maractus Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Maractus(HiddenAbilities ability){
		super("Maractus", Type.ERBA, 86, 67, 106, 67, 60, 75, 4, 25, 161, ability);
		setMoves(new Megassorbimento());
		setMoves(new Energipalla());
		setMoves(new Velenpuntura());
		setMoves(new Aeroassalto());
	}
	
	/**
	 * Maractus Pokèmon constructor
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
	public Maractus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Megassorbimento());
				break;
			case 2:
				setMoves(new Megassorbimento());
				setMoves(new Energipalla());
				break;
			case 3:
				setMoves(new Megassorbimento());
				setMoves(new Energipalla());
				setMoves(new Velenpuntura());
				break;
			case 4:
				setMoves(new Megassorbimento());
				setMoves(new Energipalla());
				setMoves(new Velenpuntura());
				setMoves(new Aeroassalto());
				break;
		}
	}
	
	/**
	 * Maractus Pokèmon constructor
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
	public Maractus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Megassorbimento());
				break;
			case 2:
				setMoves(new Megassorbimento());
				setMoves(new Energipalla());
				break;
			case 3:
				setMoves(new Megassorbimento());
				setMoves(new Energipalla());
				setMoves(new Velenpuntura());
				break;
			case 4:
				setMoves(new Megassorbimento());
				setMoves(new Energipalla());
				setMoves(new Velenpuntura());
				setMoves(new Aeroassalto());
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