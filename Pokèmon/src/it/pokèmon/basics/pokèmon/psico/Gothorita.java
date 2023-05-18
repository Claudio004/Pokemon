package it.pokèmon.basics.pokèmon.psico;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Segnoraggio;
import it.pokèmon.basics.Moves.psico.Psichico;
import it.pokèmon.basics.Moves.psico.Psicoshock;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Gothorita</b><br>
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
 * @see it.pokèmon.basics.Moves.psico.Psicoshock
 * @see it.pokèmon.basics.Moves.coleottero.Segnoraggio
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Gothorita extends Pokèmon{
		
	/**
	 * Pre-generated Gothorita Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Gothorita(Abilities ability){
		super("Gothorita", Type.PSICO, 45, 70, 75, 85, 55, 60, 4, 32, 137, ability);
		setMoves(new Psicoshock());
		setMoves(new Psichico());
		setMoves(new PallaOmbra());
		setMoves(new Segnoraggio());
	}
	
	/**
	 * Pre-generated Gothorita Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Gothorita(HiddenAbilities ability){
		super("Gothorita", Type.PSICO, 45, 70, 75, 85, 55, 60, 4, 32, 137, ability);
		setMoves(new Psicoshock());
		setMoves(new Psichico());
		setMoves(new PallaOmbra());
		setMoves(new Segnoraggio());
	}
		
	/**
	 * Gothorita Pokèmon constructor
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
	public Gothorita(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.PSICO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Psicoshock());
				break;
			case 2:
				setMoves(new Psicoshock());
				setMoves(new Psichico());
				break;
			case 3:
				setMoves(new Psicoshock());
				setMoves(new Psichico());
				setMoves(new PallaOmbra());
				break;
			case 4:
				setMoves(new Psicoshock());
				setMoves(new Psichico());
				setMoves(new PallaOmbra());
				setMoves(new Segnoraggio());
				break;
		}
	}
	
	/**
	 * Gothorita Pokèmon constructor
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
	public Gothorita(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.PSICO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Psicoshock());
				break;
			case 2:
				setMoves(new Psicoshock());
				setMoves(new Psichico());
				break;
			case 3:
				setMoves(new Psicoshock());
				setMoves(new Psichico());
				setMoves(new PallaOmbra());
				break;
			case 4:
				setMoves(new Psicoshock());
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