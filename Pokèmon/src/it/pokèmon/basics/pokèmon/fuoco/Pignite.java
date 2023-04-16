package it.pokèmon.basics.pokèmon.fuoco;

//import it.pokèmon.basics.Abilities;
//import it.pokèmon.basics.HiddenAbilities;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Braciere;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.Moves.lotta.Sberletese;
import it.pokèmon.basics.Moves.veleno.Smog;

public class Pignite extends Pokèmon{
	//private Abilities ability = Abilities.AIUTOFUOCO;
	//private HiddenAbilities h_ability = HiddenAbilities.GRASSOSPESSO;
	
	Pignite(){
		super("Pignite", Type.FUOCO, Type.LOTTA, 93, 55, 70, 55, 55, 90, 4, 20, 146);
		setMoves(new Braciere());
		setMoves(new Nitrocarica());
		setMoves(new Sberletese());
		setMoves(new Smog());
	}
	
	Pignite(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.FUOCO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Braciere());
				break;
			case 2:
				setMoves(new Braciere());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Braciere());
				setMoves(new Nitrocarica());
				setMoves(new Sberletese());
				break;
			case 4:
				setMoves(new Braciere());
				setMoves(new Nitrocarica());
				setMoves(new Sberletese());
				setMoves(new Smog());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}