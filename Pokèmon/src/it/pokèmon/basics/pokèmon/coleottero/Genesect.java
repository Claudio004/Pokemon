package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Ferrartigli;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.elettro.Falcecannone;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Genesect</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>ACCIAIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.elettro.Falcecannone
 * @see it.pokèmon.basics.Moves.acciaio.Ferrartigli
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Genesect extends Pokèmon{
	
	/**
	 * Pre-generated Genesect Pokèmon constructor
	 */
	public Genesect(){
		super("Genesect", Type.COLEOTTERO, Type.ACCIAIO, 120, 95, 120, 95, 99, 71, 4, 40, 270, Abilities.DOWNLOAD);
		setMoves(new Ferrartigli());
		setMoves(new Aeroassalto());
		setMoves(new Falcecannone());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Genesect Pokèmon constructor
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
	public Genesect(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.COLEOTTERO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.DOWNLOAD);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ferrartigli());
				break;
			case 2:
				setMoves(new Ferrartigli());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Ferrartigli());
				setMoves(new Aeroassalto());
				setMoves(new Falcecannone());
				break;
			case 4:
				setMoves(new Ferrartigli());
				setMoves(new Aeroassalto());
				setMoves(new Falcecannone());
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