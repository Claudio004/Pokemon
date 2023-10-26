package it.pokèmon.basics.Moves.roccia;

import it.pokèmon.basics.Alerts;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Vulnerability;

/**
 * @version 1.0
 * @author Claudio Togni 5CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Vulnerability
 * @see it.pokèmon.basics.Alerts
 * @since 2.0
 */
public class RockDamage {
	Vulnerability vul;
	Pokèmon p;
	Pokèmon p2;
	int movePower;
	
	RockDamage(Pokèmon p, Pokèmon p2, Vulnerability vul, int movePower){
		this.p = p;
		this.p2 = p2;
		this.vul = vul;
		this.movePower = movePower;
	}
	
	public void damage() {
		if(vul.damageMultiplier() == 0.5) {
			p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 2);
			Alerts.non_molto_efficace();
		}else {
			if(vul.damageMultiplier() == 0.25) {
				Alerts.non_molto_efficace();
				p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 4);
			}else {
				if(vul.damageMultiplier() == 0.0) {
					Alerts.invulnerabile();
				}else {
					if(vul.damageMultiplier() >= 2.0) {
						Alerts.superEfficace();
						p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) * (int)vul.damageMultiplier());
					}else {
						p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2));
					}
				}
			}
		}
	}
}
