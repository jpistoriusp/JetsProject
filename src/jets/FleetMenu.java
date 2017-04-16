package jets;

import java.util.*;

public class FleetMenu {
	public static void main(String[] args) {
		FleetMenu fm = new FleetMenu();
		fm.start();
	}

	public void start() {
	
		Scanner kb = new Scanner(System.in);
		int choice = 0;
		Hangar showhang = new Hangar();
		Jet jetArray[] = showhang.initialLoad();

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
				showhang.displayHangar(jetArray);
				break;
			case 2:
				showhang.fastestJet(jetArray);
				break;
			case 3:
				showhang.longestRangeJet(jetArray);
				break;
			case 4:
				jetArray = showhang.newJet(jetArray);
				showhang.displayHangar(jetArray);
				break;
			}
		}

	}

}
