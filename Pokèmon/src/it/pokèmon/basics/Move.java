package it.pokèmon.basics;

/**
 * Abstract class which rappresents a <b>generic</b><br>
 * <b>Pokèmon's move</b>
 * @version 1.0
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Pokèmon
 */
public abstract class Move {
	private String nome;
	private Type type;
	private int Potenza;
	private int Precisione;

	/**
	 * Move class contructor
	 * @param nome : String
	 * @param type : Type
	 * @param Potenza : int
	 * @param Precisione : int
	 * @see it.pokèmon.basics.Type
	 */
	public Move(String nome, Type type, int Potenza, int Precisione) {
		this.nome = nome;
		this.type = type;
		this.Potenza = Potenza;
		this.Precisione = Precisione;
	}

	/**
	 * Returns the name of the move
	 * @return nome : String
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Sets the name of the move
	 * @param nome : String
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Returns the Type value of the move
	 * @return type : Type
	 * @see it.pokèmon.basics.Type
	 */
	public Type getType() {
		return this.type;
	}
	
	/**
	 * Sets the Type value of the move
	 * @param type : Type
	 * @see it.pokèmon.basics.Type
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * Returns the power of the move
	 * @return Potenza : int
	 */
	public int getPotenza() {
		return this.Potenza;
	}

	/**
	 * Sets the power of the move
	 * @param potenza : int
	 */
	public void setPotenza(int potenza) {
		this.Potenza = potenza;
	}

	/**
	 * Returns the precision of the move
	 * @return Precisione : int
	 */
	public int getPrecisione() {
		return this.Precisione;
	}

	/**
	 * Sets the precision of the move
	 * @param precisione : int
	 */
	public void setPrecisione(int precisione) {
		this.Precisione = precisione;
	}
	
	/**
	 * Abstract method used by a Pokèmon who knows a move<br>
	 * to attack the opponent
	 * @param p : Pokèmon
	 * @param p2 : Pokèmon
	 * @see it.pokèmon.basics.Pokèmon
	 */
	public abstract void enemyDamage(Pokèmon p, Pokèmon p2);
}