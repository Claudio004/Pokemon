package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Idropulsar;
import it.pokèmon.basics.Moves.acqua.Surf;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.Moves.spettro.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Alomomola</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ACQUA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.acqua.Idropulsar
 * @see it.pokèmon.basics.Moves.acqua.Surf
 * @see it.pokèmon.basics.Moves.ghiaccio.Geloraggio
 * @see it.pokèmon.basics.Moves.spettro.Terremoto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Alomomola extends Pokèmon{
	
	/**
	 * Pre-generated Alomomola Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Alomomola(Abilities ability){
		super("Alomomola", Type.ACQUA, 75, 80, 40, 45, 65, 165, 4, 40, 165, ability);
		setMoves(new Idropulsar());
		setMoves(new Geloraggio());
		setMoves(new Terremoto());
		setMoves(new Surf());
	}
	
	/**
	 * Pre-generated Alomomola Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Alomomola(HiddenAbilities ability){
		super("Alomomola", Type.ACQUA, 75, 80, 40, 45, 65, 165, 4, 40, 165, ability);
		setMoves(new Idropulsar());
		setMoves(new Geloraggio());
		setMoves(new Terremoto());
		setMoves(new Surf());
	}
		
	/**
	 * Alomomola Pokèmon constructor
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
	public Alomomola(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Idropulsar());
				break;
			case 2:
				setMoves(new Idropulsar());
				setMoves(new Geloraggio());
				break;
			case 3:
				setMoves(new Idropulsar());
				setMoves(new Geloraggio());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Idropulsar());
				setMoves(new Geloraggio());
				setMoves(new Terremoto());
				setMoves(new Surf());
				break;
		}
	}
	
	/**
	 * Alomomola Pokèmon constructor
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
	public Alomomola(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Idropulsar());
				break;
			case 2:
				setMoves(new Idropulsar());
				setMoves(new Geloraggio());
				break;
			case 3:
				setMoves(new Idropulsar());
				setMoves(new Geloraggio());
				setMoves(new Terremoto());
				break;
			case 4:
				setMoves(new Idropulsar());
				setMoves(new Geloraggio());
				setMoves(new Terremoto());
				setMoves(new Surf());
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
