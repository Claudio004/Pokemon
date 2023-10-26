package it.pokèmon.basics.Moves.normale;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Vulnerability;

/**
 * Pokèmon's move: <b>Iperzanna</b><br>
 * Extends Move<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>NORMALE</b></li>
 * 	<li>Power: <b>80</b></li>
 * 	<li>Precision: <b>90</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Vulnerability
 * @see it.pokèmon.basics.Moves.normale.NormalDamage
 */
public class Iperzanna extends Move{
	private int pp = 15;

	/**
	 * Iperzanna move constructor
	 */
	public Iperzanna() {
		super("Iperzanna", Type.NORMALE, 80, 90);
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
			vul = new Vulnerability(p2.getType1(), p2.getType2(), Type.NORMALE);
		}else{
			vul = new Vulnerability(p2.getType1(), Type.NORMALE);
		}
		new NormalDamage(p, p2, vul, this.getPotenza()).damage();
	}
}
