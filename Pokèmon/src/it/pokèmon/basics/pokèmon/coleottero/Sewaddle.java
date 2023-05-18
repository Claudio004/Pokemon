package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.normale.Azione;
import it.pokèmon.basics.Moves.coleottero.Coleomorso;
import it.pokèmon.basics.Moves.coleottero.Entomoblocco;
import it.pokèmon.basics.Moves.erba.Foglielama;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Sewaddle</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>ERBA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.normale.Azione
 * @see it.pokèmon.basics.Moves.coleottero.Coleomorso
 * @see it.pokèmon.basics.Moves.coleottero.Entomoblocco
 * @see it.pokèmon.basics.Moves.erba.Foglielama
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Sewaddle extends Pokèmon{
	
	/**
	 * Pre-generated Sewaddle Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Sewaddle(Abilities ability){
		super("Sewaddle", Type.COLEOTTERO, Type.ERBA, 53, 70, 40, 60, 42, 45, 4, 15, 62, ability);
		setMoves(new Coleomorso());
		setMoves(new Foglielama());
		setMoves(new Azione());
		setMoves(new Entomoblocco());
	}
	
	/**
	 * Pre-generated Sewaddle Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Sewaddle(HiddenAbilities ability){
		super("Sewaddle", Type.COLEOTTERO, Type.ERBA, 53, 70, 40, 60, 42, 45, 4, 15, 62, ability);
		setMoves(new Coleomorso());
		setMoves(new Foglielama());
		setMoves(new Azione());
		setMoves(new Entomoblocco());
	}
	
	/**
	 * Sewaddle Pokèmon constructor
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
	public Sewaddle(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Coleomorso());
				break;
			case 2:
				setMoves(new Coleomorso());
				setMoves(new Foglielama());
				break;
			case 3:
				setMoves(new Coleomorso());
				setMoves(new Foglielama());
				setMoves(new Azione());
				break;
			case 4:
				setMoves(new Coleomorso());
				setMoves(new Foglielama());
				setMoves(new Azione());
				setMoves(new Entomoblocco());
				break;
		}
	}
	
	/**
	 * Sewaddle Pokèmon constructor
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
	public Sewaddle(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Coleomorso());
				break;
			case 2:
				setMoves(new Coleomorso());
				setMoves(new Foglielama());
				break;
			case 3:
				setMoves(new Coleomorso());
				setMoves(new Foglielama());
				setMoves(new Azione());
				break;
			case 4:
				setMoves(new Coleomorso());
				setMoves(new Foglielama());
				setMoves(new Azione());
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