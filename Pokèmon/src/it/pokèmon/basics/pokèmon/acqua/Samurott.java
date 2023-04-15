package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Conchilama;
import it.pokèmon.basics.Moves.acqua.Idropulsar;
import it.pokèmon.basics.Moves.coleottero.Tagliofuria;
import it.pokèmon.basics.Moves.lotta.Vendetta;

public class Samurott extends Pokèmon{
	//private Abilities ability = Abilities.AIUTOFUOCO;
	//private HiddenAbilities h_ability = HiddenAbilities.GRASSOSPESSO;
		
	Samurott(){
		super("Samurott", Type.ACQUA, 100, 85, 108, 70, 70, 95, 4, 40, 238);
		setMoves(new Conchilama());
		setMoves(new Tagliofuria());
		setMoves(new Idropulsar());
		setMoves(new Vendetta());
	}
		
	Samurott(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Conchilama());
				break;
			case 2:
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				break;
			case 3:
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				setMoves(new Idropulsar());
				break;
			case 4:
				setMoves(new Conchilama());
				setMoves(new Tagliofuria());
				setMoves(new Idropulsar());
				setMoves(new Vendetta());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
