package jets;

import java.util.*;

public class FleetMenu {
	public static void main(String[] args) {
		start();
	}

	public static void start() {
		Jet jetArray [] = initialLoad();
		Scanner kb = new Scanner(System.in);
		Hangar[] PaulsHangar = new Hangar[5];
        int choice=0;
		
		while (choice != 5) {
			System.out.println("Welcome to your fleet menu. Please select an option below: ");
			System.out.println("1: List fleet");
			System.out.println("2: View fastest jet");
			System.out.println("3: View jet with longest range");
			System.out.println("4: Add a jet to fleet");
			System.out.println("5: Quit");
			choice = kb.nextInt();
			switch (choice) {
			case 1:
				Hangar showhang = new Hangar();
				showhang.displayHangar(jetArray);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("Enter jet model: ");
				String model = kb.next();
				System.out.println("Enter jet speed (mph): ");
				double mphSpeed = kb.nextDouble();
				MachCalc mm = new MachCalc();
				double speed = mm.mphToMach(mphSpeed);
				System.out.println("Enter jet range: ");
				int range = kb.nextInt();
				System.out.println("Enter jet price: ");
				int price = kb.nextInt();
				Hangar addhang = new Hangar();
				addhang.newJet(model, speed, range, price);
				
				break;
			}
		}

	}
	public static Jet[] initialLoad(){
		Jet jet [] = new Jet[5];
		jet[0] = new Jet("Big Billy", 1.05, 1500, 700);
		jet[1] = new Jet("Small Sammy", .60, 900, 50);
		jet[2] = new Jet("Midsize Mary", .86, 1300, 300);
		jet[3] = new Jet("Large Larry", .98, 1400, 400);
		jet[4] = new Jet("Petite Pauly", .56, 800, 25);
		return jet;
	}
	public void addJet () {
		
	}
}
