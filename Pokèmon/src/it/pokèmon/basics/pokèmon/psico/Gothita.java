package it.pokèmon.basics.pokèmon.psico;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Segnoraggio;
import it.pokèmon.basics.Moves.psico.Psichico;
import it.pokèmon.basics.Moves.psico.Psicoraggio;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Gothita</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>PSICO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.spettro.PallaOmbra
 * @see it.pokèmon.basics.Moves.psico.Psichico
 * @see it.pokèmon.basics.Moves.psico.Psicoraggio
 * @see it.pokèmon.basics.Moves.coleottero.Segnoraggio
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Gothita extends Pokèmon{
		
	/**
	 * Pre-generated Gothita Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Gothita(Abilities ability){
		super("Gothita", Type.PSICO, 30, 50, 55, 65, 45, 45, 4, 20, 58, ability);
		setMoves(new Psicoraggio());
		setMoves(new Psichico());
		setMoves(new PallaOmbra());
		setMoves(new Segnoraggio());
	}
	
	/**
	 * Pre-generated Gothita Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Gothita(HiddenAbilities ability){
		super("Gothita", Type.PSICO, 30, 50, 55, 65, 45, 45, 4, 20, 58, ability);
		setMoves(new Psicoraggio());
		setMoves(new Psichico());
		setMoves(new PallaOmbra());
		setMoves(new Segnoraggio());
	}
		
	/**
	 * Gothita Pokèmon constructor
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
	public Gothita(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.PSICO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Psicoraggio());
				break;
			case 2:
				setMoves(new Psicoraggio());
				setMoves(new Psichico());
				break;
			case 3:
				setMoves(new Psicoraggio());
				setMoves(new Psichico());
				setMoves(new PallaOmbra());
				break;
			case 4:
				setMoves(new Psicoraggio());
				setMoves(new Psichico());
				setMoves(new PallaOmbra());
				setMoves(new Segnoraggio());
				break;
		}
	}
	
	/**
	 * Gothita Pokèmon constructor
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
	public Gothita(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.PSICO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Psicoraggio());
				break;
			case 2:
				setMoves(new Psicoraggio());
				setMoves(new Psichico());
				break;
			case 3:
				setMoves(new Psicoraggio());
				setMoves(new Psichico());
				setMoves(new PallaOmbra());
				break;
			case 4:
				setMoves(new Psicoraggio());
				setMoves(new Psichico());
				setMoves(new PallaOmbra());
				setMoves(new Segnoraggio());
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