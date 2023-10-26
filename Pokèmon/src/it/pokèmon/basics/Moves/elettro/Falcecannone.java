package it.pokèmon.basics.Moves.elettro;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;
import it.pokèmon.basics.Vulnerability;

/**
 * Pokèmon's move: <b>Falcecannone</b><br>
 * Extends Move<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>ELETTRO</b></li>
 * 	<li>Power: <b>120</b></li>
 * 	<li>Precision: <b>50</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Vulnerability
 * @see it.pokèmon.basics.Moves.elettro.ElettroDamage
 */
public class Falcecannone extends Move{
	private int pp = 5;

	/**
	 * Falcecannone move constructor
	 */
	public Falcecannone() {
		super("Falcecannone", Type.ELETTRO, 120, 50);
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
			vul = new Vulnerability(p2.getType1(), p2.getType2(), Type.ELETTRO);
		}else{
			vul = new Vulnerability(p2.getType1(), Type.ELETTRO);
		}
		new ElettroDamage(p, p2, vul, this.getPotenza()).damage();
	}
}