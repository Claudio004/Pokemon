package it.pokèmon.basics;

import java.util.Scanner;

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


public class Game {
	Scanner scan = new Scanner(System.in);
	Pokèmon p;
	Pokèmon p2;
	Pokèmon p_info;
	String ch = "";
	
	private void introduzione() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Benvenuto nel simulatore di lotta pokèmon.");
		System.out.println("Tramite questo programma (ancora non completo) potrai allenarti");
		System.out.println("Nella lotta tra pokèmon scegliendo un pokèmon da utilizzare");
		System.out.println("Contro un pokèmon dell'AI che puoi scegliere te o lasciare all'AI");
		System.out.println("Di decidere quale pokèmon utilizzerà.");
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
		System.out.println();
	}
	
	private void menuSceltaPokemon() {
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Per scegliere il pokèmon inserisci il suo numero.");
		System.out.println("Per vedere le info di un pokèmon scrivi 'info' seguito dal suo numero (es. info3).");
		System.out.println("Scrivi pag2 per andare alla seconda pagina.");
		System.out.println("0. Victini");
		System.out.println("1. Snivy");
		System.out.println("2. Servine");
		System.out.println("3. Serperior");
		System.out.println("4. Tepig");
		System.out.println("5. Pignite");
		System.out.println("6. Emboar");
		System.out.println("7. Oshawott");
		System.out.println("8. Dewott");
		System.out.println("9. Samurott");
		System.out.println("10. Patrat");
		System.out.println("11. Watchog");
		System.out.println("12. Purrloin");
		System.out.println("13. Liepard");
		System.out.println("14. Pansage");
		System.out.println("15. Simisage");
		System.out.println("16. Pansear");
		System.out.println("17. Simisear");
		System.out.println("18. Panpour");
		System.out.println("19. Simipour");
		System.out.println("-------------------------------------------------------------------------------------");
		ch = scan.nextLine();
		if(compareInput() == 1) {
			menuSceltaPokemon();
		}else {
			menuSceltaPokemon_u_AI();
		}	
	}
	
	private void menuSceltaPokemon_AI() {
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Per scegliere il pokèmon inserisci il suo numero.");
		System.out.println("Per vedere le info di un pokèmon scrivi 'info' seguito dal suo numero (es. info3).");
		System.out.println("Scrivi pag2 per andare alla seconda pagina.");
		System.out.println("0. Victini");
		System.out.println("1. Snivy");
		System.out.println("2. Servine");
		System.out.println("3. Serperior");
		System.out.println("4. Tepig");
		System.out.println("5. Pignite");
		System.out.println("6. Emboar");
		System.out.println("7. Oshawott");
		System.out.println("8. Dewott");
		System.out.println("9. Samurott");
		System.out.println("10. Patrat");
		System.out.println("11. Watchog");
		System.out.println("12. Purrloin");
		System.out.println("13. Liepard");
		System.out.println("14. Pansage");
		System.out.println("15. Simisage");
		System.out.println("16. Pansear");
		System.out.println("17. Simisear");
		System.out.println("18. Panpour");
		System.out.println("19. Simipour");
		System.out.println("-------------------------------------------------------------------------------------");
		ch = scan.nextLine();
		if(compareInputAI() == 1) {
			menuSceltaPokemon_AI();
		}else {
			startGame();
		}
	}
	
	private void menuSceltaPokemon_due() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Per scegliere il pokèmon inserisci il suo numero.");
		System.out.println("Per vedere le info di un pokèmon scrivi 'info' seguito dal suo numero (es. info3).");
		System.out.println("Scrivi pag1 per andare alla prima pagina.");
		System.out.println("Scrivi pag3 per andare alla terza pagina.");
		System.out.println("20. Trubbish");
		System.out.println("21. Garbodor");
		System.out.println("22. Sigilyph");
		System.out.println("23. Yamask");
		System.out.println("24. Cofagrigus");
		System.out.println("25. Emolga");
		System.out.println("26. Joltik");
		System.out.println("27. Galvantula");
		System.out.println("28. Axew");
		System.out.println("29. Fraxure");
		System.out.println("30. Haxorus");
		System.out.println("31. Heatmor");
		System.out.println("32. Durant");
		System.out.println("33. Cryogonal");
		System.out.println("34. Tornadus");
		System.out.println("35. Cobalion");
		System.out.println("36. Terrakion");
		System.out.println("37. Virizion");
		System.out.println("38. Stunfisk");
		System.out.println("--------------------------------------------------------------------");
		ch = scan.nextLine();
		if(compareInput() == 1) {
			menuSceltaPokemon_due();
		}else {
			menuSceltaPokemon_u_AI();
		}
	}
	
	private void menuSceltaPokemon_due_AI() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Per scegliere il pokèmon inserisci il suo numero.");
		System.out.println("Per vedere le info di un pokèmon scrivi 'info' seguito dal suo numero (es. info3).");
		System.out.println("Scrivi pag1 per andare alla prima pagina.");
		System.out.println("Scrivi pag3 per andare alla terza pagina.");
		System.out.println("20. Trubbish");
		System.out.println("21. Garbodor");
		System.out.println("22. Sigilyph");
		System.out.println("23. Yamask");
		System.out.println("24. Cofagrigus");
		System.out.println("25. Emolga");
		System.out.println("26. Joltik");
		System.out.println("27. Galvantula");
		System.out.println("28. Axew");
		System.out.println("29. Fraxure");
		System.out.println("30. Haxorus");
		System.out.println("31. Heatmor");
		System.out.println("32. Durant");
		System.out.println("33. Cryogonal");
		System.out.println("34. Tornadus");
		System.out.println("35. Cobalion");
		System.out.println("36. Terrakion");
		System.out.println("37. Virizion");
		System.out.println("38. Stunfisk");
		System.out.println("--------------------------------------------------------------------");
		ch = scan.nextLine();
		if(compareInputAI() == 1) {
			menuSceltaPokemon_due_AI();
		}else {
			startGame();
		}
	}
	
	private void menuSceltaPokemon_tre() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Per scegliere il pokèmon inserisci il suo numero.");
		System.out.println("Per vedere le info di un pokèmon scrivi 'info' seguito dal suo numero (es. info3).");
		System.out.println("Scrivi pag1 per andare alla prima pagina.");
		System.out.println("Scrivi pag2 per andare alla seconda pagina.");
		System.out.println("39. Throh");
		System.out.println("40. Sawk");
		System.out.println("41. Bouffalant");
		System.out.println("42. Druddigon");
		System.out.println("43. Reshiram");
		System.out.println("44. Zekrom");
		System.out.println("--------------------------------------------------------------------");
		ch = scan.nextLine();
		if(compareInput() == 1) {
			menuSceltaPokemon_tre();
		}else {
			menuSceltaPokemon_u_AI();
		}
	}
	
	private void menuSceltaPokemon_tre_AI() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Per scegliere il pokèmon inserisci il suo numero.");
		System.out.println("Per vedere le info di un pokèmon scrivi 'info' seguito dal suo numero (es. info3).");
		System.out.println("Scrivi pag1 per andare alla prima pagina.");
		System.out.println("Scrivi pag2 per andare alla seconda pagina.");
		System.out.println("39. Throh");
		System.out.println("40. Sawk");
		System.out.println("41. Bouffalant");
		System.out.println("42. Druddigon");
		System.out.println("43. Reshiram");
		System.out.println("44. Zekrom");
		System.out.println("--------------------------------------------------------------------");
		ch = scan.nextLine();
		if(compareInputAI() == 1) {
			menuSceltaPokemon_tre_AI();
		}else {
			startGame();
		}
	}
	
	private void menuSceltaPokemon_u_AI() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Premi 1 per scegliere il pokemon che l'AI dovrà usare.");
		System.out.println("Premi 2 per far usare all'AI un pokemon a caso.");
		System.out.println("--------------------------------------------------------------------");
		ch = scan.nextLine();
		if(ch.equals("1")) {
			menuSceltaPokemon_AI();
		}else {
			if(ch.equals("2")) {
				randomPokePick();
			}else {
				menuSceltaPokemon_u_AI();
			}
		}
	}
	
	private void randomPokePick() {
		int pick = (int)Math.random()*44+1;
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
			System.out.println("Vita del pokèmon avversario: " + p2.getHP());
			
			if(p2.getHP() > 0) {
				move = (int)Math.random()*p2.moves.size()+1;
				System.out.println(p2.getNome() + " ha usato " + p2.moves.get(move).getNome() +"...");
				p2.moves.get(move).enemyDamage(p2, p);
				System.out.println("Vita del tuo pokèmon: " + p.getHP());
			}
		}
		if(p.getHP() <= 0) {
			Alerts.lose();
		}else {
			Alerts.win();
		}
	}
	
	public Game(){
		introduzione();
		menuSceltaPokemon();
	}
}
