package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Conchilama;
import it.pokèmon.basics.Moves.acqua.Pistolacqua;
import it.pokèmon.basics.Moves.coleottero.Tagliofuria;
import it.pokèmon.basics.Moves.normale.Azione;

public class Oshawott extends Pokèmon{
	//private Abilities ability = Abilities.AIUTOFUOCO;
	//private HiddenAbilities h_ability = HiddenAbilities.GRASSOSPESSO;
		
	Oshawott(){
		super("Oshawott", Type.ACQUA, 55, 45, 63, 45, 45, 55, 2, 5, 28);
		setMoves(new Azione());
		setMoves(new Pistolacqua());
	}
		
	Oshawott(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
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
