
public class movieReservation implements Runnable{
private int currentNoOfSeats = 2;

public void run(){
	customerThread ct = (customerThread) Thread.currentThread();
	
	boolean ticketsBooked = bookTickets(ct.getSeatsNeeded(),ct.getName());
	if(ticketsBooked){
		System.out.println("Congrats" + Thread.currentThread().getName()+" :"+ct.getSeatsNeeded() +"are Booked");
		
	}
	else{
		System.out.println("Sorry" + Thread.currentThread().getName()+" :"+ct.getSeatsNeeded() +"are Not Booked");
	}
	
	
}

public synchronized boolean bookTickets(int seats , String name){
	
	System.out.println("Welcome to Imax Cinemas " + Thread.currentThread().getName()+" Total avaliable tickets :"+ getCurrentTotal()+" ");
	if(seats > getCurrentTotal()){
		return false;
	}
	else{
		currentNoOfSeats = currentNoOfSeats - seats;
		return true;
	
	}
	
}

public int getCurrentTotal(){
	return currentNoOfSeats;
}

}
