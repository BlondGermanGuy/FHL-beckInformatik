// Made by Tim Lexow
public static void main(String[] args) throws IOException {
		String muh = "",woop = "";
		InputStreamReader input = new InputStreamReader(System.in); //Erstellt einen neuen ImputStreamReader input
		BufferedReader br = new BufferedReader(input); //Erstellt einen neuen BuffedReader br
		//mit "= br.readLine()" können wir nun den input sicher aufrufen 
		    muh = br.readLine();
		    
		    System.out.print("Wie macht die Kuh? " + muh + "\n");
		    int x = muh.length()+2;
		    
		    //Cowsay ----- BubbleRand
		    
		    
		    // Cowsay Bubble
		    woop = "  "+ String.format("%"+muh.length() + "s","").replaceAll(" ", "*");
		    System.out.println(woop);
		    System.out.println("< " + muh + " >"  );
		    System.out.println(woop);
		    //Um \ einzufügen müssen wir \\ schreiben, denn nur \ maskiert das nachfolgene Zeichen \" ist für " in strings
		   //Nun folgt die Cow für das Cowsay
		    System.out.println(
		    		 "    \\    ^--^" 
		    + "\n" + "     \\   (oo)\\------"  
		    + "\n" +  "         (__)\\      )\\/\\"
		    + "\n" +  "            ||----w |" 
		    + "\n" +  "            ||    ||"); 
	}