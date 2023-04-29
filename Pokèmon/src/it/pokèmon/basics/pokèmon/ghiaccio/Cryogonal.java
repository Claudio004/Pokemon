package it.pokèmon.basics.pokèmon.ghiaccio;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Segnoraggio;
import it.pokèmon.basics.Moves.ghiaccio.Geloscheggia;
import it.pokèmon.basics.Moves.ghiaccio.Raggiaurora;
import it.pokèmon.basics.Moves.normale.Lacerazione;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

public class Cryogonal extends Pokèmon{
	
	Cryogonal(Abilities ability){
		super("Tepig", Type.GHIACCIO, 50, 50, 95, 135, 105, 80, 4, 40, 170, ability);
		setMoves(new Geloscheggia());
		setMoves(new Raggiaurora());
		setMoves(new Segnoraggio());
		setMoves(new Lacerazione());
	}
	
	Cryogonal(HiddenAbilities ability){
		super("Tepig", Type.GHIACCIO, 50, 50, 95, 135, 105, 80, 4, 40, 170, ability);
		setMoves(new Geloscheggia());
		setMoves(new Raggiaurora());
		setMoves(new Segnoraggio());
		setMoves(new Lacerazione());
	}
	
	Cryogonal(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, Abilities ability){
		super(nome, Type.GHIACCIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Geloscheggia());
				break;
			case 2:
				setMoves(new Geloscheggia());
				setMoves(new Raggiaurora());
				break;
			case 3:
				setMoves(new Geloscheggia());
				setMoves(new Raggiaurora());
				setMoves(new Segnoraggio());
				break;
			case 4:
				setMoves(new Geloscheggia());
				setMoves(new Raggiaurora());
				setMoves(new Segnoraggio());
				setMoves(new Lacerazione());
				break;
		}
	}
	
	Cryogonal(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp, HiddenAbilities ability){
		super(nome, Type.GHIACCIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, ability);
		switch(this.getMovesNumber()) {
			case 1:
				setMoves(new Geloscheggia());
				break;
			case 2:
				setMoves(new Geloscheggia());
				setMoves(new Raggiaurora());
				break;
			case 3:
				setMoves(new Geloscheggia());
				setMoves(new Raggiaurora());
				setMoves(new Segnoraggio());
				break;
			case 4:
				setMoves(new Geloscheggia());
				setMoves(new Raggiaurora());
				setMoves(new Segnoraggio());
				setMoves(new Lacerazione());
				break;
		}
	}
	
	private void setMoves(Move move) {
		this.moves.add(move);
	}
}
