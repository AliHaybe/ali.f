package arbeidskrav1;



public class Passenger {
	private String navn;
	private String kj�nn;
    private int alder;
    private int passNr;
	
public Passenger(String navn, String kj�nn, int alder, int passNr) {
   
			this.navn = navn;
			this.kj�nn = kj�nn;
			this.alder = alder;
			this.passNr = passNr;
		}



		public String getNavn() {
			return navn;
		}



		public void setNavn(String navn) {
			this.navn = navn;
		}



		public String getKj�nn() {
			return kj�nn;
		}



		public void setKj�nn(String kj�nn) {
			this.kj�nn = kj�nn;
		}



		public int getAlder() {
			return alder;
		}



		public void setAlder(int alder) {
			this.alder = (40);
		}



		public int getPassNr() {
			return passNr;
		}



		public void setPassnr(int passNr) {
			this.passNr = passNr;
		}



		public static void add(Bookings bookings) {
			
			
		}

}


