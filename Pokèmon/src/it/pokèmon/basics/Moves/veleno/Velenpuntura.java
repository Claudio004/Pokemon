package it.pokèmon.basics.Moves.veleno;

import it.pokèmon.basics.Alerts;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Vulnerability;

/**
 * Pokèmon's move: <b>Velenpuntura</b><br>
 * Extends Move<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>VELENO</b></li>
 * 	<li>Power: <b>80</b></li>
 * 	<li>Precision: <b>100</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Vulnerability
 * @see it.pokèmon.basics.Alert
 */
public class Velenpuntura extends Move{
	private int pp = 20;

	/**
	 * Velenpuntura move constructor
	 */
	public Velenpuntura() {
		super("Velenpuntura", Type.VELENO, 80, 100);
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
		if(p2.hasDoubleType()){
			vul = new Vulnerability(p2.getType1(), p2.getType2(), Type.VELENO);
		}else{
			vul = new Vulnerability(p2.getType1(), Type.VELENO);
		}
		
		if(vul.damageMultiplier() == 0.5) {
			p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttacco() / p2.getDifesa())) / 50 +2) / 2);
			Alerts.non_molto_efficace();
		}else {
			if(vul.damageMultiplier() == 0.25) {
				Alerts.non_molto_efficace();
				p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttacco() / p2.getDifesa())) / 50 +2) / 4);
			}else {
				if(vul.damageMultiplier() == 0.0) {
					Alerts.invulnerabile();
				}else {
					if(vul.damageMultiplier() >= 2.0) {
						Alerts.superEfficace();
						p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttacco() / p2.getDifesa())) / 50 +2) * (int)vul.damageMultiplier());
					}else {
						p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttacco() / p2.getDifesa())) / 50 +2));
					}
				}
			}
		}
	}
}
