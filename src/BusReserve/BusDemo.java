package BusReserve;

import java.util.*;

public class BusDemo {

	public static void main(String[] args) {
		
		//array of objects 
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		//add buses 
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,2));	
		buses.add(new Bus(3,true,2));	
		
	    int userOpt=1;
		Scanner sc = new Scanner(System.in);
		
		//loop 
		for(Bus b:buses) {
			b.toString();
		}
		
		while(userOpt==1) {
			System.out.println("Enter 1 to Book bus or 2 to exit...");
			userOpt = sc.nextInt();
			if(userOpt==1) {
				System.out.println("Booking...");
				Booking booking = new Booking();
				
				if(booking.isAvailable(buses,bookings)){
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else {
					System.out.println("Sorry , Bus is full...");
				}
			}
			
			
		}
	}

}
