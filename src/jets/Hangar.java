package jets;

public class Hangar {
	Jet[] jet = new Jet[5];

	public void displayHangar(Jet[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.println(jets[i].toString());
			}
		}
	}

	public void newJet(String model, double speed, int range, int price) {
		Jet[] temp = new Jet[jet.length + 1];
		for (int i = 0; i < jet.length; i++) {
			temp[i] = jet[i];
		}
		temp[jet.length] = new Jet(model, speed, range, price);
		jet = temp;
	}

}
