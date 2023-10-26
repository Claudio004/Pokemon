package it.pokèmon.basics.Moves.lotta;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Vulnerability;

/**
 * Pokèmon's move: <b>Martelpugno</b><br>
 * Extends Move<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>LOTTA</b></li>
 * 	<li>Power: <b>100</b></li>
 * 	<li>Precision: <b>90</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Vulnerability
 * @see it.pokèmon.basics.Moves.lotta.FightDamage
 */
public class Martelpugno extends Move{
	private int pp = 10;

	/**
	 * Martelpugno move constructor
	 */
	public Martelpugno() {
		super("Martelpugno", Type.LOTTA, 100, 90);
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
			vul = new Vulnerability(p2.getType1(), p2.getType2(), Type.LOTTA);
		}else{
			vul = new Vulnerability(p2.getType1(), Type.LOTTA);
		}
		new FightDamage(p, p2, vul, this.getPotenza()).damage();
	}
}