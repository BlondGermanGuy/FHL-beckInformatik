
import java.util.Scanner;
public class LetzteZiffer {
	/*
	 * @author Tim Lexow
	 */

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  System.out.println("Bitte geben Sie eine ganze Zahl ein? ");
		  int in1 = in.nextInt();
		  System.out.println("Bitte geben Sie eine weitere ganze Zahl ein? ");
		  int in2 = in.nextInt();
		  in.close();
		  int compare = letzteZahl(in1) - letzteZahl(in2); //Mit der Hilfsmethode werden beide letzten Zeichen der Ints verglichen
		  if (compare == 0) {System.out.println("Die letzte Ziffern stimmen überein");}
		  else {System.out.println("Die letzten Ziffern stimmen nicht überein.");}
		  System.out.println("Ende des Programmes, Vielen Dank für ihre Eingabe");
	}
		  
	public static int letzteZahl(int d) { //Hilfsmethode zum absoluten vergleichen der letzten Ziffer
	     return Math.abs(d % 10);
	}
}
