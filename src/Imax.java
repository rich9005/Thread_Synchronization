
public class Imax {
	public static void main(String args[]){
	movieReservation mr = new movieReservation();
	customerThread ct1 = new customerThread(2,mr,"Richard");
	customerThread ct2 = new customerThread(2,mr,"Caroline");
	
	ct1.start();
	ct2.start();
	}
}
