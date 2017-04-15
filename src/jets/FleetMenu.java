package jets;

import java.util.*;

public class FleetMenu {
	public static void main(String[] args) {
		start();
	}

	Jet[] jets = new Jet[100];
	{
		new Jet("Big Billy", 1.05, 1500, 700);
		new Jet("Small Sammy", .60, 900, 50);
		new Jet("Midsize Mary", .86, 1300, 300);
		new Jet("Large Larry", .98, 1400, 400);
		new Jet("Petite Pauly", .56, 800, 25);
	}

	public static void start() {
		Scanner kb = new Scanner(System.in);

		System.out.println("Welcome to your fleet menu. Please select an option below: ");
		System.out.println("1: List fleet");
		System.out.println("2: View fastest jet");
		System.out.println("3: View jet with longest range");
		System.out.println("4: Add a jet to fleet");
		System.out.println("5: Quit");
		int choice = kb.nextInt();
		switch (choice) {
		case 1:
			
		case 2:
			
		case 3:
			
		case 4:
			System.out.println("Enter jet model: ");
			String model = kb.next();
			System.out.println("Enter jet speed (mph): ");
			double mphSpeed = kb.nextDouble();
			double speed = MphtoMach(mphSpeed);
			System.out.println("Enter jet range: ");
			int range = kb.nextInt();
			System.out.println("Enter jet price: ");
			int price = kb.nextInt();
			
				Jet(String model, double speed, int range, int price)	
				for (int i = 0; i < Jet.length; i++)
					Jet[i] = new jets(model, speed, range, price);
			
		case 5:
		}

	}
}
