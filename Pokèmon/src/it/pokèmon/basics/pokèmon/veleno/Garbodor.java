package it.pokèmon.basics.pokèmon.veleno;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.elettro.Fulmine;
import it.pokèmon.basics.Moves.psico.Psichico;
import it.pokèmon.basics.Moves.veleno.Fangobomba;
import it.pokèmon.basics.Moves.veleno.Velenoshock;

public class Garbodor extends Pokèmon{
	Garbodor(){
		super("Garbodor", Type.VELENO, 95, 82, 60, 82, 75, 80, 4, 40, 166);
		setMoves(new Psichico());
		setMoves(new Fulmine());
		setMoves(new Velenoshock());
		setMoves(new Fangobomba());
	}
	
	Garbodor(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Psichico());
				break;
			case 2:
				setMoves(new Psichico());
				setMoves(new Fulmine());
				break;
			case 3:
				setMoves(new Psichico());
				setMoves(new Fulmine());
				setMoves(new Velenoshock());
				break;
			case 4:
				setMoves(new Psichico());
				setMoves(new Fulmine());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
