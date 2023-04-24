package it.pokèmon.basics.pokèmon.coleottero;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.acciaio.Metaltestata;
import it.pokèmon.basics.Moves.buio.Sgranocchio;
import it.pokèmon.basics.Moves.coleottero.ForbiceX;
import it.pokèmon.basics.Moves.volante.Aeroassalto;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Durant extends Pokèmon{
	
	Durant(Abilities ability){
		super("Durant", Type.COLEOTTERO, Type.ACCIAIO, 109, 112, 48, 48, 109, 58, 4, 40, 169, ability);
		setMoves(new Sgranocchio());
		setMoves(new Aeroassalto());
		setMoves(new Metaltestata());
		setMoves(new ForbiceX());
	}
	
	Durant(HiddenAbilities ability){
		super("Durant", Type.COLEOTTERO, Type.ACCIAIO, 109, 112, 48, 48, 109, 58, 4, 40, 169, ability);
		setMoves(new Sgranocchio());
		setMoves(new Aeroassalto());
		setMoves(new Metaltestata());
		setMoves(new ForbiceX());
	}
		
	Durant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.COLEOTTERO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sgranocchio());
				break;
			case 2:
				setMoves(new Sgranocchio());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Sgranocchio());
				setMoves(new Aeroassalto());
				setMoves(new Metaltestata());
				break;
			case 4:
				setMoves(new Sgranocchio());
				setMoves(new Aeroassalto());
				setMoves(new Metaltestata());
				setMoves(new ForbiceX());
				break;
		}
	}
	
	Durant(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.COLEOTTERO, Type.ACCIAIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Sgranocchio());
				break;
			case 2:
				setMoves(new Sgranocchio());
				setMoves(new Aeroassalto());
				break;
			case 3:
				setMoves(new Sgranocchio());
				setMoves(new Aeroassalto());
				setMoves(new Metaltestata());
				break;
			case 4:
				setMoves(new Sgranocchio());
				setMoves(new Aeroassalto());
				setMoves(new Metaltestata());
				setMoves(new ForbiceX());
				break;
		}
	}
		
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
