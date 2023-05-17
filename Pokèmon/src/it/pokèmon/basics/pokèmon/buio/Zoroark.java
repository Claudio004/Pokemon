package it.pokèmon.basics.pokèmon.buio;

import it.pokèmon.basics.Inheritance;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.buio.Ripicca;
import it.pokèmon.basics.Moves.buio.Neropulsar;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.abilities.Abilities;

/**
 * Pokèmon: <b>Zoroark</b><br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>BUIO</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Moves.spettro.PallaOmbra
 * @see it.pokèmon.basics.Moves.buio.Ripicca
 * @see it.pokèmon.basics.Moves.buio.Neropulsar
 * @see it.pokèmon.basics.Moves.volante.Aeroassalto
 * @see it.pokèmon.basics.abilities.Abilities
 */
@Inheritance(Pokèmon = "Pokèmon")
public class Zoroark extends Pokèmon{
	
	/**
	 * Pre-generated Zoroark Pokèmon constructor
	 */
	public Zoroark(){
		super("Zoroark", Type.BUIO, 105, 60, 120, 60, 105, 60, 4, 45, 179, Abilities.ILLUSIONE);
		setMoves(new Ripicca());
		setMoves(new Neropulsar());
		setMoves(new PallaOmbra());
		setMoves(new Aeroassalto());
	}
	
	/**
	 * Zoroark Pokèmon constructor
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
	public Zoroark(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.BUIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.ILLUSIONE);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Ripicca());
				break;
			case 2:
				setMoves(new Ripicca());
				setMoves(new Neropulsar());
				break;
			case 3:
				setMoves(new Ripicca());
				setMoves(new Neropulsar());
				setMoves(new PallaOmbra());
				break;
			case 4:
				setMoves(new Ripicca());
				setMoves(new Neropulsar());
				setMoves(new PallaOmbra());
				setMoves(new Aeroassalto());
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