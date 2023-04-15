package it.pokèmon.basics.pokèmon.fuoco;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Lanciafiamme;
import it.pokèmon.basics.Moves.fuoco.Pirolancio;
import it.pokèmon.basics.Moves.spettro.Ombrartigli;
import it.pokèmon.basics.Moves.terra.Fossa;

public class Simisear extends Pokèmon{
	Simisear(){
		super("Simisear", Type.FUOCO, 98, 63, 98, 63, 101, 65, 4, 40, 174);
		setMoves(new Pirolancio());
		setMoves(new Lanciafiamme());
		setMoves(new Fossa());
		setMoves(new Ombrartigli());
	}
	
	Simisear(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pirolancio());
				break;
			case 2:
				setMoves(new Pirolancio());
				setMoves(new Lanciafiamme());
				break;
			case 3:
				setMoves(new Pirolancio());
				setMoves(new Lanciafiamme());
				setMoves(new Fossa());
				break;
			case 4:
				setMoves(new Pirolancio());
				setMoves(new Lanciafiamme());
				setMoves(new Fossa());
				setMoves(new Ombrartigli());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
