package it.pokèmon.basics.pokèmon.volante;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Retromarcia;
import it.pokèmon.basics.Moves.psico.Psichico;
import it.pokèmon.basics.Moves.volante.Acrobazia;
import it.pokèmon.basics.Moves.volante.Eterelama;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Tornadus extends Pokèmon{
	
	Tornadus(Abilities ability){
		super("Tornadus", Type.VOLANTE, 115, 70, 125, 80, 111, 79, 4, 45, 261, ability);
		setMoves(new Eterelama());
		setMoves(new Psichico());
		setMoves(new Acrobazia());
		setMoves(new Retromarcia());
	}
	
	Tornadus(HiddenAbilities ability){
		super("Tornadus", Type.VOLANTE, 115, 70, 125, 80, 111, 79, 4, 45, 261, ability);
		setMoves(new Eterelama());
		setMoves(new Psichico());
		setMoves(new Acrobazia());
		setMoves(new Retromarcia());
	}
	
	Tornadus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Eterelama());
				break;
			case 2:
				setMoves(new Eterelama());
				setMoves(new Psichico());
				break;
			case 3:
				setMoves(new Eterelama());
				setMoves(new Psichico());
				setMoves(new Acrobazia());
				break;
			case 4:
				setMoves(new Eterelama());
				setMoves(new Psichico());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				break;
		}
	}
	
	Tornadus(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Eterelama());
				break;
			case 2:
				setMoves(new Eterelama());
				setMoves(new Psichico());
				break;
			case 3:
				setMoves(new Eterelama());
				setMoves(new Psichico());
				setMoves(new Acrobazia());
				break;
			case 4:
				setMoves(new Eterelama());
				setMoves(new Psichico());
				setMoves(new Acrobazia());
				setMoves(new Retromarcia());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
