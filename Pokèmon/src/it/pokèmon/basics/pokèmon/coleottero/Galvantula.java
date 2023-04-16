package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.coleottero.Segnoraggio;
import it.pokèmon.basics.Moves.elettro.Elettrotela;
import it.pokèmon.basics.Moves.veleno.Velenpuntura;

public class Galvantula extends Pokèmon{
	Galvantula(){
		super("Galvantula", Type.COLEOTTERO, Type.ELETTRO, 77, 60, 97, 60, 108, 70, 4, 40, 165);
		setMoves(new Segnoraggio());
		setMoves(new Elettrotela());
		setMoves(new ForbiceX());
		setMoves(new Velenpuntura());
	}
	
	Galvantula(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.COLEOTTERO, Type.ELETTRO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Segnoraggio());
				break;
			case 2:
				setMoves(new Segnoraggio());
				setMoves(new Elettrotela());
				break;
			case 3:
				setMoves(new Segnoraggio());
				setMoves(new Elettrotela());
				setMoves(new ForbiceX());
				break;
			case 4:
				setMoves(new Segnoraggio());
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
