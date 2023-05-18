package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Segnoraggio;
import it.pokèmon.basics.Moves.erba.Megassorbimento;
import it.pokèmon.basics.Moves.coleottero.Entomoblocco;
import it.pokèmon.basics.Moves.veleno.Velenoshock;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Shelmet</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.coleottero.Segnoraggio
 * @see it.pokèmon.basics.Moves.erba.Megassorbimento
 * @see it.pokèmon.basics.Moves.coleottero.Entomoblocco
 * @see it.pokèmon.basics.Moves.veleno.Velenoshock
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Shelmet extends Pokèmon{
	
	/**
	 * Pre-generated Shelmet Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Shelmet(Abilities ability){
		super("Shelmet", Type.COLEOTTERO, 40, 85, 40, 65, 25, 50, 4, 25, 61, ability);
		setMoves(new Megassorbimento());
		setMoves(new Entomoblocco());
		setMoves(new Velenoshock());
		setMoves(new Segnoraggio());
	}
	
	/**
	 * Pre-generated Shelmet Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Shelmet(HiddenAbilities ability){
		super("Shelmet", Type.COLEOTTERO, 40, 85, 40, 65, 25, 50, 4, 25, 61, ability);
		setMoves(new Megassorbimento());
		setMoves(new Entomoblocco());
		setMoves(new Velenoshock());
		setMoves(new Segnoraggio());
	}
	
	/**
	 * Shelmet Pokèmon constructor
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
	public Shelmet(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Megassorbimento());
				break;
			case 2:
				setMoves(new Megassorbimento());
				setMoves(new Entomoblocco());
				break;
			case 3:
				setMoves(new Megassorbimento());
				setMoves(new Entomoblocco());
				setMoves(new Velenoshock());
				break;
			case 4:
				setMoves(new Megassorbimento());
				setMoves(new Entomoblocco());
				setMoves(new Velenoshock());
				setMoves(new Segnoraggio());
				break;
		}
	}
	
	/**
	 * Shelmet Pokèmon constructor
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
	public Shelmet(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Megassorbimento());
				break;
			case 2:
				setMoves(new Megassorbimento());
				setMoves(new Entomoblocco());
				break;
			case 3:
				setMoves(new Megassorbimento());
				setMoves(new Entomoblocco());
				setMoves(new Velenoshock());
				break;
			case 4:
				setMoves(new Megassorbimento());
				setMoves(new Entomoblocco());
				setMoves(new Velenoshock());
				setMoves(new Segnoraggio());
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