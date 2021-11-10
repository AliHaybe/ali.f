package arbeidskrav1;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menu {

	public static void main(String[] args) throws ParseException {
	

		Flight fNr1 = new Flight(null, null, null, null, 0, 0);
		Group nygroupe = new Group("hj2");
		((Flight) fNr1).leggTilPassengers(nygroupe);
		Random random = new Random();
		int groupcode = random.nextInt(1) + 1;
		int flightNr= random.nextInt(900) + 100;
		int flightNrPerson= random.nextInt(900) + 100;
		
		loop:
		    for (int i=0; i<10; i++) {
		    	
		System.out.println("Fly meny: ");
		System.out.println("1 - Legg til flyreise");
		System.out.println("2 - Opprett reisegruppe");
		System.out.println("3 - Legg til reisende");
		System.out.println("4 - EXIT");
		
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		
		
		switch (choice){
		
		  
				case "1":
					
					System.out.println("Til flyplass: ");
			        String input6 = scan.nextLine();
			        
			        System.out.println("Fra flyplass: ");
			        String input7 = scan.nextLine();
			        
			        System.out.println("Avgang (HH:mm:ss): ");
			        String input8 = scan.nextLine();
			        
			        System.out.println("Ankomst(HH:mm:ss): ");
			        String input9= scan.nextLine();
			        
			        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			        Date d1 = null;
			        Date d2 = null;
			        
			        d1  = format.parse(input8);
			        d2  = format.parse(input9);
			        
			        long diff = d2.getTime() - d1.getTime();
			        
					long diffSeconds = diff / 1000 % 60;
					long diffMinutes = diff / (60 * 1000) % 60;
					long diffHours = diff / (60 * 60 * 1000) % 24;

			        
			        
			        System.out.println("Reisetid: ");
			        System.out.print(diffHours + " Timer, ");
					System.out.print(diffMinutes + " Minutter og ");
					System.out.println(diffSeconds + " Sekunder.");
			        
			        System.out.println("Antall plasser: 250");
			    continue loop;
			
		
	    	
		case "2":
			
			System.out.println("Navn pÂ alle reisende. Skill med ',' avslutt med 'ENTER'.");
			String input5 = scan.nextLine();
			
			System.out.println("Groupecode: " + (groupcode++));
		     
		    System.out.println("Flightnummer: FL" + (flightNr++));
		    
		    
		case "3":
			System.out.println("Navn: ");
	    	String input1 = scan.nextLine();
	    	
	    	System.out.println("Kjonn: ");
	    	String input2 = scan.nextLine();
	    	
	    	System.out.println("Alder: ");
	    	int input3 = scan.nextInt();
	    	
	    	System.out.println("Passnummer: ");
	    	int input4 = scan.nextInt();
	    	
	    	System.out.println("Navn: " + input1);
	    	System.out.println("Kjonn: " + input2);
	    	System.out.println("Alder: " + input3);
	    	System.out.println("Passnummer: " + input4);
		    System.out.println("Flightnummer: FL" + (flightNrPerson++));
		    
		    
		    
	    	Passenger passenger1 = new Passenger(input1,input2,input3,input4);
	    	
	    	Group objekt;
			nygroupe.leggTilReisende(passenger1);
	    	
	    	
		    continue loop;
		  
		
			
	
	
		
		
		    case "4":
		    	System.out.println("Programmet avsluttet");
				break loop;
				
		
		}
		
		    }

}
}
