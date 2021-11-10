package arbeidskrav1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;


public class Flight {
	
	private String flightId;
	private String from, to;
	private Date sstart;
	private int ttime;
	private int seats;
	
	 
     
     
	
	
public Flight(String id, String from, String to, Date start, int ttime, int seats) {
        super();
        this.flightId = flightId;
        this.from = from;
        this.to = to;
        this.sstart = start;
        this.ttime = ttime;
        this.seats = seats;
    }

 ArrayList<Group> Passenger = new ArrayList<Group>();

  

    public String getflightId() {
    	return flightId;
    }
    
    public void setFlightId() {
    	this.flightId = flightId;
    }

    public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getSstart() {
		return sstart;
	}

	public void setSstart(Date sstart) {
		this.sstart = sstart;
	}

	public int getTtime() {
		return ttime;
	}

	public void setTtime(int ttime) {
		this.ttime = ttime;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public ArrayList<Group> getPassengers() {
		    return Passenger;
	}

	public void leggTilPassengers(Group nygroupe) {
		    Passenger.add(nygroupe);
		
	}

	
		
	}

	
		
	




