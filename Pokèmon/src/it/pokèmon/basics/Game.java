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
			case "33":
				p = new Woobat(Abilities.IMPRUDENZA);
				break;
			case "34":
				p = new Swoobat(Abilities.IMPRUDENZA);
				break;
			case "35":
				p = new Drilbur(Abilities.REMASABBIA);
				break;
			case "36":
				p = new Excadrill(Abilities.REMASABBIA);
				break;
			case "37":
				p = new Audino(Abilities.CURACUORE);
				break;
			case "38":
				p = new Timburr(Abilities.DENTISTRETTI);
				break;
			case "39":
				p = new Gurdurr(Abilities.DENTISTRETTI);
				break;
			case "40":
				p = new Conkeldurr(Abilities.DENTISTRETTI);
				break;
			case "41":
				p = new Tympole(Abilities.NUOTOVELOX);
				break;
			case "42":
				p = new Palpitoad(Abilities.NUOTOVELOX);
				break;
			case "43":
				p = new Seismitoad(Abilities.NUOTOVELOX);
				break;
			case "44":
				p = new Throh(Abilities.DENTISTRETTI);
				break;
			case "45":
				p = new Sawk(Abilities.VIGORE);
				break;
			case "46":
				p = new Sewaddle(Abilities.AIUTINSETTO);
				break;
			case "47":
				p = new Swadloon(Abilities.FOGLIAMANTO);
				break;
			case "48":
				p = new Leavanny(Abilities.AIUTINSETTO);
				break;
			case "49":
				p = new Venipede(Abilities.VELENOPUNTE);
				break;
			case "50":
				p = new Whirlipede(Abilities.VELENOPUNTE);
				break;
			case "51":
				p = new Scolipede(Abilities.VELENOPUNTE);
				break;
			case "52":
				p = new Cottonee(Abilities.BURLA);
				break;
			case "53":
				p = new Whimsicott(Abilities.BURLA);
				break;
			case "54":
				p = new Petilil(Abilities.CLOROFILLA);
				break;
			case "55":
				p = new Lilligant(Abilities.CLOROFILLA);
				break;
			case "56":
				p = new Basculin(Abilities.TEMERARIETA);
				break;
			case "57":
				p = new Sandile(Abilities.PREPOTENZA);
				break;
			case "58":
				p = new Krokorok(Abilities.PREPOTENZA);
				break;
			case "59":
				p = new Krookodile(Abilities.PREPOTENZA);
				break;
			case "60":
				p = new Darumaka(Abilities.TUTTAFRETTA);
				break;
			case "61":
				p = new Darmanitan(Abilities.FORZABRUTA);
				break;
			case "62":
				p = new Maractus(Abilities.ASSORBACQUA);
				break;
			case "63":
				p = new Dwebble(Abilities.VIGORE);
				break;
			case "64":
				p = new Crustle(Abilities.VIGORE);
				break;
			case "65":
				p = new Scraggy(Abilities.MUTA);
				break;
			case "66":
				p = new Scrafty(Abilities.MUTA);
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
			case "70":
				p = new Tirtouga(Abilities.SOLIDROCCIA);
				break;
			case "71":
				p = new Carracosta(Abilities.SOLIDROCCIA);
				break;
			case "72":
				p = new Archen();
				break;
			case "73":
				p = new Archeops();
				break;
			case "74":
				p = new Trubbish(Abilities.TANFO);
				break;
			case "75":
				p = new Garbodor(Abilities.TANFO);
				break;
			case "76":
				p = new Zorua();
				break;
			case "77":
				p = new Zoroark();
				break;
			case "78":
				p = new Minccino(Abilities.INCANTEVOLE);
				break;
			case "79":
				p = new Cinccino(Abilities.INCANTEVOLE);
				break;
			case "80":
				p = new Gothita(Abilities.INDAGINE);
				break;
			case "81":
				p = new Gothorita(Abilities.INDAGINE);
				break;
			case "82":
				p = new Gothitelle(Abilities.INDAGINE);
				break;
			case "93":
				p = new Emolga(Abilities.STATICO);
				break;
			case "94":
				p = new Karrablast(Abilities.AIUTINSETTO);
				break;
			case "95":
				p = new Escavalier(Abilities.AIUTINSETTO);
				break;
			case "96":
				p = new Foongus(Abilities.SPARGISPORA);
				break;
			case "97":
				p = new Amoonguss(Abilities.SPARGISPORA);
				break;
			case "98":
				p = new Frillish(Abilities.ASSORBACQUA);
				break;
			case "99":
				p = new Jellicent(Abilities.ASSORBACQUA);
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
			case "119":
				p = new Cubchoo(Abilities.MANTELNEVE);
				break;
			case "120":
				p = new Beartic(Abilities.MANTELNEVE);
				break;
			case "121":
				p = new Cryogonal();
				break;
			case "122":
				p = new Shelmet(Abilities.IDRATAZIONE);
				break;
			case "123":
				p = new Accelgor(Abilities.IDRATAZIONE);
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
				break;
			case "info33":
				new InfoFrame(new Woobat(Abilities.IMPRUDENZA));
				flag = 1;
				break;
			case "info34":
				new InfoFrame(new Swoobat(Abilities.IMPRUDENZA));
				flag = 1;
				break;
			case "info35":
				new InfoFrame(new Drilbur(Abilities.REMASABBIA));
				flag = 1;
				break;
			case "info36":
				new InfoFrame(new Excadrill(Abilities.REMASABBIA));
				flag = 1;
				break;
			case "info37":
				new InfoFrame(new Audino(Abilities.CURACUORE));
				flag = 1;
				break;
			case "info38":
				new InfoFrame(new Timburr(Abilities.DENTISTRETTI));
				flag = 1;
				break;
			case "info39":
				new InfoFrame(new Gurdurr(Abilities.DENTISTRETTI));
				flag = 1;
				break;
			case "info40":
				new InfoFrame(new Conkeldurr(Abilities.DENTISTRETTI));
				flag = 1;
				break;
			case "info41":
				new InfoFrame(new Tympole(Abilities.NUOTOVELOX));
				flag = 1;
				break;
			case "info42":
				new InfoFrame(new Palpitoad(Abilities.NUOTOVELOX));
				flag = 1;
				break;
			case "info43":
				new InfoFrame(new Seismitoad(Abilities.NUOTOVELOX));
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
			case "info46":
				new InfoFrame(new Sewaddle(Abilities.AIUTINSETTO));
				flag = 1;
				break;
			case "info47":
				new InfoFrame(new Swadloon(Abilities.FOGLIAMANTO));
				flag = 1;
				break;
			case "info48":
				new InfoFrame(new Leavanny(Abilities.AIUTINSETTO));
				flag = 1;
				break;
			case "info49":
				new InfoFrame(new Venipede(Abilities.VELENOPUNTE));
				flag = 1;
				break;
			case "info50":
				new InfoFrame(new Whirlipede(Abilities.VELENOPUNTE));
				flag = 1;
				break;
			case "info51":
				new InfoFrame(new Scolipede(Abilities.VELENOPUNTE));
				flag = 1;
				break;
			case "info52":
				new InfoFrame(new Cottonee(Abilities.BURLA));
				flag = 1;
				break;
			case "info53":
				new InfoFrame(new Whimsicott(Abilities.BURLA));
				flag = 1;
				break;
			case "info54":
				new InfoFrame(new Petilil(Abilities.CLOROFILLA));
				flag = 1;
				break;
			case "info55":
				new InfoFrame(new Lilligant(Abilities.CLOROFILLA));
				flag = 1;
				break;
			case "info56":
				new InfoFrame(new Basculin(Abilities.TEMERARIETA));
				flag = 1;
				break;
			case "info57":
				new InfoFrame(new Sandile(Abilities.PREPOTENZA));
				flag = 1;
				break;
			case "info58":
				new InfoFrame(new Krokorok(Abilities.PREPOTENZA));
				flag = 1;
				break;
			case "info59":
				new InfoFrame(new Krookodile(Abilities.PREPOTENZA));
				flag = 1;
				break;
			case "info60":
				new InfoFrame(new Darumaka(Abilities.TUTTAFRETTA));
				flag = 1;
				break;
			case "info61":
				new InfoFrame(new Darmanitan(Abilities.FORZABRUTA));
				flag = 1;
				break;
			case "info62":
				new InfoFrame(new Maractus(Abilities.ASSORBACQUA));
				flag = 1;
				break;
			case "info63":
				new InfoFrame(new Dwebble(Abilities.VIGORE));
				flag = 1;
				break;
			case "info64":
				new InfoFrame(new Crustle(Abilities.VIGORE));
				flag = 1;
				break;
			case "info65":
				new InfoFrame(new Scraggy(Abilities.MUTA));
				flag = 1;
				break;
			case "info66":
				new InfoFrame(new Scrafty(Abilities.MUTA));
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
			case "info70":
				new InfoFrame(new Tirtouga(Abilities.SOLIDROCCIA));
				flag = 1;
				break;
			case "info71":
				new InfoFrame(new Carracosta(Abilities.SOLIDROCCIA));
				flag = 1;
				break;
			case "info72":
				new InfoFrame(new Archen());
				flag = 1;
				break;
			case "info73":
				new InfoFrame(new Archeops());
				flag = 1;
				break;
			case "info74":
				new InfoFrame(new Trubbish(Abilities.TANFO));
				flag = 1;
				break;
			case "info75":
				new InfoFrame(new Garbodor(Abilities.TANFO));
				flag = 1;
				break;
			case "info76":
				new InfoFrame(new Zorua());
				flag = 1;
				break;
			case "info77":
				new InfoFrame(new Zoroark());
				flag = 1;
				break;
			case "info78":
				new InfoFrame(new Minccino(Abilities.INCANTEVOLE));
				flag = 1;
				break;
			case "info79":
				new InfoFrame(new Cinccino(Abilities.INCANTEVOLE));
				flag = 1;
				break;
			case "info80":
				new InfoFrame(new Gothita(Abilities.INDAGINE));
				flag = 1;
				break;
			case "info81":
				new InfoFrame(new Gothorita(Abilities.INDAGINE));
				flag = 1;
				break;
			case "info82":
				new InfoFrame(new Gothitelle(Abilities.INDAGINE));
				flag = 1;
				break;
			case "info93":
				new InfoFrame(new Emolga(Abilities.STATICO));
				flag = 1;
				break;
			case "info94":
				new InfoFrame(new Karrablast(Abilities.AIUTINSETTO));
				flag = 1;
				break;
			case "info95":
				new InfoFrame(new Escavalier(Abilities.AIUTINSETTO));
				flag = 1;
				break;
			case "info96":
				new InfoFrame(new Foongus(Abilities.SPARGISPORA));
				flag = 1;
				break;
			case "info97":
				new InfoFrame(new Amoonguss(Abilities.SPARGISPORA));
				flag = 1;
				break;
			case "info98":
				new InfoFrame(new Frillish(Abilities.ASSORBACQUA));
				flag = 1;
				break;
			case "info99":
				new InfoFrame(new Jellicent(Abilities.ASSORBACQUA));
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
			case "info119":
				new InfoFrame(new Cubchoo(Abilities.MANTELNEVE));
				flag = 1;
				break;
			case "info120":
				new InfoFrame(new Beartic(Abilities.MANTELNEVE));
				flag = 1;
				break;
			case "info121":
				new InfoFrame(new Cryogonal());
				flag = 1;
				break;
			case "info122":
				new InfoFrame(new Shelmet(Abilities.IDRATAZIONE));
				flag = 1;
				break;
			case "info123":
				new InfoFrame(new Accelgor(Abilities.IDRATAZIONE));
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
				p2 = new Roggenrola(Abilities.VIGORE);
				break;
			case "31":
				p2 = new Boldore(Abilities.VIGORE);
				break;
			case "32":
				p2 = new Gigalith(Abilities.VIGORE);
				break;
			case "33":
				p2 = new Woobat(Abilities.IMPRUDENZA);
				break;
			case "34":
				p2 = new Swoobat(Abilities.IMPRUDENZA);
				break;
			case "35":
				p2 = new Drilbur(Abilities.REMASABBIA);
				break;
			case "36":
				p2 = new Excadrill(Abilities.REMASABBIA);
				break;
			case "37":
				p2 = new Audino(Abilities.CURACUORE);
				break;
			case "38":
				p2 = new Timburr(Abilities.DENTISTRETTI);
				break;
			case "39":
				p2 = new Gurdurr(Abilities.DENTISTRETTI);
				break;
			case "40":
				p2 = new Conkeldurr(Abilities.DENTISTRETTI);
				break;
			case "41":
				p2 = new Tympole(Abilities.NUOTOVELOX);
				break;
			case "42":
				p2 = new Palpitoad(Abilities.NUOTOVELOX);
				break;
			case "43":
				p2 = new Seismitoad(Abilities.NUOTOVELOX);
				break;
			case "44":
				p2 = new Throh(Abilities.DENTISTRETTI);
				break;
			case "45":
				p2 = new Sawk(Abilities.VIGORE);
				break;
			case "46":
				p2 = new Sewaddle(Abilities.AIUTINSETTO);
				break;
			case "47":
				p2 = new Swadloon(Abilities.FOGLIAMANTO);
				break;
			case "48":
				p2 = new Leavanny(Abilities.AIUTINSETTO);
				break;
			case "49":
				p2 = new Venipede(Abilities.VELENOPUNTE);
				break;
			case "50":
				p2 = new Whirlipede(Abilities.VELENOPUNTE);
				break;
			case "51":
				p2 = new Scolipede(Abilities.VELENOPUNTE);
				break;
			case "52":
				p2 = new Cottonee(Abilities.BURLA);
				break;
			case "53":
				p2 = new Whimsicott(Abilities.BURLA);
				break;
			case "54":
				p2 = new Petilil(Abilities.CLOROFILLA);
				break;
			case "55":
				p2 = new Lilligant(Abilities.CLOROFILLA);
				break;
			case "56":
				p2 = new Basculin(Abilities.TEMERARIETA);
				break;
			case "57":
				p2 = new Sandile(Abilities.PREPOTENZA);
				break;
			case "58":
				p2 = new Krokorok(Abilities.PREPOTENZA);
				break;
			case "59":
				p2 = new Krookodile(Abilities.PREPOTENZA);
				break;
			case "60":
				p2 = new Darumaka(Abilities.TUTTAFRETTA);
				break;
			case "61":
				p2 = new Darmanitan(Abilities.FORZABRUTA);
				break;
			case "62":
				p2 = new Maractus(Abilities.ASSORBACQUA);
				break;
			case "63":
				p2 = new Dwebble(Abilities.VIGORE);
				break;
			case "64":
				p2 = new Crustle(Abilities.VIGORE);
				break;
			case "65":
				p2 = new Scraggy(Abilities.MUTA);
				break;
			case "66":
				p2 = new Scrafty(Abilities.MUTA);
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
			case "70":
				p2 = new Tirtouga(Abilities.SOLIDROCCIA);
				break;
			case "71":
				p2 = new Carracosta(Abilities.SOLIDROCCIA);
				break;
			case "72":
				p2 = new Archen();
				break;
			case "73":
				p2 = new Archeops();
				break;
			case "74":
				p2 = new Trubbish(Abilities.TANFO);
				break;
			case "75":
				p2 = new Garbodor(Abilities.TANFO);
				break;
			case "76":
				p2 = new Zorua();
				break;
			case "77":
				p2 = new Zoroark();
				break;
			case "78":
				p2 = new Minccino(Abilities.INCANTEVOLE);
				break;
			case "79":
				p2 = new Cinccino(Abilities.INCANTEVOLE);
				break;
			case "80":
				p2 = new Gothita(Abilities.INDAGINE);
				break;
			case "81":
				p2 = new Gothorita(Abilities.INDAGINE);
				break;
			case "82":
				p2 = new Gothitelle(Abilities.INDAGINE);
				break;
			case "93":
				p2 = new Emolga(Abilities.STATICO);
				break;
			case "94":
				p2 = new Karrablast(Abilities.AIUTINSETTO);
				break;
			case "95":
				p2 = new Escavalier(Abilities.AIUTINSETTO);
				break;
			case "96":
				p2 = new Foongus(Abilities.SPARGISPORA);
				break;
			case "97":
				p2 = new Amoonguss(Abilities.SPARGISPORA);
				break;
			case "98":
				p2 = new Frillish(Abilities.ASSORBACQUA);
				break;
			case "99":
				p2 = new Jellicent(Abilities.ASSORBACQUA);
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
			case "119":
				p2 = new Cubchoo(Abilities.MANTELNEVE);
				break;
			case "120":
				p2 = new Beartic(Abilities.MANTELNEVE);
				break;
			case "121":
				p2 = new Cryogonal();
				break;
			case "122":
				p2 = new Shelmet(Abilities.IDRATAZIONE);
				break;
			case "123":
				p2 = new Accelgor(Abilities.IDRATAZIONE);
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
				break;
			case "info33":
				new InfoFrame(new Woobat(Abilities.IMPRUDENZA));
				flag = 1;
				break;
			case "info34":
				new InfoFrame(new Swoobat(Abilities.IMPRUDENZA));
				flag = 1;
				break;
			case "info35":
				new InfoFrame(new Drilbur(Abilities.REMASABBIA));
				flag = 1;
				break;
			case "info36":
				new InfoFrame(new Excadrill(Abilities.REMASABBIA));
				flag = 1;
				break;
			case "info37":
				new InfoFrame(new Audino(Abilities.CURACUORE));
				flag = 1;
				break;
			case "info38":
				new InfoFrame(new Timburr(Abilities.DENTISTRETTI));
				flag = 1;
				break;
			case "info39":
				new InfoFrame(new Gurdurr(Abilities.DENTISTRETTI));
				flag = 1;
				break;
			case "info40":
				new InfoFrame(new Conkeldurr(Abilities.DENTISTRETTI));
				flag = 1;
				break;
			case "info41":
				new InfoFrame(new Tympole(Abilities.NUOTOVELOX));
				flag = 1;
				break;
			case "info42":
				new InfoFrame(new Palpitoad(Abilities.NUOTOVELOX));
				flag = 1;
				break;
			case "info43":
				new InfoFrame(new Seismitoad(Abilities.NUOTOVELOX));
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
			case "info46":
				new InfoFrame(new Sewaddle(Abilities.AIUTINSETTO));
				flag = 1;
				break;
			case "info47":
				new InfoFrame(new Swadloon(Abilities.FOGLIAMANTO));
				flag = 1;
				break;
			case "info48":
				new InfoFrame(new Leavanny(Abilities.AIUTINSETTO));
				flag = 1;
				break;
			case "info49":
				new InfoFrame(new Venipede(Abilities.VELENOPUNTE));
				flag = 1;
				break;
			case "info50":
				new InfoFrame(new Whirlipede(Abilities.VELENOPUNTE));
				flag = 1;
				break;
			case "info51":
				new InfoFrame(new Scolipede(Abilities.VELENOPUNTE));
				flag = 1;
				break;
			case "info52":
				new InfoFrame(new Cottonee(Abilities.BURLA));
				flag = 1;
				break;
			case "info53":
				new InfoFrame(new Whimsicott(Abilities.BURLA));
				flag = 1;
				break;
			case "info54":
				new InfoFrame(new Petilil(Abilities.CLOROFILLA));
				flag = 1;
				break;
			case "info55":
				new InfoFrame(new Lilligant(Abilities.CLOROFILLA));
				flag = 1;
				break;
			case "info56":
				new InfoFrame(new Basculin(Abilities.TEMERARIETA));
				flag = 1;
				break;
			case "info57":
				new InfoFrame(new Sandile(Abilities.PREPOTENZA));
				flag = 1;
				break;
			case "info58":
				new InfoFrame(new Krokorok(Abilities.PREPOTENZA));
				flag = 1;
				break;
			case "info59":
				new InfoFrame(new Krookodile(Abilities.PREPOTENZA));
				flag = 1;
				break;
			case "info60":
				new InfoFrame(new Darumaka(Abilities.TUTTAFRETTA));
				flag = 1;
				break;
			case "info61":
				new InfoFrame(new Darmanitan(Abilities.FORZABRUTA));
				flag = 1;
				break;
			case "info62":
				new InfoFrame(new Maractus(Abilities.ASSORBACQUA));
				flag = 1;
				break;
			case "info63":
				new InfoFrame(new Dwebble(Abilities.VIGORE));
				flag = 1;
				break;
			case "info64":
				new InfoFrame(new Crustle(Abilities.VIGORE));
				flag = 1;
				break;
			case "info65":
				new InfoFrame(new Scraggy(Abilities.MUTA));
				flag = 1;
				break;
			case "info66":
				new InfoFrame(new Scrafty(Abilities.MUTA));
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
			case "info70":
				new InfoFrame(new Tirtouga(Abilities.SOLIDROCCIA));
				flag = 1;
				break;
			case "info71":
				new InfoFrame(new Carracosta(Abilities.SOLIDROCCIA));
				flag = 1;
				break;
			case "info72":
				new InfoFrame(new Archen());
				flag = 1;
				break;
			case "info73":
				new InfoFrame(new Archeops());
				flag = 1;
				break;
			case "info74":
				new InfoFrame(new Trubbish(Abilities.TANFO));
				flag = 1;
				break;
			case "info75":
				new InfoFrame(new Garbodor(Abilities.TANFO));
				flag = 1;
				break;
			case "info76":
				new InfoFrame(new Zorua());
				flag = 1;
				break;
			case "info77":
				new InfoFrame(new Zoroark());
				flag = 1;
				break;
			case "info78":
				new InfoFrame(new Minccino(Abilities.INCANTEVOLE));
				flag = 1;
				break;
			case "info79":
				new InfoFrame(new Cinccino(Abilities.INCANTEVOLE));
				flag = 1;
				break;
			case "info80":
				new InfoFrame(new Gothita(Abilities.INDAGINE));
				flag = 1;
				break;
			case "info81":
				new InfoFrame(new Gothorita(Abilities.INDAGINE));
				flag = 1;
				break;
			case "info82":
				new InfoFrame(new Gothitelle(Abilities.INDAGINE));
				flag = 1;
				break;
			case "info93":
				new InfoFrame(new Emolga(Abilities.STATICO));
				flag = 1;
				break;
			case "info94":
				new InfoFrame(new Karrablast(Abilities.AIUTINSETTO));
				flag = 1;
				break;
			case "info95":
				new InfoFrame(new Escavalier(Abilities.AIUTINSETTO));
				flag = 1;
				break;
			case "info96":
				new InfoFrame(new Foongus(Abilities.SPARGISPORA));
				flag = 1;
				break;
			case "info97":
				new InfoFrame(new Amoonguss(Abilities.SPARGISPORA));
				flag = 1;
				break;
			case "info98":
				new InfoFrame(new Frillish(Abilities.ASSORBACQUA));
				flag = 1;
				break;
			case "info99":
				new InfoFrame(new Jellicent(Abilities.ASSORBACQUA));
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
			case "info119":
				new InfoFrame(new Cubchoo(Abilities.MANTELNEVE));
				flag = 1;
				break;
			case "info120":
				new InfoFrame(new Beartic(Abilities.MANTELNEVE));
				flag = 1;
				break;
			case "info121":
				new InfoFrame(new Cryogonal());
				flag = 1;
				break;
			case "info122":
				new InfoFrame(new Shelmet(Abilities.IDRATAZIONE));
				flag = 1;
				break;
			case "info123":
				new InfoFrame(new Accelgor(Abilities.IDRATAZIONE));
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
		new GameUI(this.p, this.p2);
		p = null;
		p2 = null;
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
