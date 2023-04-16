package it.pokèmon.basics.pokèmon.veleno;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.normale.Doppiasberla;
import it.pokèmon.basics.Moves.veleno.Fango;
import it.pokèmon.basics.Moves.veleno.Fangobomba;
import it.pokèmon.basics.Moves.veleno.Velenoshock;

public class Trubbish extends Pokèmon{
	Trubbish(){
		super("Trubbish", Type.VELENO, 50, 62, 40, 62, 65, 50, 4, 20, 66);
		setMoves(new Fango());
		setMoves(new Doppiasberla());
		setMoves(new Velenoshock());
		setMoves(new Fangobomba());
	}
	
	Trubbish(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.VELENO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Fango());
				break;
			case 2:
				setMoves(new Fango());
				setMoves(new Doppiasberla());
				break;
			case 3:
				setMoves(new Fango());
				setMoves(new Doppiasberla());
				setMoves(new Velenoshock());
				break;
			case 4:
				setMoves(new Fango());
				setMoves(new Doppiasberla());
				setMoves(new Velenoshock());
				setMoves(new Fangobomba());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
