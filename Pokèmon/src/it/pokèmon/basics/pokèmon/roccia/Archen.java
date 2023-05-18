package it.pokèmon.basics.pokèmon.roccia;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.drago.Dragopulsar;
import it.pokèmon.basics.Moves.coleottero.Retromarcia;
import it.pokèmon.basics.Moves.roccia.Forzantica;
import it.pokèmon.basics.Moves.volante.AttaccoAla;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Archen</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ROCCIA</b></li>
 * 	<li>Second Type: <b>VOLANTE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.drago.Dragopulsar
 * @see it.pokèmon.basics.Moves.coleottero.Retromarcia
 * @see it.pokèmon.basics.Moves.roccia.Forzantica
 * @see it.pokèmon.basics.Moves.volante.AttaccoAla
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Archen extends Pokèmon{
	
	/**
	 * Pre-generated Archen Pokèmon constructor
	 */
	public Archen(){
		super("Archen", Type.ROCCIA, Type.VOLANTE, 112, 45, 74, 45, 70, 45, 4, 25, 71, Abilities.SCONFORTO);
		setMoves(new AttaccoAla());
		setMoves(new Forzantica());
		setMoves(new Dragopulsar());
		setMoves(new Retromarcia());
	}
	
	/**
	 * Archen Pokèmon constructor
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
	 */
	public Archen(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.ROCCIA, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.SCONFORTO);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new AttaccoAla());
				break;
			case 2:
				setMoves(new AttaccoAla());
				setMoves(new Forzantica());
				break;
			case 3:
				setMoves(new AttaccoAla());
				setMoves(new Forzantica());
				setMoves(new Dragopulsar());
				break;
			case 4:
				setMoves(new AttaccoAla());
				setMoves(new Forzantica());
				setMoves(new Dragopulsar());
				setMoves(new Retromarcia());
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