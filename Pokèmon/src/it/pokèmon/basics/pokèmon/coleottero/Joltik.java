package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Coleomorso;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.elettro.Elettrotela;
import it.pokèmon.basics.Moves.veleno.Velenpuntura;

public class Joltik extends Pokèmon{
	Joltik(){
		super("Joltik", Type.COLEOTTERO, Type.ELETTRO, 47, 50, 57, 50, 65, 50, 4, 20, 64);
		setMoves(new Coleomorso());
		setMoves(new Elettrotela());
		setMoves(new ForbiceX());
		setMoves(new Velenpuntura());
	}
	
	Joltik(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.COLEOTTERO, Type.ELETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Coleomorso());
				break;
			case 2:
				setMoves(new Coleomorso());
				setMoves(new Elettrotela());
				break;
			case 3:
				setMoves(new Coleomorso());
				setMoves(new Elettrotela());
				setMoves(new ForbiceX());
				break;
			case 4:
				setMoves(new Coleomorso());
				setMoves(new Elettrotela());
				setMoves(new ForbiceX());
				setMoves(new Velenpuntura());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
