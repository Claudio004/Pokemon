package it.pokèmon.basics;

import java.util.ArrayList;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

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
	private int movesNumber;
	private int Level;
	private int exp;
	public ArrayList<Move> moves = new ArrayList<Move>(0);
	private Status status = Status.NONE;
	private Abilities ability = null;
	private HiddenAbilities h_ability = null;
	
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
		this.movesNumber = movesNumber;
		this.Level = Level;
		this.exp = exp;
		this.ability = ability;
	}
	
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
		this.movesNumber = movesNumber;
		this.Level = Level;
		this.exp = exp;
		this.h_ability = ability;
	}
	
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
		this.movesNumber = movesNumber;
		this.Level = Level;
		this.exp = exp;
		this.ability = ability;
	}
	
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
		this.movesNumber = movesNumber;
		this.Level = Level;
		this.exp = exp;
		this.h_ability = ability;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Status getStatus() {
		return this.status;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean hasDoubleType() {
		boolean hasDoubleType = false;
		if((this.type1 != null) && (this.type2 != null)) {
			hasDoubleType = true;
		}
		return hasDoubleType;
	}

	public Type getType1() {
		return this.type1;
	}

	public void setType1(Type type1) {
		this.type1 = type1;
	}

	public Type getType2() {
		return this.type2;
	}

	public void setType2(Type type2) {
		this.type2 = type2;
	}

	public int getAttacco() {
		return this.Attacco;
	}

	public void setAttacco(int Attacco) {
		this.Attacco = Attacco;
	}

	public int getDifesa() {
		return this.Difesa;
	}

	public void setDifesa(int Difesa) {
		this.Difesa = Difesa;
	}

	public int getAttaccoSp() {
		return this.AttaccoSp;
	}

	public void setAttaccoSp(int AttaccoSp) {
		this.AttaccoSp = AttaccoSp;
	}

	public int getDifesaSp() {
		return this.DifesaSp;
	}

	public void setDifesaSp(int DifesaSp) {
		this.DifesaSp = DifesaSp;
	}

	public int getVelocità() {
		return this.Velocità;
	}

	public void setVelocità(int velocità) {
		Velocità = velocità;
	}

	public int getHP() {
		return this.HP;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public int getMovesNumber() {
		return this.movesNumber;
	}

	public void setMovesNumber(int movesNumber) {
		this.movesNumber = movesNumber;
	}

	public int getLevel() {
		return this.Level;
	}

	public void setLevel(int Level) {
		this.Level = Level;
	}

	public int getExp() {
		return this.exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Abilities getAbility() {
		return ability;
	}

	public void setAbility(Abilities ability) {
		this.ability = ability;
	}

	public HiddenAbilities getH_ability() {
		return h_ability;
	}

	public void setH_ability(HiddenAbilities h_ability) {
		this.h_ability = h_ability;
	}
	
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
}