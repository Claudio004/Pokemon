package it.pokèmon.basics.pokèmon.fuoco;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Lanciafiamme;
import it.pokèmon.basics.Moves.fuoco.Pirolancio;
import it.pokèmon.basics.Moves.spettro.Ombrartigli;
import it.pokèmon.basics.Moves.terra.Fossa;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Heatmor extends Pokèmon{
	
	Heatmor(Abilities ability){
		super("Heatmor", Type.FUOCO, 97, 66, 105, 66, 65, 85, 4, 30, 169, ability);
		setMoves(new Pirolancio());
		setMoves(new Fossa());
		setMoves(new Lanciafiamme());
		setMoves(new Ombrartigli());
	}
	
	Heatmor(HiddenAbilities ability){
		super("Heatmor", Type.FUOCO, 97, 66, 105, 66, 65, 85, 4, 30, 169, ability);
		setMoves(new Pirolancio());
		setMoves(new Fossa());
		setMoves(new Lanciafiamme());
		setMoves(new Ombrartigli());
	}
	
	Heatmor(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pirolancio());
				break;
			case 2:
				setMoves(new Pirolancio());
				setMoves(new Fossa());
				break;
			case 3:
				setMoves(new Pirolancio());
				setMoves(new Fossa());
				setMoves(new Lanciafiamme());
				break;
			case 4:
				setMoves(new Pirolancio());
				setMoves(new Fossa());
				setMoves(new Lanciafiamme());
				setMoves(new Ombrartigli());
				break;
		}
	}
	
	Heatmor(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pirolancio());
				break;
			case 2:
				setMoves(new Pirolancio());
				setMoves(new Fossa());
				break;
			case 3:
				setMoves(new Pirolancio());
				setMoves(new Fossa());
				setMoves(new Lanciafiamme());
				break;
			case 4:
				setMoves(new Pirolancio());
				setMoves(new Fossa());
				setMoves(new Lanciafiamme());
				setMoves(new Ombrartigli());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
