package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Inseguimento;
import it.pokèmon.basics.Moves.coleottero.Entomoblocco;
import it.pokèmon.basics.Moves.veleno.Velenoshock;
import it.pokèmon.basics.Moves.veleno.Fangobomba;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Venipede</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>VELENO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.veleno.Fangobomba
 * @see it.pokèmon.basics.Moves.buio.Inseguimento
 * @see it.pokèmon.basics.Moves.coleottero.Entomoblocco
 * @see it.pokèmon.basics.Moves.veleno.Velenoshock
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Venipede extends Pokèmon{
	
	/**
	 * Pre-generated Venipede Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Venipede(Abilities ability){
		super("Venipede", Type.COLEOTTERO, Type.VELENO, 45, 59, 30, 39, 57, 30, 4, 15, 52, ability);
		setMoves(new Inseguimento());
		setMoves(new Velenoshock());
		setMoves(new Fangobomba());
		setMoves(new Entomoblocco());
	}
	
	/**
	 * Pre-generated Venipede Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Venipede(HiddenAbilities ability){
		super("Venipede", Type.COLEOTTERO, Type.VELENO, 45, 59, 30, 39, 57, 30, 4, 15, 52, ability);
		setMoves(new Inseguimento());
		setMoves(new Velenoshock());
		setMoves(new Fangobomba());
		setMoves(new Entomoblocco());
	}
	
	/**
	 * Venipede Pokèmon constructor
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
	public Venipede(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Inseguimento());
				break;
			case 2:
				setMoves(new Inseguimento());
				setMoves(new Velenoshock());
				break;
			case 3:
				setMoves(new Inseguimento());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
				break;
			case 4:
				setMoves(new Inseguimento());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
				setMoves(new Entomoblocco());
				break;
		}
	}
	
	/**
	 * Venipede Pokèmon constructor
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
	public Venipede(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Inseguimento());
				break;
			case 2:
				setMoves(new Inseguimento());
				setMoves(new Velenoshock());
				break;
			case 3:
				setMoves(new Inseguimento());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
				break;
			case 4:
				setMoves(new Inseguimento());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
				setMoves(new Entomoblocco());
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