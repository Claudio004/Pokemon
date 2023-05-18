package it.pokèmon.basics.pokèmon.normale;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.normale.Azione;
import it.pokèmon.basics.Moves.normale.Iperzanna;

/**
 * Pokèmon: <b>Watchog</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>NORMALE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.spettro.PallaOmbra
 * @see it.pokèmon.basics.Moves.buio.Sgranocchio
 * @see it.pokèmon.basics.Moves.normale.Azione
 * @see it.pokèmon.basics.Moves.normale.Iperzanna
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Watchog extends Pokèmon{
	
	/**
	 * Pre-generated Watchog Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Watchog(Abilities ability){
		super("Watchog", Type.NORMALE, 85, 69, 60, 69, 77, 60, 4, 30, 147, ability);
		setMoves(new Azione());
		setMoves(new PallaOmbra());
		setMoves(new Sgranocchio());
		setMoves(new Iperzanna());
	}
	
	/**
	 * Pre-generated Watchog Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Watchog(HiddenAbilities ability){
		super("Watchog", Type.NORMALE, 85, 69, 60, 69, 77, 60, 4, 30, 147, ability);
		setMoves(new Azione());
		setMoves(new PallaOmbra());
		setMoves(new Sgranocchio());
		setMoves(new Iperzanna());
	}
		
	/**
	 * Watchog Pokèmon constructor
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
	public Watchog(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new PallaOmbra());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new PallaOmbra());
				setMoves(new Sgranocchio());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new PallaOmbra());
				setMoves(new Sgranocchio());
				setMoves(new Iperzanna());
				break;
		}
	}
	
	/**
	 * Watchog Pokèmon constructor
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
	public Watchog(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new PallaOmbra());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new PallaOmbra());
				setMoves(new Sgranocchio());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new PallaOmbra());
				setMoves(new Sgranocchio());
				setMoves(new Iperzanna());
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
