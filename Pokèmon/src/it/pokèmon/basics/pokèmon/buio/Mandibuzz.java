package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Neropulsar;
import it.pokèmon.basics.Moves.fuoco.Ondacalda;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.Moves.volante.Eterelama;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon: <b>Mandibuzz</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>BUIO</b></li>
 * 	<li>Second Type: <b>VOLANTE</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.volante.Eterelama
 * @see it.pokèmon.basics.Moves.fuoco.Ondacalda
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.Moves.buio.Neropulsar
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Mandibuzz extends Pokèmon{
	
	/**
	 * Pre-generated Mandibuzz Pokèmon constructor
	 * @param ability : Abilities
	 */
	public Mandibuzz(Abilities ability){
		super("Mandibuzz", Type.BUIO, Type.VOLANTE, 65, 105, 55, 95, 80, 110, 4, 54, 179, ability);
		setMoves(new Neropulsar());
		setMoves(new Aeroassalto());
		setMoves(new Eterelama());
		setMoves(new Ondacalda());
	}
	
	/**
	 * Pre-generated Mandibuzz Pokèmon constructor
	 * @param ability : HiddenAbilities
	 */
	public Mandibuzz(HiddenAbilities ability){
		super("Mandibuzz", Type.BUIO, Type.VOLANTE, 65, 105, 55, 95, 80, 110, 4, 54, 179, ability);
		setMoves(new Neropulsar());
		setMoves(new Aeroassalto());
		setMoves(new Eterelama());
		setMoves(new Ondacalda());
	}
	
	/**
	 * Mandibuzz Pokèmon constructor
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
	public Mandibuzz(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.BUIO, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
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
				setMoves(new Eterelama());
				break;
			case 4:
				setMoves(new Neropulsar());
				setMoves(new Aeroassalto());
				setMoves(new Eterelama());
				setMoves(new Ondacalda());
				break;
		}
	}
	
	/**
	 * Mandibuzz Pokèmon constructor
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
	public Mandibuzz(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.BUIO, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
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
				setMoves(new Eterelama());
				break;
			case 4:
				setMoves(new Neropulsar());
				setMoves(new Aeroassalto());
				setMoves(new Eterelama());
				setMoves(new Ondacalda());
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