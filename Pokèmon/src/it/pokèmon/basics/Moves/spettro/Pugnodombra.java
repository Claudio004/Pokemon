package it.pokèmon.basics.Moves.spettro;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Vulnerability;

/**
 * Pokèmon's move: <b>Pugnodombra</b><br>
 * Extends Move<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>SPETTRO</b></li>
 * 	<li>Power: <b>60</b></li>
 * 	<li>Precision: <b>-</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Vulnerability
 * @see it.pokèmon.basics.Moves.spettro.GhostDamage
 */
public class Pugnodombra extends Move{
	private int pp = 20;

	/**
	 * Pugnodombra move constructor
	 */
	public Pugnodombra() {
		super("Pugnodombra", Type.SPETTRO, 60, 0);
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
			vul = new Vulnerability(p2.getType1(), p2.getType2(), Type.SPETTRO);
		}else{
			vul = new Vulnerability(p2.getType1(), Type.SPETTRO);
		}
		new GhostDamage(p, p2, vul, this.getPotenza()).damage();
	}
}