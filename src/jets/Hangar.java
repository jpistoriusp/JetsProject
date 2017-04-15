package jets;

import java.util.Scanner;

public class Hangar {
	Jet[] jet = new Jet[100];

	public Jet[] initialLoad(){
		jet[0] = new Jet("Big Billy", 1.05, 1500, 700);
		jet[1] = new Jet("Small Sammy", .60, 900, 50);
		jet[2] = new Jet("Midsize Mary", .86, 1300, 300);
		jet[3] = new Jet("Large Larry", .98, 1400, 400);
		jet[4] = new Jet("Petite Pauly", .56, 800, 25);
		return jet;
	}
	
	public void displayHangar(Jet[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.println(jets[i].toString());
			}
		}
	}

	public Jet[]  newJet(Jet[] jets) {
		Scanner kb = new Scanner(System.in);
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
		Jet jet = new Jet(model, speed, range,price);
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null){
				jets[i] = jet;
				break;
			}
		}
		return jets;
	}


}
