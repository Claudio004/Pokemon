package it.pokèmon.basics;

public abstract class Move {
	private String nome;
	private Type type;
	private int Potenza;
	private int Precisione;

	public Move(String nome, Type type, int Potenza, int Precisione) {
		this.nome = nome;
		this.type = type;
		this.Potenza = Potenza;
		this.Precisione = Precisione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getPotenza() {
		return Potenza;
	}

	public void setPotenza(int potenza) {
		Potenza = potenza;
	}

	public int getPrecisione() {
		return Precisione;
	}

	public void setPrecisione(int precisione) {
		Precisione = precisione;
	}
}