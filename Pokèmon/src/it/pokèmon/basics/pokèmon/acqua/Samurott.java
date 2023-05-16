package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Starter;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Conchilama;
import it.pokèmon.basics.Moves.acqua.Idropulsar;
import it.pokèmon.basics.Moves.coleottero.Tagliofuria;
import it.pokèmon.basics.Moves.lotta.Vendetta;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Samurott</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ACQUA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.acqua.Idropulsar
 * @see it.pokèmon.basics.Moves.acqua.Conchilama
 * @see it.pokèmon.basics.Moves.coleottero.Tagliofuria
 * @see it.pokèmon.basics.Moves.lotta.Vendetta
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Starter
@Inheritance(Pokèmon = "Pokèmon")
public class Samurott extends Pokèmon{
		
	/**
	 * Pre-generated Samurott Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Samurott(Abilities ability){
		super("Samurott", Type.ACQUA, 100, 85, 108, 70, 70, 95, 4, 40, 238, ability);
		setMoves(new Conchilama());
		setMoves(new Tagliofuria());
		setMoves(new Idropulsar());
		setMoves(new Vendetta());
	}
	
	/**
	 * Pre-generated Samurott Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Samurott(HiddenAbilities ability){
		super("Samurott", Type.ACQUA, 100, 85, 108, 70, 70, 95, 4, 40, 238, ability);
		setMoves(new Conchilama());
		setMoves(new Tagliofuria());
		setMoves(new Idropulsar());
		setMoves(new Vendetta());
	}
		
	/**
	 * Samurott Pokèmon constructor
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
	public Samurott(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Conchilama());
				break;
			case 2:
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				break;
			case 3:
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				setMoves(new Idropulsar());
				break;
			case 4:
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				setMoves(new Idropulsar());
				setMoves(new Vendetta());
				break;
		}
	}
	
	/**
	 * Samurott Pokèmon constructor
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
	public Samurott(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Conchilama());
				break;
			case 2:
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				break;
			case 3:
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				setMoves(new Idropulsar());
				break;
			case 4:
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				setMoves(new Idropulsar());
				setMoves(new Vendetta());
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
