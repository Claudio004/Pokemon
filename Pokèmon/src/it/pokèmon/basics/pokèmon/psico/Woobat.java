package it.pokèmon.basics.pokèmon.psico;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.Moves.psico.Psichico;
import it.pokèmon.basics.Moves.psico.Cuorestampo;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Woobat</b><br>
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
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.Moves.psico.Psichico
 * @see it.pokèmon.basics.Moves.psico.Cuorestampo
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Woobat extends Pokèmon{
	
	/**
	 * Pre-generated Woobat Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Woobat(Abilities ability){
		super("Woobat", Type.PSICO, Type.VOLANTE, 45, 43, 55, 43, 72, 65, 4, 15, 63, ability);
		setMoves(new Cuorestampo());
		setMoves(new Psichico());
		setMoves(new PallaOmbra());
		setMoves(new Aeroassalto());
	}
	
	/**
	 * Pre-generated Woobat Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Woobat(HiddenAbilities ability){
		super("Woobat", Type.PSICO, Type.VOLANTE, 45, 43, 55, 43, 72, 65, 4, 15, 63, ability);
		setMoves(new Cuorestampo());
		setMoves(new Psichico());
		setMoves(new PallaOmbra());
		setMoves(new Aeroassalto());
	}
	
	/**
	 * Woobat Pokèmon constructor
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
	public Woobat(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
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
				setMoves(new Aeroassalto());
				break;
			case 4:
				setMoves(new Cuorestampo());
				setMoves(new Psichico());
				setMoves(new PallaOmbra());
				setMoves(new Aeroassalto());
				break;
		}
	}
	
	/**
	 * Woobat Pokèmon constructor
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
	public Woobat(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
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
				setMoves(new Aeroassalto());
				break;
			case 4:
				setMoves(new Cuorestampo());
				setMoves(new Psichico());
				setMoves(new PallaOmbra());
				setMoves(new Aeroassalto());
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