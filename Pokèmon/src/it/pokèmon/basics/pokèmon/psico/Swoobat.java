package it.pokèmon.basics.pokèmon.psico;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.psico.Cuorestampo;
import it.pokèmon.basics.Moves.psico.Psichico;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.Moves.volante.Eterelama;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Swoobat</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>PSICO</b></li>
 * 	<li>Second Type: <b>VOLANTE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.spettro.PallaOmbra
 * @see it.pokèmon.basics.Moves.volante.Eterelama
 * @see it.pokèmon.basics.Moves.psico.Psichico
 * @see it.pokèmon.basics.Moves.psico.Cuorestampo
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Swoobat extends Pokèmon{
	
	/**
	 * Pre-generated Swoobat Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Swoobat(Abilities ability){
		super("Swoobat", Type.PSICO, Type.VOLANTE, 57, 55, 77, 55, 114, 67, 4, 40, 149, ability);
		setMoves(new Cuorestampo());
		setMoves(new Psichico());
		setMoves(new PallaOmbra());
		setMoves(new Eterelama());
	}
	
	/**
	 * Pre-generated Swoobat Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Swoobat(HiddenAbilities ability){
		super("Swoobat", Type.PSICO, Type.VOLANTE, 57, 55, 77, 55, 114, 67, 4, 40, 149, ability);
		setMoves(new Cuorestampo());
		setMoves(new Psichico());
		setMoves(new PallaOmbra());
		setMoves(new Eterelama());
	}
	
	/**
	 * Swoobat Pokèmon constructor
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
	public Swoobat(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.PSICO, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Cuorestampo());
				break;
			case 2:
				setMoves(new Cuorestampo());
				setMoves(new Psichico());
				break;
			case 3:
				setMoves(new Cuorestampo());
				setMoves(new Psichico());
				setMoves(new Eterelama());
				break;
			case 4:
				setMoves(new Cuorestampo());
				setMoves(new Psichico());
				setMoves(new PallaOmbra());
				setMoves(new Eterelama());
				break;
		}
	}
	
	/**
	 * Swoobat Pokèmon constructor
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
	public Swoobat(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.PSICO, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Cuorestampo());
				break;
			case 2:
				setMoves(new Cuorestampo());
				setMoves(new Psichico());
				break;
			case 3:
				setMoves(new Cuorestampo());
				setMoves(new Psichico());
				setMoves(new Eterelama());
				break;
			case 4:
				setMoves(new Cuorestampo());
				setMoves(new Psichico());
				setMoves(new PallaOmbra());
				setMoves(new Eterelama());
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