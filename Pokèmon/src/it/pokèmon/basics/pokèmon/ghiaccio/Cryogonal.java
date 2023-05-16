package it.pokèmon.basics.pokèmon.ghiaccio;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Cannonflash;
import it.pokèmon.basics.Moves.ghiaccio.Geloscheggia;
import it.pokèmon.basics.Moves.ghiaccio.Raggiaurora;
import it.pokèmon.basics.Moves.normale.Lacerazione;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Cryogonal</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>GHIACCIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.coleottero.Cannonflash
 * @see it.pokèmon.basics.Moves.ghiaccio.Geloscheggia
 * @see it.pokèmon.basics.Moves.ghiaccio.Raggiaurora
 * @see it.pokèmon.basics.Moves.normale.Lacerazione
 * @see it.pokèmon.basics.abilities.Abilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Cryogonal extends Pokèmon{
	
	/**
	 * Pre-generated Cryogonal Pokèmon constructor
	 */
	public Cryogonal(){
		super("Tepig", Type.GHIACCIO, 50, 50, 95, 135, 105, 80, 4, 40, 170, Abilities.LEVITAZIONE);
		setMoves(new Geloscheggia());
		setMoves(new Raggiaurora());
		setMoves(new Cannonflash());
		setMoves(new Lacerazione());
	}
	
	/**
	 * Cryogonal Pokèmon constructor
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
	public Cryogonal(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.GHIACCIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.LEVITAZIONE);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Geloscheggia());
				break;
			case 2:
				setMoves(new Geloscheggia());
				setMoves(new Raggiaurora());
				break;
			case 3:
				setMoves(new Geloscheggia());
				setMoves(new Raggiaurora());
				setMoves(new Cannonflash());
				break;
			case 4:
				setMoves(new Geloscheggia());
				setMoves(new Raggiaurora());
				setMoves(new Cannonflash());
				setMoves(new Lacerazione());
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
