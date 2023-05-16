package it.pokèmon.basics.pokèmon.spettro;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Energipalla;
import it.pokèmon.basics.Moves.psico.Psichico;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.Moves.spettro.Sciagura;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Yamask</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>SPETTRO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.erba.Energipalla
 * @see it.pokèmon.basics.Moves.psico.Psichico
 * @see it.pokèmon.basics.Moves.spettro.PallaOmbra
 * @see it.pokèmon.basics.Moves.spettro.Sciagura
 * @see it.pokèmon.basics.abilities.Abilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Yamask extends Pokèmon{
	
	/**
	 * Pre-generated Yamask Pokèmon constructor
	 */
	public Yamask(){
		super("Yamask", Type.SPETTRO, 30, 85, 55, 65, 30, 38, 4, 20, 169, Abilities.MUMMIA);
		setMoves(new Sciagura());
		setMoves(new PallaOmbra());
		setMoves(new Energipalla());
		setMoves(new Psichico());
	}
		
	/**
	 * Yamask Pokèmon constructor
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
	public Yamask(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.NORMALE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.MUMMIA);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sciagura());
				break;
			case 2:
				setMoves(new Sciagura());
				setMoves(new PallaOmbra());
				break;
			case 3:
				setMoves(new Sciagura());
				setMoves(new PallaOmbra());
				setMoves(new Energipalla());
				break;
			case 4:
				setMoves(new Sciagura());
				setMoves(new PallaOmbra());
				setMoves(new Energipalla());
				setMoves(new Psichico());
				break;
		}
	}
		
	/**
	 * Pre-generated Tornadus Pokèmon constructor
	 * @param ability : Abilities
	 */
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
