package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Idropulsar;
import it.pokèmon.basics.Moves.acqua.Surf;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Frillish</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ACQUA</b></li>
 * 	<li>Second Type: <b>SPETTRO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.ghiaccio.Geloraggio
 * @see it.pokèmon.basics.Moves.acqua.Surf
 * @see it.pokèmon.basics.Moves.spettro.PallaOmbra
 * @see it.pokèmon.basics.Moves.acqua.Idropulsar
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Frillish extends Pokèmon{
	
	/**
	 * Pre-generated Frillish Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Frillish(Abilities ability){
		super("Frillish", Type.ACQUA, Type.SPETTRO, 40, 50, 65, 85, 40, 55, 4, 25, 67, ability);
		setMoves(new Idropulsar());
		setMoves(new PallaOmbra());
		setMoves(new Geloraggio());
		setMoves(new Surf());
	}
	
	/**
	 * Pre-generated Frillish Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Frillish(HiddenAbilities ability){
		super("Frillish", Type.ACQUA, Type.SPETTRO, 40, 50, 65, 85, 40, 55, 4, 25, 67, ability);
		setMoves(new Idropulsar());
		setMoves(new PallaOmbra());
		setMoves(new Geloraggio());
		setMoves(new Surf());
	}
	
	/**
	 * Frillish Pokèmon constructor
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
	public Frillish(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ACQUA, Type.SPETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Idropulsar());
				break;
			case 2:
				setMoves(new Idropulsar());
				setMoves(new PallaOmbra());
				break;
			case 3:
				setMoves(new Idropulsar());
				setMoves(new PallaOmbra());
				setMoves(new Geloraggio());
				break;
			case 4:
				setMoves(new Idropulsar());
				setMoves(new PallaOmbra());
				setMoves(new Geloraggio());
				setMoves(new Surf());
				break;
		}
	}
	
	/**
	 * Frillish Pokèmon constructor
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
	public Frillish(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ACQUA, Type.SPETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Idropulsar());
				break;
			case 2:
				setMoves(new Idropulsar());
				setMoves(new PallaOmbra());
				break;
			case 3:
				setMoves(new Idropulsar());
				setMoves(new PallaOmbra());
				setMoves(new Geloraggio());
				break;
			case 4:
				setMoves(new Idropulsar());
				setMoves(new PallaOmbra());
				setMoves(new Geloraggio());
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