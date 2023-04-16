package it.pokèmon.basics.pokèmon.fuoco;

//import it.pokèmon.basics.Abilities;
//import it.pokèmon.basics.HiddenAbilities;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Braciere;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.Moves.normale.Azione;
import it.pokèmon.basics.Moves.veleno.Smog;

public class Tepig extends Pokèmon{
	//private Abilities ability = Abilities.AIUTOFUOCO;
	//private HiddenAbilities h_ability = HiddenAbilities.GRASSOSPESSO;
	
	Tepig(){
		super("Tepig", Type.FUOCO, 63, 45, 45, 45, 45, 65, 2, 5, 28);
		setMoves(new Azione());
		setMoves(new Nitrocarica());
	}
	
	Tepig(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.FUOCO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Azione());
				break;
			case 2:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				setMoves(new Braciere());
				break;
			case 4:
				setMoves(new Azione());
				setMoves(new Nitrocarica());
				setMoves(new Braciere());
				setMoves(new Smog());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}