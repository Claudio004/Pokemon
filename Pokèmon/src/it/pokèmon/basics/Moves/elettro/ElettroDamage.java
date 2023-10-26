package it.pokèmon.basics.Moves.elettro;

import it.pokèmon.basics.Alerts;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Vulnerability;
import it.pokèmon.basics.abilities.Abilities;

/**
 * @version 1.0
 * @author Claudio Togni 5CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.abilities.Abilities
 * @see it.pokèmon.basics.abilities.HiddenAbilities
 * @see it.pokèmon.basics.Vulnerability
 * @since 2.0
 */
public class ElettroDamage {
	Vulnerability vul;
	Pokèmon p;
	Pokèmon p2;
	int movePower;
	
	ElettroDamage(Pokèmon p, Pokèmon p2, Vulnerability vul, int movePower){
		this.p = p;
		this.p2 = p2;
		this.vul = vul;
		this.movePower = movePower;
	}
	
	public void damage() {
		if(p2.getAbility() == Abilities.ASSORBIVOLT) {
			int tmpPS = p2.getHP() + ((p2.getMaxHP()*25)/100);
			if(tmpPS >= p2.getMaxHP()) {
				p2.setHP(p2.getMaxHP());
			}else {
				p2.setHP(tmpPS);
			}
			Alerts.invulnerabile();
			Alerts.Assorbivolt();
		}else {
			if(p2.getAbility() == Abilities.PARAFULMINE) {
				Alerts.invulnerabile();
			}else {
				if(vul.damageMultiplier() == 0.5) {
					p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 2);
					Alerts.non_molto_efficace();
				}else {
					if(vul.damageMultiplier() == 0.25) {		
						p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 4);
						Alerts.non_molto_efficace();
					}else {
						if(vul.damageMultiplier() == 0.0) {
							Alerts.invulnerabile();
						}else {
							if(vul.damageMultiplier() >= 2.0) {
								p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) * (int)vul.damageMultiplier());
								Alerts.superEfficace();
							}else {
								p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2));
							}
						}
					}
				}
			}
		}
	}
}
