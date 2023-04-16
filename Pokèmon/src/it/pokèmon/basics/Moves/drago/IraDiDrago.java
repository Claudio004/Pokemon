package it.pokèmon.basics.Moves.drago;

import it.pokèmon.basics.Move;
import it.pokèmon.basics.Pokèmon;
import it.pokèmon.basics.Type;

public class IraDiDrago extends Move{
	private int pp = 10;

	public IraDiDrago() {
		super("Ira Di Drago", Type.DRAGO, 0, 100);
	}

	public void enemyDamage(Pokèmon p, Pokèmon p2) {
		this.pp = this.pp - 1;
		p2.setHP(p2.getHP() - 40);
	}
}
