package it.pokèmon.basics.pokèmon.lotta;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Retromarcia;
import it.pokèmon.basics.Moves.lotta.Palmoforza;
import it.pokèmon.basics.Moves.volante.Rimbalzo;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Mienshao</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>LOTTA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.Moves.coleottero.Retromarcia
 * @see it.pokèmon.basics.Moves.lotta.Palmoforza
 * @see it.pokèmon.basics.Moves.volante.Rimbalzo
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Mienshao extends Pokèmon{
	
	/**
	 * Pre-generated Mienshao Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Mienshao(Abilities ability){
		super("Mienshao", Type.LOTTA, 125, 60, 95, 60, 105, 65, 4, 50, 179, ability);
		setMoves(new Palmoforza());
		setMoves(new Retromarcia());
		setMoves(new Aeroassalto());
		setMoves(new Rimbalzo());
	}
	
	/**
	 * Pre-generated Mienshao Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Mienshao(HiddenAbilities ability){
		super("Mienshao", Type.LOTTA, 125, 60, 95, 60, 105, 65, 4, 50, 179, ability);
		setMoves(new Palmoforza());
		setMoves(new Retromarcia());
		setMoves(new Aeroassalto());
		setMoves(new Rimbalzo());
	}
	
	/**
	 * Mienshao Pokèmon constructor
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
	public Mienshao(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Palmoforza());
				break;
			case 2:
				setMoves(new Palmoforza());
				setMoves(new Retromarcia());
				break;
			case 3:
				setMoves(new Palmoforza());
				setMoves(new Retromarcia());
				setMoves(new Aeroassalto());
				break;
			case 4:
				setMoves(new Palmoforza());
				setMoves(new Retromarcia());
				setMoves(new Aeroassalto());
				setMoves(new Rimbalzo());
				break;
		}
	}
	
	/**
	 * Mienshao Pokèmon constructor
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
	public Mienshao(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Palmoforza());
				break;
			case 2:
				setMoves(new Palmoforza());
				setMoves(new Retromarcia());
				break;
			case 3:
				setMoves(new Palmoforza());
				setMoves(new Retromarcia());
				setMoves(new Aeroassalto());
				break;
			case 4:
				setMoves(new Palmoforza());
				setMoves(new Retromarcia());
				setMoves(new Aeroassalto());
				setMoves(new Rimbalzo());
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