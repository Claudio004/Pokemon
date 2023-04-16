package it.pokèmon.basics.pokèmon.lotta;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.ghiaccio.Gelopugno;
import it.pokèmon.basics.Moves.lotta.Breccia;
import it.pokèmon.basics.Moves.lotta.Doppiocalcio;
import it.pokèmon.basics.Moves.terra.Terremoto;

public class Sawk extends Pokèmon{
	//private Abilities ability = Abilities.AIUTOFUOCO;
	//private HiddenAbilities h_ability = HiddenAbilities.GRASSOSPESSO;
	
	Sawk(){
		super("Sawk", Type.LOTTA, 125, 75, 30, 75, 85, 75, 4, 30, 163);
		setMoves(new Doppiocalcio());
		setMoves(new Breccia());
		setMoves(new Gelopugno());
		setMoves(new Terremoto());
	}
	
	Sawk(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.LOTTA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Doppiocalcio());
				break;
			case 2:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				break;
			case 3:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				setMoves(new Gelopugno());
				break;
			case 4:
				setMoves(new Doppiocalcio());
				setMoves(new Breccia());
				setMoves(new Gelopugno());
				setMoves(new Terremoto());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
