import java.util.Scanner;

/**
 * 
 */

/**
 * @author T. Lexow
 *
 */
public class Kugel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double kDM; //Kreisdruchmesser
		double kR; //Kreisdruchmesser
		double kV; //Kreisvolumen
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte geben Sie den Durchmesser einer Kugel ein [cm]: " + );
		kDM = in.nextDouble(); //wartet auf den n�chsten Double Wert, gibt Error wenn es keine Zahl oder Double ist. 10.1 falsch 10,1 richtig
		kDM = Math.abs(kdm); // Gibt die Absolute Zahl aus, wenn es also -10 ist es |10|
		in.close(); //schlie�t den Scanner wieder
		kR = (kDM / 2.0); //Kreisdurchmesser durch Zwei f�r den Radius
		kV = ( 4.0 / 3.0 ) * Math.PI * Math.pow( kR, 3 ); //Math.PI f�r PI und Math.pow ist die Exponentialfunktion kR hoch 3
		System.out.println("");
		System.out.println("Das Volumen der Kugel betr�gt [cm^3]: " + kV);

	}
	}
