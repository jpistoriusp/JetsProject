package jets;

import java.util.Scanner;

public class Hangar {
	Jet[] jet = new Jet[100];

	public Jet[] initialLoad() {
		jet[0] = new Jet("Bombardier Challenger 300", 528f, 3500, 26_000_000, "Henry");
		jet[1] = new Jet("Gulfstream G650", 610f, 8050, 65_000_000, "Sue");
		jet[2] = new Jet("Embraer Phenom 100", 537f, 1350, 4_000_000, "Bobby");
		jet[3] = new Jet("Cessna Citation X", 717f, 3700, 23_000_000, "Frank");
		jet[4] = new Jet("Cessna Citation Mustang", 483f, 1340, 3_000_000, "Mary");
		return jet;
	}

	public void fastestJet(Jet[] jets) {
		Jet fastest = new Jet();
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getSpeed() > fastest.getSpeed()) {
					fastest = jets[i];
				}
			}
		}
		System.out.println("Fastest jet: " + fastest.toString());
	}
	
	public void longestRangeJet(Jet[] jets) {
		Jet longest = new Jet();
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getRange() > longest.getRange()) {
					longest = jets[i];
				}
			}
		}
		System.out.println("Longest range jet: " + longest.toString());
	}

	public void displayHangar(Jet[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.println(jets[i].toString());
			}
		}
	}

	public Jet[] newJet(Jet[] jets) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter jet model: ");
		String model = kb.nextLine();
		System.out.println("Enter jet speed (mph): ");
		float speed = kb.nextFloat();
		System.out.println("Enter jet range (mi): ");
		int range = kb.nextInt();
		System.out.println("Enter jet price: ");
		int price = kb.nextInt();
		System.out.println("Press [enter] to assign a random pilot : ");
		kb.nextLine();
		kb.nextLine();
		Jet jet = new Jet(model, speed, range, price);
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = jet;
				break;
			}
		}
		return jets;
	}

}
