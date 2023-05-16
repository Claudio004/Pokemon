package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.normale.Nemesi;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.Moves.acciaio.Metaltestata;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Stoutland</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>NORMALE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.buio.Sgranocchio
 * @see it.pokèmon.basics.Moves.normale.Nemesi
 * @see it.pokèmon.basics.Moves.acciaio.Metaltestata
 * @see it.pokèmon.basics.Moves.spettro.PallaOmbra
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Stoutland extends Pokèmon{
		
	/**
	 * Pre-generated Stoutland Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Stoutland(Abilities ability){
		super("Stoutland", Type.NORMALE, 110, 90, 45, 90, 80, 85, 4, 40, 221, ability);
		setMoves(new Metaltestata());
		setMoves(new Sgranocchio());
		setMoves(new Nemesi());
		setMoves(new PallaOmbra());
	}
	
	/**
	 * Pre-generated Stoutland Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Stoutland(HiddenAbilities ability){
		super("Stoutland", Type.NORMALE, 110, 90, 45, 90, 80, 85, 4, 40, 221, ability);
		setMoves(new Metaltestata());
		setMoves(new Sgranocchio());
		setMoves(new Nemesi());
		setMoves(new PallaOmbra());
	}
		
	/**
	 * Stoutland Pokèmon constructor
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
	public Stoutland(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Metaltestata());
				break;
			case 2:
				setMoves(new Metaltestata());
				setMoves(new Sgranocchio());
				break;
			case 3:
				setMoves(new Metaltestata());
				setMoves(new Sgranocchio());
				setMoves(new Nemesi());
				break;
			case 4:
				setMoves(new Metaltestata());
				setMoves(new Sgranocchio());
				setMoves(new Nemesi());
				setMoves(new PallaOmbra());
				break;
		}
	}
	
	/**
	 * Stoutland Pokèmon constructor
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
	public Stoutland(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
		case 1:
			setMoves(new Metaltestata());
			break;
		case 2:
			setMoves(new Metaltestata());
			setMoves(new Sgranocchio());
			break;
		case 3:
			setMoves(new Metaltestata());
			setMoves(new Sgranocchio());
			setMoves(new Nemesi());
			break;
		case 4:
			setMoves(new Metaltestata());
			setMoves(new Sgranocchio());
			setMoves(new Nemesi());
			setMoves(new PallaOmbra());
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