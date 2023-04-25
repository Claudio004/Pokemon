package it.pokèmon.basics.Moves.coleottero;

import it.pokèmon.basics.LevelRange;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;

public class ForbiceX extends Move{
	private LevelRange levelRange = new LevelRange();
	private int levelRange_atk;
	private int levelRange_enemy;
	private int pp = 15;

	public ForbiceX() {
		super("Forbice X", Type.COLEOTTERO, 80, 100);
	}

	//Rifare i danni
	public void enemyDamage(Pokèmon p, Pokèmon p2) {
		this.levelRange_atk = levelRange.getRange(p);
		this.levelRange_enemy = levelRange.getRange(p2);
		this.pp = this.pp - 1;
		
		switch(this.levelRange_atk) {
			case 1:
				switch(this.levelRange_enemy) {
					case 1:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*16));
						break;
					case 2:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*8));
						break;
					case 3:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*4));
						break;
					case 4:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*2));
						break;
					case 5:
						p2.setHP(p2.getHP() - 1);
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
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*18));
						break;
					case 2:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*16));
						break;
					case 3:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*8));
						break;
					case 4:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*4));
						break;
					case 5:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*2));
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
			case 3:
				switch(this.levelRange_enemy) {
					case 1:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*22));
						break;
					case 2:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*18));
						break;
					case 3:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*16));
						break;
					case 4:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*8));
						break;
					case 5:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*4));
						break;
					case 6:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*2));
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
			case 4:
				switch(this.levelRange_enemy) {
					case 1:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*26));
						break;
					case 2:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*22));
						break;
					case 3:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*18));
						break;
					case 4:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*16));
						break;
					case 5:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*8));
						break;
					case 6:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*4));
						break;
					case 7:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*2));
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
			case 5:
				switch(this.levelRange_enemy)	{
					case 1:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*28));
						break;
					case 2:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*26));
						break;
					case 3:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*22));
						break;
					case 4:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*18));
						break;
					case 5:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*16));
						break;
					case 6:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*8));
						break;
					case 7:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*4));
						break;
					case 8:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*2));
						break;
					case 9:
						p2.setHP(p2.getHP() - 1);
						break;
					case 10:
						p2.setHP(p2.getHP() - 1);
						break;
				}
				break;
			case 6:
				switch(this.levelRange_enemy) {
					case 1:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*36));
						break;
					case 2:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*32));
						break;
					case 3:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*28));
						break;
					case 4:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*24));
						break;
					case 5:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*20));
						break;
					case 6:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*18));
						break;
					case 7:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*16));
						break;
					case 8:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*8));
						break;
					case 9:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*4));
						break;
					case 10:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*2));
						break;
				}
				break;
			case 7:
				switch(this.levelRange_enemy) {
					case 1:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*50));
						break;
					case 2:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*40));
						break;
					case 3:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*36));
						break;
					case 4:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*32));
						break;
					case 5:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*28));
						break;
					case 6:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*24));
						break;
					case 7:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*20));
						break;
					case 8:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*18));
						break;
					case 9:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*12));
						break;
					case 10:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*8));
						break;
				}
				break;
			case 8:
				switch(this.levelRange_enemy) {
					case 1:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*75));
						break;
					case 2:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*60));
						break;
					case 3:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*55));
						break;
					case 4:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*45));
						break;
					case 5:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*40));
						break;
					case 6:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*36));
						break;
					case 7:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*32));
						break;
					case 8:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*24));
						break;
					case 9:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*19));
						break;
					case 10:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*14));
						break;
				}
				break;
			case 9:
				switch(this.levelRange_enemy) {
					case 1:
						p2.setHP(4);
						break;
					case 2:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*85));
						break;
					case 3:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*75));
						break;
					case 4:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*60));
						break;
					case 5:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*50));
						break;
					case 6:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*45));
						break;
					case 7:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*40));
						break;
					case 8:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*35));
						break;
					case 9:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*30));
						break;
					case 10:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*25));
						break;
				}
				break;
			case 10:
				switch(this.levelRange_enemy) {
					case 1:
						p2.setHP(0);
						break;
					case 2:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*95));
						break;
					case 3:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*85));
						break;
					case 4:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*70));
						break;
					case 5:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*60));
						break;
					case 6:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*40));
						break;
					case 7:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*35));
						break;
					case 8:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*30));
						break;
					case 9:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*25));
						break;
					case 10:
						p2.setHP(p2.getHP() - ((p2.getHP()/100)*20));
						break;
				}
				break;
		}
	}
}
