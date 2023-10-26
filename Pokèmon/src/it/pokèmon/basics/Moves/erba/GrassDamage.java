package it.pokèmon.basics.Moves.erba;

import it.pokèmon.basics.Alerts;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Vulnerability;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

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
public class GrassDamage {
	Vulnerability vul;
	Pokèmon p;
	Pokèmon p2;
	int movePower;
	
	GrassDamage(Pokèmon p, Pokèmon p2, Vulnerability vul, int movePower){
		this.p = p;
		this.p2 = p2;
		this.vul = vul;
		this.movePower = movePower;
	}
	
	public void damage() {
		Boolean Erbaiuto = false;
		if(p.getAbility() == Abilities.ERBAIUTO || p.getH_ability() == HiddenAbilities.ERBAIUTO) {
			Erbaiuto = true;
		}
		if(vul.damageMultiplier() == 0.5) {
			if(p.getHP() <= (p.getMaxHP() / 3) && Erbaiuto) {
				p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 2 + (this.movePower/2));
			}else {
				p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 2);
			}
			Alerts.non_molto_efficace();
		}else {
			if(vul.damageMultiplier() == 0.25) {
				if(p.getHP() <= (p.getMaxHP() / 3) && Erbaiuto) {
					p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 4 + (this.movePower/2));
				}else {
					p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 4);
				}
				Alerts.non_molto_efficace();
			}else {
				if(vul.damageMultiplier() == 0.0) {
					Alerts.invulnerabile();
				}else {
					if(vul.damageMultiplier() >= 2.0) {
						if(p.getHP() <= (p.getMaxHP() / 3) && Erbaiuto) {
							p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) * (int)vul.damageMultiplier() + (this.movePower/2));
						}else {
							p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) * (int)vul.damageMultiplier());
						}
						Alerts.superEfficace();
					}else {
						if(p.getHP() <= (p.getMaxHP() / 3)  && Erbaiuto) {
							p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) + (this.movePower/2));
						}else {
							p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.movePower * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2));
						}
					}
				}
			}
		}
	}
}
