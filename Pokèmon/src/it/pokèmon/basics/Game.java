package it.pokèmon.basics;

import it.pokèmon.basics.PokeInfos.InfoFrame;
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
	
	private void menuSceltaPokemon_quattro() {
		ch = GameInterface.displayPokèmon_quattro();
		if(compareInput() == 1) {
			menuSceltaPokemon_quattro();
		}else {
			menuSceltaPokemon_u_AI();
		}
	}
	
	private void menuSceltaPokemon_quattro_AI() {
		ch = GameInterface.displayPokèmon_quattro();
		if(compareInputAI() == 1) {
			menuSceltaPokemon_quattro_AI();
		}else {
			startGame();
		}
	}
	
	private void menuSceltaPokemon_cinque() {
		ch = GameInterface.displayPokèmon_cinque();
		if(compareInput() == 1) {
			menuSceltaPokemon_cinque();
		}else {
			menuSceltaPokemon_u_AI();
		}
	}
	
	private void menuSceltaPokemon_cinque_AI() {
		ch = GameInterface.displayPokèmon_cinque();
		if(compareInputAI() == 1) {
			menuSceltaPokemon_cinque_AI();
		}else {
			startGame();
		}
	}
	
	private void menuSceltaPokemon_sei() {
		ch = GameInterface.displayPokèmon_sei();
		if(compareInput() == 1) {
			menuSceltaPokemon_sei();
		}else {
			menuSceltaPokemon_u_AI();
		}
	}
	
	private void menuSceltaPokemon_sei_AI() {
		ch = GameInterface.displayPokèmon_sei();
		if(compareInputAI() == 1) {
			menuSceltaPokemon_sei_AI();
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
			case "pag4":
				menuSceltaPokemon_quattro();
				break;
			case "pag5":
				menuSceltaPokemon_cinque();
				break;
			case "pag6":
				menuSceltaPokemon_sei();
				break;
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
				p = new Lillipup(Abilities.SPIRITOVIVO);
				break;
			case "13":
				p = new Herdier(Abilities.PREPOTENZA);
				break;
			case "14":
				p = new Stoutland(Abilities.PREPOTENZA);
				break;
			case "15":
				p = new Purrloin(Abilities.SCIOLTEZZA);
				break;
			case "16":
				p = new Liepard(Abilities.SCIOLTEZZA);
				break;
			case "17":
				p = new Pansage(Abilities.VORACITA);
				break;
			case "18":
				p = new Simisage(Abilities.VORACITA);
				break;
			case "19":
				p = new Pansear(Abilities.VORACITA);
				break;
			case "20":
				p = new Simisear(Abilities.VORACITA);
				break;
			case "21":
				p = new Panpour(Abilities.VORACITA);
				break;
			case "22":
				p = new Simipour(Abilities.VORACITA);
				break;
			case "23":
				p = new Munna(Abilities.PREMONIZIONE);
				break;
			case "24":
				p = new Musharna(Abilities.PREMONIZIONE);
				break;
			case "25":
				p = new Pidove(Abilities.PETTINFUORI);
				break;
			case "26":
				p = new Tranquill(Abilities.PETTINFUORI);
				break;
			case "27":
				p = new Unfezant(Abilities.PETTINFUORI);
				break;
			case "28":
				p = new Blitzle(Abilities.PARAFULMINE);
				break;
			case "29":
				p = new Zebstrika(Abilities.PARAFULMINE);
				break;
			case "30":
				p = new Roggenrola(Abilities.VIGORE);
				break;
			case "31":
				p = new Boldore(Abilities.VIGORE);
				break;
			case "32":
				p = new Gigalith(Abilities.VIGORE);
				break;
			case "37":
				p = new Audino(Abilities.CURACUORE);
				break;
			case "44":
				p = new Throh(Abilities.DENTISTRETTI);
				break;
			case "45":
				p = new Sawk(Abilities.VIGORE);
				break;
			case "56":
				p = new Basculin(Abilities.TEMERARIETA);
				break;
			case "62":
				p = new Maractus(Abilities.ASSORBACQUA);
				break;
			case "67":
				p = new Sigilyph(Abilities.SPLENDICUTE);
				break;
			case "68":
				p = new Yamask();
				break;
			case "69":
				p = new Cofagrigus();
				break;
			case "74":
				p = new Trubbish(Abilities.TANFO);
				break;
			case "75":
				p = new Garbodor(Abilities.TANFO);
				break;
			case "93":
				p = new Emolga(Abilities.STATICO);
				break;
			case "100":
				p = new Alomomola(Abilities.CURACUORE);
				break;
			case "101":
				p = new Joltik(Abilities.INSETTOCCHI);
				break;
			case "102":
				p = new Galvantula(Abilities.INSETTOCCHI);
				break;
			case "116":
				p = new Axew(Abilities.ANTAGONISMO);
				break;
			case "117":
				p = new Fraxure(Abilities.ANTAGONISMO);
				break;
			case "118":
				p = new Haxorus(Abilities.ANTAGONISMO);
				break;
			case "121":
				p = new Cryogonal();
				break;
			case "124":
				p = new Stunfisk(Abilities.STATICO);
				break;
			case "125":
				p = new Mienfoo(Abilities.FORZA_INTERIORE);
				break;
			case "126":
				p = new Mienshao(Abilities.FORZA_INTERIORE);
				break;
			case "127":
				p = new Druddigon(Abilities.CARTAVETRO);
				break;
			case "128":
				p = new Golett(Abilities.FERROPUGNO);
				break;
			case "129":
				p = new Golurk(Abilities.FERROPUGNO);
				break;
			case "130":
				p = new Pawniard(Abilities.AGONISMO);
				break;
			case "131":
				p = new Bisharp(Abilities.AGONISMO);
				break;
			case "132":
				p = new Bouffalant(Abilities.TEMERARIETA);
				break;
			case "133":
				p = new Rufflet(Abilities.SGUARDOFERMO);
				break;
			case "134":
				p = new Braviary(Abilities.SGUARDOFERMO);
				break;
			case "135":
				p = new Vullaby(Abilities.PETTINFUORI);
				break;
			case "136":
				p = new Mandibuzz(Abilities.PETTINFUORI);
				break;
			case "137":
				p = new Heatmor(Abilities.VORACITA);
				break;
			case "138":
				p = new Durant(Abilities.AIUTINSETTO);
				break;
			case "139":
				p = new Deino();
				break;
			case "140":
				p = new Zweilous();
				break;
			case "141":
				p = new Hydreigon();
				break;
			case "142":
				p = new Larvesta(Abilities.CORPODIFUOCO);
				break;
			case "143":
				p = new Volcarona(Abilities.CORPODIFUOCO);
				break;
			case "144":
				p = new Cobalion();
				break;
			case "145":
				p = new Terrakion();
				break;
			case "146":
				p = new Virizion();
				break;
			case "147":
				p = new Tornadus(Abilities.BURLA);
				break;
			case "148":
				p = new Thundurus(Abilities.BURLA);
				break;
			case "149":
				p = new Reshiram();
				break;
			case "150":
				p = new Zekrom();
				break;
			case "151":
				p = new Landorus(Abilities.SILICOFORZA);
				break;
			case "152":
				p = new Kyurem();
				break;
			case "153":
				p = new Keldeo();
				break;
			case "154":
				p = new Meloetta();
				break;
			case "155":
				p = new Genesect();
				break;
			case "info0":
				new InfoFrame(new Victini());
				flag = 1;
				break;
			case "info1":
				new InfoFrame(new Snivy(Abilities.ERBAIUTO));
				flag = 1;
				break;
			case "info2":
				new InfoFrame(new Servine(Abilities.ERBAIUTO));
				flag = 1;
				break;
			case "info3":
				new InfoFrame(new Serperior(Abilities.ERBAIUTO));
				flag = 1;
				break;
			case "info4":
				new InfoFrame(new Tepig(Abilities.AIUTOFUOCO));
				flag = 1;
				break;
			case "info5":
				new InfoFrame(new Pignite(Abilities.AIUTOFUOCO));
				flag = 1;
				break;
			case "info6":
				new InfoFrame(new Emboar(Abilities.AIUTOFUOCO));
				flag = 1;
				break;
			case "info7":
				new InfoFrame(new Oshawott(Abilities.ACQUAIUTO));
				flag = 1;
				break;
			case "info8":
				new InfoFrame(new Dewott(Abilities.ACQUAIUTO));
				flag = 1;
				break;
			case "info9":
				new InfoFrame(new Samurott(Abilities.ACQUAIUTO));
				flag = 1;
				break;
			case "info10":
				new InfoFrame(new Patrat(Abilities.SGUARDOFERMO));
				flag = 1;
				flag = 1;
				break;
			case "info11":
				new InfoFrame(new Watchog(Abilities.SGUARDOFERMO));
				flag = 1;
				flag = 1;
				break;
			case "info12":
				new InfoFrame(new Lillipup(Abilities.SPIRITOVIVO));
				flag = 1;
				break;
			case "info13":
				new InfoFrame(new Herdier(Abilities.PREPOTENZA));
				flag = 1;
				break;
			case "info14":
				new InfoFrame(new Stoutland(Abilities.PREPOTENZA));
				flag = 1;
				break;
			case "info15":
				new InfoFrame(new Purrloin(Abilities.SCIOLTEZZA));
				flag = 1;
				break;
			case "info16":
				new InfoFrame(new Liepard(Abilities.SCIOLTEZZA));
				flag = 1;
				break;
			case "info17":
				new InfoFrame(new Pansage(Abilities.VORACITA));
				flag = 1;
				break;
			case "info18":
				new InfoFrame(new Simisage(Abilities.VORACITA));
				flag = 1;
				break;
			case "info19":
				new InfoFrame(new Pansear(Abilities.VORACITA));
				flag = 1;
				break;
			case "info20":
				new InfoFrame(new Simisear(Abilities.VORACITA));
				flag = 1;
				break;
			case "info21":
				new InfoFrame(new Panpour(Abilities.VORACITA));
				flag = 1;
				break;
			case "info22":
				new InfoFrame(new Simipour(Abilities.VORACITA));
				flag = 1;
				break;
			case "info23":
				new InfoFrame(new Munna(Abilities.PREMONIZIONE));
				flag = 1;
				break;
			case "info24":
				new InfoFrame(new Musharna(Abilities.PREMONIZIONE));
				flag = 1;
				break;
			case "info25":
				new InfoFrame(new Pidove(Abilities.PETTINFUORI));
				flag = 1;
				break;
			case "info26":
				new InfoFrame(new Tranquill(Abilities.PETTINFUORI));
				flag = 1;
				break;
			case "info27":
				new InfoFrame(new Unfezant(Abilities.PETTINFUORI));
				flag = 1;
				break;
			case "info28":
				new InfoFrame(new Blitzle(Abilities.PARAFULMINE));
				flag = 1;
				break;
			case "info29":
				new InfoFrame(new Zebstrika(Abilities.PARAFULMINE));
				flag = 1;
				break;
			case "info30":
				new InfoFrame(new Roggenrola(Abilities.VIGORE));
				flag = 1;
				break;
			case "info31":
				new InfoFrame(new Boldore(Abilities.VIGORE));
				flag = 1;
				break;
			case "info32":
				new InfoFrame(new Gigalith(Abilities.VIGORE));
				flag = 1;
			case "info37":
				new InfoFrame(new Audino(Abilities.CURACUORE));
				flag = 1;
				break;
			case "info44":
				new InfoFrame(new Throh(Abilities.DENTISTRETTI));
				flag = 1;
				break;
			case "info45":
				new InfoFrame(new Sawk(Abilities.VIGORE));
				flag = 1;
				break;
			case "info56":
				new InfoFrame(new Basculin(Abilities.TEMERARIETA));
				flag = 1;
				break;
			case "info62":
				new InfoFrame(new Maractus(Abilities.ASSORBACQUA));
				flag = 1;
				break;
			case "info67":
				new InfoFrame(new Sigilyph(Abilities.SPLENDICUTE));
				flag = 1;
				break;
			case "info68":
				new InfoFrame(new Yamask());
				flag = 1;
				break;
			case "info69":
				new InfoFrame(new Cofagrigus());
				flag = 1;
				break;
			case "info93":
				new InfoFrame(new Emolga(Abilities.STATICO));
				flag = 1;
				break;
			case "info100":
				new InfoFrame(new Alomomola(Abilities.CURACUORE));
				flag = 1;
				break;
			case "info101":
				new InfoFrame(new Joltik(Abilities.INSETTOCCHI));
				flag = 1;
				break;
			case "info102":
				new InfoFrame(new Galvantula(Abilities.INSETTOCCHI));
				flag = 1;
				break;
			case "info116":
				new InfoFrame(new Axew(Abilities.ANTAGONISMO));
				flag = 1;
				break;
			case "info117":
				new InfoFrame(new Fraxure(Abilities.ANTAGONISMO));
				flag = 1;
				break;
			case "info118":
				new InfoFrame(new Haxorus(Abilities.ANTAGONISMO));
				flag = 1;
				break;
			case "info121":
				new InfoFrame(new Cryogonal());
				flag = 1;
				break;
			case "info124":
				new InfoFrame(new Stunfisk(Abilities.STATICO));
				flag = 1;
				break;
			case "info125":
				new InfoFrame(new Mienfoo(Abilities.FORZA_INTERIORE));
				flag = 1;
				break;
			case "info126":
				new InfoFrame(new Mienshao(Abilities.FORZA_INTERIORE));
				flag = 1;
				break;
			case "info127":
				new InfoFrame(new Druddigon(Abilities.CARTAVETRO));
				flag = 1;
				break;
			case "info128":
				new InfoFrame(new Golett(Abilities.FERROPUGNO));
				flag = 1;
				break;
			case "info129":
				new InfoFrame(new Golurk(Abilities.FERROPUGNO));
				flag = 1;
				break;
			case "info130":
				new InfoFrame(new Pawniard(Abilities.AGONISMO));
				flag = 1;
				break;
			case "info131":
				new InfoFrame(new Bisharp(Abilities.AGONISMO));
				flag = 1;
				break;
			case "info132":
				new InfoFrame(new Bouffalant(Abilities.TEMERARIETA));
				flag = 1;
				break;
			case "info133":
				new InfoFrame(new Rufflet(Abilities.SGUARDOFERMO));
				flag = 1;
				break;
			case "info134":
				new InfoFrame(new Braviary(Abilities.SGUARDOFERMO));
				flag = 1;
				break;
			case "info135":
				new InfoFrame(new Vullaby(Abilities.PETTINFUORI));
				flag = 1;
				break;
			case "info136":
				new InfoFrame(new Mandibuzz(Abilities.PETTINFUORI));
				flag = 1;
				break;
			case "info137":
				new InfoFrame(new Heatmor(Abilities.VORACITA));
				flag = 1;
				break;
			case "info138":
				new InfoFrame(new Durant(Abilities.AIUTINSETTO));
				flag = 1;
				break;
			case "info139":
				new InfoFrame(new Deino());
				flag = 1;
				break;
			case "info140":
				new InfoFrame(new Zweilous());
				flag = 1;
				break;
			case "info141":
				new InfoFrame(new Hydreigon());
				flag = 1;
				break;
			case "info142":
				new InfoFrame(new Larvesta(Abilities.CORPODIFUOCO));
				flag = 1;
				break;
			case "info143":
				new InfoFrame(new Volcarona(Abilities.CORPODIFUOCO));
				flag = 1;
				break;
			case "info144":
				new InfoFrame(new Cobalion());
				flag = 1;
				break;
			case "info145":
				new InfoFrame(new Terrakion());
				flag = 1;
				break;
			case "info146":
				new InfoFrame(new Virizion());
				flag = 1;
				break;
			case "info147":
				new InfoFrame(new Tornadus(Abilities.BURLA));
				flag = 1;
				break;
			case "info148":
				new InfoFrame(new Thundurus(Abilities.BURLA));
				flag = 1;
				break;
			case "info149":
				new InfoFrame(new Reshiram());
				flag = 1;
				break;
			case "info150":
				new InfoFrame(new Zekrom());
				flag = 1;
				break;
			case "info151":
				new InfoFrame(new Landorus(Abilities.SILICOFORZA));
				flag = 1;
				break;
			case "info152":
				new InfoFrame(new Kyurem());
				flag = 1;
				break;
			case "info153":
				new InfoFrame(new Keldeo());
				flag = 1;
				break;
			case "info154":
				new InfoFrame(new Meloetta());
				flag = 1;
				break;
			case "info155":
				new InfoFrame(new Genesect());
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
				break;
			case "pag3":
				menuSceltaPokemon_tre_AI();
				break;
			case "pag4":
				menuSceltaPokemon_quattro_AI();
				break;
			case "pag5":
				menuSceltaPokemon_cinque_AI();
				break;
			case "pag6":
				menuSceltaPokemon_sei_AI();
				break;
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
				p2 = new Lillipup(Abilities.SPIRITOVIVO);
				break;
			case "13":
				p2 = new Herdier(Abilities.PREPOTENZA);
				break;
			case "14":
				p2 = new Stoutland(Abilities.PREPOTENZA);
				break;
			case "15":
				p2 = new Purrloin(Abilities.SCIOLTEZZA);
				break;
			case "16":
				p2 = new Liepard(Abilities.SCIOLTEZZA);
				break;
			case "17":
				p2 = new Pansage(Abilities.VORACITA);
				break;
			case "18":
				p2 = new Simisage(Abilities.VORACITA);
				break;
			case "19":
				p2 = new Pansear(Abilities.VORACITA);
				break;
			case "20":
				p2 = new Simisear(Abilities.VORACITA);
				break;
			case "21":
				p2 = new Panpour(Abilities.VORACITA);
				break;
			case "22":
				p2 = new Simipour(Abilities.VORACITA);
				break;
			case "23":
				p2 = new Munna(Abilities.PREMONIZIONE);
				break;
			case "24":
				p2 = new Musharna(Abilities.PREMONIZIONE);
				break;
			case "25":
				p2 = new Pidove(Abilities.PETTINFUORI);
				break;
			case "26":
				p2 = new Tranquill(Abilities.PETTINFUORI);
				break;
			case "27":
				p2 = new Unfezant(Abilities.PETTINFUORI);
				break;
			case "28":
				p2 = new Blitzle(Abilities.PARAFULMINE);
				break;
			case "29":
				p2 = new Zebstrika(Abilities.PARAFULMINE);
				break;
			case "30":
				p = new Roggenrola(Abilities.VIGORE);
				break;
			case "31":
				p = new Boldore(Abilities.VIGORE);
				break;
			case "32":
				p = new Gigalith(Abilities.VIGORE);
				break;
			case "37":
				p2 = new Audino(Abilities.CURACUORE);
				break;
			case "44":
				p2 = new Throh(Abilities.DENTISTRETTI);
				break;
			case "45":
				p2 = new Sawk(Abilities.VIGORE);
				break;
			case "56":
				p2 = new Basculin(Abilities.TEMERARIETA);
				break;
			case "62":
				p2 = new Maractus(Abilities.ASSORBACQUA);
				break;
			case "67":
				p2 = new Sigilyph(Abilities.SPLENDICUTE);
				break;
			case "68":
				p2 = new Yamask();
				break;
			case "69":
				p2 = new Cofagrigus();
				break;
			case "74":
				p2 = new Trubbish(Abilities.TANFO);
				break;
			case "75":
				p2 = new Garbodor(Abilities.TANFO);
				break;
			case "93":
				p2 = new Emolga(Abilities.STATICO);
				break;
			case "100":
				p2 = new Alomomola(Abilities.CURACUORE);
				break;
			case "101":
				p2 = new Joltik(Abilities.INSETTOCCHI);
				break;
			case "102":
				p2 = new Galvantula(Abilities.INSETTOCCHI);
				break;
			case "116":
				p2 = new Axew(Abilities.ANTAGONISMO);
				break;
			case "117":
				p2 = new Fraxure(Abilities.ANTAGONISMO);
				break;
			case "118":
				p2 = new Haxorus(Abilities.ANTAGONISMO);
				break;
			case "121":
				p2 = new Cryogonal();
				break;
			case "124":
				p2 = new Stunfisk(Abilities.STATICO);
				break;
			case "125":
				p2 = new Mienfoo(Abilities.FORZA_INTERIORE);
				break;
			case "126":
				p2 = new Mienshao(Abilities.FORZA_INTERIORE);
				break;
			case "127":
				p2 = new Druddigon(Abilities.CARTAVETRO);
				break;
			case "128":
				p2 = new Golett(Abilities.FERROPUGNO);
				break;
			case "129":
				p2 = new Golurk(Abilities.FERROPUGNO);
				break;
			case "130":
				p2 = new Pawniard(Abilities.AGONISMO);
				break;
			case "131":
				p2 = new Bisharp(Abilities.AGONISMO);
				break;
			case "132":
				p2 = new Bouffalant(Abilities.TEMERARIETA);
				break;
			case "133":
				p2 = new Rufflet(Abilities.SGUARDOFERMO);
				break;
			case "134":
				p2 = new Braviary(Abilities.SGUARDOFERMO);
				break;
			case "135":
				p2 = new Vullaby(Abilities.PETTINFUORI);
				break;
			case "136":
				p2 = new Mandibuzz(Abilities.PETTINFUORI);
				break;
			case "137":
				p2 = new Heatmor(Abilities.VORACITA);
				break;
			case "138":
				p2 = new Durant(Abilities.AIUTINSETTO);
				break;
			case "139":
				p2 = new Deino();
				break;
			case "140":
				p2 = new Zweilous();
				break;
			case "141":
				p2 = new Hydreigon();
				break;
			case "142":
				p2 = new Larvesta(Abilities.CORPODIFUOCO);
				break;
			case "143":
				p2 = new Volcarona(Abilities.CORPODIFUOCO);
				break;
			case "144":
				p2 = new Cobalion();
				break;
			case "145":
				p2 = new Terrakion();
				break;
			case "146":
				p2 = new Virizion();
				break;
			case "147":
				p2 = new Tornadus(Abilities.BURLA);
				break;
			case "148":
				p2 = new Thundurus(Abilities.BURLA);
				break;
			case "149":
				p2 = new Reshiram();
				break;
			case "150":
				p2 = new Zekrom();
				break;
			case "151":
				p2 = new Landorus(Abilities.SILICOFORZA);
				break;
			case "152":
				p2 = new Kyurem();
				break;
			case "153":
				p2 = new Keldeo();
				break;
			case "154":
				p2 = new Meloetta();
				break;
			case "155":
				p2 = new Genesect();
				break;
			case "info0":
				new InfoFrame(new Victini());
				flag = 1;
				break;
			case "info1":
				new InfoFrame(new Snivy(Abilities.ERBAIUTO));
				flag = 1;
				break;
			case "info2":
				new InfoFrame(new Servine(Abilities.ERBAIUTO));
				flag = 1;
				break;
			case "info3":
				new InfoFrame(new Serperior(Abilities.ERBAIUTO));
				flag = 1;
				break;
			case "info4":
				new InfoFrame(new Tepig(Abilities.AIUTOFUOCO));
				flag = 1;
				break;
			case "info5":
				new InfoFrame(new Pignite(Abilities.AIUTOFUOCO));
				flag = 1;
				break;
			case "info6":
				new InfoFrame(new Emboar(Abilities.AIUTOFUOCO));
				flag = 1;
				break;
			case "info7":
				new InfoFrame(new Oshawott(Abilities.ACQUAIUTO));
				flag = 1;
				break;
			case "info8":
				new InfoFrame(new Dewott(Abilities.ACQUAIUTO));
				flag = 1;
				break;
			case "info9":
				new InfoFrame(new Samurott(Abilities.ACQUAIUTO));
				flag = 1;
				break;
			case "info10":
				new InfoFrame(new Patrat(Abilities.SGUARDOFERMO));
				flag = 1;
				flag = 1;
				break;
			case "info11":
				new InfoFrame(new Watchog(Abilities.SGUARDOFERMO));
				flag = 1;
				flag = 1;
				break;
			case "info12":
				new InfoFrame(new Lillipup(Abilities.SPIRITOVIVO));
				flag = 1;
				break;
			case "info13":
				new InfoFrame(new Herdier(Abilities.PREPOTENZA));
				flag = 1;
				break;
			case "info14":
				new InfoFrame(new Stoutland(Abilities.PREPOTENZA));
				flag = 1;
				break;
			case "info15":
				new InfoFrame(new Purrloin(Abilities.SCIOLTEZZA));
				flag = 1;
				break;
			case "info16":
				new InfoFrame(new Liepard(Abilities.SCIOLTEZZA));
				flag = 1;
				break;
			case "info17":
				new InfoFrame(new Pansage(Abilities.VORACITA));
				flag = 1;
				break;
			case "info18":
				new InfoFrame(new Simisage(Abilities.VORACITA));
				flag = 1;
				break;
			case "info19":
				new InfoFrame(new Pansear(Abilities.VORACITA));
				flag = 1;
				break;
			case "info20":
				new InfoFrame(new Simisear(Abilities.VORACITA));
				flag = 1;
				break;
			case "info21":
				new InfoFrame(new Panpour(Abilities.VORACITA));
				flag = 1;
				break;
			case "info22":
				new InfoFrame(new Simipour(Abilities.VORACITA));
				flag = 1;
				break;
			case "info23":
				new InfoFrame(new Munna(Abilities.PREMONIZIONE));
				flag = 1;
				break;
			case "info24":
				new InfoFrame(new Musharna(Abilities.PREMONIZIONE));
				flag = 1;
				break;
			case "info25":
				new InfoFrame(new Pidove(Abilities.PETTINFUORI));
				flag = 1;
				break;
			case "info26":
				new InfoFrame(new Tranquill(Abilities.PETTINFUORI));
				flag = 1;
				break;
			case "info27":
				new InfoFrame(new Unfezant(Abilities.PETTINFUORI));
				flag = 1;
				break;
			case "info28":
				new InfoFrame(new Blitzle(Abilities.PARAFULMINE));
				flag = 1;
				break;
			case "info29":
				new InfoFrame(new Zebstrika(Abilities.PARAFULMINE));
				flag = 1;
				break;
			case "info30":
				new InfoFrame(new Roggenrola(Abilities.VIGORE));
				flag = 1;
				break;
			case "info31":
				new InfoFrame(new Boldore(Abilities.VIGORE));
				flag = 1;
				break;
			case "info32":
				new InfoFrame(new Gigalith(Abilities.VIGORE));
				flag = 1;
			case "info37":
				new InfoFrame(new Audino(Abilities.CURACUORE));
				flag = 1;
				break;
			case "info44":
				new InfoFrame(new Throh(Abilities.DENTISTRETTI));
				flag = 1;
				break;
			case "info45":
				new InfoFrame(new Sawk(Abilities.VIGORE));
				flag = 1;
				break;
			case "info56":
				new InfoFrame(new Basculin(Abilities.TEMERARIETA));
				flag = 1;
				break;
			case "info62":
				new InfoFrame(new Maractus(Abilities.ASSORBACQUA));
				flag = 1;
				break;
			case "info67":
				new InfoFrame(new Sigilyph(Abilities.SPLENDICUTE));
				flag = 1;
				break;
			case "info68":
				new InfoFrame(new Yamask());
				flag = 1;
				break;
			case "info69":
				new InfoFrame(new Cofagrigus());
				flag = 1;
				break;
			case "info93":
				new InfoFrame(new Emolga(Abilities.STATICO));
				flag = 1;
				break;
			case "info100":
				new InfoFrame(new Alomomola(Abilities.CURACUORE));
				flag = 1;
				break;
			case "info101":
				new InfoFrame(new Joltik(Abilities.INSETTOCCHI));
				flag = 1;
				break;
			case "info102":
				new InfoFrame(new Galvantula(Abilities.INSETTOCCHI));
				flag = 1;
				break;
			case "info116":
				new InfoFrame(new Axew(Abilities.ANTAGONISMO));
				flag = 1;
				break;
			case "info117":
				new InfoFrame(new Fraxure(Abilities.ANTAGONISMO));
				flag = 1;
				break;
			case "info118":
				new InfoFrame(new Haxorus(Abilities.ANTAGONISMO));
				flag = 1;
				break;
			case "info121":
				new InfoFrame(new Cryogonal());
				flag = 1;
				break;
			case "info124":
				new InfoFrame(new Stunfisk(Abilities.STATICO));
				flag = 1;
				break;
			case "info125":
				new InfoFrame(new Mienfoo(Abilities.FORZA_INTERIORE));
				flag = 1;
				break;
			case "info126":
				new InfoFrame(new Mienshao(Abilities.FORZA_INTERIORE));
				flag = 1;
				break;
			case "info127":
				new InfoFrame(new Druddigon(Abilities.CARTAVETRO));
				flag = 1;
				break;
			case "info128":
				new InfoFrame(new Golett(Abilities.FERROPUGNO));
				flag = 1;
				break;
			case "info129":
				new InfoFrame(new Golurk(Abilities.FERROPUGNO));
				flag = 1;
				break;
			case "info130":
				new InfoFrame(new Pawniard(Abilities.AGONISMO));
				flag = 1;
				break;
			case "info131":
				new InfoFrame(new Bisharp(Abilities.AGONISMO));
				flag = 1;
				break;
			case "info132":
				new InfoFrame(new Bouffalant(Abilities.TEMERARIETA));
				flag = 1;
				break;
			case "info133":
				new InfoFrame(new Rufflet(Abilities.SGUARDOFERMO));
				flag = 1;
				break;
			case "info134":
				new InfoFrame(new Braviary(Abilities.SGUARDOFERMO));
				flag = 1;
				break;
			case "info135":
				new InfoFrame(new Vullaby(Abilities.PETTINFUORI));
				flag = 1;
				break;
			case "info136":
				new InfoFrame(new Mandibuzz(Abilities.PETTINFUORI));
				flag = 1;
				break;
			case "info137":
				new InfoFrame(new Heatmor(Abilities.VORACITA));
				flag = 1;
				break;
			case "info138":
				new InfoFrame(new Durant(Abilities.AIUTINSETTO));
				flag = 1;
				break;
			case "info139":
				new InfoFrame(new Deino());
				flag = 1;
				break;
			case "info140":
				new InfoFrame(new Zweilous());
				flag = 1;
				break;
			case "info141":
				new InfoFrame(new Hydreigon());
				flag = 1;
				break;
			case "info142":
				new InfoFrame(new Larvesta(Abilities.CORPODIFUOCO));
				flag = 1;
				break;
			case "info143":
				new InfoFrame(new Volcarona(Abilities.CORPODIFUOCO));
				flag = 1;
				break;
			case "info144":
				new InfoFrame(new Cobalion());
				flag = 1;
				break;
			case "info145":
				new InfoFrame(new Terrakion());
				flag = 1;
				break;
			case "info146":
				new InfoFrame(new Virizion());
				flag = 1;
				break;
			case "info147":
				new InfoFrame(new Tornadus(Abilities.BURLA));
				flag = 1;
				break;
			case "info148":
				new InfoFrame(new Thundurus(Abilities.BURLA));
				flag = 1;
				break;
			case "info149":
				new InfoFrame(new Reshiram());
				flag = 1;
				break;
			case "info150":
				new InfoFrame(new Zekrom());
				flag = 1;
				break;
			case "info151":
				new InfoFrame(new Landorus(Abilities.SILICOFORZA));
				flag = 1;
				break;
			case "info152":
				new InfoFrame(new Kyurem());
				flag = 1;
				break;
			case "info153":
				new InfoFrame(new Keldeo());
				flag = 1;
				break;
			case "info154":
				new InfoFrame(new Meloetta());
				flag = 1;
				break;
			case "info155":
				new InfoFrame(new Genesect());
				flag = 1;
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
				switch(p2.moves.size()) {
					case 1:
						System.out.println(p2.getNome() + " ha usato " + p2.moves.get(0).getNome() +"...");
						p2.moves.get(0).enemyDamage(p2, p);
						if(p.getHP() > 0) {
							System.out.println("Vita del tuo pokèmon: " + p.getHP());
						}else {
							System.out.println("Vita del tuo pokèmon: 0");
							Alerts.pokemon_ko(p);
							Alerts.lose();
						}
						break;
					default:
						move = (int)(Math.random()*(p2.moves.size()));
						System.out.println(p2.getNome() + " ha usato " + p2.moves.get(move).getNome() +"...");
						p2.moves.get(move).enemyDamage(p2, p);
						if(p.getHP() > 0) {
							System.out.println("Vita del tuo pokèmon: " + p.getHP());
						}else {
							System.out.println("Vita del tuo pokèmon: 0");
							Alerts.pokemon_ko(p);
							Alerts.lose();
						}
						break;
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
