package it.pokèmon.basics.pokèmon.acqua;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acqua.Idropulsar;
import it.pokèmon.basics.Moves.acqua.Surf;
import it.pokèmon.basics.Moves.ghiaccio.Geloraggio;
import it.pokèmon.basics.Moves.spettro.PallaOmbra;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Alomomola extends Pokèmon{
	
	Alomomola(Abilities ability){
		super("Alomomola", Type.ACQUA, 75, 80, 40, 45, 65, 165, 4, 40, 165, ability);
		setMoves(new Idropulsar());
		setMoves(new Geloraggio());
		setMoves(new PallaOmbra());
		setMoves(new Surf());
	}
	
	Alomomola(HiddenAbilities ability){
		super("Alomomola", Type.ACQUA, 75, 80, 40, 45, 65, 165, 4, 40, 165, ability);
		setMoves(new Idropulsar());
		setMoves(new Geloraggio());
		setMoves(new PallaOmbra());
		setMoves(new Surf());
	}
		
	Alomomola(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Idropulsar());
				break;
			case 2:
				setMoves(new Idropulsar());
				setMoves(new Geloraggio());
				break;
			case 3:
				setMoves(new Idropulsar());
				setMoves(new Geloraggio());
				setMoves(new PallaOmbra());
				break;
			case 4:
				setMoves(new Idropulsar());
				setMoves(new Geloraggio());
				setMoves(new PallaOmbra());
				setMoves(new Surf());
				break;
		}
	}
	
	Alomomola(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.ACQUA, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Idropulsar());
				break;
			case 2:
				setMoves(new Idropulsar());
				setMoves(new Geloraggio());
				break;
			case 3:
				setMoves(new Idropulsar());
				setMoves(new Geloraggio());
				setMoves(new PallaOmbra());
				break;
			case 4:
				setMoves(new Idropulsar());
				setMoves(new Geloraggio());
				setMoves(new PallaOmbra());
				setMoves(new Surf());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
