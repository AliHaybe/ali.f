package arbeidskrav1;


import java.util.List;
import java.util.ArrayList;





public class Group {

	    String groupcode;
		ArrayList<Bookings> kunder = new ArrayList<Bookings>();
	
        public Group(String groupcode) {
        	this.groupcode = groupcode;
        }
	
        public void leggTilReisende(Passenger reisende) {
    		    Passenger.add(new Bookings(reisende,0.0));
    		
    	}
        


	} 
		
		
		


