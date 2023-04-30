package it.pokèmon.basics.Moves.volante;

import it.pokèmon.basics.LevelRange;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Vulnerability;

public class Acrobazia extends Move{
	private LevelRange levelRange = new LevelRange();
	private int levelRange_atk;
	private int levelRange_enemy;
	private int pp = 15;

	public Acrobazia() {
		super("Acrobazia", Type.VOLANTE, 55, 100);
	}
	
	public void enemyDamage(Pokèmon p, Pokèmon p2) {
		this.levelRange_atk = levelRange.getRange(p);
		this.levelRange_enemy = levelRange.getRange(p2);
		this.pp = this.pp - 1;
		Vulnerability vul;
		if(p2.hasDoubleType()) {
			vul = new Vulnerability(p2.getType1(), p2.getType2(), Type.FUOCO);
		}else {
			vul = new Vulnerability(p2.getType1(), Type.FUOCO);
		}
		
		switch(this.levelRange_atk) {
			case 1:
				switch(this.levelRange_enemy) {
					case 1:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						p2.setHP(p2.getHP() - 1);
						break;
					case 7:
						p2.setHP(p2.getHP() - 1);
						break;
					case 8:
						p2.setHP(p2.getHP() - 1);
						break;
					case 9:
						p2.setHP(p2.getHP() - 1);
						break;
					case 10:
						p2.setHP(p2.getHP() - 1);
						break;
				}
				break;
			case 2:
				switch(this.levelRange_enemy) {
					case 1:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						p2.setHP(p2.getHP() - 1);
						break;
					case 8:
						p2.setHP(p2.getHP() - 1);
						break;
					case 9:
						p2.setHP(p2.getHP() - 1);
						break;
					case 10:
						p2.setHP(p2.getHP() - 1);
						break;
				}
				break;
			case 3:
				switch(this.levelRange_enemy) {
					case 1:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						p2.setHP(p2.getHP() - 1);
						break;
					case 9:
						p2.setHP(p2.getHP() - 1);
						break;
					case 10:
						p2.setHP(p2.getHP() - 1);
						break;
				}
				break;
			case 4:
				switch(this.levelRange_enemy) {
					case 1:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						p2.setHP(p2.getHP() - 1);
						break;
					case 10:
						p2.setHP(p2.getHP() - 1);
						break;
				}
				break;
			case 5:
				switch(this.levelRange_enemy)	{
					case 1:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*4) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*2) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						p2.setHP(p2.getHP() - 1);
						break;
				}
				break;
			case 6:
				switch(this.levelRange_enemy) {
					case 1:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 2));
						}else {
							if(vul.damageMultiplier() == 0.5) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*5) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*5) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*5) * (int)vul.damageMultiplier()));
							}
						}
						break;
				}
				break;
			case 7:
				switch(this.levelRange_enemy) {
					case 1:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*75) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*75) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*75) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*15) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*8) * (int)vul.damageMultiplier()));
							}
						}
						break;
				}
				break;
			case 8:
				switch(this.levelRange_enemy) {
					case 1:
						p2.setHP(0);
						break;
					case 2:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*75) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*75) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*75) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*45) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*45) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*45) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*20) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*17) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*17) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*17) * (int)vul.damageMultiplier()));
							}
						}
						break;
				}
				break;
			case 9:
				switch(this.levelRange_enemy) {
					case 1:
						p2.setHP(0);
						break;
					case 2:
						p2.setHP(0);
						break;
					case 3:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*75) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*75) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*75) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*45) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*45) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*45) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) * (int)vul.damageMultiplier()));
							}
						}
						break;
				}
				break;
			case 10:
				switch(this.levelRange_enemy) {
					case 1:
						p2.setHP(0);
						break;
					case 2:
						p2.setHP(0);
						break;
					case 3:
						p2.setHP(0);
						break;
					case 4:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*70) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*70) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*70) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 5:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*60) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 6:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*50) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 7:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*40) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 8:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*35) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 9:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*30) * (int)vul.damageMultiplier()));
							}
						}
						break;
					case 10:
						if(vul.damageMultiplier() == 0.5) {
							p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 2));
						}else {
							if(vul.damageMultiplier() == 0.25) {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) / 4));
							}else {
								p2.setHP(p2.getHP() - (((p2.getHP()/100)*25) * (int)vul.damageMultiplier()));
							}
						}
						break;
				}
				break;
		}
	}
}
