package it.pokèmon.basics.Moves.fuoco;

import it.pokèmon.basics.Alerts;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Vulnerability;
import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.abilities.HiddenAbilities;

/**
 * Pokèmon's move: <b>Sparafuoco</b><br>
 * Extends Move<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>FUOCO</b></li>
 * 	<li>Power: <b>100</b></li>
 * 	<li>Precision: <b>100</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Vulnerability
 * @see it.pokèmon.basics.Moves.fuoco.FireDamage
 */
public class Sparafuoco extends Move{
	private int pp = 5;

	/**
	 * Sparafuoco move constructor
	 */
	public Sparafuoco() {
		super("Sparafuoco", Type.FUOCO, 100, 100);
	}
	
	/**
	 * Method used by a Pokèmon who knows a move<br>
	 * to attack the opponent
	 * @param p : Pokèmon
	 * @param p2 : Pokèmon
	 */
	public void enemyDamage(Pokèmon p, Pokèmon p2) {
		this.pp = this.pp - 1;
		Vulnerability vul;
		Boolean Aiutofuoco = false;
		if(p.getAbility() == Abilities.AIUTOFUOCO || p.getH_ability() == HiddenAbilities.AIUTOFUOCO) {
			Aiutofuoco = true;
		}
		if(p2.hasDoubleType()){
			vul = new Vulnerability(p2.getType1(), p2.getType2(), Type.FUOCO);
		}else{
			vul = new Vulnerability(p2.getType1(), Type.FUOCO);
		}
		
		if(vul.damageMultiplier() == 0.5) {
			if(p.getHP() <= (p.getMaxHP() / 3)) {
				p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 2 + (this.getPotenza()/2));
			}else {
				p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 2);
			}
			Alerts.non_molto_efficace();
		}else {
			if(vul.damageMultiplier() == 0.25) {
				if(p.getHP() <= (p.getMaxHP() / 3) && Aiutofuoco) {
					p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 4 + (this.getPotenza()/2));
				}else {
					p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 4);
				}
				Alerts.non_molto_efficace();
			}else {
				if(vul.damageMultiplier() == 0.0) {
					Alerts.invulnerabile();
				}else {
					if(vul.damageMultiplier() >= 2.0) {
						if(p.getHP() <= (p.getMaxHP() / 3) && Aiutofuoco) {
							p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) * (int)vul.damageMultiplier() + (this.getPotenza()/2));
						}else {
							p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) * (int)vul.damageMultiplier());
						}
						Alerts.superEfficace();
					}else {
						if(p.getHP() <= (p.getMaxHP() / 3)  && Aiutofuoco) {
							p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) + (this.getPotenza()/2));
						}else {
							p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2));
						}
					}
				}
			}
		}
	}
}
