package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Retromarcia;
import it.pokèmon.basics.Moves.fuoco.Lanciafiamme;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.Moves.volante.Acrobazia;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Larvesta</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>FUOCO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.coleottero.Retromarcia
 * @see it.pokèmon.basics.Moves.fuoco.Nitrocarica
 * @see it.pokèmon.basics.Moves.fuoco.Lanciafiamme
 * @see it.pokèmon.basics.Moves.volante.Acrobazia
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Larvesta extends Pokèmon{
	
	/**
	 * Pre-generated Larvesta Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Larvesta(Abilities ability){
		super("Larvesta", Type.COLEOTTERO, Type.FUOCO, 85, 55, 50, 55, 60, 55, 4, 25, 72, ability);
		setMoves(new Nitrocarica());
		setMoves(new Acrobazia());
		setMoves(new Retromarcia());
		setMoves(new Lanciafiamme());
	}
	
	/**
	 * Pre-generated Larvesta Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Larvesta(HiddenAbilities ability){
		super("Larvesta", Type.COLEOTTERO, Type.FUOCO, 85, 55, 50, 55, 60, 55, 4, 25, 72, ability);
		setMoves(new Nitrocarica());
		setMoves(new Acrobazia());
		setMoves(new Retromarcia());
		setMoves(new Lanciafiamme());
	}
	
	/**
	 * Larvesta Pokèmon constructor
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
	public Larvesta(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Nitrocarica());
				break;
			case 2:
				setMoves(new Nitrocarica());
				setMoves(new Acrobazia());
				break;
			case 3:
				setMoves(new Nitrocarica());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				break;
			case 4:
				setMoves(new Nitrocarica());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				setMoves(new Lanciafiamme());
				break;
		}
	}
	
	/**
	 * Larvesta Pokèmon constructor
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
	public Larvesta(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Nitrocarica());
				break;
			case 2:
				setMoves(new Nitrocarica());
				setMoves(new Acrobazia());
				break;
			case 3:
				setMoves(new Nitrocarica());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				break;
			case 4:
				setMoves(new Nitrocarica());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
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