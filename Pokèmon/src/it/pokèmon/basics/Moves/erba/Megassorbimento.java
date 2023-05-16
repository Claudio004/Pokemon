package it.pokèmon.basics.Moves.erba;

import it.pokèmon.basics.Alerts;
import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Vulnerability;

/**
 * Pokèmon's move: <b>Megassorbimento</b><br>
 * Extends Move<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ERBA</b></li>
 * 	<li>Power: <b>40</b></li>
 * 	<li>Precision: <b>100</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Vulnerability
 * @see it.pokèmon.basics.Alert
 */
public class Megassorbimento extends Move{
	private int pp = 15;

	/*
	 * Megassorbimento move constructor
	 */
	public Megassorbimento() {
		super("Megassorbimento", Type.ERBA, 40, 100);
	}

	/**
	 * Method used by a Pokèmon who knows a move<br>
	 * to attack the opponent
	 * @param p : Pokèmon
	 * @param p2 : Pokèmon
	 */
	//Aggiungere meccanica recupero vita
	public void enemyDamage(Pokèmon p, Pokèmon p2) {
		this.pp = this.pp - 1;
		Vulnerability vul;
		if(p2.hasDoubleType()){
			vul = new Vulnerability(p2.getType1(), p2.getType2(), Type.ERBA);
		}else{
			vul = new Vulnerability(p2.getType1(), Type.ERBA);
		}
		
		if(vul.damageMultiplier() == 0.5) {
			p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 2);
			int regen = ((((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 2) / 100 * 50;
			p.setHP(p.getHP() + regen);
			Alerts.non_molto_efficace();
		}else {
			if(vul.damageMultiplier() == 0.25) {
				Alerts.non_molto_efficace();
				p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 4);
				int regen = ((((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 4) / 100 * 50;
				p.setHP(p.getHP() + regen);
			}else {
				if(vul.damageMultiplier() == 0.0) {
					Alerts.invulnerabile();
				}else {
					if(vul.damageMultiplier() >= 2.0) {
						Alerts.superEfficace();
						p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) * (int)vul.damageMultiplier());
						int regen = ((((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) * (int)vul.damageMultiplier()) / 100 * 50;
						p.setHP(p.getHP() + regen);
					}else {
						p2.setHP(p2.getHP() - (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2));
						int regen = (((((2*p.getLevel())/5) +2) * this.getPotenza() * (p.getAttaccoSp() / p2.getDifesaSp())) / 50 +2) / 100 * 50;
						p.setHP(p.getHP() + regen);
					}
				}
			}
		}
	}
}