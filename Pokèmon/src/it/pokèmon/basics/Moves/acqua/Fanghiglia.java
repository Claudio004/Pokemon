package it.pokèmon.basics.Moves.acqua;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Vulnerability;

/**
 * Pokèmon's move: <b>Fanghiglia</b><br>
 * Extends Move<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ACQUA</b></li>
 * 	<li>Power: <b>95</b></li>
 * 	<li>Precision: <b>85</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Vulnerability
 * @see it.pokèmon.basics.Moves.acqua.WaterDamage
 */
public class Fanghiglia extends Move{
	private int pp = 10;

	/**
	 * Fanghiglia move constructor
	 */
	public Fanghiglia() {
		super("Fanghiglia", Type.ACQUA, 95, 85);
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
			vul = new Vulnerability(p2.getType1(), p2.getType2(), Type.ACQUA);
		}else{
			vul = new Vulnerability(p2.getType1(), Type.ACQUA);
		}
		new WaterDamage(p, p2, vul, this.getPotenza()).damage();
	}
}