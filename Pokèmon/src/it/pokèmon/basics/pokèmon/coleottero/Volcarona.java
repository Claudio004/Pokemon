package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Ventargenteo;
import it.pokèmon.basics.Moves.fuoco.Lanciafiamme;
import it.pokèmon.basics.Moves.fuoco.Ondacalda;
import it.pokèmon.basics.Moves.veleno.Velenpuntura;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Volcarona</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>FUOCO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.coleottero.Ventargenteo
 * @see it.pokèmon.basics.Moves.veleno.Velenpuntura
 * @see it.pokèmon.basics.Moves.fuoco.Lanciafiamme
 * @see it.pokèmon.basics.Moves.fuoco.Ondacalda
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Volcarona extends Pokèmon{
	
	/**
	 * Pre-generated Volcarona Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Volcarona(Abilities ability){
		super("Volcarona", Type.COLEOTTERO, Type.FUOCO, 60, 65, 135, 105, 100, 85, 4, 60, 248, ability);
		setMoves(new Velenpuntura());
		setMoves(new Ondacalda());
		setMoves(new Ventargenteo());
		setMoves(new Lanciafiamme());
	}
	
	/**
	 * Pre-generated Volcarona Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Volcarona(HiddenAbilities ability){
		super("Volcarona", Type.COLEOTTERO, Type.FUOCO, 60, 65, 135, 105, 100, 85, 4, 60, 248, ability);
		setMoves(new Velenpuntura());
		setMoves(new Ondacalda());
		setMoves(new Ventargenteo());
		setMoves(new Lanciafiamme());
	}
	
	/**
	 * Volcarona Pokèmon constructor
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
	public Volcarona(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Velenpuntura());
				break;
			case 2:
				setMoves(new Velenpuntura());
				setMoves(new Ondacalda());
				break;
			case 3:
				setMoves(new Velenpuntura());
				setMoves(new Ondacalda());
				setMoves(new Ventargenteo());
				break;
			case 4:
				setMoves(new Velenpuntura());
				setMoves(new Ondacalda());
				setMoves(new Ventargenteo());
				setMoves(new Lanciafiamme());
				break;
		}
	}
	
	/**
	 * Volcarona Pokèmon constructor
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
	public Volcarona(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Velenpuntura());
				break;
			case 2:
				setMoves(new Velenpuntura());
				setMoves(new Ondacalda());
				break;
			case 3:
				setMoves(new Velenpuntura());
				setMoves(new Ondacalda());
				setMoves(new Ventargenteo());
				break;
			case 4:
				setMoves(new Velenpuntura());
				setMoves(new Ondacalda());
				setMoves(new Ventargenteo());
				setMoves(new Lanciafiamme());
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