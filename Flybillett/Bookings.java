package arbeidskrav1;

public class Bookings {
	private Passenger reisende;
	double payment;


public Bookings(Passenger reisende, double payment) {
    this.reisende = reisende;
    this.payment = payment;
 }
public Passenger getReisende() {
	return reisende;
	    
}
public void setReisende(Passenger reisende) {
	    this.reisende = reisende;
}
public double getPayment() {
	return payment;
	
}
}