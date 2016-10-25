/**
 * 
 */
package Hallowelt;

import java.util.Scanner;

/**
 * @author T. Lexow
 *
 */
public class FragenachNamen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bitte geben Sie Ihren Namen ein: ");
		Scanner in = new Scanner(System.in);
		String N = in.nextLine();
		in.close();
		System.out.println("Hallo " + N +" schön Dich zu sehen.");
		System.out.println("Wie geht es Dir?");
		

	}

}
