package it.pokèmon.basics;

import it.pokèmon.basics.abilities.Abilities;
import it.pokèmon.basics.pokèmon.erba.*;
import it.pokèmon.basics.pokèmon.fuoco.*;
import it.pokèmon.basics.pokèmon.ghiaccio.*;
import it.pokèmon.basics.pokèmon.lotta.*;
import it.pokèmon.basics.pokèmon.acciaio.*;
import it.pokèmon.basics.pokèmon.acqua.*;
import it.pokèmon.basics.pokèmon.psico.*;
import it.pokèmon.basics.pokèmon.roccia.*;
import it.pokèmon.basics.pokèmon.spettro.*;
import it.pokèmon.basics.pokèmon.terra.*;
import it.pokèmon.basics.pokèmon.veleno.*;
import it.pokèmon.basics.pokèmon.volante.*;
import it.pokèmon.basics.pokèmon.normale.*;
import it.pokèmon.basics.pokèmon.buio.*;
import it.pokèmon.basics.pokèmon.coleottero.*;
import it.pokèmon.basics.pokèmon.drago.*;
import it.pokèmon.basics.pokèmon.elettro.*;

public class Game implements GameInterface{
	private Pokèmon p;
	private Pokèmon p2;
	private Pokèmon p_info;
	private String ch = "";
	
	private void menuSceltaPokemon() {
		ch = GameInterface.displayPokèmon();
		if(compareInput() == 1) {
			menuSceltaPokemon();
		}else {
			menuSceltaPokemon_u_AI();
		}	
	}
	
	private void menuSceltaPokemon_AI() {
		ch = GameInterface.displayPokèmon();
		if(compareInputAI() == 1) {
			menuSceltaPokemon_AI();
		}else {
			startGame();
		}
	}
	
	private void menuSceltaPokemon_due() {
		ch = GameInterface.displayPokèmon_due();
		if(compareInput() == 1) {
			menuSceltaPokemon_due();
		}else {
			menuSceltaPokemon_u_AI();
		}
	}
	
	private void menuSceltaPokemon_due_AI() {
		ch = GameInterface.displayPokèmon_due();
		if(compareInputAI() == 1) {
			menuSceltaPokemon_due_AI();
		}else {
			startGame();
		}
	}
	
	private void menuSceltaPokemon_tre() {
		ch = GameInterface.displayPokèmon_tre();
		if(compareInput() == 1) {
			menuSceltaPokemon_tre();
		}else {
			menuSceltaPokemon_u_AI();
		}
	}
	
	private void menuSceltaPokemon_tre_AI() {
		ch = GameInterface.displayPokèmon_tre();
		if(compareInputAI() == 1) {
			menuSceltaPokemon_tre_AI();
		}else {
			startGame();
		}
	}
	
	private void menuSceltaPokemon_u_AI() {
		int ch = GameInterface.displayAiPickChooserMsg();
		if(ch == 1) {
			menuSceltaPokemon_AI();
		}else {
			if(ch == 2) {
				randomPokePick();
			}else {
				menuSceltaPokemon_u_AI();
			}
		}
	}
	
	private void randomPokePick() {
		int pick = GameInterface.pickValue();
		ch = "" + pick;
		compareInputAI();
		startGame();
	}
	
	private int compareInput() {
		int flag = 0;
		switch(ch.toLowerCase()) {
			case "pag1":
				menuSceltaPokemon();
				break;
			case "pag2":
				menuSceltaPokemon_due();
			case "pag3":
				menuSceltaPokemon_tre();
			case "0":
				p = new Victini();
				break;
			case "1":
				p = new Snivy(Abilities.ERBAIUTO);
				break;
			case "2":
				p = new Servine(Abilities.ERBAIUTO);
				break;
			case "3":
				p = new Serperior(Abilities.ERBAIUTO);
				break;
			case "4":
				p = new Tepig(Abilities.AIUTOFUOCO);
				break;
			case "5":
				p = new Pignite(Abilities.AIUTOFUOCO);
				break;
			case "6":
				p = new Emboar(Abilities.AIUTOFUOCO);
				break;
			case "7":
				p = new Oshawott(Abilities.ACQUAIUTO);
				break;
			case "8":
				p = new Dewott(Abilities.ACQUAIUTO);
				break;
			case "9":
				p = new Samurott(Abilities.ACQUAIUTO);
				break;
			case "10":
				p = new Patrat(Abilities.SGUARDOFERMO);
				break;
			case "11":
				p = new Watchog(Abilities.SGUARDOFERMO);
				break;
			case "12":
				p = new Purrloin(Abilities.SCIOLTEZZA);
				break;
			case "13":
				p = new Liepard(Abilities.SCIOLTEZZA);
				break;
			case "14":
				p = new Pansage(Abilities.VORACITA);
				break;
			case "15":
				p = new Simisage(Abilities.VORACITA);
				break;
			case "16":
				p = new Pansear(Abilities.VORACITA);
				break;
			case "17":
				p = new Simisear(Abilities.VORACITA);
				break;
			case "18":
				p = new Panpour(Abilities.VORACITA);
				break;
			case "19":
				p = new Simipour(Abilities.VORACITA);
				break;
			case "20":
				p = new Trubbish(Abilities.TANFO);
				break;
			case "21":
				p = new Garbodor(Abilities.TANFO);
				break;
			case "22":
				p = new Sigilyph(Abilities.SPLENDICUTE);
				break;
			case "23":
				p = new Yamask();
				break;
			case "24":
				p = new Cofagrigus();
				break;
			case "25":
				p = new Emolga(Abilities.STATICO);
				break;
			case "26":
				p = new Joltik(Abilities.INSETTOCCHI);
				break;
			case "27":
				p = new Galvantula(Abilities.INSETTOCCHI);
				break;
			case "28":
				p = new Axew(Abilities.ANTAGONISMO);
				break;
			case "29":
				p = new Fraxure(Abilities.ANTAGONISMO);
				break;
			case "30":
				p = new Haxorus(Abilities.ANTAGONISMO);
				break;
			case "31":
				p = new Heatmor(Abilities.VORACITA);
				break;
			case "32":
				p = new Durant(Abilities.AIUTINSETTO);
				break;
			case "33":
				p = new Cryogonal();
				break;
			case "34":
				p = new Tornadus(Abilities.BURLA);
				break;
			case "35":
				p = new Cobalion();
				break;
			case "36":
				p = new Terrakion();
				break;
			case "37":
				p = new Virizion();
				break;
			case "38":
				p = new Stunfisk(Abilities.STATICO);
				break;
			case "39":
				p = new Throh(Abilities.DENTISTRETTI);
				break;
			case "40":
				p = new Sawk(Abilities.VIGORE);
				break;
			case "41":
				p = new Bouffalant(Abilities.TEMERARIETA);
				break;
			case "42":
				p = new Druddigon(Abilities.CARTAVETRO);
				break;
			case "43":
				p = new Reshiram();
				break;
			case "44":
				p = new Zekrom();
				break;
			case "info0":
				p_info = new Victini();
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info1":
				p_info = new Snivy(Abilities.ERBAIUTO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info2":
				p_info = new Servine(Abilities.ERBAIUTO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info3":
				p_info = new Serperior(Abilities.ERBAIUTO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info4":
				p_info = new Tepig(Abilities.AIUTOFUOCO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info5":
				p_info = new Pignite(Abilities.AIUTOFUOCO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info6":
				p_info = new Emboar(Abilities.AIUTOFUOCO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info7":
				p_info = new Oshawott(Abilities.ACQUAIUTO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info8":
				p_info = new Dewott(Abilities.ACQUAIUTO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info9":
				p_info = new Samurott(Abilities.ACQUAIUTO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info10":
				p_info = new Patrat(Abilities.SGUARDOFERMO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info11":
				p_info = new Watchog(Abilities.SGUARDOFERMO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info12":
				p_info = new Purrloin(Abilities.SCIOLTEZZA);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info13":
				p_info = new Liepard(Abilities.SCIOLTEZZA);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info14":
				p_info = new Pansage(Abilities.VORACITA);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info15":
				p_info = new Simisage(Abilities.VORACITA);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info16":
				p_info = new Pansear(Abilities.VORACITA);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info17":
				p_info = new Simisear(Abilities.VORACITA);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info18":
				p_info = new Panpour(Abilities.VORACITA);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info19":
				p_info = new Simipour(Abilities.VORACITA);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info20":
				p_info = new Trubbish(Abilities.TANFO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info21":
				p_info = new Garbodor(Abilities.TANFO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info22":
				p_info = new Sigilyph(Abilities.SPLENDICUTE);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info23":
				p_info = new Yamask();
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info24":
				p_info = new Cofagrigus();
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info25":
				p_info = new Emolga(Abilities.STATICO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info26":
				p_info = new Joltik(Abilities.INSETTOCCHI);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info27":
				p_info = new Galvantula(Abilities.INSETTOCCHI);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info28":
				p_info = new Axew(Abilities.ANTAGONISMO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info29":
				p_info = new Fraxure(Abilities.ANTAGONISMO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info30":
				p_info = new Haxorus(Abilities.ANTAGONISMO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info31":
				p_info = new Heatmor(Abilities.VORACITA);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info32":
				p_info = new Durant(Abilities.AIUTINSETTO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info33":
				p_info = new Cryogonal();
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info34":
				p_info = new Tornadus(Abilities.BURLA);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info35":
				p_info = new Cobalion();
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info36":
				p_info = new Terrakion();
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info37":
				p_info = new Virizion();
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info38":
				p_info = new Stunfisk(Abilities.STATICO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info39":
				p_info = new Throh(Abilities.DENTISTRETTI);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info40":
				p_info = new Sawk(Abilities.VIGORE);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info41":
				p_info = new Bouffalant(Abilities.TEMERARIETA);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info42":
				p_info = new Druddigon(Abilities.CARTAVETRO);
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info43":
				p_info = new Reshiram();
				System.out.println(p_info.infos());
				flag = 1;
				break;
			case "info44":
				p_info = new Zekrom();
				System.out.println(p_info.infos());
				flag = 1;
				break;
			default:
				flag = 1;
				break;
		}
		return flag;
	}

	private int compareInputAI() {
		int flag = 0;
		switch(ch.toLowerCase()) {
			case "pag1":
				menuSceltaPokemon_AI();
				break;
			case "pag2":
				menuSceltaPokemon_due_AI();
			case "pag3":
				menuSceltaPokemon_tre_AI();
			case "0":
				p2 = new Victini();
				break;
			case "1":
				p2 = new Snivy(Abilities.ERBAIUTO);
				break;
			case "2":
				p2 = new Servine(Abilities.ERBAIUTO);
				break;
			case "3":
				p2 = new Serperior(Abilities.ERBAIUTO);
				break;
			case "4":
				p2 = new Tepig(Abilities.AIUTOFUOCO);
				break;
			case "5":
				p2 = new Pignite(Abilities.AIUTOFUOCO);
				break;
			case "6":
				p2 = new Emboar(Abilities.AIUTOFUOCO);
				break;
			case "7":
				p2 = new Oshawott(Abilities.ACQUAIUTO);
				break;
			case "8":
				p2 = new Dewott(Abilities.ACQUAIUTO);
				break;
			case "9":
				p2 = new Samurott(Abilities.ACQUAIUTO);
				break;
			case "10":
				p2 = new Patrat(Abilities.SGUARDOFERMO);
				break;
			case "11":
				p2 = new Watchog(Abilities.SGUARDOFERMO);
				break;
			case "12":
				p2 = new Purrloin(Abilities.SCIOLTEZZA);
				break;
			case "13":
				p2 = new Liepard(Abilities.SCIOLTEZZA);
				break;
			case "14":
				p2 = new Pansage(Abilities.VORACITA);
				break;
			case "15":
				p2 = new Simisage(Abilities.VORACITA);
				break;
			case "16":
				p2 = new Pansear(Abilities.VORACITA);
				break;
			case "17":
				p2 = new Simisear(Abilities.VORACITA);
				break;
			case "18":
				p2 = new Panpour(Abilities.VORACITA);
				break;
			case "19":
				p2 = new Simipour(Abilities.VORACITA);
				break;
			case "20":
				p2 = new Trubbish(Abilities.TANFO);
				break;
			case "21":
				p2 = new Garbodor(Abilities.TANFO);
				break;
			case "22":
				p2 = new Sigilyph(Abilities.SPLENDICUTE);
				break;
			case "23":
				p2 = new Yamask();
				break;
			case "24":
				p2 = new Cofagrigus();
				break;
			case "25":
				p2 = new Emolga(Abilities.STATICO);
				break;
			case "26":
				p2 = new Joltik(Abilities.INSETTOCCHI);
				break;
			case "27":
				p2 = new Galvantula(Abilities.INSETTOCCHI);
				break;
			case "28":
				p2 = new Axew(Abilities.ANTAGONISMO);
				break;
			case "29":
				p2 = new Fraxure(Abilities.ANTAGONISMO);
				break;
			case "30":
				p2 = new Haxorus(Abilities.ANTAGONISMO);
				break;
			case "31":
				p2 = new Heatmor(Abilities.VORACITA);
				break;
			case "32":
				p2 = new Durant(Abilities.AIUTINSETTO);
				break;
			case "33":
				p2 = new Cryogonal();
				break;
			case "34":
				p2 = new Tornadus(Abilities.BURLA);
				break;
			case "35":
				p2 = new Cobalion();
				break;
			case "36":
				p2 = new Terrakion();
				break;
			case "37":
				p2 = new Virizion();
				break;
			case "38":
				p2 = new Stunfisk(Abilities.STATICO);
				break;
			case "39":
				p2 = new Throh(Abilities.DENTISTRETTI);
				break;
			case "40":
				p2 = new Sawk(Abilities.VIGORE);
				break;
			case "41":
				p2 = new Bouffalant(Abilities.TEMERARIETA);
				break;
			case "42":
				p2 = new Druddigon(Abilities.CARTAVETRO);
				break;
			case "43":
				p2 = new Reshiram();
				break;
			case "44":
				p2 = new Zekrom();
				break;
			default:
				flag = 1;
				break;
		}
		return flag;
	}
	
	private void startGame() {
		System.out.println("Il tuo Pokèmon: " + p.getNome());
		System.out.println("Punti vita di " + p.getNome() + ": " + p.getHP());
		System.out.println("Il Pokèmon dell'AI: " + p2.getNome());
		System.out.println("Punti vita di " + p2.getNome() + ": " + p2.getHP());
		int move;
		while(p.getHP() > 0 && p2.getHP() > 0) {
			do {
				for(int i = 0; i < p.moves.size(); i++) {
					System.out.println("Premi " + i + " per usare " + p.moves.get(i).getNome());
				}
				move = scan.nextInt();
				System.out.println(p.getNome() + " ha usato " + p.moves.get(move).getNome() +"...");
			}while(move != 0 && move != 1 && move != 2 && move != 3);
			p.moves.get(move).enemyDamage(p, p2);
			if(p2.getHP() > 0) {
				System.out.println("Vita del pokèmon avversario: " + p2.getHP());
			}else {
				System.out.println("Vita del pokèmon avversario: 0");
				Alerts.pokemon_ko(p2);
				Alerts.win();
			}
			
			if(p2.getHP() > 0) {
				move = (int)(Math.random()*(p2.moves.size()+1));
				System.out.println(p2.getNome() + " ha usato " + p2.moves.get(move).getNome() +"...");
				p2.moves.get(move).enemyDamage(p2, p);
				if(p.getHP() > 0) {
					System.out.println("Vita del tuo pokèmon: " + p.getHP());
				}else {
					System.out.println("Vita del tuo pokèmon: 0");
					Alerts.pokemon_ko(p);
					Alerts.lose();
				}
			}
		}
		GameInterface.emptyLines();
		retry();
	}
	
	private void retry() {
		int scelta = 0;
		while(scelta != 1 && scelta != 2) {
			scelta = GameInterface.displayRetryMsg();	
		}
		if(scelta == 1) {
			GameInterface.emptyLines();
			GameInterface.introduzione();
			menuSceltaPokemon();
		}
	}
	
	public Game(){
		GameInterface.introduzione();
		menuSceltaPokemon();
	}
}
