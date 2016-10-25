/**
 * 
 */

/**
 * @author T. Lexow
 *
 */
import java.util.Scanner;
	 
public class Armstrong {

	/**
	 * @param args
	 */

	
	   public static void main(String args[])
	   {
	      int n, sum = 0, temp, kopf, digits = 0;
	 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Gebe eine Zahl ein um zu Prüfen ob sie eine Armstrong Zahl ist :");      
	      n = in.nextInt();
	      in.close();
	      temp = n;
	 
	      // Zählt die Anzahl der 0er 10 = 2 0er 1000= 4 nuller
	 
	      while (temp != 0) {
	         digits++;
	         temp = temp/10;
	      }
	 
	      temp = n;
	 
	      while (temp != 0) {
	         kopf = temp%10;
	         sum = sum + power(kopf, digits);
	         temp = temp/10;
	      }
	 
	      if (n == sum)
	         System.out.println(n + " ist eine Armstrong Nummer.");
	      else
	         System.out.println(n + " ist keine Armstrong Nummer.");         
	   }
	 
	   static int power(int n, int r) {
	      int c, p = 1;
	 
	      for (c = 1; c <= r; c++) 
	         p = p*n;
	 
	      return p;   
	   }
	}

