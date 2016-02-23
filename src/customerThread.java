
public class customerThread extends Thread {

	private int seatsNeeded;
	public customerThread(int seats, Runnable target, String name){
		super(target,name);
		seatsNeeded = seats;
	}
	
	public int getSeatsNeeded(){
		return seatsNeeded;
	}
	
}
