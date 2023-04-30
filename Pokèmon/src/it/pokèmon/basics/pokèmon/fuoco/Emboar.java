package it.pokèmon.basics.pokèmon.fuoco;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.fuoco.Nitrocarica;
import it.pokèmon.basics.Moves.lotta.Sberletese;
import it.pokèmon.basics.Moves.normale.Riduttore;
import it.pokèmon.basics.Moves.roccia.Rotolamento;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Emboar extends Pokèmon{
	
	public Emboar(Abilities ability){
		super("Emboar", Type.FUOCO, Type.LOTTA, 123, 65, 100, 65, 65, 110, 4, 40, 238, ability);
		setMoves(new Rotolamento());
		setMoves(new Nitrocarica());
		setMoves(new Sberletese());
		setMoves(new Riduttore());
	}
	
	public Emboar(HiddenAbilities ability){
		super("Emboar", Type.FUOCO, Type.LOTTA, 123, 65, 100, 65, 65, 110, 4, 40, 238, ability);
		setMoves(new Rotolamento());
		setMoves(new Nitrocarica());
		setMoves(new Sberletese());
		setMoves(new Riduttore());
	}
	
	public Emboar(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.FUOCO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
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
	
	public Emboar(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.FUOCO, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
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