package it.pokèmon.basics.pokèmon.erba;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.erba.Energipalla;
import it.pokèmon.basics.Moves.lotta.Spadasolenne;
import it.pokèmon.basics.Moves.normale.Nemesi;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.abilities.Abilities;

public class Virizion extends Pokèmon{
	
	public Virizion(){
		super("Virizion", Type.ERBA, Type.LOTTA, 90, 72, 90, 129, 108, 91, 4, 50, 290, Abilities.GIUSTIZIA);
		setMoves(new Spadasolenne());
		setMoves(new Nemesi());
		setMoves(new Energipalla());
		setMoves(new Aeroassalto());
	}
		
	public Virizion(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.ERBA, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.GIUSTIZIA);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Spadasolenne());
				break;
			case 2:
				setMoves(new Spadasolenne());
				setMoves(new Nemesi());
				break;
			case 3:
				setMoves(new Spadasolenne());
				setMoves(new Nemesi());
				setMoves(new Energipalla());
				break;
			case 4:
				setMoves(new Spadasolenne());
				setMoves(new Nemesi());
				setMoves(new Energipalla());
				setMoves(new Aeroassalto());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
