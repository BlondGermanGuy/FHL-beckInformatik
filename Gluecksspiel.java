package Chapterfour;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tim Lexow
 *
 */
public class Gluecksspiel {
	private static Scanner scan = new Scanner(System.in);	//Wichtig da wir rekusiv auf den Scanner 
															//zugreifen und so ihn in der Main erst schließen 
															//wenn wir ihn nicht mehr brauchen

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Ich denke mir eine Zahl zwischen 1 und 100 aus.");
		System.out.println("Wer von Euch beiden näher rät, hat gewonnen.");
		Random ran = new Random(); // Erstellt einen neuen
									// Zufallszahlengenerator (0-99)
		int ra = ran.nextInt(100) + 1; // Gibt eine Zufallszahl zwischen 0-99
										// aus, daher müssen wir +1 dazu rechnen
		int p1, p2;
		p1 = 0;
		p2 = 1;

		p1 = holeNummer(1); //Greift auf die Hilfsmethode zu, übermittelt ihr den Wert 1 für die Spielernummer

		p2 = holeNummer(2);
		while (p2 == p1) {
			System.out.println("Das wäre doch langweilig"); // Failsafe
															// verhindert
															// gleiche Werte für
															// P1 und P2, gutes
															// Fehlerabfangen
			System.out.println("Nehm eine andere Zahl als Spieler 1");
			p2 = holeNummer(2);
		}
		System.out.println("Meine Zahl lautete: " + ra);
		if ((ra - p1) < (ra - p2)) {
			System.out.println("Spieler 1 hat gewonnen");
		} else {
			System.out.println("Spieler 2 hat gewonnen");
		}
		scan.close(); //Würden wir den Scanner schon in der holeNummer Variable schließen
						//würde sich damit auch gleich die System.in schließen und wir bekämen eine NoSuchElementExeption

	}

	public static int holeNummer(int d) { //Hilfsmethode zum Filtern von Fehleingaben
		boolean gingFangen = false;
		int nummer = 0;
		do {
			System.out.print("Spieler " + d + " bitte gib Deine Zahl ein: ");
			if (scan.hasNextInt()) { //Schaut ob überhaupt ein Integer Wert eingegeben wurde
				nummer = scan.nextInt(); //Wenn ja, übernimmt den Integer Wert für Int Nummer
				gingFangen = true; //Setzt den Boolean Wert auf true um die Schleife zu beenden
			} else {
				scan.nextLine(); //Schiebt den Scanner weiter, so das der wieder leer ist
				System.out.println("Gebe bitte eine gültige Integer Zahl ein, Danke!");
			}
		} while (!gingFangen);

		return nummer; //returnt die Zahl von der Eingabe
	}
	
	public String Winner (int a,int b, int c){
		int w = 0;
		if (Math.abs(c-a)== Math.abs(c-b)){
			return "Beide lagen gleich nahe";
		} else if(Math.abs(c-a)> Math.abs(c-b)){ w=2;}else {w = 1;}
		return "der Gewinner ist Spieler :" + w;
		
	}

}
