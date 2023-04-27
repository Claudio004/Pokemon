package it.pokèmon.basics.pokèmon.psico;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.Moves.psico.CozzataZen;
import it.pokèmon.basics.Moves.psico.Psichico;
import it.pokèmon.basics.Moves.volante.Aerasoio;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Sigilyph extends Pokèmon{
	
	Sigilyph(Abilities ability){
		super("Sigilyph", Type.PSICO, Type.VOLANTE, 58, 80, 103, 80, 97, 72, 4, 35, 172, ability);
		setMoves(new Aerasoio());
		setMoves(new Psichico());
		setMoves(new Geloraggio());
		setMoves(new CozzataZen());
	}
	
	Sigilyph(HiddenAbilities ability){
		super("Sigilyph", Type.PSICO, Type.VOLANTE, 58, 80, 103, 80, 97, 72, 4, 35, 172, ability);
		setMoves(new Aerasoio());
		setMoves(new Psichico());
		setMoves(new Geloraggio());
		setMoves(new CozzataZen());
	}
	
	Sigilyph(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.PSICO, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
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
	
	Sigilyph(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.PSICO, Type.VOLANTE, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
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
