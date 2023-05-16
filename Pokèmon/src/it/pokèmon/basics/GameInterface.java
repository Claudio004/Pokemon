package it.pokèmon.basics;

import java.util.Scanner;

/**
 * Operations for the Game Class
 * @author Claudio Togni 4CI
 * @version 1.0
 * @see java.util.Scanner
 */
public interface GameInterface {
	Scanner scan = new Scanner(System.in);
	
	/**
	 * Displays an introduction message
	 */
	public static void introduzione() {
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
	
	/**
	 * Prints 10 empty lines for the console "clear" operation
	 */
	public static void emptyLines() {
		for(int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
	
	/**
	 * Displays the first page of Pokèmon and it let you choose<br>
	 * which Pokèmon you or the AI are gonna use
	 * @return ch : String
	 */
	public static String displayPokèmon() {
		String ch = "";
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
		return ch;
	}
	
	/**
	 * Displays the second page of Pokèmon and it let you choose<br>
	 * which Pokèmon you or the AI are gonna use
	 * @return ch : String
	 */
	public static String displayPokèmon_due() {
		String ch = "";
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
		return ch;
	}
	
	/**
	 * Displays the third page of Pokèmon and it let you choose<br>
	 * which Pokèmon you or the AI are gonna use
	 * @return ch : String
	 */
	public static String displayPokèmon_tre() {
		String ch = "";
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
		return ch;
	}
	
	/**
	 * Picks a random number from 0 to 44
	 * @return (int)Math.random()*45 : int
	 */
	public static int pickValue() {
		return (int)(Math.random()*45);
	}
	
	/**
	 * Displays the retry message and it let you choose<br>
	 * if you want to retry or close the game
	 * @return scelta : int
	 */
	public static int displayRetryMsg() {
		int scelta;
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Premi 1 per ricominciare.");
		System.out.println("Premi 2 per terminare.");
		System.out.println("-------------------------------------------------------------------------------------");
		scelta = scan.nextInt();
		return scelta;
	}
	
	/**
	 * Displays the message for the AI Pokèmon choosing method<br>
	 * and it let you choose if you want to select the AI Pokèmon<br>
	 * or if you want the AI selects it by her own
	 * @return ch : int
	 */
	public static int displayAiPickChooserMsg() {
		int ch = 0;
		while(ch != 1 && ch != 2) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Premi 1 per scegliere il pokemon che l'AI dovrà usare.");
			System.out.println("Premi 2 per far usare all'AI un pokemon a caso.");
			System.out.println("--------------------------------------------------------------------");
			ch = scan.nextInt();
		}
		return ch;
	}
}