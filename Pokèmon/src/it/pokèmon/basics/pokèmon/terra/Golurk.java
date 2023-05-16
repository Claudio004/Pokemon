package it.pokèmon.basics.pokèmon.terra;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.psico.Psichico;
import it.pokèmon.basics.Moves.roccia.Frana;
import it.pokèmon.basics.Moves.spettro.Pugnodombra;
import it.pokèmon.basics.Moves.terra.Terremoto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Golurk</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>TERRA</b></li>
 * 	<li>Second Type: <b>SPETTRO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.roccia.Frana
 * @see it.pokèmon.basics.Moves.terra.Terremoto
 * @see it.pokèmon.basics.Moves.spettro.Pugnodombra
 * @see it.pokèmon.basics.Moves.psico.Psichico
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Golurk extends Pokèmon{
	
	/**
	 * Pre-generated Golurk Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Golurk(Abilities ability){
		super("Golurk", Type.TERRA, Type.SPETTRO, 124, 80, 55, 80, 55, 89, 4, 44, 169, ability);
		setMoves(new Pugnodombra());
		setMoves(new Psichico());
		setMoves(new Frana());
		setMoves(new Terremoto());
	}
	
	/**
	 * Pre-generated Golurk Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Golurk(HiddenAbilities ability){
		super("Golurk", Type.TERRA, Type.SPETTRO, 124, 80, 55, 80, 55, 89, 4, 44, 169, ability);
		setMoves(new Pugnodombra());
		setMoves(new Psichico());
		setMoves(new Frana());
		setMoves(new Terremoto());
	}
		
	/**
	 * Golurk Pokèmon constructor
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
	public Golurk(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.TERRA, Type.SPETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pugnodombra());
				break;
			case 2:
				setMoves(new Pugnodombra());
				setMoves(new Psichico());
				break;
			case 3:
				setMoves(new Pugnodombra());
				setMoves(new Psichico());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Pugnodombra());
				setMoves(new Psichico());
				setMoves(new Frana());
				setMoves(new Terremoto());
				break;
		}
	}
	
	/**
	 * Golurk Pokèmon constructor
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
	public Golurk(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.TERRA, Type.SPETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pugnodombra());
				break;
			case 2:
				setMoves(new Pugnodombra());
				setMoves(new Psichico());
				break;
			case 3:
				setMoves(new Pugnodombra());
				setMoves(new Psichico());
				setMoves(new Frana());
				break;
			case 4:
				setMoves(new Pugnodombra());
				setMoves(new Psichico());
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