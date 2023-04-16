package it.pokèmon.basics.pokèmon.psico;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.Moves.psico.CozzataZen;
import it.pokèmon.basics.Moves.psico.Psichico;
import it.pokèmon.basics.Moves.volante.Aerasoio;

public class Sigilyph extends Pokèmon{
	Sigilyph(){
		super("Sigilyph", Type.PSICO, Type.VOLANTE, 58, 80, 103, 80, 97, 72, 4, 35, 172);
		setMoves(new Aerasoio());
		setMoves(new Psichico());
		setMoves(new Geloraggio());
		setMoves(new CozzataZen());
	}
	
	Sigilyph(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.PSICO, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Psichico());
				break;
			case 2:
				setMoves(new Aerasoio());
				setMoves(new Psichico());
				break;
			case 3:
				setMoves(new Aerasoio());
				setMoves(new Psichico());
				setMoves(new CozzataZen());
				break;
			case 4:
				setMoves(new Aerasoio());
				setMoves(new Psichico());
				setMoves(new Geloraggio());
				setMoves(new CozzataZen());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
