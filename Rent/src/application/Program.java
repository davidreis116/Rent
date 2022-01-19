package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Rent;
public class Program {
public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
			
	
		
		System.out.println("Enter with the total of room:");			
		int quantity_room = sc.nextInt();
		Rent [] vect = new Rent[quantity_room];
		
		System.out.println("How many room will be rented ?");	
		int quantities_rent = sc.nextInt();
		
		
		for (int i=0; i<quantities_rent; i++) {
				
				
				
				System.out.printf("Rent # %d", i);
				System.out.printf("Name:");
				String name = sc.next();
				System.out.printf("Email:");
				String email = sc.next();
				System.out.printf("Room:");
				int number_room= sc.nextInt();
				
			
				vect[i] = new Rent(name, email);
						
		
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
		if (vect[i] != null) {
		System.out.println(i + ": " + vect[i]);
		}
		}
		
		
		
	
	sc.close();
	}


}