package it.pokèmon.basics.pokèmon.roccia;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.drago.Dragospiro;
import it.pokèmon.basics.Moves.drago.Dragopulsar;
import it.pokèmon.basics.Moves.roccia.Forzantica;
import it.pokèmon.basics.Moves.volante.AttaccoAla;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Archeops</b><br>
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
 * @see it.pokèmon.basics.Moves.drago.Dragospiro
 * @see it.pokèmon.basics.Moves.roccia.Forzantica
 * @see it.pokèmon.basics.Moves.volante.AttaccoAla
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Archeops extends Pokèmon{
	
	/**
	 * Pre-generated Archeops Pokèmon constructor
	 */
	public Archeops(){
		super("Archen", Type.ROCCIA, Type.VOLANTE, 140, 65, 112, 65, 110, 75, 4, 40, 177, Abilities.SCONFORTO);
		setMoves(new AttaccoAla());
		setMoves(new Forzantica());
		setMoves(new Dragopulsar());
		setMoves(new Dragospiro());
	}
	
	/**
	 * Archeops Pokèmon constructor
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
	public Archeops(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
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
				setMoves(new Dragospiro());
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