package it.pokèmon.basics.pokèmon.psico;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.GeneratoreV;
import it.pokèmon.basics.Moves.fuoco.Sparafuoco;
import it.pokèmon.basics.Moves.psico.CozzataZen;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;

public class Victini extends Pokèmon{
	//private Abilities ability = Abilities.AIUTOFUOCO;
	//private HiddenAbilities h_ability = HiddenAbilities.GRASSOSPESSO;
	
	Victini(){
		super("Victini", Type.PSICO, Type.FUOCO, 100, 100, 100, 100, 100, 100, 4, 40, 270);
		setMoves(new Sparafuoco());
		setMoves(new GeneratoreV());
		setMoves(new CozzataZen());
		setMoves(new PallaOmbra());
	}
	
	Victini(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.PSICO, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sparafuoco());
				break;
			case 2:
				setMoves(new Sparafuoco());
				setMoves(new GeneratoreV());
				break;
			case 3:
				setMoves(new Sparafuoco());
				setMoves(new GeneratoreV());
				setMoves(new CozzataZen());
				break;
			case 4:
				setMoves(new Sparafuoco());
				setMoves(new GeneratoreV());
				setMoves(new CozzataZen());
				setMoves(new PallaOmbra());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
