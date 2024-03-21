package first_project;
import java.util.Scanner;
import java.util.ArrayList;

public class bus_demo {
	public static void main(String[] args) {
		
		int userInput=1;
		Scanner sc = new Scanner(System.in);
		ArrayList<bus_details> buses= new ArrayList<>();
		ArrayList<bookings> bookings= new ArrayList<>();
		buses.add(new bus_details(1,true,1));
		buses.add(new bus_details(2,true,2));
		buses.add(new bus_details(3,false,1));
		for(bus_details b : buses) {
			b.DisplayInfo();
		}
		while(userInput==1) {
			System.out.println("Enter 1 to bookings and 2 to exit.");
			userInput=sc.nextInt();
			if(userInput==1) {
				bookings booking = new bookings();
				if(booking.isAvailable(bookings,buses)){
					bookings.add(booking);
					System.out.println("Your booking is Successful");	
				}
				else {
					System.out.println("Sorry the bus is full");
				}
			}
			
			
		}
		System.out.println("Thanks for your visit");
		
		 
	}

}
