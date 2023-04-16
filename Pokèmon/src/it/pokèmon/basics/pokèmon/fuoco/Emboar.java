package it.pokèmon.basics.pokèmon.fuoco;

//import it.pokèmon.basics.Abilities;
//import it.pokèmon.basics.HiddenAbilities;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.Moves.lotta.Sberletese;
import it.pokèmon.basics.Moves.normale.Riduttore;
import it.pokèmon.basics.Moves.roccia.Rotolamento;

public class Emboar extends Pokèmon{
	//private Abilities ability = Abilities.AIUTOFUOCO;
	//private HiddenAbilities h_ability = HiddenAbilities.GRASSOSPESSO;
	
	Emboar(){
		super("Emboar", Type.FUOCO, Type.LOTTA, 123, 65, 100, 65, 65, 110, 4, 40, 238);
		setMoves(new Rotolamento());
		setMoves(new Nitrocarica());
		setMoves(new Sberletese());
		setMoves(new Riduttore());
	}
	
	Emboar(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.FUOCO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Nitrocarica());
				break;
			case 2:
				setMoves(new Rotolamento());
				setMoves(new Nitrocarica());
				break;
			case 3:
				setMoves(new Rotolamento());
				setMoves(new Nitrocarica());
				setMoves(new Sberletese());
				break;
			case 4:
				setMoves(new Rotolamento());
				setMoves(new Nitrocarica());
				setMoves(new Sberletese());
				setMoves(new Riduttore());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}