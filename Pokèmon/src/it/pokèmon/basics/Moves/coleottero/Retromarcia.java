package it.pokèmon.basics.Moves.coleottero;

import it.pokèmon.basics.LevelRange;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Vulnerability;

public class Retromarcia extends Move{
	private LevelRange levelRange = new LevelRange();
	private int levelRange_atk;
	private int levelRange_enemy;
	private int pp = 20;

	public Retromarcia() {
		super("Retromarcia", Type.COLEOTTERO, 70, 100);
	}

	public void enemyDamage(Pokèmon p, Pokèmon p2) {
		this.levelRange_atk = levelRange.getRange(p);
		this.levelRange_enemy = levelRange.getRange(p2);
		this.pp = this.pp - 1;
		Vulnerability vul;
		if(p2.hasDoubleType()){
			vul = new Vulnerability(p2.getType1(), p2.getType2(), Type.COLEOTTERO);
		}else{
			vul = new Vulnerability(p2.getType1(), Type.COLEOTTERO);
		}
		
		switch(this.levelRange_atk) {
			case 1:
				switch(this.levelRange_enemy) {
					case 1:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) * (int) vul.damageMultiplier()));
							}
						}
						break;
					default:
						p2.setHP(p2.getHP() - 1);
						break;
				}
				break;
			case 2:
				switch(this.levelRange_enemy) {
					case 1:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) * (int) vul.damageMultiplier()));
							}
						}
						break;
					default:
						p2.setHP(p2.getHP() - 1);
						break;
				}
				break;
			case 3:
				switch(this.levelRange_enemy) {
					case 1:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) * (int) vul.damageMultiplier()));
							}
						}
						break;
					default:
						p2.setHP(p2.getHP() - 1);
						break;
				}
				break;
			case 4:
				switch(this.levelRange_enemy) {
					case 1:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						p2.setHP(p2.getHP() - 1);
						break;
				}
				break;
			case 5:
				switch(this.levelRange_enemy)	{
					case 1:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 10) * (int) vul.damageMultiplier()));
							}
						}
						break;
				}
				break;
			case 6:
				switch(this.levelRange_enemy) {
					case 1:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) * (int) vul.damageMultiplier()));
							}
						};
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 20) * (int) vul.damageMultiplier()));
							}
						}
						break;
				}
				break;
			case 7:
				switch(this.levelRange_enemy) {
					case 1:
						p2.setHP(0);
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 24) * (int) vul.damageMultiplier()));
							}
						}
						break;
				}
				break;
			case 8:
				switch(this.levelRange_enemy) {
					case 3:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 28) * (int) vul.damageMultiplier()));
							}
						}
						break;
					default:
						p2.setHP(0);
						break;
				}
				break;
			case 9:
				switch(this.levelRange_enemy) {
					case 4:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 32) * (int) vul.damageMultiplier()));
							}
						}
						break;
					default:
						p2.setHP(0);
						break;
				}
				break;
			case 10:
				switch(this.levelRange_enemy) {
					case 5:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 80) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 60) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 50) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 44) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 40) * (int) vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						if(vul.damageMultiplier() == 0.5){
							p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 2));
						}else{
							if(vul.damageMultiplier() == 0.25){
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) / 4));
							}else{
								p2.setHP(p2.getHP() - (((p2.getHP() / 100) * 36) * (int) vul.damageMultiplier()));
							}
						}
						break;
					default:
						p2.setHP(0);
						break;
				}
				break;
		}
	}
}
