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
	Pokèdex dex = new Pokèdex();
	
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
		for(int i = 0; i < 26; i++) {
			System.out.println(i + ": " + dex.getPokèmonById(i));
		}
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
		for(int i = 26; i < 52; i++) {
			System.out.println(i + ": " + dex.getPokèmonById(i));
		}
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
		System.out.println("Scrivi pag2 per andare alla seconda pagina.");
		System.out.println("Scrivi pag4 per andare alla quarta pagina.");
		for(int i = 52; i < 78; i++) {
			System.out.println(i + ": " + dex.getPokèmonById(i));
		}
		System.out.println("--------------------------------------------------------------------");
		ch = scan.nextLine();
		return ch;
	}
	
	/**
	 * Displays the 4th page of Pokèmon and it let you choose<br>
	 * which Pokèmon you or the AI are gonna use
	 * @return ch : String
	 */
	public static String displayPokèmon_quattro() {
		String ch = "";
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Per scegliere il pokèmon inserisci il suo numero.");
		System.out.println("Per vedere le info di un pokèmon scrivi 'info' seguito dal suo numero (es. info3).");
		System.out.println("Scrivi pag3 per andare alla terza pagina.");
		System.out.println("Scrivi pag5 per andare alla quinta pagina.");
		for(int i = 78; i < 104; i++) {
			System.out.println(i + ": " + dex.getPokèmonById(i));
		}
		System.out.println("--------------------------------------------------------------------");
		ch = scan.nextLine();
		return ch;
	}
	
	/**
	 * Displays the 5th page of Pokèmon and it let you choose<br>
	 * which Pokèmon you or the AI are gonna use
	 * @return ch : String
	 */
	public static String displayPokèmon_cinque() {
		String ch = "";
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Per scegliere il pokèmon inserisci il suo numero.");
		System.out.println("Per vedere le info di un pokèmon scrivi 'info' seguito dal suo numero (es. info3).");
		System.out.println("Scrivi pag4 per andare alla quarta pagina.");
		System.out.println("Scrivi pag6 per andare alla sesta pagina.");
		for(int i = 104; i < 130; i++) {
			System.out.println(i + ": " + dex.getPokèmonById(i));
		}
		System.out.println("--------------------------------------------------------------------");
		ch = scan.nextLine();
		return ch;
	}
	
	/**
	 * Displays the 6th page of Pokèmon and it let you choose<br>
	 * which Pokèmon you or the AI are gonna use
	 * @return ch : String
	 */
	public static String displayPokèmon_sei() {
		String ch = "";
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Per scegliere il pokèmon inserisci il suo numero.");
		System.out.println("Per vedere le info di un pokèmon scrivi 'info' seguito dal suo numero (es. info3).");
		System.out.println("Scrivi pag5 per andare alla quinta pagina.");
		for(int i = 130; i < 156; i++) {
			System.out.println(i + ": " + dex.getPokèmonById(i));
		}
		System.out.println("--------------------------------------------------------------------");
		ch = scan.nextLine();
		return ch;
	}
	
	/**
	 * Picks a random number from 0 to 44
	 * @return (int)Math.random()*45 : int
	 */
	public static int pickValue() {
		return (int)(Math.random()*156);
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