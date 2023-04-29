package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Conchilama;
import it.pokèmon.basics.Moves.acqua.Pistolacqua;
import it.pokèmon.basics.Moves.coleottero.Tagliofuria;
import it.pokèmon.basics.Moves.normale.Azione;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Oshawott extends Pokèmon{
	
	Oshawott(Abilities ability){
		super("Oshawott", Type.ACQUA, 55, 45, 63, 45, 45, 55, 2, 5, 28, ability);
		setMoves(new Azione());
		setMoves(new Pistolacqua());
	}
	
	Oshawott(HiddenAbilities ability){
		super("Oshawott", Type.ACQUA, 55, 45, 63, 45, 45, 55, 2, 5, 28, ability);
		setMoves(new Azione());
		setMoves(new Pistolacqua());
	}
		
	Oshawott(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Pistolacqua());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Pistolacqua());
				setMoves(new Conchilama());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new Pistolacqua());
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				break;
		}
	}
	
	Oshawott(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Pistolacqua());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Pistolacqua());
				setMoves(new Conchilama());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new Pistolacqua());
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
