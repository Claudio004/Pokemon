package it.pokèmon.basics.pokèmon.spettro;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Energipalla;
import it.pokèmon.basics.Moves.psico.Psichico;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.Moves.spettro.Sciagura;
import it.pokèmon.basics.abilities.Abilities;

public class Yamask extends Pokèmon{
	public Yamask(){
		super("Yamask", Type.SPETTRO, 30, 85, 55, 65, 30, 38, 4, 20, 169, Abilities.MUMMIA);
		setMoves(new Sciagura());
		setMoves(new PallaOmbra());
		setMoves(new Energipalla());
		setMoves(new Psichico());
	}
		
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
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
