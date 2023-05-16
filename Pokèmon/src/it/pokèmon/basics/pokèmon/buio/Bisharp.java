package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Ferrartigli;
import it.pokèmon.basics.Moves.buio.Neropulsar;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Bisharp</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>BUIO</b></li>
 * 	<li>Second Type: <b>ACCIAIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.acciaio.Ferrartigli
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.Moves.buio.Neropulsar
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Bisharp extends Pokèmon{
	
	/**
	 * Pre-generated Bisharp Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Bisharp(Abilities ability){
		super("Bisharp", Type.BUIO, Type.ACCIAIO, 125, 100, 60, 70, 70, 65, 4, 52, 172, ability);
		setMoves(new Neropulsar());
		setMoves(new Aeroassalto());
		setMoves(new Ferrartigli());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Pre-generated Bisharp Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Bisharp(HiddenAbilities ability){
		super("Bisharp", Type.BUIO, Type.ACCIAIO, 125, 100, 60, 70, 70, 65, 4, 52, 172, ability);
		setMoves(new Neropulsar());
		setMoves(new Aeroassalto());
		setMoves(new Ferrartigli());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Bisharp Pokèmon constructor
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
	public Bisharp(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.BUIO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Neropulsar());
				break;
			case 2:
				setMoves(new Neropulsar());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Neropulsar());
				setMoves(new Aeroassalto());
				setMoves(new Ferrartigli());
				break;
			case 4:
				setMoves(new Neropulsar());
				setMoves(new Aeroassalto());
				setMoves(new Ferrartigli());
				setMoves(new ForbiceX());
				break;
		}
	}
	
	/**
	 * Bisharp Pokèmon constructor
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
	public Bisharp(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.BUIO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Neropulsar());
				break;
			case 2:
				setMoves(new Neropulsar());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Neropulsar());
				setMoves(new Aeroassalto());
				setMoves(new Ferrartigli());
				break;
			case 4:
				setMoves(new Neropulsar());
				setMoves(new Aeroassalto());
				setMoves(new Ferrartigli());
				setMoves(new ForbiceX());
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