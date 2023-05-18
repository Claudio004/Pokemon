package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Metaltestata;
import it.pokèmon.basics.Moves.veleno.Velenpuntura;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Escavalier</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>ACCIAIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.acciaio.Metaltestata
 * @see it.pokèmon.basics.Moves.veleno.Velenpuntura
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Escavalier extends Pokèmon{
	
	/**
	 * Pre-generated Escavalier Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Escavalier(Abilities ability){
		super("Escavalier", Type.COLEOTTERO, Type.ACCIAIO, 135, 105, 60, 105, 20, 70, 4, 40, 173, ability);
		setMoves(new Velenpuntura());
		setMoves(new Aeroassalto());
		setMoves(new Metaltestata());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Pre-generated Escavalier Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Escavalier(HiddenAbilities ability){
		super("Escavalier", Type.COLEOTTERO, Type.ACCIAIO, 135, 105, 60, 105, 20, 70, 4, 40, 173, ability);
		setMoves(new Velenpuntura());
		setMoves(new Aeroassalto());
		setMoves(new Metaltestata());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Escavalier Pokèmon constructor
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
	public Escavalier(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Velenpuntura());
				break;
			case 2:
				setMoves(new Velenpuntura());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Velenpuntura());
				setMoves(new Aeroassalto());
				setMoves(new Metaltestata());
				break;
			case 4:
				setMoves(new Velenpuntura());
				setMoves(new Aeroassalto());
				setMoves(new Metaltestata());
				setMoves(new ForbiceX());
				break;
		}
	}
	
	/**
	 * Escavalier Pokèmon constructor
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
	public Escavalier(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Velenpuntura());
				break;
			case 2:
				setMoves(new Velenpuntura());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Velenpuntura());
				setMoves(new Aeroassalto());
				setMoves(new Metaltestata());
				break;
			case 4:
				setMoves(new Velenpuntura());
				setMoves(new Aeroassalto());
				setMoves(new Metaltestata());
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