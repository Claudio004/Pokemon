package it.pokèmon.basics.pokèmon.terra;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.roccia.Frana;
import it.pokèmon.basics.Moves.acciaio.Ferrartigli;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Excadrill</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>TERRA</b></li>
 * 	<li>Second Type: <b>ACCIAIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.roccia.Frana
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.Moves.acciaio.Ferrartigli
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Excadrill extends Pokèmon{
	
	/**
	 * Pre-generated Excadrill Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Excadrill(Abilities ability){
		super("Excadrill", Type.TERRA, Type.ACCIAIO, 135, 60, 50, 65, 88, 110, 4, 40, 178, ability);
		setMoves(new Ferrartigli());
		setMoves(new ForbiceX());
		setMoves(new Frana());
		setMoves(new Terremoto());
	}
	
	/**
	 * Pre-generated Excadrill Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Excadrill(HiddenAbilities ability){
		super("Excadrill", Type.TERRA, Type.ACCIAIO, 135, 60, 50, 65, 88, 110, 4, 40, 178, ability);
		setMoves(new Ferrartigli());
		setMoves(new ForbiceX());
		setMoves(new Frana());
		setMoves(new Terremoto());
	}
		
	/**
	 * Excadrill Pokèmon constructor
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
	public Excadrill(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.TERRA, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ferrartigli());
				break;
			case 2:
				setMoves(new Ferrartigli());
				setMoves(new ForbiceX());
				break;
			case 3:
				setMoves(new Ferrartigli());
				setMoves(new ForbiceX());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Ferrartigli());
				setMoves(new ForbiceX());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
		}
	}
	
	/**
	 * Excadrill Pokèmon constructor
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
	public Excadrill(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.TERRA, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ferrartigli());
				break;
			case 2:
				setMoves(new Ferrartigli());
				setMoves(new ForbiceX());
				break;
			case 3:
				setMoves(new Ferrartigli());
				setMoves(new ForbiceX());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Ferrartigli());
				setMoves(new ForbiceX());
				setMoves(new Frana());
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