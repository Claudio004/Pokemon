package it.pokèmon.basics.Moves.drago;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;

/**
 * Pokèmon's move: <b>Ira Di Drago</b><br>
 * Extends Move<br>
 * Move informations:
 * <ul>
 * 	<li>Type: <b>DRAGO</b></li>
 * 	<li>Power: <b>-</b></li>
 * 	<li>Precision: <b>100</b></li>
 * </ul>
 * @author Claudio Togni 4CI
 * @see it.pokèmon.basics.Pokèmon
 * @see it.pokèmon.basics.Move
 * @see it.pokèmon.basics.Type
 * @see it.pokèmon.basics.Vulnerability
 * @see it.pokèmon.basics.Alert
 */
public class IraDiDrago extends Move{
	private int pp = 10;

	/**
	 * IraDiDrago move constructor
	 */
	public IraDiDrago() {
		super("Ira Di Drago", Type.DRAGO, 0, 100);
	}

	/**
	 * Method used by a Pokèmon who knows a move<br>
	 * to attack the opponent
	 * @param p : Pokèmon
	 * @param p2 : Pokèmon
	 */
	public void enemyDamage(Pokèmon p, Pokèmon p2) {
		this.pp = this.pp - 1;
		p2.setHP(p2.getHP() - 40);
	}
}
