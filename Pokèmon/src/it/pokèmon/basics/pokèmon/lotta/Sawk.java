package it.pokèmon.basics.pokèmon.lotta;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.ghiaccio.Gelopugno;
import it.pokèmon.basics.Moves.lotta.Breccia;
import it.pokèmon.basics.Moves.lotta.Doppiocalcio;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Sawk</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>LOTTA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.ghiaccio.Gelopugno
 * @see it.pokèmon.basics.Moves.lotta.Breccia
 * @see it.pokèmon.basics.Moves.lotta.Doppiocalcio
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Sawk extends Pokèmon{
	
	/**
	 * Pre-generated Sawk Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Sawk(Abilities ability){
		super("Sawk", Type.LOTTA, 125, 75, 30, 75, 85, 75, 4, 30, 163, ability);
		setMoves(new Doppiocalcio());
		setMoves(new Breccia());
		setMoves(new Gelopugno());
		setMoves(new Terremoto());
	}
	
	/**
	 * Pre-generated Sawk Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Sawk(HiddenAbilities ability){
		super("Sawk", Type.LOTTA, 125, 75, 30, 75, 85, 75, 4, 30, 163, ability);
		setMoves(new Doppiocalcio());
		setMoves(new Breccia());
		setMoves(new Gelopugno());
		setMoves(new Terremoto());
	}
	
	/**
	 * Sawk Pokèmon constructor
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
	public Sawk(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Doppiocalcio());
				break;
			case 2:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				break;
			case 3:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				setMoves(new Gelopugno());
				break;
			case 4:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				setMoves(new Gelopugno());
				setMoves(new Terremoto());
				break;
		}
	}
	
	/**
	 * Sawk Pokèmon constructor
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
	public Sawk(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Doppiocalcio());
				break;
			case 2:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				break;
			case 3:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				setMoves(new Gelopugno());
				break;
			case 4:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				setMoves(new Gelopugno());
				setMoves(new Terremoto());
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
