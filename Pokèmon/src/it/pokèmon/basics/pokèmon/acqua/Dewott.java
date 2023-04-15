package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Conchilama;
import it.pokèmon.basics.Moves.acqua.Idropulsar;
import it.pokèmon.basics.Moves.acqua.Pistolacqua;
import it.pokèmon.basics.Moves.coleottero.Tagliofuria;

public class Dewott extends Pokèmon{
	//private Abilities ability = Abilities.AIUTOFUOCO;
	//private HiddenAbilities h_ability = HiddenAbilities.GRASSOSPESSO;
		
	Dewott(){
		super("Dewott", Type.ACQUA, 75, 60, 83, 60, 60, 75, 4, 20, 145);
		setMoves(new Pistolacqua());
		setMoves(new Conchilama());
	}
		
	Dewott(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Pistolacqua());
				break;
			case 2:
				setMoves(new Pistolacqua());
				setMoves(new Conchilama());
				break;
			case 3:
				setMoves(new Pistolacqua());
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				break;
			case 4:
				setMoves(new Pistolacqua());
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				setMoves(new Idropulsar());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
