package it.pokèmon.basics.pokèmon.ghiaccio;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Moves.coleottero.Segnoraggio;
import it.pokèmon.basics.Moves.ghiaccio.Geloscheggia;
import it.pokèmon.basics.Moves.ghiaccio.Raggiaurora;
import it.pokèmon.basics.Moves.normale.Lacerazione;
import it.pokèmon.basics.abilities.Abilities;

public class Cryogonal extends Pokèmon{
	
	public Cryogonal(){
		super("Tepig", Type.GHIACCIO, 50, 50, 95, 135, 105, 80, 4, 40, 170, Abilities.LEVITAZIONE);
		setMoves(new Geloscheggia());
		setMoves(new Raggiaurora());
		setMoves(new Segnoraggio());
		setMoves(new Lacerazione());
	}
	
	public Cryogonal(String nome, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP, 
			int movesNumber, int Level, int exp){
		super(nome, Type.GHIACCIO, Attacco, Difesa, AttaccoSp, DifesaSp, Velocità, HP, movesNumber, Level, exp, Abilities.LEVITAZIONE);
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
