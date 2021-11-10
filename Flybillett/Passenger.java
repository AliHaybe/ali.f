package arbeidskrav1;



public class Passenger {
	private String navn;
	private String kjønn;
    private int alder;
    private int passNr;
	
public Passenger(String navn, String kjønn, int alder, int passNr) {
   
			this.navn = navn;
			this.kjønn = kjønn;
			this.alder = alder;
			this.passNr = passNr;
		}



		public String getNavn() {
			return navn;
		}



		public void setNavn(String navn) {
			this.navn = navn;
		}



		public String getKjønn() {
			return kjønn;
		}



		public void setKjønn(String kjønn) {
			this.kjønn = kjønn;
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


