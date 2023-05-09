package it.pokèmon.basics.pokèmon.psico;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.GeneratoreV;
import it.pokèmon.basics.Moves.fuoco.Sparafuoco;
import it.pokèmon.basics.Moves.psico.CozzataZen;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Victini</b><br>
 * Extends Pokèmon<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>PSICO</b></li>
 * 	<li>Second Type: <b>FUOCO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.fuoco.GeneratoreV
 * @see it.pokèmon.basics.Moves.fuoco.Sparafuoco
 * @see it.pokèmon.basics.Moves.psico.CozzataZen
 * @see it.pokèmon.basics.Moves.spettro.PallaOmbra
 * @see it.pokèmon.basics.abilities.Abilities
 */
public class Victini extends Pokèmon{
	
	/**
	 * Pre-generated Victini Pokèmon constructor
	 */
	public Victini(){
		super("Victini", Type.PSICO, Type.FUOCO, 100, 100, 100, 100, 100, 100, 4, 40, 270, Abilities.VITTORSTELLA);
		setMoves(new Sparafuoco());
		setMoves(new GeneratoreV());
		setMoves(new CozzataZen());
		setMoves(new PallaOmbra());
	}
	
	/**
	 * Victini Pokèmon constructor
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
	 */
	public Victini(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.PSICO, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.VITTORSTELLA);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sparafuoco());
				break;
			case 2:
				setMoves(new Sparafuoco());
				setMoves(new GeneratoreV());
				break;
			case 3:
				setMoves(new Sparafuoco());
				setMoves(new GeneratoreV());
				setMoves(new CozzataZen());
				break;
			case 4:
				setMoves(new Sparafuoco());
				setMoves(new GeneratoreV());
				setMoves(new CozzataZen());
				setMoves(new PallaOmbra());
				break;
		}
	}
	
	/**
	 * Pre-generated Snivy Pokèmon constructor
	 * @param ability : Abilities
	 */
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
