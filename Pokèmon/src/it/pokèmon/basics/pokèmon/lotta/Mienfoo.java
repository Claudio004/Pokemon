package it.pokèmon.basics.pokèmon.lotta;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.Moves.lotta.Breccia;
import it.pokèmon.basics.Moves.lotta.Palmoforza;
import it.pokèmon.basics.Moves.normale.Comete;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Mienfoo</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>LOTTA</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.Moves.lotta.Breccia
 * @see it.pokèmon.basics.Moves.lotta.Palmoforza
 * @see it.pokèmon.basics.Moves.normale.Comete
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Mienfoo extends Pokèmon{
	
	/**
	 * Pre-generated Mienfoo Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Mienfoo(Abilities ability){
		super("Mienfoo", Type.LOTTA, 85, 50, 55, 50, 65, 45, 4, 30, 70, ability);
		setMoves(new Palmoforza());
		setMoves(new Breccia());
		setMoves(new Aeroassalto());
		setMoves(new Comete());
	}
	
	/**
	 * Pre-generated Mienfoo Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Mienfoo(HiddenAbilities ability){
		super("Mienfoo", Type.LOTTA, 85, 50, 55, 50, 65, 45, 4, 30, 70, ability);
		setMoves(new Palmoforza());
		setMoves(new Breccia());
		setMoves(new Aeroassalto());
		setMoves(new Comete());
	}
	
	/**
	 * Mienfoo Pokèmon constructor
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
	public Mienfoo(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Palmoforza());
				break;
			case 2:
				setMoves(new Palmoforza());
				setMoves(new Breccia());
				break;
			case 3:
				setMoves(new Palmoforza());
				setMoves(new Breccia());
				setMoves(new Aeroassalto());
				break;
			case 4:
				setMoves(new Palmoforza());
				setMoves(new Breccia());
				setMoves(new Aeroassalto());
				setMoves(new Comete());
				break;
		}
	}
	
	/**
	 * Mienfoo Pokèmon constructor
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
	public Mienfoo(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Palmoforza());
				break;
			case 2:
				setMoves(new Palmoforza());
				setMoves(new Breccia());
				break;
			case 3:
				setMoves(new Palmoforza());
				setMoves(new Breccia());
				setMoves(new Aeroassalto());
				break;
			case 4:
				setMoves(new Palmoforza());
				setMoves(new Breccia());
				setMoves(new Aeroassalto());
				setMoves(new Comete());
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