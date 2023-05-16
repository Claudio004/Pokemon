package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Metaltestata;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Durant</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>COLEOTTERO</b></li>
 * 	<li>Second Type: <b>ACCIAIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.acciaio.Metaltestata
 * @see it.pokèmon.basics.Moves.buio.Sgranocchio
 * @see it.pokèmon.basics.Moves.coleottero.ForbiceX
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Durant extends Pokèmon{
	
	/**
	 * Pre-generated Durant Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Durant(Abilities ability){
		super("Durant", Type.COLEOTTERO, Type.ACCIAIO, 109, 112, 48, 48, 109, 58, 4, 40, 169, ability);
		setMoves(new Sgranocchio());
		setMoves(new Aeroassalto());
		setMoves(new Metaltestata());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Pre-generated Durant Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Durant(HiddenAbilities ability){
		super("Durant", Type.COLEOTTERO, Type.ACCIAIO, 109, 112, 48, 48, 109, 58, 4, 40, 169, ability);
		setMoves(new Sgranocchio());
		setMoves(new Aeroassalto());
		setMoves(new Metaltestata());
		setMoves(new ForbiceX());
	}
	
	/**
	 * Durant Pokèmon constructor
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
	public Durant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sgranocchio());
				break;
			case 2:
				setMoves(new Sgranocchio());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Sgranocchio());
				setMoves(new Aeroassalto());
				setMoves(new Metaltestata());
				break;
			case 4:
				setMoves(new Sgranocchio());
				setMoves(new Aeroassalto());
				setMoves(new Metaltestata());
				setMoves(new ForbiceX());
				break;
		}
	}
	
	/**
	 * Durant Pokèmon constructor
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
	public Durant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sgranocchio());
				break;
			case 2:
				setMoves(new Sgranocchio());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Sgranocchio());
				setMoves(new Aeroassalto());
				setMoves(new Metaltestata());
				break;
			case 4:
				setMoves(new Sgranocchio());
				setMoves(new Aeroassalto());
				setMoves(new Metaltestata());
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
