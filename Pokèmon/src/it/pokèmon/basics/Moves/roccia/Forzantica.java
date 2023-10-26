package it.pokèmon.basics.Moves.roccia;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Vulnerability;

/**
 * Pokèmon's move: <b>Forzantica</b><br>
 * Extends Move<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ROCCIA</b></li>
 * 	<li>Power: <b>60</b></li>
 * 	<li>Precision: <b>100</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Vulnerability
 * @see it.pokèmon.basics.Moves.roccia.RockDamage
 */
public class Forzantica extends Move{
	private int pp = 5;

	/**
	 * Forzantica move constructor
	 */
	public Forzantica() {
		super("Forzantica", Type.ROCCIA, 60, 100);
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
			vul = new Vulnerability(p2.getType1(), p2.getType2(), Type.ROCCIA);
		}else{
			vul = new Vulnerability(p2.getType1(), Type.ROCCIA);
		}
		new RockDamage(p, p2, vul, this.getPotenza()).damage();
	}
}