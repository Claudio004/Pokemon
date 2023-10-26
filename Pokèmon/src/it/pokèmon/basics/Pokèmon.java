package it.pokèmon.basics;

import java.util.ArrayList;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Abstract class which rappresents a <b>generic Pokèmon</b>
 * @version 1.0
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Status
 * @see java.util.ArrayList
 */
public abstract class Pokèmon {
	private String nome;
	private Type type1;
	private Type type2;
	private int Attacco;
	private int Difesa;
	private int AttaccoSp;
	private int DifesaSp;
	private int Velocità;
	private int HP;
	private int MaxHP;
	private int movesNumber;
	private int Level;
	private int exp;
	public ArrayList<Move> moves = new ArrayList<Move>(0);
	private Status status = Status.NONE;
	private Abilities ability = null;
	private HiddenAbilities h_ability = null;
	
	/**
	 * Pokèmon class contructor
	 * @param nome : String
	 * @param type1 : Type
	 * @param Attacco : int
	 * @param Difesa : int
	 * @param AttaccoSp : int
	 * @param DifesaSp : int
	 * @param Velocità : int
	 * @param HP : int
	 * @param movesNumber : int
	 * @param Level : int
	 * @param exp : int
	 * @param ability : Abilities
	 * @see it.pokèmon.basics.Type
	 * @see it.pokèmon.basics.abilities.Abilities
	 */
	protected Pokèmon(String nome, Type type1, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP,
			int movesNumber, int Level, int exp, Abilities ability) {
		this.nome = nome;
		this.type1 = type1;
		this.Attacco = Attacco;
		this.Difesa = Difesa;
		this.AttaccoSp = AttaccoSp;
		this.DifesaSp = DifesaSp;
		this.Velocità = Velocità;
		this.HP = HP;
		this.setMaxHP(this.HP);
		this.movesNumber = movesNumber;
		this.Level = Level;
		this.exp = exp;
		this.ability = ability;
	}
	
	/**
	 * Pokèmon class contructor
	 * @param nome : String
	 * @param type1 : Type
	 * @param Attacco : int
	 * @param Difesa : int
	 * @param AttaccoSp : int
	 * @param DifesaSp : int
	 * @param Velocità : int
	 * @param HP : int
	 * @param movesNumber : int
	 * @param Level : int
	 * @param exp : int
	 * @param ability : HiddenAbilities
	 * @see it.pokèmon.basics.Type
	 * @see it.pokèmon.basics.abilities.HiddenAbilities
	 */
	protected Pokèmon(String nome, Type type1, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP,
			int movesNumber, int Level, int exp, HiddenAbilities ability) {
		this.nome = nome;
		this.type1 = type1;
		this.Attacco = Attacco;
		this.Difesa = Difesa;
		this.AttaccoSp = AttaccoSp;
		this.DifesaSp = DifesaSp;
		this.Velocità = Velocità;
		this.HP = HP;
		this.setMaxHP(this.HP);
		this.movesNumber = movesNumber;
		this.Level = Level;
		this.exp = exp;
		this.h_ability = ability;
	}
	
	/**
	 * Pokèmon class contructor
	 * @param nome : String
	 * @param type1 : Type
	 * @param type2 : Type
	 * @param Attacco : int
	 * @param Difesa : int
	 * @param AttaccoSp : int
	 * @param DifesaSp : int
	 * @param Velocità : int
	 * @param HP : int
	 * @param movesNumber : int
	 * @param Level : int
	 * @param exp : int
	 * @param ability : Abilities
	 * @see it.pokèmon.basics.Type
	 * @see it.pokèmon.basics.abilities.Abilities
	 */
	protected Pokèmon(String nome, Type type1, Type type2, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP,
			int movesNumber, int Level, int exp, Abilities ability) {
		this.nome = nome;
		this.type1 = type1;
		this.type2 = type2;
		this.Attacco = Attacco;
		this.Difesa = Difesa;
		this.AttaccoSp = AttaccoSp;
		this.DifesaSp = DifesaSp;
		this.Velocità = Velocità;
		this.HP = HP;
		this.setMaxHP(this.HP);
		this.movesNumber = movesNumber;
		this.Level = Level;
		this.exp = exp;
		this.ability = ability;
	}
	
	/**
	 * Pokèmon class contructor
	 * @param nome : String
	 * @param type1 : Type
	 * @param type2 : Type
	 * @param Attacco : int
	 * @param Difesa : int
	 * @param AttaccoSp : int
	 * @param DifesaSp : int
	 * @param Velocità : int
	 * @param HP : int
	 * @param movesNumber : int
	 * @param Level : int
	 * @param exp : int
	 * @param ability : HiddenAbilities
	 * @see it.pokèmon.basics.Type
	 * @see it.pokèmon.basics.abilities.HiddenAbilities
	 */
	protected Pokèmon(String nome, Type type1, Type type2, int Attacco, int Difesa, int AttaccoSp, int DifesaSp, int Velocità, int HP,
			int movesNumber, int Level, int exp, HiddenAbilities ability) {
		this.nome = nome;
		this.type1 = type1;
		this.type2 = type2;
		this.Attacco = Attacco;
		this.Difesa = Difesa;
		this.AttaccoSp = AttaccoSp;
		this.DifesaSp = DifesaSp;
		this.Velocità = Velocità;
		this.HP = HP;
		this.setMaxHP(this.HP);
		this.movesNumber = movesNumber;
		this.Level = Level;
		this.exp = exp;
		this.h_ability = ability;
	}
	
	/**
	 * Sets the Pokèmon's status
	 * @param status : Status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	
	/**
	 * Returns the Pokèmon's status
	 * @return status : Status
	 */
	public Status getStatus() {
		return this.status;
	}

	/**
	 * Returns the Pokèmon's name
	 * @return nome : String
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Sets the Pokèmon's name
	 * @param nome : String
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Returns:<br>
	 * <ul>
	 * 	<li>True --> This Pokèmon has two types</li>
	 * 	<li>False --> This Pokèmon has one type</li>
	 * </ul>
	 * @return hasDoubleType : boolean
	 */
	public boolean hasDoubleType() {
		boolean hasDoubleType = false;
		if((this.type1 != null) && (this.type2 != null)) {
			hasDoubleType = true;
		}
		return hasDoubleType;
	}

	/**
	 * Returns the Pokèmon's first type 
	 * @return type1 : Type
	 */
	public Type getType1() {
		return this.type1;
	}
	
	/**
	 * Sets the Pokèmon's first type
	 * @param type1 : Type
	 */
	public void setType1(Type type1) {
		this.type1 = type1;
	}

	/**
	 * Returns the Pokèmon's second type
	 * @return type2 : type
	 */
	public Type getType2() {
		return this.type2;
	}

	/**
	 * Sets the Pokèmon's second type
	 * @param type2 : Type
	 */
	public void setType2(Type type2) {
		this.type2 = type2;
	}

	/**
	 * Returns the Pokèmon's attack statistic
	 * @return Attacco : int
	 */
	public int getAttacco() {
		return this.Attacco;
	}

	/**
	 * Sets the Pokèmon's attack statistic
	 * @param Attacco : int
	 */
	public void setAttacco(int Attacco) {
		this.Attacco = Attacco;
	}

	/**
	 * Returns the Pokèmon's defense statistic
	 * @return Difesa : int
	 */
	public int getDifesa() {
		return this.Difesa;
	}

	/**
	 * Sets the Pokèmon defense statistic
	 * @param Difesa : int
	 */
	public void setDifesa(int Difesa) {
		this.Difesa = Difesa;
	}

	/**
	 * Returns the Pokèmon's special attack statistic
	 * @return AttaccoSp : int
	 */
	public int getAttaccoSp() {
		return this.AttaccoSp;
	}

	/**
	 * Sets the Pokèmon's special attack statistic
	 * @param AttaccoSp : int
	 */
	public void setAttaccoSp(int AttaccoSp) {
		this.AttaccoSp = AttaccoSp;
	}

	/**
	 * Returns the Pokèmon's special defense statistic
	 * @return DifesaSp : int
	 */
	public int getDifesaSp() {
		return this.DifesaSp;
	}

	/**
	 * Sets the Pokèmon's special defense statistic
	 * @param DifesaSp : int
	 */
	public void setDifesaSp(int DifesaSp) {
		this.DifesaSp = DifesaSp;
	}

	/**
	 * Returns the Pokèmon's speed statistic
	 * @return Velocità : int
	 */
	public int getVelocità() {
		return this.Velocità;
	}

	/**
	 * Sets the Pokèmon's speed statistic
	 * @param velocità : int
	 */
	public void setVelocità(int velocità) {
		Velocità = velocità;
	}

	/**
	 * Returns the Pokèmon's Health Points
	 * @return HP : int
	 */
	public int getHP() {
		return this.HP;
	}

	/**
	 * Sets the Pokèmon's Health Points
	 * @param HP : int
	 */
	public void setHP(int HP) {
		this.HP = HP;
	}

	/**
	 * Returns the number of moves that the Pokèmon knows
	 * @return movesNumber : int
	 */
	public int getMovesNumber() {
		return this.movesNumber;
	}

	/**
	 * Sets the number of moves that the Pokèmon knows
	 * @param movesNumber : int
	 */
	public void setMovesNumber(int movesNumber) {
		this.movesNumber = movesNumber;
	}

	/**
	 * Returns the Pokèmon's level
	 * @return Level : int
	 */
	public int getLevel() {
		return this.Level;
	}

	/**
	 * Sets the Pokèmon's level
	 * @param Level : int
	 */
	public void setLevel(int Level) {
		this.Level = Level;
	}

	/**
	 * Returns the Pokèmon's Experience Points
	 * @return exp : int
	 */
	public int getExp() {
		return this.exp;
	}

	/**
	 * Sets the Pokèmon's Experience Points
	 * @param exp : int
	 */
	public void setExp(int exp) {
		this.exp = exp;
	}

	/**
	 * Returns the Pokèmon's Ability
	 * @return ability : Abilities
	 */
	public Abilities getAbility() {
		return ability;
	}

	/**
	 * Sets the Pokèmon's Ability
	 * @param ability : Abilities
	 */
	public void setAbility(Abilities ability) {
		this.ability = ability;
	}

	/**
	 * Returns the Pokèmon's HiddenAbility
	 * @return h_ability : HiddenAbilities
	 */
	public HiddenAbilities getH_ability() {
		return h_ability;
	}

	/**
	 * Sets the Pokèmon's HiddenAbility
	 * @param h_ability : HiddenAbilities
	 */
	public void setH_ability(HiddenAbilities h_ability) {
		this.h_ability = h_ability;
	}
	
	/**
	 * Returns the Pokèmon's informations
	 * @return info : String
	 */
	public String infos() {
		String info;
		if(this.hasDoubleType()) {
			info = "Nome: " + getNome() + "- Livello: "+ getLevel() +" - Tipo: " + getType1() + " - " + getType2() + " - Mosse: ";
			for(int i = 0; i < moves.size(); i++) {
				info = info + moves.get(i).getNome() + " - ";
			}
		}else {
			info = "Nome: " + getNome() + "- Livello: "+ getLevel() + " - Tipo: " + getType1() + " - Mosse: ";
			for(int i = 0; i < moves.size(); i++) {
				info = info + moves.get(i).getNome() + " - ";
			}
		}
		return info;
	}

	/**
	 * Returns the Pokèmon's MaxHealth Points
	 * @return MaxHP : int
	 */
	public int getMaxHP() {
		return MaxHP;
	}

	/**
	 * Sets the Pokèmon's MaxHealth Points
	 * @param maxHP : int
	 */
	public void setMaxHP(int maxHP) {
		this.MaxHP = maxHP;
	}
}