package busreservation;
import java.util.*;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking>bookings = new ArrayList<Booking>();
		
		
		
		buses.add(new Bus(01,true,2));
		buses.add(new Bus(02,true,28));
		buses.add(new Bus(03,true,47));
		buses.add(new Bus(04,true,14));
		
		int userOpt = 1;
		Scanner get = new Scanner(System.in);
		
		
		for(Bus b:buses) {
			b.displayInfo();
		}
		
		
		
		while(userOpt == 1) {
		System.out.println("ENter 1 to Book or Enter 2 to Exit");
		userOpt = get.nextInt();
		if(userOpt==1) {
			Booking booking = new Booking(); 
			if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("Your Booking Is Confirmed");
				}
			else {
				System.out.println("Sorry Bus is Full Try Another Bus or Date");
				}
			}
		}
	}

}
