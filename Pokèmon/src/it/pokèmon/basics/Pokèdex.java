package it.pokèmon.basics;

/**
 * Actually not completed 
 * @author Claudio Togni 4CI
 * @version 0.1
 * @see java.util.HashMap
 */
public class Pokèdex implements PokèdexInterface{
	
	public Pokèdex() {
		PokèdexInterface.setPokèdex();
		PokèdexInterface.setPokèdex_n();
	}
	
	public String getPokèmonById(int id) {
		return PokèdexInterface.getPokèmonById(id);
	}
	
	public String getPokèmonById_n(int id) {
		return PokèdexInterface.getPokèmonById_n(id);
	}
}
