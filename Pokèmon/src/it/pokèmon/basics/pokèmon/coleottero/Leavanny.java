package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Coleomorso;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.erba.Energipalla;
import it.pokèmon.basics.Moves.erba.Fendifoglia;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Leavanny</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>ERBA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.erba.Fendifoglia
 * @see it.pokèmon.basics.Moves.coleottero.Coleomorso
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.erba.Energipalla
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Leavanny extends Pokèmon{
	
	/**
	 * Pre-generated Leavanny Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Leavanny(Abilities ability){
		super("Leavanny", Type.COLEOTTERO, Type.ERBA, 103, 80, 70, 80, 92, 75, 4, 45, 221, ability);
		setMoves(new Coleomorso());
		setMoves(new Energipalla());
		setMoves(new Fendifoglia());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Pre-generated Leavanny Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Leavanny(HiddenAbilities ability){
		super("Leavanny", Type.COLEOTTERO, Type.ERBA, 103, 80, 70, 80, 92, 75, 4, 45, 221, ability);
		setMoves(new Coleomorso());
		setMoves(new Energipalla());
		setMoves(new Fendifoglia());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Leavanny Pokèmon constructor
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
	public Leavanny(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Coleomorso());
				break;
			case 2:
				setMoves(new Coleomorso());
				setMoves(new Energipalla());
				break;
			case 3:
				setMoves(new Coleomorso());
				setMoves(new Energipalla());
				setMoves(new Fendifoglia());
				break;
			case 4:
				setMoves(new Coleomorso());
				setMoves(new Energipalla());
				setMoves(new Fendifoglia());
				setMoves(new ForbiceX());
				break;
		}
	}
	
	/**
	 * Leavanny Pokèmon constructor
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
	public Leavanny(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.ERBA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Coleomorso());
				break;
			case 2:
				setMoves(new Coleomorso());
				setMoves(new Energipalla());
				break;
			case 3:
				setMoves(new Coleomorso());
				setMoves(new Energipalla());
				setMoves(new Fendifoglia());
				break;
			case 4:
				setMoves(new Coleomorso());
				setMoves(new Energipalla());
				setMoves(new Fendifoglia());
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